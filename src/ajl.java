import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ajl(wx b, Optional<ajl.b> c, Optional<ajl.c> d, Optional<ajl.a> e, boolean f) {
   public static final Codec<ajl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wz.a.lenientOptionalFieldOf("description", ww.a).forGetter(ajl::a),
               ajl.b.a.lenientOptionalFieldOf("players").forGetter(ajl::b),
               ajl.c.a.lenientOptionalFieldOf("version").forGetter(ajl::c),
               ajl.a.a.lenientOptionalFieldOf("favicon").forGetter(ajl::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ajl::e)
            )
            .apply($$0, ajl::new)
   );

   public wx a() {
      return this.b;
   }

   public Optional<ajl.b> b() {
      return this.c;
   }

   public Optional<ajl.c> c() {
      return this.d;
   }

   public Optional<ajl.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ajl.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ajl.a($$2));
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
         $$0 -> $$0.group(jr.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ajl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ajl.b::a),
                  Codec.INT.fieldOf("online").forGetter(ajl.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ajl.b::c)
               )
               .apply($$0, ajl.b::new)
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
      public static final Codec<ajl.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ajl.c::b), Codec.INT.fieldOf("protocol").forGetter(ajl.c::c)).apply($$0, ajl.c::new)
      );

      public static ajl.c a() {
         ad $$0 = aa.b();
         return new ajl.c($$0.c(), $$0.e());
      }
   }
}
