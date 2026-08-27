import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ary implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 20;
   private final Path c;
   private final bkt<ary.e> d;
   private final bof<Runnable> e = bof.a(ac.h(), "download-queue");

   public ary(Path $$0) throws IOException {
      this.c = $$0;
      v.c($$0);
      this.d = bkt.a(ary.e.a, $$0.resolve("log.json"));
      arx.a($$0, 20);
   }

   private ary.b b(ary.a $$0, Map<UUID, ary.c> $$1) {
      ary.b $$2 = new ary.b();
      $$1.forEach(
         ($$2x, $$3) -> {
            Path $$4 = this.c.resolve($$2x.toString());
            Path $$5 = null;

            try {
               $$5 = axq.a($$4, $$3.a, $$0.c, $$0.a, $$3.b, $$0.b, $$0.d, $$0.e);
               $$2.a.put($$2x, $$5);
            } catch (Exception var9) {
               a.error("Failed to download {}", $$3.a, var9);
               $$2.b.add($$2x);
            }

            try {
               this.d
                  .a(
                     new ary.e(
                        $$2x,
                        $$3.a.toString(),
                        Instant.now(),
                        Optional.ofNullable($$3.b).map(HashCode::toString),
                        $$5 != null ? this.a($$5) : Either.left("download_failed")
                     )
                  );
            } catch (Exception var8) {
               a.error("Failed to log download of {}", $$3.a, var8);
            }
         }
      );
      return $$2;
   }

   private Either<String, ary.d> a(Path $$0) {
      try {
         long $$1 = Files.size($$0);
         Path $$2 = this.c.relativize($$0);
         return Either.right(new ary.d($$2.toString(), $$1));
      } catch (IOException var5) {
         a.error("Failed to get file size of {}", $$0, var5);
         return Either.left("no_access");
      }
   }

   public CompletableFuture<ary.b> a(ary.a $$0, Map<UUID, ary.c> $$1) {
      return CompletableFuture.supplyAsync(() -> this.b($$0, $$1), this.e::a);
   }

   @Override
   public void close() throws IOException {
      this.e.close();
      this.d.close();
   }

   public static record a(HashFunction a, int b, Map<String, String> c, Proxy d, axq.a e) {
   }

   public static record b(Map<UUID, Path> a, Set<UUID> b) {

      public b() {
         this(new HashMap<>(), new HashSet<>());
      }
   }

   public static record c(URL a, @Nullable HashCode b) {
   }

   static record d(String b, long c) {
      public static final Codec<ary.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ary.d::a), Codec.LONG.fieldOf("size").forGetter(ary.d::b)).apply($$0, ary.d::new)
      );

      public String a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   static record e(UUID b, String c, Instant d, Optional<String> e, Either<String, ary.d> f) {
      public static final Codec<ary.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jq.d.fieldOf("id").forGetter(ary.e::a),
                  Codec.STRING.fieldOf("url").forGetter(ary.e::b),
                  axh.m.fieldOf("time").forGetter(ary.e::c),
                  Codec.STRING.optionalFieldOf("hash").forGetter(ary.e::d),
                  Codec.mapEither(Codec.STRING.fieldOf("error"), ary.d.a.fieldOf("file")).forGetter(ary.e::e)
               )
               .apply($$0, ary.e::new)
      );

      public UUID a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public Instant c() {
         return this.d;
      }

      public Optional<String> d() {
         return this.e;
      }

      public Either<String, ary.d> e() {
         return this.f;
      }
   }
}
