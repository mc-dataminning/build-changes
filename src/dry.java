import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dry extends dhe {
   public static final MapCodec<dry> b = b(dry::new);
   public static final dtc<dtg> c = dsu.bg;
   public static final dsv d = dsu.x;
   public static final float e = 4.0F;
   protected static final ewm f = dfb.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewm g = dfb.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ewm h = dfb.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ewm i = dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ewm j = dfb.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewm k = dfb.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ewm o = dfb.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewm F = dfb.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ewm G = dfb.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ewm H = dfb.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ewm I = dfb.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewm J = dfb.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ewm K = dfb.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewm L = dfb.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewm M = dfb.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ewm N = dfb.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ewm O = dfb.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewm P = dfb.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ewm[] Q = a(true);
   private static final ewm[] R = a(false);

   @Override
   protected MapCodec<dry> a() {
      return b;
   }

   private static ewm[] a(boolean $$0) {
      return Arrays.stream(je.values()).map($$1 -> a($$1, $$0)).toArray(ewm[]::new);
   }

   private static ewm a(je $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewj.a(k, $$1 ? L : F);
         case b:
            return ewj.a(j, $$1 ? K : o);
         case c:
            return ewj.a(i, $$1 ? N : H);
         case d:
            return ewj.a(h, $$1 ? M : G);
         case e:
            return ewj.a(g, $$1 ? P : J);
         case f:
            return ewj.a(f, $$1 ? O : I);
      }
   }

   public dry(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(c, dtg.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dse $$0, dse $$1) {
      dfb $$2 = $$0.c(c) == dtg.a ? dfd.by : dfd.br;
      return $$1.a($$2) && $$1.c(drx.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dse a(dca $$0, iz $$1, dse $$2, cmz $$3) {
      if (!$$0.B && $$3.gd().d) {
         iz $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         iz $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      dse $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfd.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if ($$0.a((dcd)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur($$2.c(c) == dtg.b ? dfd.br : dfd.by);
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
