import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhk(jg<awq> d, btw e, btw f) implements dhe {
   public static final MapCodec<dhk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awq.b.fieldOf("sound").forGetter(dhk::b),
               btw.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dhk::c),
               btw.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dhk::d)
            )
            .apply($$0, dhk::new)
   );

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      azz $$5 = $$3.dY();
      if (!$$3.ba()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   public jg<awq> b() {
      return this.d;
   }

   public btw c() {
      return this.e;
   }

   public btw d() {
      return this.f;
   }
}
