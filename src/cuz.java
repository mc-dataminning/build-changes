import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class cuz extends cwi {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int l = axx.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int m = axx.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int n = 10;
   private static final int o = 2;
   private static final int p = 60;
   private final alj q;
   private final alj r;

   public cuz(alj $$0, alj $$1, cwi.a $$2) {
      super($$2);
      this.q = $$0;
      this.r = $$1;
   }

   public static float c(cwm $$0) {
      cyq $$1 = $$0.a(ku.P, cyq.a);
      return $$1.f().floatValue();
   }

   public alj b() {
      return this.q;
   }

   public alj c() {
      return this.r;
   }

   @Override
   public boolean a(cwm $$0, ctw $$1, csj $$2, cou $$3) {
      cyq $$4 = $$0.a(ku.P);
      if ($$4 == null) {
         return false;
      } else {
         cwm $$5 = $$1.g();
         cyq.a $$6 = new cyq.a($$4);
         if ($$2 == csj.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(ku.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == csj.b && $$5.f()) {
            cwm $$7 = $$6.b();
            if ($$7 != null) {
               cwm $$8 = $$1.d($$7);
               if ($$8.L() > 0) {
                  $$6.a($$8);
               } else {
                  a((bul)$$3);
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
   public boolean a(cwm $$0, cwm $$1, ctw $$2, csj $$3, cou $$4, bvz $$5) {
      if ($$3 == csj.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cyq $$6 = $$0.a(ku.P);
         if ($$6 == null) {
            return false;
         } else {
            cyq.a $$7 = new cyq.a($$6);
            if ($$3 == csj.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(ku.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == csj.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cwm $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bul)$$4);
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
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      if ($$0.C) {
         return bsk.c;
      } else {
         $$1.c($$2);
         return bsk.b;
      }
   }

   private void a(cou $$0, cwm $$1) {
      if (this.a($$1, $$0)) {
         d($$0);
         $$0.b(awx.c.b(this));
      }
   }

   @Override
   public boolean d(cwm $$0) {
      cyq $$1 = $$0.a(ku.P, cyq.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cwm $$0) {
      cyq $$1 = $$0.a(ku.P, cyq.a);
      return Math.min(1 + azm.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cwm $$0) {
      cyq $$1 = $$0.a(ku.P, cyq.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? l : m;
   }

   public static void a(cwm $$0, int $$1) {
      cyq $$2 = $$0.a(ku.P);
      if ($$2 != null) {
         cyq.a $$3 = new cyq.a($$2);
         $$3.a($$1);
         $$0.b(ku.P, $$3.d());
      }
   }

   public static boolean g(cwm $$0) {
      cyq $$1 = $$0.a(ku.P, cyq.a);
      return $$1.h() != -1;
   }

   public static int h(cwm $$0) {
      cyq $$1 = $$0.a(ku.P, cyq.a);
      return $$1.h();
   }

   public static cwm i(cwm $$0) {
      cyq $$1 = $$0.a(ku.P, cyq.a);
      return $$1.a($$1.h());
   }

   public static int j(cwm $$0) {
      cyq $$1 = $$0.a(ku.P, cyq.a);
      return $$1.a();
   }

   private boolean a(cwm $$0, cou $$1) {
      cyq $$2 = $$0.a(ku.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cwm> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cwm> a(cwm $$0, cou $$1, cyq $$2) {
      cyq.a $$3 = new cyq.a($$2);
      cwm $$4 = $$3.b();
      if ($$4 != null) {
         a((bul)$$1);
         $$0.b(ku.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dfm $$0, bvh $$1, cwm $$2, int $$3) {
      if (!$$0.C && $$1 instanceof cou $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$4, $$2);
         }
      }
   }

   @Override
   public int a(cwm $$0, bvh $$1) {
      return 60;
   }

   @Override
   public Optional<cug> k(cwm $$0) {
      return !$$0.b(ku.r) && !$$0.b(ku.q) ? Optional.ofNullable($$0.a(ku.P)).map(cuf::new) : Optional.empty();
   }

   @Override
   public void a(clc $$0) {
      cyq $$1 = $$0.j().a(ku.P);
      if ($$1 != null) {
         $$0.j().b(ku.P, cyq.a);
         cwp.a($$0, $$1.d());
      }
   }

   public static cwi a(cvj $$0) {
      return switch ($$0) {
         case a -> cwq.qW;
         case b -> cwq.qX;
         case c -> cwq.qY;
         case d -> cwq.qZ;
         case e -> cwq.ra;
         case f -> cwq.rb;
         case g -> cwq.rc;
         case h -> cwq.rd;
         case i -> cwq.re;
         case j -> cwq.rf;
         case l -> cwq.rh;
         case m -> cwq.ri;
         case n -> cwq.rj;
         case o -> cwq.rk;
         case p -> cwq.rl;
         case k -> cwq.rg;
      };
   }

   private static void a(bul $$0) {
      $$0.a(awn.dr, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private static void b(bul $$0) {
      $$0.a(awn.dp, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private static void c(bul $$0) {
      $$0.a(awn.dq, 1.0F, 1.0F);
   }

   private static void d(bul $$0) {
      $$0.a(awn.do, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private void a(cou $$0) {
      crz $$1 = $$0.cc;
      if ($$1 != null) {
         $$1.a($$0.gg());
      }
   }
}
