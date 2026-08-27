import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evs(evz b, String c, float d) implements evq {
   public static final Codec<evs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ewa.a.fieldOf("target").forGetter(evs::c),
               Codec.STRING.fieldOf("score").forGetter(evs::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(evs::e)
            )
            .apply($$0, evs::new)
   );

   @Override
   public evp b() {
      return evr.e;
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.b();
   }

   public static evs a(erp.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static evs a(erp.b $$0, String $$1, float $$2) {
      return new evs(evw.a($$0), $$1, $$2);
   }

   @Override
   public float b(erp $$0) {
      exx $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         exy $$2 = $$0.d().f();
         exq $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            exu $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public evz c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
