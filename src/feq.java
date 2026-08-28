import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record feq(fex b, String c, float d) implements feo {
   public static final MapCodec<feq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fey.a.fieldOf("target").forGetter(feq::c),
               Codec.STRING.fieldOf("score").forGetter(feq::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(feq::e)
            )
            .apply($$0, feq::new)
   );

   @Override
   public fen b() {
      return fep.e;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.b();
   }

   public static feq a(faj.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static feq a(faj.b $$0, String $$1, float $$2) {
      return new feq(feu.a($$0), $$1, $$2);
   }

   @Override
   public float b(faj $$0) {
      fgw $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fgx $$2 = $$0.d().g();
         fgp $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fgt $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fex c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
