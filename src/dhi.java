import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhi extends cys {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final dmd b = dcn.aE;
   public static final dma c = dlz.w;
   public static final dma d = dlz.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final eos h = cys.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final eos i = cys.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final eos j = cys.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eos k = cys.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      switch ((ie)$$0.c(b)) {
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
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      ie $$3 = $$0.c(b);
      hz $$4 = $$2.a($$3.g());
      dlj $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      cvu $$2 = $$0.q();
      hz $$3 = $$0.a();
      ie[] $$4 = $$0.f();

      for (ie $$5 : $$4) {
         if ($$5.o().d()) {
            ie $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, boolean $$3, boolean $$4, int $$5, @Nullable dlj $$6) {
      Optional<ie> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ie $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         cys $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dlj[] $$15 = new dlj[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            hz $$17 = $$1.a($$8, $$16);
            dlj $$18 = $$0.a_($$17);
            if ($$18.a(cyu.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(cyu.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dlj)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dhh.d);
               boolean $$20 = $$18.c(dhh.b);
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
         dlj $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            hz $$22 = $$1.a($$8, $$14);
            ie $$23 = $$8.g();
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
               hz $$25 = $$1.a($$8, $$24);
               dlj $$26 = $$15[$$24];
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
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(cvr $$0, hz $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, atl.zd, atm.e, 0.4F, 0.6F);
         $$0.a(null, dpw.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, atl.zc, atm.e, 0.4F, 0.5F);
         $$0.a(null, dpw.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, atl.zb, atm.e, 0.4F, 0.7F);
         $$0.a(null, dpw.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, atl.ze, atm.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dpw.g, $$1);
      }
   }

   private static void a(cys $$0, cvr $$1, hz $$2, ie $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
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
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, d);
   }
}
