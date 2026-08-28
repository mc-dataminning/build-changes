import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dsb extends dhi {
   public static final MapCodec<dsb> b = b(dsb::new);
   public static final dtf<dtj> c = dsx.bg;
   public static final dsy d = dsx.x;
   public static final float e = 4.0F;
   protected static final ews f = dff.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ews g = dff.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ews h = dff.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ews i = dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ews j = dff.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ews k = dff.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ews o = dff.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ews F = dff.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ews G = dff.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ews H = dff.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ews I = dff.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ews J = dff.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ews K = dff.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ews L = dff.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ews M = dff.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ews N = dff.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ews O = dff.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ews P = dff.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ews[] Q = a(true);
   private static final ews[] R = a(false);

   @Override
   protected MapCodec<dsb> a() {
      return b;
   }

   private static ews[] a(boolean $$0) {
      return Arrays.stream(jf.values()).map($$1 -> a($$1, $$0)).toArray(ews[]::new);
   }

   private static ews a(jf $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewp.a(k, $$1 ? L : F);
         case b:
            return ewp.a(j, $$1 ? K : o);
         case c:
            return ewp.a(i, $$1 ? N : H);
         case d:
            return ewp.a(h, $$1 ? M : G);
         case e:
            return ewp.a(g, $$1 ? P : J);
         case f:
            return ewp.a(f, $$1 ? O : I);
      }
   }

   public dsb(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.c).a(c, dtj.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dsh $$0, dsh $$1) {
      dff $$2 = $$0.c(c) == dtj.a ? dfh.by : dfh.br;
      return $$1.a($$2) && $$1.c(dsa.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$0.B && $$3.fZ().d) {
         ja $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ja $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      dsh $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfh.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if ($$0.a((dcg)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua($$2.c(c) == dtj.b ? dfh.br : dfh.by);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
