import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record aka(wv b, Optional<aka.b> c, Optional<aka.c> d, Optional<aka.a> e, boolean f) {
   public static final Codec<aka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wx.a.lenientOptionalFieldOf("description", wu.a).forGetter(aka::a),
               aka.b.a.lenientOptionalFieldOf("players").forGetter(aka::b),
               aka.c.a.lenientOptionalFieldOf("version").forGetter(aka::c),
               aka.a.a.lenientOptionalFieldOf("favicon").forGetter(aka::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(aka::e)
            )
            .apply($$0, aka::new)
   );

   public wv a() {
      return this.b;
   }

   public Optional<aka.b> b() {
      return this.c;
   }

   public Optional<aka.c> c() {
      return this.d;
   }

   public Optional<aka.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<aka.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new aka.a($$2));
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
         $$0 -> $$0.group(km.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<aka.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(aka.b::a),
                  Codec.INT.fieldOf("online").forGetter(aka.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(aka.b::c)
               )
               .apply($$0, aka.b::new)
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
      public static final Codec<aka.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(aka.c::b), Codec.INT.fieldOf("protocol").forGetter(aka.c::c)).apply($$0, aka.c::new)
      );

      public static aka.c a() {
         ag $$0 = ab.b();
         return new aka.c($$0.c(), $$0.e());
      }
   }
}
