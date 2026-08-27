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

public class fsq {
   private static final fsq a = new fsq("") {
      @Override
      public void a(evh $$0) {
      }

      @Override
      public void a(fsq.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fsq.b e;

   fsq(String $$0) {
      this.d = evh.O().p.toPath().resolve($$0);
   }

   public static fsq a(@Nullable String $$0) {
      return $$0 == null ? a : new fsq($$0);
   }

   public void a(fsq.c $$0, String $$1, String $$2) {
      this.e = new fsq.b($$0, $$1, $$2);
   }

   public void a(evh $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fsq.a $$2 = new fsq.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fsq.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fsq.b b, Instant c, ctl d) {
      public static final Codec<fsq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fsq.b.a.forGetter(fsq.a::a), atv.m.fieldOf("lastPlayedTime").forGetter(fsq.a::b), ctl.f.fieldOf("gamemode").forGetter(fsq.a::c))
               .apply($$0, fsq.a::new)
      );

      public fsq.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public ctl c() {
         return this.d;
      }
   }

   static record b(fsq.c b, String c, String d) {
      public static final MapCodec<fsq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fsq.c.d.fieldOf("type").forGetter(fsq.b::a), atv.o.fieldOf("id").forGetter(fsq.b::b), Codec.STRING.fieldOf("name").forGetter(fsq.b::c)
               )
               .apply($$0, fsq.b::new)
      );

      public fsq.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements avj {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fsq.c> d = avj.a(fsq.c::values);
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
