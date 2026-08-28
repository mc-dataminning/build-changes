import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cus extends cwb {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int l = axy.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int m = axy.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int n = 10;
   private static final int o = 2;
   private static final int p = 60;
   private final all q;
   private final all r;

   public cus(all $$0, all $$1, cwb.a $$2) {
      super($$2);
      this.q = $$0;
      this.r = $$1;
   }

   public static float c(cwf $$0) {
      cyj $$1 = $$0.a(ku.P, cyj.a);
      return $$1.f().floatValue();
   }

   public all b() {
      return this.q;
   }

   public all c() {
      return this.r;
   }

   @Override
   public boolean a(cwf $$0, ctp $$1, csc $$2, cor $$3) {
      cyj $$4 = $$0.a(ku.P);
      if ($$4 == null) {
         return false;
      } else {
         cwf $$5 = $$1.g();
         cyj.a $$6 = new cyj.a($$4);
         if ($$2 == csc.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(ku.P, $$6.d());
            return true;
         } else if ($$2 == csc.b && $$5.f()) {
            cwf $$7 = $$6.b();
            if ($$7 != null) {
               cwf $$8 = $$1.d($$7);
               if ($$8.L() > 0) {
                  $$6.a($$8);
               } else {
                  a($$3);
               }
            }

            $$0.b(ku.P, $$6.d());
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cwf $$0, cwf $$1, ctp $$2, csc $$3, cor $$4, bvw $$5) {
      if ($$3 == csc.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cyj $$6 = $$0.a(ku.P);
         if ($$6 == null) {
            return false;
         } else {
            cyj.a $$7 = new cyj.a($$6);
            if ($$3 == csc.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(ku.P, $$7.d());
               return true;
            } else if ($$3 == csc.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cwf $$8 = $$7.b();
                  if ($$8 != null) {
                     a($$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(ku.P, $$7.d());
               return true;
            } else {
               a($$0, -1);
               return false;
            }
         }
      }
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      if ($$0.C) {
         return bsh.c;
      } else {
         $$1.c($$2);
         return bsh.b;
      }
   }

   private void a(cor $$0, cwf $$1) {
      if (this.a($$1, $$0)) {
         d($$0);
         $$0.b(awy.c.b(this));
      }
   }

   @Override
   public boolean d(cwf $$0) {
      cyj $$1 = $$0.a(ku.P, cyj.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cwf $$0) {
      cyj $$1 = $$0.a(ku.P, cyj.a);
      return Math.min(1 + azn.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cwf $$0) {
      cyj $$1 = $$0.a(ku.P, cyj.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? l : m;
   }

   public static void a(cwf $$0, int $$1) {
      cyj $$2 = $$0.a(ku.P);
      if ($$2 != null) {
         cyj.a $$3 = new cyj.a($$2);
         $$3.a($$1);
         $$0.b(ku.P, $$3.d());
      }
   }

   public static boolean g(cwf $$0) {
      cyj $$1 = $$0.a(ku.P, cyj.a);
      return $$1.h() != -1;
   }

   public static int h(cwf $$0) {
      cyj $$1 = $$0.a(ku.P, cyj.a);
      return $$1.h();
   }

   public static cwf i(cwf $$0) {
      cyj $$1 = $$0.a(ku.P, cyj.a);
      return $$1.a($$1.h());
   }

   public static int j(cwf $$0) {
      cyj $$1 = $$0.a(ku.P, cyj.a);
      return $$1.a();
   }

   private boolean a(cwf $$0, cor $$1) {
      cyj $$2 = $$0.a(ku.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cwf> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cwf> a(cwf $$0, cor $$1, cyj $$2) {
      cyj.a $$3 = new cyj.a($$2);
      cwf $$4 = $$3.b();
      if ($$4 != null) {
         a($$1);
         $$0.b(ku.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dff $$0, bve $$1, cwf $$2, int $$3) {
      if (!$$0.C && $$1 instanceof cor $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$4, $$2);
         }
      }
   }

   @Override
   public int a(cwf $$0, bve $$1) {
      return 60;
   }

   @Override
   public Optional<ctz> k(cwf $$0) {
      return !$$0.b(ku.r) && !$$0.b(ku.q) ? Optional.ofNullable($$0.a(ku.P)).map(cty::new) : Optional.empty();
   }

   @Override
   public void a(ckz $$0) {
      cyj $$1 = $$0.m().a(ku.P);
      if ($$1 != null) {
         $$0.m().b(ku.P, cyj.a);
         cwi.a($$0, $$1.d());
      }
   }

   public static List<cus> d() {
      return Stream.of(cwj.qV, cwj.qW, cwj.qX, cwj.qY, cwj.qZ, cwj.ra, cwj.rb, cwj.rc, cwj.rd, cwj.re, cwj.rf, cwj.rl, cwj.ri, cwj.rj, cwj.rk, cwj.rh, cwj.rg)
         .map($$0 -> (cus)$$0)
         .toList();
   }

   public static cwb a(cvc $$0) {
      return switch ($$0) {
         case a -> cwj.qW;
         case b -> cwj.qX;
         case c -> cwj.qY;
         case d -> cwj.qZ;
         case e -> cwj.ra;
         case f -> cwj.rb;
         case g -> cwj.rc;
         case h -> cwj.rd;
         case i -> cwj.re;
         case j -> cwj.rf;
         case l -> cwj.rh;
         case m -> cwj.ri;
         case n -> cwj.rj;
         case o -> cwj.rk;
         case p -> cwj.rl;
         case k -> cwj.rg;
      };
   }

   private static void a(bui $$0) {
      $$0.a(awo.dr, 0.8F, 0.8F + $$0.dY().E_().i() * 0.4F);
   }

   private static void b(bui $$0) {
      $$0.a(awo.dp, 0.8F, 0.8F + $$0.dY().E_().i() * 0.4F);
   }

   private static void c(bui $$0) {
      $$0.a(awo.dq, 1.0F, 1.0F);
   }

   private static void d(bui $$0) {
      $$0.a(awo.do, 0.8F, 0.8F + $$0.dY().E_().i() * 0.4F);
   }
}
