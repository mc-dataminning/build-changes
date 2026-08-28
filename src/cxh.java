import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cxh extends cyo {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = axu.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = axu.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public cxh(cyo.a $$0) {
      super($$0);
   }

   public static float c(cys $$0) {
      dav $$1 = $$0.a(kj.Q, dav.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(cys $$0, cwh $$1, cuu $$2, cqs $$3) {
      dav $$4 = $$0.a(kj.Q);
      if ($$4 == null) {
         return false;
      } else {
         cys $$5 = $$1.g();
         dav.a $$6 = new dav.a($$4);
         if ($$2 == cuu.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kj.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cuu.b && $$5.f()) {
            cys $$7 = $$6.b();
            if ($$7 != null) {
               cys $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bwa)$$3);
               }
            }

            $$0.b(kj.Q, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cys $$0, cys $$1, cwh $$2, cuu $$3, cqs $$4, bxq $$5) {
      if ($$3 == cuu.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dav $$6 = $$0.a(kj.Q);
         if ($$6 == null) {
            return false;
         } else {
            dav.a $$7 = new dav.a($$6);
            if ($$3 == cuu.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kj.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cuu.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cys $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bwa)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kj.Q, $$7.d());
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
   public bty a(dip $$0, cqs $$1, btx $$2) {
      $$1.c($$2);
      return bty.a;
   }

   private void a(dip $$0, cqs $$1, cys $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awv.c.b(this));
      }
   }

   @Override
   public boolean d(cys $$0) {
      dav $$1 = $$0.a(kj.Q, dav.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cys $$0) {
      dav $$1 = $$0.a(kj.Q, dav.a);
      return Math.min(1 + azk.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cys $$0) {
      dav $$1 = $$0.a(kj.Q, dav.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(cys $$0, int $$1) {
      dav $$2 = $$0.a(kj.Q);
      if ($$2 != null) {
         dav.a $$3 = new dav.a($$2);
         $$3.a($$1);
         $$0.b(kj.Q, $$3.d());
      }
   }

   public static boolean g(cys $$0) {
      dav $$1 = $$0.a(kj.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(cys $$0) {
      dav $$1 = $$0.a(kj.Q, dav.a);
      return $$1.h();
   }

   public static cys i(cys $$0) {
      dav $$1 = $$0.a(kj.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : cys.k;
   }

   public static int j(cys $$0) {
      dav $$1 = $$0.a(kj.Q, dav.a);
      return $$1.a();
   }

   private boolean b(cys $$0, cqs $$1) {
      dav $$2 = $$0.a(kj.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<cys> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cys> a(cys $$0, cqs $$1, dav $$2) {
      dav.a $$3 = new dav.a($$2);
      cys $$4 = $$3.b();
      if ($$4 != null) {
         a((bwa)$$1);
         $$0.b(kj.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dip $$0, bwz $$1, cys $$2, int $$3) {
      if ($$1 instanceof cqs $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cys $$0, bwz $$1) {
      return 200;
   }

   @Override
   public cyu b(cys $$0) {
      return cyu.k;
   }

   @Override
   public Optional<cwr> k(cys $$0) {
      dbw $$1 = $$0.a(kj.q, dbw.c);
      return !$$1.a(kj.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kj.Q)).map(cwq::new);
   }

   @Override
   public void a(cmx $$0) {
      dav $$1 = $$0.f().a(kj.Q);
      if ($$1 != null) {
         $$0.f().b(kj.Q, dav.a);
         cyv.a($$0, $$1.d());
      }
   }

   public static List<cxh> a() {
      return Stream.of(cyw.rF, cyw.rG, cyw.rH, cyw.rI, cyw.rJ, cyw.rK, cyw.rL, cyw.rM, cyw.rN, cyw.rO, cyw.rP, cyw.rV, cyw.rS, cyw.rT, cyw.rU, cyw.rR, cyw.rQ)
         .map($$0 -> (cxh)$$0)
         .toList();
   }

   public static cyo a(cxq $$0) {
      return switch ($$0) {
         case a -> cyw.rG;
         case b -> cyw.rH;
         case c -> cyw.rI;
         case d -> cyw.rJ;
         case e -> cyw.rK;
         case f -> cyw.rL;
         case g -> cyw.rM;
         case h -> cyw.rN;
         case i -> cyw.rO;
         case j -> cyw.rP;
         case l -> cyw.rR;
         case m -> cyw.rS;
         case n -> cyw.rT;
         case o -> cyw.rU;
         case p -> cyw.rV;
         case k -> cyw.rQ;
      };
   }

   private static void a(bwa $$0) {
      $$0.a(awl.ds, 0.8F, 0.8F + $$0.dV().C_().i() * 0.4F);
   }

   private static void b(bwa $$0) {
      $$0.a(awl.dq, 0.8F, 0.8F + $$0.dV().C_().i() * 0.4F);
   }

   private static void c(bwa $$0) {
      $$0.a(awl.dr, 1.0F, 1.0F);
   }

   private static void a(dip $$0, bwa $$1) {
      $$0.a(null, $$1.dv(), awl.dp, awm.h, 0.8F, 0.8F + $$1.dV().C_().i() * 0.4F);
   }

   private void a(cqs $$0) {
      cuk $$1 = $$0.bQ;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
