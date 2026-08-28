import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbs(fbz b, String c, float d) implements fbq {
   public static final MapCodec<fbs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fca.a.fieldOf("target").forGetter(fbs::c),
               Codec.STRING.fieldOf("score").forGetter(fbs::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fbs::e)
            )
            .apply($$0, fbs::new)
   );

   @Override
   public fbp b() {
      return fbr.e;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.b();
   }

   public static fbs a(exl.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fbs a(exl.b $$0, String $$1, float $$2) {
      return new fbs(fbw.a($$0), $$1, $$2);
   }

   @Override
   public float b(exl $$0) {
      fdy $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fdz $$2 = $$0.d().g();
         fdr $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fdv $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fbz c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
