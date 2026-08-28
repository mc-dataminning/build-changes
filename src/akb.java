import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record akb(xe b, Optional<akb.b> c, Optional<akb.c> d, Optional<akb.a> e, boolean f) {
   public static final Codec<akb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xg.a.lenientOptionalFieldOf("description", xd.a).forGetter(akb::a),
               akb.b.a.lenientOptionalFieldOf("players").forGetter(akb::b),
               akb.c.a.lenientOptionalFieldOf("version").forGetter(akb::c),
               akb.a.a.lenientOptionalFieldOf("favicon").forGetter(akb::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(akb::e)
            )
            .apply($$0, akb::new)
   );

   public xe a() {
      return this.b;
   }

   public Optional<akb.b> b() {
      return this.c;
   }

   public Optional<akb.c> c() {
      return this.d;
   }

   public Optional<akb.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<akb.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new akb.a($$2));
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
         $$0 -> $$0.group(ki.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<akb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(akb.b::a),
                  Codec.INT.fieldOf("online").forGetter(akb.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(akb.b::c)
               )
               .apply($$0, akb.b::new)
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
      public static final Codec<akb.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(akb.c::b), Codec.INT.fieldOf("protocol").forGetter(akb.c::c)).apply($$0, akb.c::new)
      );

      public static akb.c a() {
         ae $$0 = ab.b();
         return new akb.c($$0.c(), $$0.e());
      }
   }
}
