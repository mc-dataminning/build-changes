import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsz extends dkd {
   public static final MapCodec<dsz> a = b(dsz::new);
   public static final dyl<jm> b = dob.aF;
   public static final dyf c = dye.B;
   public static final dyf d = dye.b;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final fcl h = dkd.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final fcl i = dkd.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final fcl j = dkd.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fcl k = dkd.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dsz> a() {
      return a;
   }

   public dsz(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      switch ((jm)$$0.c(b)) {
         case f:
         default:
            return k;
         case e:
            return j;
         case d:
            return i;
         case c:
            return h;
      }
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      jh $$4 = $$2.a($$3.g());
      dxo $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dhc $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
         if ($$5.o().d()) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvx $$3, cxg $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, boolean $$3, boolean $$4, int $$5, @Nullable dxo $$6) {
      Optional<jm> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jm $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dkd $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dxo[] $$15 = new dxo[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            jh $$17 = $$1.a($$8, $$16);
            dxo $$18 = $$0.a_($$17);
            if ($$18.a(dkf.gc)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dkf.gd) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dxo)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dsy.d);
               boolean $$20 = $$18.c(dsy.b);
               $$13 |= $$19 && $$20;
               $$15[$$16] = $$18;
               if ($$16 == $$5) {
                  $$0.a($$1, $$11, 10);
                  $$12 &= $$19;
               }
            }
         }

         $$12 &= $$14 > 1;
         $$13 &= $$12;
         dxo $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            jh $$22 = $$1.a($$8, $$14);
            jm $$23 = $$8.g();
            $$0.a($$22, $$21.b(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.b(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               jh $$25 = $$1.a($$8, $$24);
               dxo $$26 = $$15[$$24];
               if ($$26 != null) {
                  dxo $$27 = $$0.a_($$25);
                  if ($$27.a(dkf.gd) || $$27.a(dkf.gc)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dgz $$0, jh $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awv.Az, aww.e, 0.4F, 0.6F);
         $$0.a(null, eck.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awv.Ay, aww.e, 0.4F, 0.5F);
         $$0.a(null, eck.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awv.Ax, aww.e, 0.4F, 0.7F);
         $$0.a(null, eck.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awv.AA, aww.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, eck.g, $$1);
      }
   }

   private static void a(dkd $$0, dgz $$1, jh $$2, jm $$3) {
      jm $$4 = $$3.g();
      euy $$5 = euu.a($$1, $$4, jm.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(d);
         boolean $$6 = $$0.c(c);
         if ($$5 || $$6) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            a(this, $$1, $$2, $$0.c(b));
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d);
   }
}
