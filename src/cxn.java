import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cxn extends cyu {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = axw.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = axw.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public cxn(cyu.a $$0) {
      super($$0);
   }

   public static float c(cyy $$0) {
      dbb $$1 = $$0.a(kj.Q, dbb.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(cyy $$0, cwn $$1, cva $$2, cqy $$3) {
      dbb $$4 = $$0.a(kj.Q);
      if ($$4 == null) {
         return false;
      } else {
         cyy $$5 = $$1.g();
         dbb.a $$6 = new dbb.a($$4);
         if ($$2 == cva.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kj.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cva.b && $$5.f()) {
            cyy $$7 = $$6.b();
            if ($$7 != null) {
               cyy $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bwd)$$3);
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
   public boolean a(cyy $$0, cyy $$1, cwn $$2, cva $$3, cqy $$4, bxt $$5) {
      if ($$3 == cva.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dbb $$6 = $$0.a(kj.Q);
         if ($$6 == null) {
            return false;
         } else {
            dbb.a $$7 = new dbb.a($$6);
            if ($$3 == cva.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kj.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cva.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cyy $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bwd)$$4);
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
   public bub a(div $$0, cqy $$1, bua $$2) {
      $$1.c($$2);
      return bub.a;
   }

   private void a(div $$0, cqy $$1, cyy $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awx.c.b(this));
      }
   }

   @Override
   public boolean d(cyy $$0) {
      dbb $$1 = $$0.a(kj.Q, dbb.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cyy $$0) {
      dbb $$1 = $$0.a(kj.Q, dbb.a);
      return Math.min(1 + azm.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cyy $$0) {
      dbb $$1 = $$0.a(kj.Q, dbb.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(cyy $$0, int $$1) {
      dbb $$2 = $$0.a(kj.Q);
      if ($$2 != null) {
         dbb.a $$3 = new dbb.a($$2);
         $$3.a($$1);
         $$0.b(kj.Q, $$3.d());
      }
   }

   public static boolean g(cyy $$0) {
      dbb $$1 = $$0.a(kj.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(cyy $$0) {
      dbb $$1 = $$0.a(kj.Q, dbb.a);
      return $$1.h();
   }

   public static cyy i(cyy $$0) {
      dbb $$1 = $$0.a(kj.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : cyy.k;
   }

   public static int j(cyy $$0) {
      dbb $$1 = $$0.a(kj.Q, dbb.a);
      return $$1.a();
   }

   private boolean b(cyy $$0, cqy $$1) {
      dbb $$2 = $$0.a(kj.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<cyy> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cyy> a(cyy $$0, cqy $$1, dbb $$2) {
      dbb.a $$3 = new dbb.a($$2);
      cyy $$4 = $$3.b();
      if ($$4 != null) {
         a((bwd)$$1);
         $$0.b(kj.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(div $$0, bxc $$1, cyy $$2, int $$3) {
      if ($$1 instanceof cqy $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cyy $$0, bxc $$1) {
      return 200;
   }

   @Override
   public cza b(cyy $$0) {
      return cza.k;
   }

   @Override
   public Optional<cwx> k(cyy $$0) {
      dcc $$1 = $$0.a(kj.q, dcc.c);
      return !$$1.a(kj.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kj.Q)).map(cww::new);
   }

   @Override
   public void a(cnd $$0) {
      dbb $$1 = $$0.f().a(kj.Q);
      if ($$1 != null) {
         $$0.f().b(kj.Q, dbb.a);
         czb.a($$0, $$1.d());
      }
   }

   public static List<cxn> a() {
      return Stream.of(czc.rH, czc.rI, czc.rJ, czc.rK, czc.rL, czc.rM, czc.rN, czc.rO, czc.rP, czc.rQ, czc.rR, czc.rX, czc.rU, czc.rV, czc.rW, czc.rT, czc.rS)
         .map($$0 -> (cxn)$$0)
         .toList();
   }

   public static cyu a(cxw $$0) {
      return switch ($$0) {
         case a -> czc.rI;
         case b -> czc.rJ;
         case c -> czc.rK;
         case d -> czc.rL;
         case e -> czc.rM;
         case f -> czc.rN;
         case g -> czc.rO;
         case h -> czc.rP;
         case i -> czc.rQ;
         case j -> czc.rR;
         case l -> czc.rT;
         case m -> czc.rU;
         case n -> czc.rV;
         case o -> czc.rW;
         case p -> czc.rX;
         case k -> czc.rS;
      };
   }

   private static void a(bwd $$0) {
      $$0.a(awn.ds, 0.8F, 0.8F + $$0.dV().C_().i() * 0.4F);
   }

   private static void b(bwd $$0) {
      $$0.a(awn.dq, 0.8F, 0.8F + $$0.dV().C_().i() * 0.4F);
   }

   private static void c(bwd $$0) {
      $$0.a(awn.dr, 1.0F, 1.0F);
   }

   private static void a(div $$0, bwd $$1) {
      $$0.a(null, $$1.dv(), awn.dp, awo.h, 0.8F, 0.8F + $$1.dV().C_().i() * 0.4F);
   }

   private void a(cqy $$0) {
      cuq $$1 = $$0.bQ;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
