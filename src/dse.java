import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dse extends dhk {
   public static final MapCodec<dse> b = b(dse::new);
   public static final dti<dtm> c = dta.bg;
   public static final dtb d = dta.x;
   public static final float e = 4.0F;
   protected static final ewy f = dfh.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewy g = dfh.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ewy h = dfh.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ewy i = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ewy j = dfh.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewy k = dfh.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ewy o = dfh.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewy F = dfh.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ewy G = dfh.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ewy H = dfh.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ewy I = dfh.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewy J = dfh.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ewy K = dfh.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewy L = dfh.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewy M = dfh.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ewy N = dfh.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ewy O = dfh.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewy P = dfh.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ewy[] Q = a(true);
   private static final ewy[] R = a(false);

   @Override
   protected MapCodec<dse> a() {
      return b;
   }

   private static ewy[] a(boolean $$0) {
      return Arrays.stream(jf.values()).map($$1 -> a($$1, $$0)).toArray(ewy[]::new);
   }

   private static ewy a(jf $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewv.a(k, $$1 ? L : F);
         case b:
            return ewv.a(j, $$1 ? K : o);
         case c:
            return ewv.a(i, $$1 ? N : H);
         case d:
            return ewv.a(h, $$1 ? M : G);
         case e:
            return ewv.a(g, $$1 ? P : J);
         case f:
            return ewv.a(f, $$1 ? O : I);
      }
   }

   public dse(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.c).a(c, dtm.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dsk $$0, dsk $$1) {
      dfh $$2 = $$0.c(c) == dtm.a ? dfj.by : dfj.br;
      return $$1.a($$2) && $$1.c(dsd.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      if (!$$0.B && $$3.ga().d) {
         ja $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ja $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      dsk $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfj.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if ($$0.a((dci)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc($$2.c(c) == dtm.b ? dfj.br : dfj.by);
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
