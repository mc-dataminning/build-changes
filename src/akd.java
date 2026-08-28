import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record akd(xo b, Optional<akd.b> c, Optional<akd.c> d, Optional<akd.a> e, boolean f) {
   public static final Codec<akd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xq.a.lenientOptionalFieldOf("description", xn.a).forGetter(akd::a),
               akd.b.a.lenientOptionalFieldOf("players").forGetter(akd::b),
               akd.c.a.lenientOptionalFieldOf("version").forGetter(akd::c),
               akd.a.a.lenientOptionalFieldOf("favicon").forGetter(akd::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(akd::e)
            )
            .apply($$0, akd::new)
   );

   public xo a() {
      return this.b;
   }

   public Optional<akd.b> b() {
      return this.c;
   }

   public Optional<akd.c> c() {
      return this.d;
   }

   public Optional<akd.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<akd.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new akd.a($$2));
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
         $$0 -> $$0.group(kc.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<akd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(akd.b::a),
                  Codec.INT.fieldOf("online").forGetter(akd.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(akd.b::c)
               )
               .apply($$0, akd.b::new)
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
      public static final Codec<akd.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(akd.c::b), Codec.INT.fieldOf("protocol").forGetter(akd.c::c)).apply($$0, akd.c::new)
      );

      public static akd.c a() {
         ad $$0 = aa.b();
         return new akd.c($$0.c(), $$0.e());
      }
   }
}
