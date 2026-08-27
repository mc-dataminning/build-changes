import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dsw extends dhg {
   public static final MapCodec<dsw> b = b(dsw::new);
   public static final dua<due> c = dts.bg;
   public static final dtt d = dts.x;
   public static final float e = 4.0F;
   protected static final exn f = dfc.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exn g = dfc.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final exn h = dfc.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final exn i = dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final exn j = dfc.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exn k = dfc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final exn o = dfc.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final exn F = dfc.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final exn G = dfc.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final exn H = dfc.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final exn I = dfc.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final exn J = dfc.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final exn K = dfc.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final exn L = dfc.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final exn M = dfc.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final exn N = dfc.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final exn O = dfc.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final exn P = dfc.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final exn[] Q = a(true);
   private static final exn[] R = a(false);

   @Override
   protected MapCodec<dsw> a() {
      return b;
   }

   private static exn[] a(boolean $$0) {
      return Arrays.stream(iw.values()).map($$1 -> a($$1, $$0)).toArray(exn[]::new);
   }

   private static exn a(iw $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return exk.a(k, $$1 ? L : F);
         case b:
            return exk.a(j, $$1 ? K : o);
         case c:
            return exk.a(i, $$1 ? N : H);
         case d:
            return exk.a(h, $$1 ? M : G);
         case e:
            return exk.a(g, $$1 ? P : J);
         case f:
            return exk.a(f, $$1 ? O : I);
      }
   }

   public dsw(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, iw.c).a(c, due.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dtc $$0, dtc $$1) {
      dfc $$2 = $$0.c(c) == due.a ? dfe.ci : dfe.cb;
      return $$1.a($$2) && $$1.c(dsv.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      if (!$$0.C && $$3.gm().d) {
         ir $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ir $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfe.cA) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if ($$0.a((dcd)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh($$2.c(c) == due.b ? dfe.cb : dfe.ci);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
