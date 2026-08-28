import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djx extends dhq {
   public static final MapCodec<djx> a = b(djx::new);
   public static final dwa b = dvz.bx;
   public static final dwa c = dvz.A;
   private static final dwh<jo> d = dvz.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final daq g = new daq(10);
   private static final int h = 17;

   public djx(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jo.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<djx> a() {
      return a;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return $$1.c_($$2) instanceof dta $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dsm $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0.C ? null : a($$2, dso.P, dta::a);
   }

   private void a(@Nullable dsm $$0, boolean $$1) {
      if ($$0 instanceof dta $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      dta $$2 = new dta($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dvj a(czs $$0) {
      jm $$1 = $$0.d().g();

      jm $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jm.b;
      };
      return this.m().b(d, jo.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bva $$3, cwb $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      brz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dta $$5) {
         $$3.a($$5);
      }

      return bsd.a;
   }

   protected void a(dvj $$0, arn $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dta $$3) {
         dae var11 = $$3.aC_();
         Optional<dar<daf>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dar<daf> $$7 = $$6.get();
            cwb $$8 = $$7.b().a(var11, $$1.H_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cwb $$9 : $$7.b().a(var11)) {
                  if (!$$9.f()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
                  }
               }

               $$3.f().forEach($$0x -> {
                  if (!$$0x.f()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<dar<daf>> a(dfb $$0, dae $$1) {
      return g.a($$0, $$1);
   }

   private void a(arn $$0, jh $$1, dta $$2, cwb $$3, dvj $$4, dar<daf> $$5) {
      jm $$6 = $$4.c(d).a();
      brw $$7 = dtn.a($$0, $$1.a($$6));
      cwb $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dta || $$3.L() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cwb $$9 = $$8.c(1);
            cwb $$10 = dtn.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.L();
            $$8 = dtn.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.L()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         ezn $$12 = ezn.b($$1);
         ezn $$13 = $$12.a($$6, 0.7);
         la.a($$0, $$8, 6, $$6, $$13);

         for (aro $$14 : $$0.a(aro.class, ezi.a($$12, 17.0, 17.0, 17.0))) {
            ao.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(d, c, b);
   }
}
