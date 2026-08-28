import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cvd extends cwm {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int m = axk.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int n = axk.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int o = 10;
   private static final int p = 2;
   private static final int q = 200;

   public cvd(cwm.a $$0) {
      super($$0);
   }

   public static float c(cwq $$0) {
      cyu $$1 = $$0.a(kv.P, cyu.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(cwq $$0, cua $$1, csn $$2, coy $$3) {
      cyu $$4 = $$0.a(kv.P);
      if ($$4 == null) {
         return false;
      } else {
         cwq $$5 = $$1.g();
         cyu.a $$6 = new cyu.a($$4);
         if ($$2 == csn.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kv.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == csn.b && $$5.f()) {
            cwq $$7 = $$6.b();
            if ($$7 != null) {
               cwq $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bum)$$3);
               }
            }

            $$0.b(kv.P, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cwq $$0, cwq $$1, cua $$2, csn $$3, coy $$4, bwa $$5) {
      if ($$3 == csn.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cyu $$6 = $$0.a(kv.P);
         if ($$6 == null) {
            return false;
         } else {
            cyu.a $$7 = new cyu.a($$6);
            if ($$3 == csn.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kv.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == csn.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cwq $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bum)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kv.P, $$7.d());
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
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      $$1.c($$2);
      return bsl.a;
   }

   private void a(dgj $$0, coy $$1, cwq $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awk.c.b(this));
      }
   }

   @Override
   public boolean d(cwq $$0) {
      cyu $$1 = $$0.a(kv.P, cyu.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cwq $$0) {
      cyu $$1 = $$0.a(kv.P, cyu.a);
      return Math.min(1 + ayz.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cwq $$0) {
      cyu $$1 = $$0.a(kv.P, cyu.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? m : n;
   }

   public static void a(cwq $$0, int $$1) {
      cyu $$2 = $$0.a(kv.P);
      if ($$2 != null) {
         cyu.a $$3 = new cyu.a($$2);
         $$3.a($$1);
         $$0.b(kv.P, $$3.d());
      }
   }

   public static boolean g(cwq $$0) {
      cyu $$1 = $$0.a(kv.P);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(cwq $$0) {
      cyu $$1 = $$0.a(kv.P, cyu.a);
      return $$1.h();
   }

   public static cwq i(cwq $$0) {
      cyu $$1 = $$0.a(kv.P);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : cwq.j;
   }

   public static int j(cwq $$0) {
      cyu $$1 = $$0.a(kv.P, cyu.a);
      return $$1.a();
   }

   private boolean b(cwq $$0, coy $$1) {
      cyu $$2 = $$0.a(kv.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cwq> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cwq> a(cwq $$0, coy $$1, cyu $$2) {
      cyu.a $$3 = new cyu.a($$2);
      cwq $$4 = $$3.b();
      if ($$4 != null) {
         a((bum)$$1);
         $$0.b(kv.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dgj $$0, bvi $$1, cwq $$2, int $$3) {
      if ($$1 instanceof coy $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cwq $$0, bvi $$1) {
      return 200;
   }

   @Override
   public cws b(cwq $$0) {
      return cws.k;
   }

   @Override
   public Optional<cuk> k(cwq $$0) {
      return !$$0.b(kv.r) && !$$0.b(kv.q) ? Optional.ofNullable($$0.a(kv.P)).map(cuj::new) : Optional.empty();
   }

   @Override
   public void a(cld $$0) {
      cyu $$1 = $$0.l().a(kv.P);
      if ($$1 != null) {
         $$0.l().b(kv.P, cyu.a);
         cwt.a($$0, $$1.d());
      }
   }

   public static List<cvd> b() {
      return Stream.of(cwu.rB, cwu.rC, cwu.rD, cwu.rE, cwu.rF, cwu.rG, cwu.rH, cwu.rI, cwu.rJ, cwu.rK, cwu.rL, cwu.rR, cwu.rO, cwu.rP, cwu.rQ, cwu.rN, cwu.rM)
         .map($$0 -> (cvd)$$0)
         .toList();
   }

   public static cwm a(cvn $$0) {
      return switch ($$0) {
         case a -> cwu.rC;
         case b -> cwu.rD;
         case c -> cwu.rE;
         case d -> cwu.rF;
         case e -> cwu.rG;
         case f -> cwu.rH;
         case g -> cwu.rI;
         case h -> cwu.rJ;
         case i -> cwu.rK;
         case j -> cwu.rL;
         case l -> cwu.rN;
         case m -> cwu.rO;
         case n -> cwu.rP;
         case o -> cwu.rQ;
         case p -> cwu.rR;
         case k -> cwu.rM;
      };
   }

   private static void a(bum $$0) {
      $$0.a(awa.ds, 0.8F, 0.8F + $$0.dV().H_().i() * 0.4F);
   }

   private static void b(bum $$0) {
      $$0.a(awa.dq, 0.8F, 0.8F + $$0.dV().H_().i() * 0.4F);
   }

   private static void c(bum $$0) {
      $$0.a(awa.dr, 1.0F, 1.0F);
   }

   private static void a(dgj $$0, bum $$1) {
      $$0.a(null, $$1.dv(), awa.dp, awb.h, 0.8F, 0.8F + $$1.dV().H_().i() * 0.4F);
   }

   private void a(coy $$0) {
      csd $$1 = $$0.cd;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
