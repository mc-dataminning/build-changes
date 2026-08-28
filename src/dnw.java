import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnw extends dff {
   public static final MapCodec<dnw> a = b(dnw::new);
   public static final dtb b = djb.aE;
   public static final dsy c = dsx.w;
   public static final dsy d = dsx.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final ews h = dff.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ews i = dff.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ews j = dff.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ews k = dff.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      switch ((jf)$$0.c(b)) {
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
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      ja $$4 = $$2.a($$3.g());
      dsh $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      dcg $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
         if ($$5.o().d()) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, boolean $$3, boolean $$4, int $$5, @Nullable dsh $$6) {
      Optional<jf> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jf $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dff $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dsh[] $$15 = new dsh[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            ja $$17 = $$1.a($$8, $$16);
            dsh $$18 = $$0.a_($$17);
            if ($$18.a(dfh.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dfh.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dsh)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dnv.d);
               boolean $$20 = $$18.c(dnv.b);
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
         dsh $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            ja $$22 = $$1.a($$8, $$14);
            jf $$23 = $$8.g();
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
               ja $$25 = $$1.a($$8, $$24);
               dsh $$26 = $$15[$$24];
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
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dcd $$0, ja $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, avf.zK, avg.e, 0.4F, 0.6F);
         $$0.a(null, dxa.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, avf.zJ, avg.e, 0.4F, 0.5F);
         $$0.a(null, dxa.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, avf.zI, avg.e, 0.4F, 0.7F);
         $$0.a(null, dxa.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, avf.zL, avg.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dxa.g, $$1);
      }
   }

   private static void a(dff $$0, dcd $$1, ja $$2, jf $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
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
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d);
   }
}
