import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpn extends dgv {
   public static final MapCodec<dpn> a = b(dpn::new);
   public static final duu b = dkr.aE;
   public static final dur c = duq.w;
   public static final dur d = duq.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final eyx h = dgv.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final eyx i = dgv.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final eyx j = dgv.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eyx k = dgv.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
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
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      jj $$3 = $$0.c(b);
      je $$4 = $$2.a($$3.g());
      dua $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = this.o().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      ddv $$2 = $$0.q();
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
   public void a(dds $$0, je $$1, dua $$2, buf $$3, cvl $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dds $$0, je $$1, dua $$2, boolean $$3, boolean $$4, int $$5, @Nullable dua $$6) {
      Optional<jj> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jj $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dgv $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dua[] $$15 = new dua[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            je $$17 = $$1.a($$8, $$16);
            dua $$18 = $$0.a_($$17);
            if ($$18.a(dgx.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dgx.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dua)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dpm.d);
               boolean $$20 = $$18.c(dpm.b);
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
         dua $$21 = $$11.o().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
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
               dua $$26 = $$15[$$24];
               if ($$26 != null && !$$0.a_($$25).l()) {
                  $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
               }
            }
         }
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dds $$0, je $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awd.zQ, awe.e, 0.4F, 0.6F);
         $$0.a(null, dyx.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awd.zP, awe.e, 0.4F, 0.5F);
         $$0.a(null, dyx.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awd.zO, awe.e, 0.4F, 0.7F);
         $$0.a(null, dyx.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awd.zR, awe.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dyx.g, $$1);
      }
   }

   private static void a(dgv $$0, dds $$1, je $$2, jj $$3) {
      jj $$4 = $$3.g();
      erj $$5 = erf.a($$1, $$4, jj.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
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
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d);
   }
}
