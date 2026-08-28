import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class doo extends dfw {
   public static final MapCodec<doo> a = b(doo::new);
   public static final dtu b = djs.aE;
   public static final dtr c = dtq.w;
   public static final dtr d = dtq.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final exp h = dfw.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final exp i = dfw.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final exp j = dfw.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final exp k = dfw.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      switch ((ji)$$0.c(b)) {
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
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      ji $$3 = $$0.c(b);
      jd $$4 = $$2.a($$3.g());
      dta $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      dcx $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
         if ($$5.o().d()) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, btl $$3, cuo $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dcu $$0, jd $$1, dta $$2, boolean $$3, boolean $$4, int $$5, @Nullable dta $$6) {
      Optional<ji> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ji $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dfw $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dta[] $$15 = new dta[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            jd $$17 = $$1.a($$8, $$16);
            dta $$18 = $$0.a_($$17);
            if ($$18.a(dfy.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dfy.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dta)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(don.d);
               boolean $$20 = $$18.c(don.b);
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
         dta $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            jd $$22 = $$1.a($$8, $$14);
            ji $$23 = $$8.g();
            $$0.a($$22, $$21.a(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.a(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               jd $$25 = $$1.a($$8, $$24);
               dta $$26 = $$15[$$24];
               if ($$26 != null) {
                  $$0.a($$25, $$26.b(d, Boolean.valueOf($$12)), 3);
                  if (!$$0.a_($$25).i()) {
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dcu $$0, jd $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, avo.zK, avp.e, 0.4F, 0.6F);
         $$0.a(null, dxw.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, avo.zJ, avp.e, 0.4F, 0.5F);
         $$0.a(null, dxw.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, avo.zI, avp.e, 0.4F, 0.7F);
         $$0.a(null, dxw.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, avo.zL, avp.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dxw.g, $$1);
      }
   }

   private static void a(dfw $$0, dcu $$1, jd $$2, ji $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(d);
         boolean $$6 = $$0.c(c);
         if ($$5 || $$6) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            $$1.a($$2, this);
            $$1.a($$2.a($$0.c(b).g()), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c, d);
   }
}
