import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fea(feh b, String c, float d) implements fdy {
   public static final MapCodec<fea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fei.a.fieldOf("target").forGetter(fea::c),
               Codec.STRING.fieldOf("score").forGetter(fea::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fea::e)
            )
            .apply($$0, fea::new)
   );

   @Override
   public fdx b() {
      return fdz.e;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.b();
   }

   public static fea a(ezt.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fea a(ezt.b $$0, String $$1, float $$2) {
      return new fea(fee.a($$0), $$1, $$2);
   }

   @Override
   public float b(ezt $$0) {
      fgg $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fgh $$2 = $$0.d().g();
         ffz $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fgd $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public feh c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
