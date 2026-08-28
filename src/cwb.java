import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cwb extends cxk {
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

   public cwb(alz $$0, alz $$1, cxk.a $$2) {
      super($$2);
      this.r = $$0;
      this.s = $$1;
   }

   public static float c(cxo $$0) {
      czs $$1 = $$0.a(ku.P, czs.a);
      return $$1.f().floatValue();
   }

   public alz b() {
      return this.r;
   }

   public alz c() {
      return this.s;
   }

   @Override
   public boolean a(cxo $$0, cuy $$1, ctl $$2, cpw $$3) {
      czs $$4 = $$0.a(ku.P);
      if ($$4 == null) {
         return false;
      } else {
         cxo $$5 = $$1.g();
         czs.a $$6 = new czs.a($$4);
         if ($$2 == ctl.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(ku.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == ctl.b && $$5.f()) {
            cxo $$7 = $$6.b();
            if ($$7 != null) {
               cxo $$8 = $$1.d($$7);
               if ($$8.L() > 0) {
                  $$6.a($$8);
               } else {
                  a((bvj)$$3);
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
   public boolean a(cxo $$0, cxo $$1, cuy $$2, ctl $$3, cpw $$4, bwx $$5) {
      if ($$3 == ctl.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         czs $$6 = $$0.a(ku.P);
         if ($$6 == null) {
            return false;
         } else {
            czs.a $$7 = new czs.a($$6);
            if ($$3 == ctl.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(ku.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == ctl.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cxo $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bvj)$$4);
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
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      if ($$0.C) {
         return bti.c;
      } else {
         $$1.c($$2);
         return bti.b;
      }
   }

   private void a(dhh $$0, cpw $$1, cxo $$2) {
      if (this.a($$2, $$1)) {
         a($$0, $$1);
         $$1.b(axp.c.b(this));
      }
   }

   @Override
   public boolean d(cxo $$0) {
      czs $$1 = $$0.a(ku.P, czs.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cxo $$0) {
      czs $$1 = $$0.a(ku.P, czs.a);
      return Math.min(1 + bae.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cxo $$0) {
      czs $$1 = $$0.a(ku.P, czs.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? m : n;
   }

   public static void a(cxo $$0, int $$1) {
      czs $$2 = $$0.a(ku.P);
      if ($$2 != null) {
         czs.a $$3 = new czs.a($$2);
         $$3.a($$1);
         $$0.b(ku.P, $$3.d());
      }
   }

   public static boolean g(cxo $$0) {
      czs $$1 = $$0.a(ku.P, czs.a);
      return $$1.h() != -1;
   }

   public static int h(cxo $$0) {
      czs $$1 = $$0.a(ku.P, czs.a);
      return $$1.h();
   }

   public static cxo i(cxo $$0) {
      czs $$1 = $$0.a(ku.P, czs.a);
      return $$1.a($$1.h());
   }

   public static int j(cxo $$0) {
      czs $$1 = $$0.a(ku.P, czs.a);
      return $$1.a();
   }

   private boolean a(cxo $$0, cpw $$1) {
      czs $$2 = $$0.a(ku.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cxo> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cxo> a(cxo $$0, cpw $$1, czs $$2) {
      czs.a $$3 = new czs.a($$2);
      cxo $$4 = $$3.b();
      if ($$4 != null) {
         a((bvj)$$1);
         $$0.b(ku.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dhh $$0, bwf $$1, cxo $$2, int $$3) {
      if (!$$0.C && $$1 instanceof cpw $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cxo $$0, bwf $$1) {
      return 200;
   }

   @Override
   public Optional<cvi> k(cxo $$0) {
      return !$$0.b(ku.r) && !$$0.b(ku.q) ? Optional.ofNullable($$0.a(ku.P)).map(cvh::new) : Optional.empty();
   }

   @Override
   public void a(cma $$0) {
      czs $$1 = $$0.l().a(ku.P);
      if ($$1 != null) {
         $$0.l().b(ku.P, czs.a);
         cxr.a($$0, $$1.d());
      }
   }

   public static List<cwb> d() {
      return Stream.of(cxs.rs, cxs.rt, cxs.ru, cxs.rv, cxs.rw, cxs.rx, cxs.ry, cxs.rz, cxs.rA, cxs.rB, cxs.rC, cxs.rI, cxs.rF, cxs.rG, cxs.rH, cxs.rE, cxs.rD)
         .map($$0 -> (cwb)$$0)
         .toList();
   }

   public static cxk a(cwl $$0) {
      return switch ($$0) {
         case a -> cxs.rt;
         case b -> cxs.ru;
         case c -> cxs.rv;
         case d -> cxs.rw;
         case e -> cxs.rx;
         case f -> cxs.ry;
         case g -> cxs.rz;
         case h -> cxs.rA;
         case i -> cxs.rB;
         case j -> cxs.rC;
         case l -> cxs.rE;
         case m -> cxs.rF;
         case n -> cxs.rG;
         case o -> cxs.rH;
         case p -> cxs.rI;
         case k -> cxs.rD;
      };
   }

   private static void a(bvj $$0) {
      $$0.a(axf.ds, 0.8F, 0.8F + $$0.dW().H_().i() * 0.4F);
   }

   private static void b(bvj $$0) {
      $$0.a(axf.dq, 0.8F, 0.8F + $$0.dW().H_().i() * 0.4F);
   }

   private static void c(bvj $$0) {
      $$0.a(axf.dr, 1.0F, 1.0F);
   }

   private static void a(dhh $$0, bvj $$1) {
      $$0.a(null, $$1.dw(), axf.dp, axg.h, 0.8F, 0.8F + $$1.dW().H_().i() * 0.4F);
   }

   private void a(cpw $$0) {
      ctb $$1 = $$0.cd;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
