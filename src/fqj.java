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

public class fqj {
   private static final fqj a = new fqj("") {
      @Override
      public void a(eti $$0) {
      }

      @Override
      public void a(fqj.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fqj.b e;

   fqj(String $$0) {
      this.d = eti.N().p.toPath().resolve($$0);
   }

   public static fqj a(@Nullable String $$0) {
      return $$0 == null ? a : new fqj($$0);
   }

   public void a(fqj.c $$0, String $$1, String $$2) {
      this.e = new fqj.b($$0, $$1, $$2);
   }

   public void a(eti $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fqj.a $$2 = new fqj.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fqj.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fqj.b b, Instant c, csc d) {
      public static final Codec<fqj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fqj.b.a.forGetter(fqj.a::a), asy.m.fieldOf("lastPlayedTime").forGetter(fqj.a::b), csc.f.fieldOf("gamemode").forGetter(fqj.a::c))
               .apply($$0, fqj.a::new)
      );

      public fqj.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public csc c() {
         return this.d;
      }
   }

   static record b(fqj.c b, String c, String d) {
      public static final MapCodec<fqj.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fqj.c.d.fieldOf("type").forGetter(fqj.b::a), asy.o.fieldOf("id").forGetter(fqj.b::b), Codec.STRING.fieldOf("name").forGetter(fqj.b::c)
               )
               .apply($$0, fqj.b::new)
      );

      public fqj.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements auk {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fqj.c> d = auk.a(fqj.c::values);
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
