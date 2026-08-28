import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cwc extends cxl {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int m = ayp.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int n = ayp.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int o = 10;
   private static final int p = 2;
   private static final int q = 200;
   private final alz r;
   private final alz s;

   public cwc(alz $$0, alz $$1, cxl.a $$2) {
      super($$2);
      this.r = $$0;
      this.s = $$1;
   }

   public static float c(cxp $$0) {
      czt $$1 = $$0.a(ku.P, czt.a);
      return $$1.f().floatValue();
   }

   public alz b() {
      return this.r;
   }

   public alz c() {
      return this.s;
   }

   @Override
   public boolean a(cxp $$0, cuz $$1, ctm $$2, cpx $$3) {
      czt $$4 = $$0.a(ku.P);
      if ($$4 == null) {
         return false;
      } else {
         cxp $$5 = $$1.g();
         czt.a $$6 = new czt.a($$4);
         if ($$2 == ctm.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(ku.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == ctm.b && $$5.f()) {
            cxp $$7 = $$6.b();
            if ($$7 != null) {
               cxp $$8 = $$1.d($$7);
               if ($$8.L() > 0) {
                  $$6.a($$8);
               } else {
                  a((bvk)$$3);
               }
            }

            $$0.b(ku.P, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cxp $$0, cxp $$1, cuz $$2, ctm $$3, cpx $$4, bwy $$5) {
      if ($$3 == ctm.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         czt $$6 = $$0.a(ku.P);
         if ($$6 == null) {
            return false;
         } else {
            czt.a $$7 = new czt.a($$6);
            if ($$3 == ctm.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(ku.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == ctm.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cxp $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bvk)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(ku.P, $$7.d());
               this.a($$4);
               return true;
            } else {
               a($$0, -1);
               return false;
            }
         }
      }
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      if ($$0.C) {
         return btj.c;
      } else {
         $$1.c($$2);
         return btj.b;
      }
   }

   private void a(dhi $$0, cpx $$1, cxp $$2) {
      if (this.a($$2, $$1)) {
         a($$0, $$1);
         $$1.b(axp.c.b(this));
      }
   }

   @Override
   public boolean d(cxp $$0) {
      czt $$1 = $$0.a(ku.P, czt.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cxp $$0) {
      czt $$1 = $$0.a(ku.P, czt.a);
      return Math.min(1 + bae.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cxp $$0) {
      czt $$1 = $$0.a(ku.P, czt.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? m : n;
   }

   public static void a(cxp $$0, int $$1) {
      czt $$2 = $$0.a(ku.P);
      if ($$2 != null) {
         czt.a $$3 = new czt.a($$2);
         $$3.a($$1);
         $$0.b(ku.P, $$3.d());
      }
   }

   public static boolean g(cxp $$0) {
      czt $$1 = $$0.a(ku.P, czt.a);
      return $$1.h() != -1;
   }

   public static int h(cxp $$0) {
      czt $$1 = $$0.a(ku.P, czt.a);
      return $$1.h();
   }

   public static cxp i(cxp $$0) {
      czt $$1 = $$0.a(ku.P, czt.a);
      return $$1.a($$1.h());
   }

   public static int j(cxp $$0) {
      czt $$1 = $$0.a(ku.P, czt.a);
      return $$1.a();
   }

   private boolean a(cxp $$0, cpx $$1) {
      czt $$2 = $$0.a(ku.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cxp> $$3 = a($$0, $$1, $$2);
         if ($$3.isPresent()) {
            $$1.a($$3.get(), true);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static Optional<cxp> a(cxp $$0, cpx $$1, czt $$2) {
      czt.a $$3 = new czt.a($$2);
      cxp $$4 = $$3.b();
      if ($$4 != null) {
         a((bvk)$$1);
         $$0.b(ku.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dhi $$0, bwg $$1, cxp $$2, int $$3) {
      if (!$$0.C && $$1 instanceof cpx $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cxp $$0, bwg $$1) {
      return 200;
   }

   @Override
   public Optional<cvj> k(cxp $$0) {
      return !$$0.b(ku.r) && !$$0.b(ku.q) ? Optional.ofNullable($$0.a(ku.P)).map(cvi::new) : Optional.empty();
   }

   @Override
   public void a(cmb $$0) {
      czt $$1 = $$0.l().a(ku.P);
      if ($$1 != null) {
         $$0.l().b(ku.P, czt.a);
         cxs.a($$0, $$1.d());
      }
   }

   public static List<cwc> d() {
      return Stream.of(cxt.rs, cxt.rt, cxt.ru, cxt.rv, cxt.rw, cxt.rx, cxt.ry, cxt.rz, cxt.rA, cxt.rB, cxt.rC, cxt.rI, cxt.rF, cxt.rG, cxt.rH, cxt.rE, cxt.rD)
         .map($$0 -> (cwc)$$0)
         .toList();
   }

   public static cxl a(cwm $$0) {
      return switch ($$0) {
         case a -> cxt.rt;
         case b -> cxt.ru;
         case c -> cxt.rv;
         case d -> cxt.rw;
         case e -> cxt.rx;
         case f -> cxt.ry;
         case g -> cxt.rz;
         case h -> cxt.rA;
         case i -> cxt.rB;
         case j -> cxt.rC;
         case l -> cxt.rE;
         case m -> cxt.rF;
         case n -> cxt.rG;
         case o -> cxt.rH;
         case p -> cxt.rI;
         case k -> cxt.rD;
      };
   }

   private static void a(bvk $$0) {
      $$0.a(axf.ds, 0.8F, 0.8F + $$0.dW().H_().i() * 0.4F);
   }

   private static void b(bvk $$0) {
      $$0.a(axf.dq, 0.8F, 0.8F + $$0.dW().H_().i() * 0.4F);
   }

   private static void c(bvk $$0) {
      $$0.a(axf.dr, 1.0F, 1.0F);
   }

   private static void a(dhi $$0, bvk $$1) {
      $$0.a(null, $$1.dw(), axf.dp, axg.h, 0.8F, 0.8F + $$1.dW().H_().i() * 0.4F);
   }

   private void a(cpx $$0) {
      ctc $$1 = $$0.cd;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
