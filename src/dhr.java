import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhr extends dfk {
   public static final MapCodec<dhr> a = b(dhr::new);
   public static final dtt b = dts.bx;
   public static final dtt c = dts.A;
   private static final dua<jk> d = dts.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cza g = new cza(10);
   private static final int h = 17;

   public dhr(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jk.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dhr> a() {
      return a;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return $$1.c_($$2) instanceof dqv $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dqh $$8 = $$1.c_($$2);
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
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$0.B ? null : a($$2, dqj.P, dqv::a);
   }

   private void a(@Nullable dqh $$0, boolean $$1) {
      if ($$0 instanceof dqv $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      dqv $$2 = new dqv($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dtc a(cyd $$0) {
      ji $$1 = $$0.d().g();

      ji $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ji.b;
      };
      return this.o().a(d, jk.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, btn $$3, cuq $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      bqn.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         dqh $$5 = $$1.c_($$2);
         if ($$5 instanceof dqv) {
            $$3.a((dqv)$$5);
         }

         return bqr.c;
      }
   }

   protected void a(dtc $$0, aqu $$1, jd $$2) {
      if ($$1.c_($$2) instanceof dqv $$3) {
         cyp var11 = $$3.aE_();
         Optional<czb<cyq>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            czb<cyq> $$7 = $$6.get();
            cuq $$8 = $$7.b().a(var11, $$1.H_());
            if ($$8.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cuq $$9 : $$7.b().a(var11)) {
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

   public static Optional<czb<cyq>> a(dcw $$0, cyp $$1) {
      return g.a($$0, $$1);
   }

   private void a(aqu $$0, jd $$1, dqv $$2, cuq $$3, dtc $$4, czb<cyq> $$5) {
      ji $$6 = $$4.c(d).a();
      bqk $$7 = drh.a($$0, $$1.a($$6));
      cuq $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dqv || $$3.H() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cuq $$9 = $$8.c(1);
            cuq $$10 = drh.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.H();
            $$8 = drh.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.H()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         exc $$12 = exc.b($$1);
         exc $$13 = $$12.a($$6, 0.7);
         kw.a($$0, $$8, 6, $$6, $$13);

         for (aqv $$14 : $$0.a(aqv.class, ewx.a($$12, 17.0, 17.0, 17.0))) {
            an.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(d, c, b);
   }
}
