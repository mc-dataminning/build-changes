import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqe {
   private static final fqe a = new fqe("") {
      @Override
      public void a(etd $$0) {
      }

      @Override
      public void a(fqe.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fqe.b e;

   fqe(String $$0) {
      this.d = etd.N().p.toPath().resolve($$0);
   }

   public static fqe a(@Nullable String $$0) {
      return $$0 == null ? a : new fqe($$0);
   }

   public void a(fqe.c $$0, String $$1, String $$2) {
      this.e = new fqe.b($$0, $$1, $$2);
   }

   public void a(etd $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fqe.a $$2 = new fqe.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fqe.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
               try {
                  Files.createDirectories(this.d.getParent());
                  Files.writeString(this.d, c.toJson($$0xx));
               } catch (IOException var3x) {
                  b.error("Failed to write to quickplay log file {}", this.d, var3x);
               }
            });
         });
      } else {
         b.error("Failed to log session for quickplay. Missing world data or gamemode");
      }
   }

   static record a(fqe.b b, Instant c, crx d) {
      public static final Codec<fqe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fqe.b.a.forGetter(fqe.a::a), asu.m.fieldOf("lastPlayedTime").forGetter(fqe.a::b), crx.f.fieldOf("gamemode").forGetter(fqe.a::c))
               .apply($$0, fqe.a::new)
      );

      public fqe.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public crx c() {
         return this.d;
      }
   }

   static record b(fqe.c b, String c, String d) {
      public static final MapCodec<fqe.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fqe.c.d.fieldOf("type").forGetter(fqe.b::a), asu.o.fieldOf("id").forGetter(fqe.b::b), Codec.STRING.fieldOf("name").forGetter(fqe.b::c)
               )
               .apply($$0, fqe.b::new)
      );

      public fqe.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements aug {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fqe.c> d = aug.a(fqe.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
