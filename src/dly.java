import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dly extends dbi {
   public static final MapCodec<dly> b = b(dly::new);
   public static final dnc<dng> c = dmu.bg;
   public static final dmv d = dmu.x;
   public static final float e = 4.0F;
   protected static final epo f = czf.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final epo g = czf.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final epo h = czf.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final epo i = czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final epo j = czf.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final epo k = czf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final epo o = czf.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final epo F = czf.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final epo G = czf.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final epo H = czf.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final epo I = czf.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final epo J = czf.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final epo K = czf.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final epo L = czf.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final epo M = czf.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final epo N = czf.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final epo O = czf.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final epo P = czf.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final epo[] Q = a(true);
   private static final epo[] R = a(false);

   @Override
   protected MapCodec<dly> a() {
      return b;
   }

   private static epo[] a(boolean $$0) {
      return Arrays.stream(ih.values()).map($$1 -> a($$1, $$0)).toArray(epo[]::new);
   }

   private static epo a(ih $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return epl.a(k, $$1 ? L : F);
         case b:
            return epl.a(j, $$1 ? K : o);
         case c:
            return epl.a(i, $$1 ? N : H);
         case d:
            return epl.a(h, $$1 ? M : G);
         case e:
            return epl.a(g, $$1 ? P : J);
         case f:
            return epl.a(f, $$1 ? O : I);
      }
   }

   public dly(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.c).a(c, dng.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dme $$0, dme $$1) {
      czf $$2 = $$0.c(c) == dng.a ? czh.by : czh.br;
      return $$1.a($$2) && $$1.c(dlx.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      if (!$$0.B && $$3.fW().d) {
         ib $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ib $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      dme $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(czh.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if ($$0.a((cwh)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq($$2.c(c) == dng.b ? czh.br : czh.by);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
