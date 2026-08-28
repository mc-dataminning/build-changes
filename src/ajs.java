import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ajs(wp b, Optional<ajs.b> c, Optional<ajs.c> d, Optional<ajs.a> e, boolean f) {
   public static final Codec<ajs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wr.a.lenientOptionalFieldOf("description", wo.a).forGetter(ajs::a),
               ajs.b.a.lenientOptionalFieldOf("players").forGetter(ajs::b),
               ajs.c.a.lenientOptionalFieldOf("version").forGetter(ajs::c),
               ajs.a.a.lenientOptionalFieldOf("favicon").forGetter(ajs::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ajs::e)
            )
            .apply($$0, ajs::new)
   );

   public wp a() {
      return this.b;
   }

   public Optional<ajs.b> b() {
      return this.c;
   }

   public Optional<ajs.c> c() {
      return this.d;
   }

   public Optional<ajs.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ajs.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ajs.a($$2));
            } catch (IllegalArgumentException var3) {
               return DataResult.error(() -> "Malformed base64 server icon");
            }
         }
      }, $$0 -> "data:image/png;base64," + new String(Base64.getEncoder().encode($$0.b), StandardCharsets.UTF_8));

      public byte[] a() {
         return this.b;
      }
   }

   public static record b(int b, int c, List<GameProfile> d) {
      private static final Codec<GameProfile> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(kl.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ajs.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ajs.b::a),
                  Codec.INT.fieldOf("online").forGetter(ajs.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ajs.b::c)
               )
               .apply($$0, ajs.b::new)
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public List<GameProfile> c() {
         return this.d;
      }
   }

   public static record c(String b, int c) {
      public static final Codec<ajs.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ajs.c::b), Codec.INT.fieldOf("protocol").forGetter(ajs.c::c)).apply($$0, ajs.c::new)
      );

      public static ajs.c a() {
         ag $$0 = ab.b();
         return new ajs.c($$0.c(), $$0.e());
      }
   }
}
