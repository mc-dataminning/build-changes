import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqb extends dhj {
   public static final MapCodec<dqb> a = b(dqb::new);
   public static final dvi b = dlf.aF;
   public static final dvf c = dve.w;
   public static final dvf d = dve.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ezm h = dhj.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ezm i = dhj.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ezm j = dhj.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ezm k = dhj.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ((jj)$$0.c(b)) {
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
   protected boolean a(duo $$0, dej $$1, je $$2) {
      jj $$3 = $$0.c(b);
      je $$4 = $$2.a($$3.g());
      duo $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = this.o().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dej $$2 = $$0.q();
      je $$3 = $$0.a();
      jj[] $$4 = $$0.f();

      for (jj $$5 : $$4) {
         if ($$5.o().d()) {
            jj $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(deg $$0, je $$1, duo $$2, boolean $$3, boolean $$4, int $$5, @Nullable duo $$6) {
      Optional<jj> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jj $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dhj $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         duo[] $$15 = new duo[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            je $$17 = $$1.a($$8, $$16);
            duo $$18 = $$0.a_($$17);
            if ($$18.a(dhl.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dhl.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (duo)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dqa.d);
               boolean $$20 = $$18.c(dqa.b);
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
         duo $$21 = $$11.o().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            je $$22 = $$1.a($$8, $$14);
            jj $$23 = $$8.g();
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
               je $$25 = $$1.a($$8, $$24);
               duo $$26 = $$15[$$24];
               if ($$26 != null && !$$0.a_($$25).l()) {
                  $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
               }
            }
         }
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(deg $$0, je $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awe.zQ, awf.e, 0.4F, 0.6F);
         $$0.a(null, dzl.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awe.zP, awf.e, 0.4F, 0.5F);
         $$0.a(null, dzl.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awe.zO, awf.e, 0.4F, 0.7F);
         $$0.a(null, dzl.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awe.zR, awf.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dzl.g, $$1);
      }
   }

   private static void a(dhj $$0, deg $$1, je $$2, jj $$3) {
      jj $$4 = $$3.g();
      erx $$5 = ert.a($$1, $$4, jj.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
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
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d);
   }
}
