import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlv extends dde {
   public static final MapCodec<dlv> a = b(dlv::new);
   public static final drb b = dha.aE;
   public static final dqy c = dqx.w;
   public static final dqy d = dqx.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final eui h = dde.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final eui i = dde.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final eui j = dde.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eui k = dde.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((is)$$0.c(b)) {
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
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      is $$3 = $$0.c(b);
      in $$4 = $$2.a($$3.g());
      dqh $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = this.n().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      dag $$2 = $$0.q();
      in $$3 = $$0.a();
      is[] $$4 = $$0.f();

      for (is $$5 : $$4) {
         if ($$5.o().d()) {
            is $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, bsa $$3, csz $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dad $$0, in $$1, dqh $$2, boolean $$3, boolean $$4, int $$5, @Nullable dqh $$6) {
      Optional<is> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         is $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dde $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dqh[] $$15 = new dqh[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            in $$17 = $$1.a($$8, $$16);
            dqh $$18 = $$0.a_($$17);
            if ($$18.a(ddg.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(ddg.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dqh)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dlu.d);
               boolean $$20 = $$18.c(dlu.b);
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
         dqh $$21 = $$11.n().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            in $$22 = $$1.a($$8, $$14);
            is $$23 = $$8.g();
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
               in $$25 = $$1.a($$8, $$24);
               dqh $$26 = $$15[$$24];
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
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dad $$0, in $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, avc.zw, avd.e, 0.4F, 0.6F);
         $$0.a(null, dva.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, avc.zv, avd.e, 0.4F, 0.5F);
         $$0.a(null, dva.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, avc.zu, avd.e, 0.4F, 0.7F);
         $$0.a(null, dva.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, avc.zx, avd.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dva.g, $$1);
      }
   }

   private static void a(dde $$0, dad $$1, in $$2, is $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
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
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d);
   }
}
