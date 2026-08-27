import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dis extends dac {
   public static final MapCodec<dis> a = b(dis::new);
   public static final dnv b = ddx.aE;
   public static final dns c = dnr.w;
   public static final dns d = dnr.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final eqm h = dac.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final eqm i = dac.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final eqm j = dac.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eqm k = dac.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
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
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      ib $$4 = $$2.a($$3.g());
      dnb $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      cxe $$2 = $$0.q();
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
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, boolean $$3, boolean $$4, int $$5, @Nullable dnb $$6) {
      Optional<ih> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ih $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dac $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dnb[] $$15 = new dnb[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            ib $$17 = $$1.a($$8, $$16);
            dnb $$18 = $$0.a_($$17);
            if ($$18.a(dae.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dae.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dnb)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dir.d);
               boolean $$20 = $$18.c(dir.b);
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
         dnb $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
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
               dnb $$26 = $$15[$$24];
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
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(cxb $$0, ib $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, aty.zl, atz.e, 0.4F, 0.6F);
         $$0.a(null, drp.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, aty.zk, atz.e, 0.4F, 0.5F);
         $$0.a(null, drp.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, aty.zj, atz.e, 0.4F, 0.7F);
         $$0.a(null, drp.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, aty.zm, atz.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, drp.g, $$1);
      }
   }

   private static void a(dac $$0, cxb $$1, ib $$2, ih $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
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
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d);
   }
}
