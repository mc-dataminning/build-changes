import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record adx(ti b, Optional<adx.b> c, Optional<adx.c> d, Optional<adx.a> e, boolean f) {
   public static final Codec<adx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.b.optionalFieldOf("description", th.a).forGetter(adx::a),
               adx.b.a.optionalFieldOf("players").forGetter(adx::b),
               adx.c.a.optionalFieldOf("version").forGetter(adx::c),
               adx.a.a.optionalFieldOf("favicon").forGetter(adx::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(adx::e)
            )
            .apply($$0, adx::new)
   );

   public ti a() {
      return this.b;
   }

   public Optional<adx.b> b() {
      return this.c;
   }

   public Optional<adx.c> c() {
      return this.d;
   }

   public Optional<adx.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<adx.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new adx.a($$2));
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
         $$0 -> $$0.group(ia.b.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<adx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(adx.b::a),
                  Codec.INT.fieldOf("online").forGetter(adx.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(adx.b::c)
               )
               .apply($$0, adx.b::new)
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
      public static final Codec<adx.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(adx.c::b), Codec.INT.fieldOf("protocol").forGetter(adx.c::c)).apply($$0, adx.c::new)
      );

      public static adx.c a() {
         ad $$0 = aa.b();
         return new adx.c($$0.c(), $$0.e());
      }
   }
}
