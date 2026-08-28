import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cvt extends cxc {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int m = ayf.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int n = ayf.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int o = 10;
   private static final int p = 2;
   private static final int q = 200;
   private final alp r;
   private final alp s;

   public cvt(alp $$0, alp $$1, cxc.a $$2) {
      super($$2);
      this.r = $$0;
      this.s = $$1;
   }

   public static float c(cxg $$0) {
      czk $$1 = $$0.a(ku.P, czk.a);
      return $$1.f().floatValue();
   }

   public alp b() {
      return this.r;
   }

   public alp c() {
      return this.s;
   }

   @Override
   public boolean a(cxg $$0, cuq $$1, ctd $$2, cpo $$3) {
      czk $$4 = $$0.a(ku.P);
      if ($$4 == null) {
         return false;
      } else {
         cxg $$5 = $$1.g();
         czk.a $$6 = new czk.a($$4);
         if ($$2 == ctd.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(ku.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == ctd.b && $$5.f()) {
            cxg $$7 = $$6.b();
            if ($$7 != null) {
               cxg $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bvb)$$3);
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
   public boolean a(cxg $$0, cxg $$1, cuq $$2, ctd $$3, cpo $$4, bwp $$5) {
      if ($$3 == ctd.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         czk $$6 = $$0.a(ku.P);
         if ($$6 == null) {
            return false;
         } else {
            czk.a $$7 = new czk.a($$6);
            if ($$3 == ctd.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(ku.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == ctd.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cxg $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bvb)$$4);
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
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      if ($$0.C) {
         return bta.c;
      } else {
         $$1.c($$2);
         return bta.b;
      }
   }

   private void a(dgz $$0, cpo $$1, cxg $$2) {
      if (this.a($$2, $$1)) {
         a($$0, $$1);
         $$1.b(axf.c.b(this));
      }
   }

   @Override
   public boolean d(cxg $$0) {
      czk $$1 = $$0.a(ku.P, czk.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cxg $$0) {
      czk $$1 = $$0.a(ku.P, czk.a);
      return Math.min(1 + azu.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cxg $$0) {
      czk $$1 = $$0.a(ku.P, czk.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? m : n;
   }

   public static void a(cxg $$0, int $$1) {
      czk $$2 = $$0.a(ku.P);
      if ($$2 != null) {
         czk.a $$3 = new czk.a($$2);
         $$3.a($$1);
         $$0.b(ku.P, $$3.d());
      }
   }

   public static boolean g(cxg $$0) {
      czk $$1 = $$0.a(ku.P, czk.a);
      return $$1.h() != -1;
   }

   public static int h(cxg $$0) {
      czk $$1 = $$0.a(ku.P, czk.a);
      return $$1.h();
   }

   public static cxg i(cxg $$0) {
      czk $$1 = $$0.a(ku.P, czk.a);
      return $$1.a($$1.h());
   }

   public static int j(cxg $$0) {
      czk $$1 = $$0.a(ku.P, czk.a);
      return $$1.a();
   }

   private boolean a(cxg $$0, cpo $$1) {
      czk $$2 = $$0.a(ku.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cxg> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cxg> a(cxg $$0, cpo $$1, czk $$2) {
      czk.a $$3 = new czk.a($$2);
      cxg $$4 = $$3.b();
      if ($$4 != null) {
         a((bvb)$$1);
         $$0.b(ku.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dgz $$0, bvx $$1, cxg $$2, int $$3) {
      if (!$$0.C && $$1 instanceof cpo $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cxg $$0, bvx $$1) {
      return 200;
   }

   @Override
   public Optional<cva> k(cxg $$0) {
      return !$$0.b(ku.r) && !$$0.b(ku.q) ? Optional.ofNullable($$0.a(ku.P)).map(cuz::new) : Optional.empty();
   }

   @Override
   public void a(cls $$0) {
      czk $$1 = $$0.l().a(ku.P);
      if ($$1 != null) {
         $$0.l().b(ku.P, czk.a);
         cxj.a($$0, $$1.d());
      }
   }

   public static List<cvt> d() {
      return Stream.of(cxk.rB, cxk.rC, cxk.rD, cxk.rE, cxk.rF, cxk.rG, cxk.rH, cxk.rI, cxk.rJ, cxk.rK, cxk.rL, cxk.rR, cxk.rO, cxk.rP, cxk.rQ, cxk.rN, cxk.rM)
         .map($$0 -> (cvt)$$0)
         .toList();
   }

   public static cxc a(cwd $$0) {
      return switch ($$0) {
         case a -> cxk.rC;
         case b -> cxk.rD;
         case c -> cxk.rE;
         case d -> cxk.rF;
         case e -> cxk.rG;
         case f -> cxk.rH;
         case g -> cxk.rI;
         case h -> cxk.rJ;
         case i -> cxk.rK;
         case j -> cxk.rL;
         case l -> cxk.rN;
         case m -> cxk.rO;
         case n -> cxk.rP;
         case o -> cxk.rQ;
         case p -> cxk.rR;
         case k -> cxk.rM;
      };
   }

   private static void a(bvb $$0) {
      $$0.a(awv.ds, 0.8F, 0.8F + $$0.dW().H_().i() * 0.4F);
   }

   private static void b(bvb $$0) {
      $$0.a(awv.dq, 0.8F, 0.8F + $$0.dW().H_().i() * 0.4F);
   }

   private static void c(bvb $$0) {
      $$0.a(awv.dr, 1.0F, 1.0F);
   }

   private static void a(dgz $$0, bvb $$1) {
      $$0.a(null, $$1.dw(), awv.dp, aww.h, 0.8F, 0.8F + $$1.dW().H_().i() * 0.4F);
   }

   private void a(cpo $$0) {
      cst $$1 = $$0.cd;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
