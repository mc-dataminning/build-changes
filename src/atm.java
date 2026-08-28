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

public class atm implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 20;
   private final Path c;
   private final bpk<atm.e> d;
   private final btg e = new btg(ag.j(), "download-queue");

   public atm(Path $$0) throws IOException {
      this.c = $$0;
      w.c($$0);
      this.d = bpk.a(atm.e.a, $$0.resolve("log.json"));
      atl.a($$0, 20);
   }

   private atm.b b(atm.a $$0, Map<UUID, atm.c> $$1) {
      atm.b $$2 = new atm.b();
      $$1.forEach(
         ($$2x, $$3) -> {
            Path $$4 = this.c.resolve($$2x.toString());
            Path $$5 = null;

            try {
               $$5 = azf.a($$4, $$3.a, $$0.c, $$0.a, $$3.b, $$0.b, $$0.d, $$0.e);
               $$2.a.put($$2x, $$5);
            } catch (Exception var9) {
               a.error("Failed to download {}", $$3.a, var9);
               $$2.b.add($$2x);
            }

            try {
               this.d
                  .a(
                     new atm.e(
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

   private Either<String, atm.d> a(Path $$0) {
      try {
         long $$1 = Files.size($$0);
         Path $$2 = this.c.relativize($$0);
         return Either.right(new atm.d($$2.toString(), $$1));
      } catch (IOException var5) {
         a.error("Failed to get file size of {}", $$0, var5);
         return Either.left("no_access");
      }
   }

   public CompletableFuture<atm.b> a(atm.a $$0, Map<UUID, atm.c> $$1) {
      return CompletableFuture.supplyAsync(() -> this.b($$0, $$1), this.e::a_);
   }

   @Override
   public void close() throws IOException {
      this.e.close();
      this.d.close();
   }

   public static record a(HashFunction a, int b, Map<String, String> c, Proxy d, azf.a e) {
   }

   public static record b(Map<UUID, Path> a, Set<UUID> b) {

      public b() {
         this(new HashMap<>(), new HashSet<>());
      }
   }

   public static record c(URL a, @Nullable HashCode b) {
   }

   static record d(String b, long c) {
      public static final Codec<atm.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(atm.d::a), Codec.LONG.fieldOf("size").forGetter(atm.d::b)).apply($$0, atm.d::new)
      );

      public String a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   static record e(UUID b, String c, Instant d, Optional<String> e, Either<String, atm.d> f) {
      public static final Codec<atm.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jz.d.fieldOf("id").forGetter(atm.e::a),
                  Codec.STRING.fieldOf("url").forGetter(atm.e::b),
                  ayw.q.fieldOf("time").forGetter(atm.e::c),
                  Codec.STRING.optionalFieldOf("hash").forGetter(atm.e::d),
                  Codec.mapEither(Codec.STRING.fieldOf("error"), atm.d.a.fieldOf("file")).forGetter(atm.e::e)
               )
               .apply($$0, atm.e::new)
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

      public Either<String, atm.d> e() {
         return this.f;
      }
   }
}
