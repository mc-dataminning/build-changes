import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtt extends dku {
   public static final MapCodec<dtt> a = b(dtt::new);
   public static final dzk<jo> b = dot.e;
   public static final dzd c = dzc.A;
   public static final dzd d = dzc.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int g = 10;
   private static final Map<jo, fdo> h = fdl.c(dku.a(6.0, 0.0, 10.0, 10.0, 16.0));

   @Override
   public MapCodec<dtt> a() {
      return a;
   }

   public dtt(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return h.get($$0.c(b));
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jo $$3 = $$0.c(b);
      jj $$4 = $$2.a($$3.g());
      dym $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dhs $$2 = $$0.q();
      jj $$3 = $$0.a();
      jo[] $$4 = $$0.f();

      for (jo $$5 : $$4) {
         if ($$5.o().d()) {
            jo $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dhp $$0, jj $$1, dym $$2, boolean $$3, boolean $$4, int $$5, @Nullable dym $$6) {
      Optional<jo> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jo $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dku $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dym[] $$15 = new dym[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            jj $$17 = $$1.a($$8, $$16);
            dym $$18 = $$0.a_($$17);
            if ($$18.a(dkw.gc)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dkw.gd) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dym)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dts.d);
               boolean $$20 = $$18.c(dts.b);
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
         dym $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            jj $$22 = $$1.a($$8, $$14);
            jo $$23 = $$8.g();
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
               jj $$25 = $$1.a($$8, $$24);
               dym $$26 = $$15[$$24];
               if ($$26 != null) {
                  dym $$27 = $$0.a_($$25);
                  if ($$27.a(dkw.gd) || $$27.a(dkw.gc)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dhp $$0, jj $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awk.AI, awl.e, 0.4F, 0.6F);
         $$0.a(null, edm.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awk.AH, awl.e, 0.4F, 0.5F);
         $$0.a(null, edm.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awk.AG, awl.e, 0.4F, 0.7F);
         $$0.a(null, edm.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awk.AJ, awl.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, edm.g, $$1);
      }
   }

   private static void a(dku $$0, dhp $$1, jj $$2, jo $$3) {
      jo $$4 = $$3.g();
      ewb $$5 = evx.a($$1, $$4, jo.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = $$0.c(c);
         if ($$4 || $$5) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$5) {
            a(this, $$1, $$2, $$0.c(b));
         }
      }
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d);
   }
}
