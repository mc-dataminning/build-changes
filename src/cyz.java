import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cyz extends dag {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = ayh.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = ayh.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public cyz(dag.a $$0) {
      super($$0);
   }

   public static float c(dak $$0) {
      dcn $$1 = $$0.a(kl.Q, dcn.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(dak $$0, cxz $$1, cwl $$2, csi $$3) {
      dcn $$4 = $$0.a(kl.Q);
      if ($$4 == null) {
         return false;
      } else {
         dak $$5 = $$1.g();
         dcn.a $$6 = new dcn.a($$4);
         if ($$2 == cwl.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kl.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cwl.b && $$5.f()) {
            dak $$7 = $$6.b();
            if ($$7 != null) {
               dak $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bxe)$$3);
               }
            }

            $$0.b(kl.Q, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(dak $$0, dak $$1, cxz $$2, cwl $$3, csi $$4, byw $$5) {
      if ($$3 == cwl.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dcn $$6 = $$0.a(kl.Q);
         if ($$6 == null) {
            return false;
         } else {
            dcn.a $$7 = new dcn.a($$6);
            if ($$3 == cwl.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kl.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cwl.b && $$1.f()) {
               if ($$2.b($$4)) {
                  dak $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bxe)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kl.Q, $$7.d());
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
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      $$1.c($$2);
      return bvc.a;
   }

   private void a(dkj $$0, csi $$1, dak $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(axi.c.b(this));
      }
   }

   @Override
   public boolean d(dak $$0) {
      dcn $$1 = $$0.a(kl.Q, dcn.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(dak $$0) {
      dcn $$1 = $$0.a(kl.Q, dcn.a);
      return Math.min(1 + azz.a($$1.f(), 12), 13);
   }

   @Override
   public int f(dak $$0) {
      dcn $$1 = $$0.a(kl.Q, dcn.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(dak $$0, int $$1) {
      dcn $$2 = $$0.a(kl.Q);
      if ($$2 != null) {
         dcn.a $$3 = new dcn.a($$2);
         $$3.a($$1);
         $$0.b(kl.Q, $$3.d());
      }
   }

   public static boolean g(dak $$0) {
      dcn $$1 = $$0.a(kl.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(dak $$0) {
      dcn $$1 = $$0.a(kl.Q, dcn.a);
      return $$1.h();
   }

   public static dak i(dak $$0) {
      dcn $$1 = $$0.a(kl.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : dak.l;
   }

   public static int j(dak $$0) {
      dcn $$1 = $$0.a(kl.Q, dcn.a);
      return $$1.a();
   }

   private boolean b(dak $$0, csi $$1) {
      dcn $$2 = $$0.a(kl.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<dak> $$3 = a($$0, $$1, $$2);
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

   private static Optional<dak> a(dak $$0, csi $$1, dcn $$2) {
      dcn.a $$3 = new dcn.a($$2);
      dak $$4 = $$3.b();
      if ($$4 != null) {
         a((bxe)$$1);
         $$0.b(kl.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dkj $$0, byf $$1, dak $$2, int $$3) {
      if ($$1 instanceof csi $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(dak $$0, byf $$1) {
      return 200;
   }

   @Override
   public dam b(dak $$0) {
      return dam.k;
   }

   @Override
   public Optional<cyj> k(dak $$0) {
      ddo $$1 = $$0.a(kl.q, ddo.c);
      return !$$1.a(kl.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kl.Q)).map(cyi::new);
   }

   @Override
   public void a(coo $$0) {
      dcn $$1 = $$0.e().a(kl.Q);
      if ($$1 != null) {
         $$0.e().b(kl.Q, dcn.a);
         dan.a($$0, $$1.d());
      }
   }

   public static List<cyz> a() {
      return Stream.of(dao.rM, dao.rN, dao.rO, dao.rP, dao.rQ, dao.rR, dao.rS, dao.rT, dao.rU, dao.rV, dao.rW, dao.sc, dao.rZ, dao.sa, dao.sb, dao.rY, dao.rX)
         .map($$0 -> (cyz)$$0)
         .toList();
   }

   public static dag a(czi $$0) {
      return switch ($$0) {
         case a -> dao.rN;
         case b -> dao.rO;
         case c -> dao.rP;
         case d -> dao.rQ;
         case e -> dao.rR;
         case f -> dao.rS;
         case g -> dao.rT;
         case h -> dao.rU;
         case i -> dao.rV;
         case j -> dao.rW;
         case l -> dao.rY;
         case m -> dao.rZ;
         case n -> dao.sa;
         case o -> dao.sb;
         case p -> dao.sc;
         case k -> dao.rX;
      };
   }

   private static void a(bxe $$0) {
      $$0.a(awy.ds, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private static void b(bxe $$0) {
      $$0.a(awy.dq, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private static void c(bxe $$0) {
      $$0.a(awy.dr, 1.0F, 1.0F);
   }

   private static void a(dkj $$0, bxe $$1) {
      $$0.a(null, $$1.dv(), awy.dp, awz.h, 0.8F, 0.8F + $$1.dV().G_().i() * 0.4F);
   }

   private void a(csi $$0) {
      cwb $$1 = $$0.bR;
      if ($$1 != null) {
         $$1.a($$0.gj());
      }
   }
}
