import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsj extends djn {
   public static final MapCodec<dsj> a = b(dsj::new);
   public static final dxv<jn> b = dnl.aF;
   public static final dxp c = dxo.B;
   public static final dxp d = dxo.b;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final fbv h = djn.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final fbv i = djn.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final fbv j = djn.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fbv k = djn.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dsj> a() {
      return a;
   }

   public dsj(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      switch ((jn)$$0.c(b)) {
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
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      ji $$4 = $$2.a($$3.g());
      dwy $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dgm $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, boolean $$3, boolean $$4, int $$5, @Nullable dwy $$6) {
      Optional<jn> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jn $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         djn $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dwy[] $$15 = new dwy[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            ji $$17 = $$1.a($$8, $$16);
            dwy $$18 = $$0.a_($$17);
            if ($$18.a(djp.gc)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(djp.gd) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dwy)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dsi.d);
               boolean $$20 = $$18.c(dsi.b);
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
         dwy $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            ji $$22 = $$1.a($$8, $$14);
            jn $$23 = $$8.g();
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
               ji $$25 = $$1.a($$8, $$24);
               dwy $$26 = $$15[$$24];
               if ($$26 != null) {
                  dwy $$27 = $$0.a_($$25);
                  if ($$27.a(djp.gd) || $$27.a(djp.gc)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dgj $$0, ji $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awa.Ay, awb.e, 0.4F, 0.6F);
         $$0.a(null, ebu.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awa.Ax, awb.e, 0.4F, 0.5F);
         $$0.a(null, ebu.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awa.Aw, awb.e, 0.4F, 0.7F);
         $$0.a(null, ebu.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awa.Az, awb.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, ebu.g, $$1);
      }
   }

   private static void a(djn $$0, dgj $$1, ji $$2, jn $$3) {
      jn $$4 = $$3.g();
      eui $$5 = eue.a($$1, $$4, jn.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
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
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d);
   }
}
