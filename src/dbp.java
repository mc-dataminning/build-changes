import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbp extends ctc {
   public static final MapCodec<dbp> a = b(dbp::new);
   public static final dfx b = cww.aE;
   public static final dfu c = dft.w;
   public static final dfu d = dft.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final eia h = ctc.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final eia i = ctc.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final eia j = ctc.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eia k = ctc.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dbp> a() {
      return a;
   }

   public dbp(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      switch ((ha)$$0.c(b)) {
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
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      ha $$3 = $$0.c(b);
      gw $$4 = $$2.a($$3.g());
      dfd $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      cqe $$2 = $$0.q();
      gw $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, boolean $$3, boolean $$4, int $$5, @Nullable dfd $$6) {
      Optional<ha> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ha $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         ctc $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dfd[] $$15 = new dfd[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            gw $$17 = $$1.a($$8, $$16);
            dfd $$18 = $$0.a_($$17);
            if ($$18.a(cte.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(cte.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dfd)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dbo.d);
               boolean $$20 = $$18.c(dbo.b);
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
         dfd $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            gw $$22 = $$1.a($$8, $$14);
            ha $$23 = $$8.g();
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
               gw $$25 = $$1.a($$8, $$24);
               dfd $$26 = $$15[$$24];
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
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(cqb $$0, gw $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, apg.xX, aph.e, 0.4F, 0.6F);
         $$0.a(null, djn.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, apg.xW, aph.e, 0.4F, 0.5F);
         $$0.a(null, djn.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, apg.xV, aph.e, 0.4F, 0.7F);
         $$0.a(null, djn.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, apg.xY, aph.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, djn.g, $$1);
      }
   }

   private static void a(ctc $$0, cqb $$1, gw $$2, ha $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
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
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d);
   }
}
