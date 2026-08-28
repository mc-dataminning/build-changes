import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cvc extends cwl {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int m = axk.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int n = axk.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int o = 10;
   private static final int p = 2;
   private static final int q = 200;

   public cvc(cwl.a $$0) {
      super($$0);
   }

   public static float c(cwp $$0) {
      cyt $$1 = $$0.a(kv.P, cyt.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(cwp $$0, ctz $$1, csm $$2, cox $$3) {
      cyt $$4 = $$0.a(kv.P);
      if ($$4 == null) {
         return false;
      } else {
         cwp $$5 = $$1.g();
         cyt.a $$6 = new cyt.a($$4);
         if ($$2 == csm.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kv.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == csm.b && $$5.f()) {
            cwp $$7 = $$6.b();
            if ($$7 != null) {
               cwp $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bul)$$3);
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
   public boolean a(cwp $$0, cwp $$1, ctz $$2, csm $$3, cox $$4, bvz $$5) {
      if ($$3 == csm.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cyt $$6 = $$0.a(kv.P);
         if ($$6 == null) {
            return false;
         } else {
            cyt.a $$7 = new cyt.a($$6);
            if ($$3 == csm.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kv.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == csm.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cwp $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bul)$$4);
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
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      $$1.c($$2);
      return bsk.a;
   }

   private void a(dgi $$0, cox $$1, cwp $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awk.c.b(this));
      }
   }

   @Override
   public boolean d(cwp $$0) {
      cyt $$1 = $$0.a(kv.P, cyt.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cwp $$0) {
      cyt $$1 = $$0.a(kv.P, cyt.a);
      return Math.min(1 + ayz.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cwp $$0) {
      cyt $$1 = $$0.a(kv.P, cyt.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? m : n;
   }

   public static void a(cwp $$0, int $$1) {
      cyt $$2 = $$0.a(kv.P);
      if ($$2 != null) {
         cyt.a $$3 = new cyt.a($$2);
         $$3.a($$1);
         $$0.b(kv.P, $$3.d());
      }
   }

   public static boolean g(cwp $$0) {
      cyt $$1 = $$0.a(kv.P);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(cwp $$0) {
      cyt $$1 = $$0.a(kv.P, cyt.a);
      return $$1.h();
   }

   public static cwp i(cwp $$0) {
      cyt $$1 = $$0.a(kv.P);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : cwp.j;
   }

   public static int j(cwp $$0) {
      cyt $$1 = $$0.a(kv.P, cyt.a);
      return $$1.a();
   }

   private boolean b(cwp $$0, cox $$1) {
      cyt $$2 = $$0.a(kv.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cwp> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cwp> a(cwp $$0, cox $$1, cyt $$2) {
      cyt.a $$3 = new cyt.a($$2);
      cwp $$4 = $$3.b();
      if ($$4 != null) {
         a((bul)$$1);
         $$0.b(kv.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dgi $$0, bvh $$1, cwp $$2, int $$3) {
      if ($$1 instanceof cox $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cwp $$0, bvh $$1) {
      return 200;
   }

   @Override
   public cwr b(cwp $$0) {
      return cwr.k;
   }

   @Override
   public Optional<cuj> k(cwp $$0) {
      return !$$0.b(kv.r) && !$$0.b(kv.q) ? Optional.ofNullable($$0.a(kv.P)).map(cui::new) : Optional.empty();
   }

   @Override
   public void a(clc $$0) {
      cyt $$1 = $$0.l().a(kv.P);
      if ($$1 != null) {
         $$0.l().b(kv.P, cyt.a);
         cws.a($$0, $$1.d());
      }
   }

   public static List<cvc> b() {
      return Stream.of(cwt.rB, cwt.rC, cwt.rD, cwt.rE, cwt.rF, cwt.rG, cwt.rH, cwt.rI, cwt.rJ, cwt.rK, cwt.rL, cwt.rR, cwt.rO, cwt.rP, cwt.rQ, cwt.rN, cwt.rM)
         .map($$0 -> (cvc)$$0)
         .toList();
   }

   public static cwl a(cvm $$0) {
      return switch ($$0) {
         case a -> cwt.rC;
         case b -> cwt.rD;
         case c -> cwt.rE;
         case d -> cwt.rF;
         case e -> cwt.rG;
         case f -> cwt.rH;
         case g -> cwt.rI;
         case h -> cwt.rJ;
         case i -> cwt.rK;
         case j -> cwt.rL;
         case l -> cwt.rN;
         case m -> cwt.rO;
         case n -> cwt.rP;
         case o -> cwt.rQ;
         case p -> cwt.rR;
         case k -> cwt.rM;
      };
   }

   private static void a(bul $$0) {
      $$0.a(awa.ds, 0.8F, 0.8F + $$0.dV().H_().i() * 0.4F);
   }

   private static void b(bul $$0) {
      $$0.a(awa.dq, 0.8F, 0.8F + $$0.dV().H_().i() * 0.4F);
   }

   private static void c(bul $$0) {
      $$0.a(awa.dr, 1.0F, 1.0F);
   }

   private static void a(dgi $$0, bul $$1) {
      $$0.a(null, $$1.dv(), awa.dp, awb.h, 0.8F, 0.8F + $$1.dV().H_().i() * 0.4F);
   }

   private void a(cox $$0) {
      csc $$1 = $$0.cd;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
