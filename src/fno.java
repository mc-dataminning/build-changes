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

public class fno {
   private static final fno a = new fno("") {
      @Override
      public void a(eqv $$0) {
      }

      @Override
      public void a(fno.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fno.b e;

   fno(String $$0) {
      this.d = eqv.O().p.toPath().resolve($$0);
   }

   public static fno a(@Nullable String $$0) {
      return $$0 == null ? a : new fno($$0);
   }

   public void a(fno.c $$0, String $$1, String $$2) {
      this.e = new fno.b($$0, $$1, $$2);
   }

   public void a(eqv $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fno.a $$2 = new fno.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fno.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fno.b b, Instant c, cps d) {
      public static final Codec<fno.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fno.b.a.forGetter(fno.a::a), arg.m.fieldOf("lastPlayedTime").forGetter(fno.a::b), cps.f.fieldOf("gamemode").forGetter(fno.a::c))
               .apply($$0, fno.a::new)
      );

      public fno.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cps c() {
         return this.d;
      }
   }

   static record b(fno.c b, String c, String d) {
      public static final MapCodec<fno.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fno.c.d.fieldOf("type").forGetter(fno.b::a), arg.o.fieldOf("id").forGetter(fno.b::b), Codec.STRING.fieldOf("name").forGetter(fno.b::c)
               )
               .apply($$0, fno.b::new)
      );

      public fno.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements asp {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fno.c> d = asp.a(fno.c::values);
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
