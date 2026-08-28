import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ake(xh b, Optional<ake.b> c, Optional<ake.c> d, Optional<ake.a> e, boolean f) {
   public static final Codec<ake> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xj.a.lenientOptionalFieldOf("description", xg.a).forGetter(ake::a),
               ake.b.a.lenientOptionalFieldOf("players").forGetter(ake::b),
               ake.c.a.lenientOptionalFieldOf("version").forGetter(ake::c),
               ake.a.a.lenientOptionalFieldOf("favicon").forGetter(ake::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ake::e)
            )
            .apply($$0, ake::new)
   );

   public xh a() {
      return this.b;
   }

   public Optional<ake.b> b() {
      return this.c;
   }

   public Optional<ake.c> c() {
      return this.d;
   }

   public Optional<ake.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ake.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ake.a($$2));
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
         $$0 -> $$0.group(kj.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ake.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ake.b::a),
                  Codec.INT.fieldOf("online").forGetter(ake.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ake.b::c)
               )
               .apply($$0, ake.b::new)
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
      public static final Codec<ake.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ake.c::b), Codec.INT.fieldOf("protocol").forGetter(ake.c::c)).apply($$0, ake.c::new)
      );

      public static ake.c a() {
         ae $$0 = ab.b();
         return new ake.c($$0.c(), $$0.e());
      }
   }
}
