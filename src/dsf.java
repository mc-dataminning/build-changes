import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dsf extends dhl {
   public static final MapCodec<dsf> b = b(dsf::new);
   public static final dtj<dtn> c = dtb.bg;
   public static final dtc d = dtb.x;
   public static final float e = 4.0F;
   protected static final exa f = dfi.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exa g = dfi.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final exa h = dfi.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final exa i = dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final exa j = dfi.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exa k = dfi.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final exa o = dfi.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final exa F = dfi.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final exa G = dfi.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final exa H = dfi.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final exa I = dfi.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final exa J = dfi.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final exa K = dfi.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final exa L = dfi.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final exa M = dfi.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final exa N = dfi.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final exa O = dfi.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final exa P = dfi.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final exa[] Q = a(true);
   private static final exa[] R = a(false);

   @Override
   protected MapCodec<dsf> a() {
      return b;
   }

   private static exa[] a(boolean $$0) {
      return Arrays.stream(jf.values()).map($$1 -> a($$1, $$0)).toArray(exa[]::new);
   }

   private static exa a(jf $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewx.a(k, $$1 ? L : F);
         case b:
            return ewx.a(j, $$1 ? K : o);
         case c:
            return ewx.a(i, $$1 ? N : H);
         case d:
            return ewx.a(h, $$1 ? M : G);
         case e:
            return ewx.a(g, $$1 ? P : J);
         case f:
            return ewx.a(f, $$1 ? O : I);
      }
   }

   public dsf(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.c).a(c, dtn.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dsl $$0, dsl $$1) {
      dfi $$2 = $$0.c(c) == dtn.a ? dfk.by : dfk.br;
      return $$1.a($$2) && $$1.c(dse.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      if (!$$0.B && $$3.gb().d) {
         ja $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ja $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      dsl $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfk.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if ($$0.a((dcj)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud($$2.c(c) == dtn.b ? dfk.br : dfk.by);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
