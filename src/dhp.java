import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhp extends dfi {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final dtr b = dtq.bx;
   public static final dtr c = dtq.A;
   private static final dty<jk> d = dtq.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cyy g = new cyy(10);
   private static final int h = 17;

   public dhp(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jk.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dhp> a() {
      return a;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return $$1.c_($$2) instanceof dqt $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dqf $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0.B ? null : a($$2, dqh.P, dqt::a);
   }

   private void a(@Nullable dqf $$0, boolean $$1) {
      if ($$0 instanceof dqt $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      dqt $$2 = new dqt($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dta a(cyb $$0) {
      ji $$1 = $$0.d().g();

      ji $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ji.b;
      };
      return this.o().a(d, jk.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, btl $$3, cuo $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      bqm.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof dqt) {
            $$3.a((dqt)$$5);
         }

         return bqq.c;
      }
   }

   protected void a(dta $$0, aqt $$1, jd $$2) {
      if ($$1.c_($$2) instanceof dqt $$3) {
         cyn var11 = $$3.aA_();
         Optional<cyz<cyo>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cyz<cyo> $$7 = $$6.get();
            cuo $$8 = $$7.b().a(var11, $$1.H_());
            if ($$8.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cuo $$9 : $$7.b().a(var11)) {
                  if (!$$9.e()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.e()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cyz<cyo>> a(dcu $$0, cyn $$1) {
      return g.a($$0, $$1);
   }

   private void a(aqt $$0, jd $$1, dqt $$2, cuo $$3, dta $$4, cyz<cyo> $$5) {
      ji $$6 = $$4.c(d).a();
      bqj $$7 = drf.a($$0, $$1.a($$6));
      cuo $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dqt || $$3.H() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cuo $$9 = $$8.c(1);
            cuo $$10 = drf.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.H();
            $$8 = drf.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.H()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         eww $$12 = eww.b($$1);
         eww $$13 = $$12.a($$6, 0.7);
         kw.a($$0, $$8, 6, $$6, $$13);

         for (aqu $$14 : $$0.a(aqu.class, ewr.a($$12, 17.0, 17.0, 17.0))) {
            an.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(d, c, b);
   }
}
