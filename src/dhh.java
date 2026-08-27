import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dhh extends cxi {
   public static final MapCodec<dhh> b = b(dhh::new);
   public static final dil<dip> c = did.bg;
   public static final die d = did.x;
   public static final float e = 4.0F;
   protected static final eks f = cvf.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eks g = cvf.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eks h = cvf.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eks i = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eks j = cvf.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eks k = cvf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eks o = cvf.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eks F = cvf.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eks G = cvf.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eks H = cvf.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eks I = cvf.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eks J = cvf.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eks K = cvf.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eks L = cvf.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eks M = cvf.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eks N = cvf.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eks O = cvf.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eks P = cvf.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eks[] Q = a(true);
   private static final eks[] R = a(false);

   @Override
   protected MapCodec<dhh> a() {
      return b;
   }

   private static eks[] a(boolean $$0) {
      return Arrays.stream(ib.values()).map($$1 -> a($$1, $$0)).toArray(eks[]::new);
   }

   private static eks a(ib $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ekp.a(k, $$1 ? L : F);
         case b:
            return ekp.a(j, $$1 ? K : o);
         case c:
            return ekp.a(i, $$1 ? N : H);
         case d:
            return ekp.a(h, $$1 ? M : G);
         case e:
            return ekp.a(g, $$1 ? P : J);
         case f:
            return ekp.a(f, $$1 ? O : I);
      }
   }

   public dhh(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ib.c).a(c, dip.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dhn $$0, dhn $$1) {
      cvf $$2 = $$0.c(c) == dip.a ? cvh.by : cvh.br;
      return $$1.a($$2) && $$1.c(dhg.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      if (!$$0.B && $$3.fU().d) {
         hx $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         hx $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cvh.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if ($$0.a((csi)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo($$2.c(c) == dip.b ? cvh.br : cvh.by);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
