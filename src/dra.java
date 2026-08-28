import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dra extends dij {
   public static final MapCodec<dra> a = b(dra::new);
   public static final dwl<jm> b = dme.aF;
   public static final dwf c = dwe.w;
   public static final dwf d = dwe.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final fal h = dij.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final fal i = dij.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final fal j = dij.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fal k = dij.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   public dra(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
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
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      jh $$4 = $$2.a($$3.g());
      dvo $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dfi $$2 = $$0.q();
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
   public void a(dff $$0, jh $$1, dvo $$2, bve $$3, cwf $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dff $$0, jh $$1, dvo $$2, boolean $$3, boolean $$4, int $$5, @Nullable dvo $$6) {
      Optional<jm> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jm $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dij $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dvo[] $$15 = new dvo[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            jh $$17 = $$1.a($$8, $$16);
            dvo $$18 = $$0.a_($$17);
            if ($$18.a(dil.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dil.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dvo)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dqz.d);
               boolean $$20 = $$18.c(dqz.b);
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
         dvo $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
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
               dvo $$26 = $$15[$$24];
               if ($$26 != null) {
                  dvo $$27 = $$0.a_($$25);
                  if ($$27.a(dil.fI) || $$27.a(dil.fH)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dff $$0, jh $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awo.zO, awp.e, 0.4F, 0.6F);
         $$0.a(null, eak.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awo.zN, awp.e, 0.4F, 0.5F);
         $$0.a(null, eak.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awo.zM, awp.e, 0.4F, 0.7F);
         $$0.a(null, eak.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awo.zP, awp.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, eak.g, $$1);
      }
   }

   private static void a(dij $$0, dff $$1, jh $$2, jm $$3) {
      jm $$4 = $$3.g();
      esw $$5 = ess.a($$1, $$4, jm.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
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
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c, d);
   }
}
