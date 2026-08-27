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

public class fne {
   private static final fne a = new fne("") {
      @Override
      public void a(eql $$0) {
      }

      @Override
      public void a(fne.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fne.b e;

   fne(String $$0) {
      this.d = eql.O().p.toPath().resolve($$0);
   }

   public static fne a(@Nullable String $$0) {
      return $$0 == null ? a : new fne($$0);
   }

   public void a(fne.c $$0, String $$1, String $$2) {
      this.e = new fne.b($$0, $$1, $$2);
   }

   public void a(eql $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fne.a $$2 = new fne.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fne.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fne.b b, Instant c, cpi d) {
      public static final Codec<fne.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fne.b.a.forGetter(fne.a::a), aqy.m.fieldOf("lastPlayedTime").forGetter(fne.a::b), cpi.f.fieldOf("gamemode").forGetter(fne.a::c))
               .apply($$0, fne.a::new)
      );

      public fne.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cpi c() {
         return this.d;
      }
   }

   static record b(fne.c b, String c, String d) {
      public static final MapCodec<fne.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fne.c.d.fieldOf("type").forGetter(fne.b::a), Codec.STRING.fieldOf("id").forGetter(fne.b::b), Codec.STRING.fieldOf("name").forGetter(fne.b::c)
               )
               .apply($$0, fne.b::new)
      );

      public fne.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements ash {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fne.c> d = ash.a(fne.c::values);
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
