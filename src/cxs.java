import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cxs extends cyz {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = axw.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = axw.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public cxs(cyz.a $$0) {
      super($$0);
   }

   public static float c(czd $$0) {
      dbg $$1 = $$0.a(kj.Q, dbg.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(czd $$0, cws $$1, cvf $$2, crc $$3) {
      dbg $$4 = $$0.a(kj.Q);
      if ($$4 == null) {
         return false;
      } else {
         czd $$5 = $$1.g();
         dbg.a $$6 = new dbg.a($$4);
         if ($$2 == cvf.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kj.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cvf.b && $$5.f()) {
            czd $$7 = $$6.b();
            if ($$7 != null) {
               czd $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bwf)$$3);
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
   public boolean a(czd $$0, czd $$1, cws $$2, cvf $$3, crc $$4, bxv $$5) {
      if ($$3 == cvf.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dbg $$6 = $$0.a(kj.Q);
         if ($$6 == null) {
            return false;
         } else {
            dbg.a $$7 = new dbg.a($$6);
            if ($$3 == cvf.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kj.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cvf.b && $$1.f()) {
               if ($$2.b($$4)) {
                  czd $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bwf)$$4);
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
   public bud a(dja $$0, crc $$1, buc $$2) {
      $$1.c($$2);
      return bud.a;
   }

   private void a(dja $$0, crc $$1, czd $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awx.c.b(this));
      }
   }

   @Override
   public boolean d(czd $$0) {
      dbg $$1 = $$0.a(kj.Q, dbg.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(czd $$0) {
      dbg $$1 = $$0.a(kj.Q, dbg.a);
      return Math.min(1 + azm.a($$1.f(), 12), 13);
   }

   @Override
   public int f(czd $$0) {
      dbg $$1 = $$0.a(kj.Q, dbg.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(czd $$0, int $$1) {
      dbg $$2 = $$0.a(kj.Q);
      if ($$2 != null) {
         dbg.a $$3 = new dbg.a($$2);
         $$3.a($$1);
         $$0.b(kj.Q, $$3.d());
      }
   }

   public static boolean g(czd $$0) {
      dbg $$1 = $$0.a(kj.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(czd $$0) {
      dbg $$1 = $$0.a(kj.Q, dbg.a);
      return $$1.h();
   }

   public static czd i(czd $$0) {
      dbg $$1 = $$0.a(kj.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : czd.k;
   }

   public static int j(czd $$0) {
      dbg $$1 = $$0.a(kj.Q, dbg.a);
      return $$1.a();
   }

   private boolean b(czd $$0, crc $$1) {
      dbg $$2 = $$0.a(kj.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<czd> $$3 = a($$0, $$1, $$2);
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

   private static Optional<czd> a(czd $$0, crc $$1, dbg $$2) {
      dbg.a $$3 = new dbg.a($$2);
      czd $$4 = $$3.b();
      if ($$4 != null) {
         a((bwf)$$1);
         $$0.b(kj.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dja $$0, bxe $$1, czd $$2, int $$3) {
      if ($$1 instanceof crc $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(czd $$0, bxe $$1) {
      return 200;
   }

   @Override
   public czf b(czd $$0) {
      return czf.k;
   }

   @Override
   public Optional<cxc> k(czd $$0) {
      dch $$1 = $$0.a(kj.q, dch.c);
      return !$$1.a(kj.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kj.Q)).map(cxb::new);
   }

   @Override
   public void a(cnh $$0) {
      dbg $$1 = $$0.f().a(kj.Q);
      if ($$1 != null) {
         $$0.f().b(kj.Q, dbg.a);
         czg.a($$0, $$1.d());
      }
   }

   public static List<cxs> a() {
      return Stream.of(czh.rM, czh.rN, czh.rO, czh.rP, czh.rQ, czh.rR, czh.rS, czh.rT, czh.rU, czh.rV, czh.rW, czh.sc, czh.rZ, czh.sa, czh.sb, czh.rY, czh.rX)
         .map($$0 -> (cxs)$$0)
         .toList();
   }

   public static cyz a(cyb $$0) {
      return switch ($$0) {
         case a -> czh.rN;
         case b -> czh.rO;
         case c -> czh.rP;
         case d -> czh.rQ;
         case e -> czh.rR;
         case f -> czh.rS;
         case g -> czh.rT;
         case h -> czh.rU;
         case i -> czh.rV;
         case j -> czh.rW;
         case l -> czh.rY;
         case m -> czh.rZ;
         case n -> czh.sa;
         case o -> czh.sb;
         case p -> czh.sc;
         case k -> czh.rX;
      };
   }

   private static void a(bwf $$0) {
      $$0.a(awn.ds, 0.8F, 0.8F + $$0.dV().C_().i() * 0.4F);
   }

   private static void b(bwf $$0) {
      $$0.a(awn.dq, 0.8F, 0.8F + $$0.dV().C_().i() * 0.4F);
   }

   private static void c(bwf $$0) {
      $$0.a(awn.dr, 1.0F, 1.0F);
   }

   private static void a(dja $$0, bwf $$1) {
      $$0.a(null, $$1.dv(), awn.dp, awo.h, 0.8F, 0.8F + $$1.dV().C_().i() * 0.4F);
   }

   private void a(crc $$0) {
      cuv $$1 = $$0.bR;
      if ($$1 != null) {
         $$1.a($$0.gj());
      }
   }
}
