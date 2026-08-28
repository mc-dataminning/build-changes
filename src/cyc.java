import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cyc extends czj {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = axw.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = axw.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public cyc(czj.a $$0) {
      super($$0);
   }

   public static float c(czn $$0) {
      dbq $$1 = $$0.a(kk.Q, dbq.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(czn $$0, cxc $$1, cvp $$2, crm $$3) {
      dbq $$4 = $$0.a(kk.Q);
      if ($$4 == null) {
         return false;
      } else {
         czn $$5 = $$1.g();
         dbq.a $$6 = new dbq.a($$4);
         if ($$2 == cvp.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kk.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cvp.b && $$5.f()) {
            czn $$7 = $$6.b();
            if ($$7 != null) {
               czn $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bwi)$$3);
               }
            }

            $$0.b(kk.Q, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(czn $$0, czn $$1, cxc $$2, cvp $$3, crm $$4, bya $$5) {
      if ($$3 == cvp.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dbq $$6 = $$0.a(kk.Q);
         if ($$6 == null) {
            return false;
         } else {
            dbq.a $$7 = new dbq.a($$6);
            if ($$3 == cvp.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kk.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cvp.b && $$1.f()) {
               if ($$2.b($$4)) {
                  czn $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bwi)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kk.Q, $$7.d());
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
   public bug a(djm $$0, crm $$1, buf $$2) {
      $$1.c($$2);
      return bug.a;
   }

   private void a(djm $$0, crm $$1, czn $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awx.c.b(this));
      }
   }

   @Override
   public boolean d(czn $$0) {
      dbq $$1 = $$0.a(kk.Q, dbq.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(czn $$0) {
      dbq $$1 = $$0.a(kk.Q, dbq.a);
      return Math.min(1 + azm.a($$1.f(), 12), 13);
   }

   @Override
   public int f(czn $$0) {
      dbq $$1 = $$0.a(kk.Q, dbq.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(czn $$0, int $$1) {
      dbq $$2 = $$0.a(kk.Q);
      if ($$2 != null) {
         dbq.a $$3 = new dbq.a($$2);
         $$3.a($$1);
         $$0.b(kk.Q, $$3.d());
      }
   }

   public static boolean g(czn $$0) {
      dbq $$1 = $$0.a(kk.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(czn $$0) {
      dbq $$1 = $$0.a(kk.Q, dbq.a);
      return $$1.h();
   }

   public static czn i(czn $$0) {
      dbq $$1 = $$0.a(kk.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : czn.k;
   }

   public static int j(czn $$0) {
      dbq $$1 = $$0.a(kk.Q, dbq.a);
      return $$1.a();
   }

   private boolean b(czn $$0, crm $$1) {
      dbq $$2 = $$0.a(kk.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<czn> $$3 = a($$0, $$1, $$2);
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

   private static Optional<czn> a(czn $$0, crm $$1, dbq $$2) {
      dbq.a $$3 = new dbq.a($$2);
      czn $$4 = $$3.b();
      if ($$4 != null) {
         a((bwi)$$1);
         $$0.b(kk.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(djm $$0, bxj $$1, czn $$2, int $$3) {
      if ($$1 instanceof crm $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(czn $$0, bxj $$1) {
      return 200;
   }

   @Override
   public czp b(czn $$0) {
      return czp.k;
   }

   @Override
   public Optional<cxm> k(czn $$0) {
      dcr $$1 = $$0.a(kk.q, dcr.c);
      return !$$1.a(kk.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kk.Q)).map(cxl::new);
   }

   @Override
   public void a(cnr $$0) {
      dbq $$1 = $$0.f().a(kk.Q);
      if ($$1 != null) {
         $$0.f().b(kk.Q, dbq.a);
         czq.a($$0, $$1.d());
      }
   }

   public static List<cyc> a() {
      return Stream.of(czr.rM, czr.rN, czr.rO, czr.rP, czr.rQ, czr.rR, czr.rS, czr.rT, czr.rU, czr.rV, czr.rW, czr.sc, czr.rZ, czr.sa, czr.sb, czr.rY, czr.rX)
         .map($$0 -> (cyc)$$0)
         .toList();
   }

   public static czj a(cyl $$0) {
      return switch ($$0) {
         case a -> czr.rN;
         case b -> czr.rO;
         case c -> czr.rP;
         case d -> czr.rQ;
         case e -> czr.rR;
         case f -> czr.rS;
         case g -> czr.rT;
         case h -> czr.rU;
         case i -> czr.rV;
         case j -> czr.rW;
         case l -> czr.rY;
         case m -> czr.rZ;
         case n -> czr.sa;
         case o -> czr.sb;
         case p -> czr.sc;
         case k -> czr.rX;
      };
   }

   private static void a(bwi $$0) {
      $$0.a(awn.ds, 0.8F, 0.8F + $$0.dU().C_().i() * 0.4F);
   }

   private static void b(bwi $$0) {
      $$0.a(awn.dq, 0.8F, 0.8F + $$0.dU().C_().i() * 0.4F);
   }

   private static void c(bwi $$0) {
      $$0.a(awn.dr, 1.0F, 1.0F);
   }

   private static void a(djm $$0, bwi $$1) {
      $$0.a(null, $$1.du(), awn.dp, awo.h, 0.8F, 0.8F + $$1.dU().C_().i() * 0.4F);
   }

   private void a(crm $$0) {
      cvf $$1 = $$0.bR;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
