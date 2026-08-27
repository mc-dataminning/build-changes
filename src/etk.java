import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etk(etr b, String c, float d) implements eti {
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ets.a.fieldOf("target").forGetter(etk::c),
               Codec.STRING.fieldOf("score").forGetter(etk::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(etk::e)
            )
            .apply($$0, etk::new)
   );

   @Override
   public eth b() {
      return etj.e;
   }

   @Override
   public Set<erw<?>> a() {
      return this.b.b();
   }

   public static etk a(eph.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static etk a(eph.b $$0, String $$1, float $$2) {
      return new etk(eto.a($$0), $$1, $$2);
   }

   @Override
   public float b(eph $$0) {
      evp $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         evq $$2 = $$0.d().f();
         evi $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            evm $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public etr c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
