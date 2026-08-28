import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dti extends dvy implements dmp {
   public static final MapCodec<dti> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eac.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dti::new)
   );
   public static final ebo f = ebe.aX;
   private static final ffr a = dmm.b(12.0, 0.0, 12.0);
   protected final eac g;

   @Override
   public MapCodec<? extends dti> a() {
      return e;
   }

   protected dti(eac $$0, ean.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return a;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.B($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arq $$0, iv $$1, eao $$2, azv $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return true;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(f);
   }
}
