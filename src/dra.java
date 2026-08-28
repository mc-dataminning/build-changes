import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dra extends dlf {
   public static final MapCodec<dra> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dkk.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kc.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dra::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final ebo f = ebe.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final dkk.c i;

   @Override
   public MapCodec<dra> a() {
      return c;
   }

   public dra(dkk.c $$0, kc.a $$1, ean.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(eao $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(ewu $$0) {
      return $$0 == eww.c && this.i == dkk.c.b;
   }

   @Override
   protected double b(eao $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$1 instanceof arq $$5 && $$3.bW() && this.a($$0, $$2, $$3)) {
         $$3.aF();
         if ($$3.c($$5, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(eao $$0, djh $$1, iv $$2) {
      if (this.i == dkk.c.c) {
         d(dmo.fT.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(eao $$0, djh $$1, iv $$2) {
      int $$3 = $$0.c(f) - 1;
      eao $$4 = $$3 == 0 ? dmo.fS.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(efo.c, $$2, efo.a.a($$4));
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, dkk.c $$3) {
      if (dnj.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         eao $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(efo.c, $$2, efo.a.a($$4));
      }
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, ewu $$3) {
      if (!this.d($$0)) {
         eao $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(efo.c, $$2, efo.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
