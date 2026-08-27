import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dko extends dby {
   public static final MapCodec<dko> a = b(dko::new);
   public static final dpt b = dft.aE;
   public static final dpq c = dpp.w;
   public static final dpq d = dpp.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final est h = dby.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final est i = dby.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final est j = dby.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final est k = dby.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      switch ((ih)$$0.c(b)) {
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
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      ib $$4 = $$2.a($$3.g());
      doz $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = this.n().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      cza $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
         if ($$5.o().d()) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(cyx $$0, ib $$1, doz $$2, boolean $$3, boolean $$4, int $$5, @Nullable doz $$6) {
      Optional<ih> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ih $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dby $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         doz[] $$15 = new doz[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            ib $$17 = $$1.a($$8, $$16);
            doz $$18 = $$0.a_($$17);
            if ($$18.a(dca.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dca.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (doz)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dkn.d);
               boolean $$20 = $$18.c(dkn.b);
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
         doz $$21 = $$11.n().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            ib $$22 = $$1.a($$8, $$14);
            ih $$23 = $$8.g();
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
               ib $$25 = $$1.a($$8, $$24);
               doz $$26 = $$15[$$24];
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
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(cyx $$0, ib $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, aum.zo, aun.e, 0.4F, 0.6F);
         $$0.a(null, dts.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, aum.zn, aun.e, 0.4F, 0.5F);
         $$0.a(null, dts.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, aum.zm, aun.e, 0.4F, 0.7F);
         $$0.a(null, dts.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, aum.zp, aun.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dts.g, $$1);
      }
   }

   private static void a(dby $$0, cyx $$1, ib $$2, ih $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
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
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c, d);
   }
}
