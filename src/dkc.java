import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkc extends dhv {
   public static final MapCodec<dkc> a = b(dkc::new);
   public static final dwf b = dwe.bx;
   public static final dwf c = dwe.A;
   private static final dwl<jo> d = dwe.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final dau g = new dau(10);
   private static final int h = 17;

   public dkc(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jo.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dkc> a() {
      return a;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return $$1.c_($$2) instanceof dtf $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dsr $$8 = $$1.c_($$2);
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
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0.C ? null : a($$2, dst.P, dtf::a);
   }

   private void a(@Nullable dsr $$0, boolean $$1) {
      if ($$0 instanceof dtf $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      dtf $$2 = new dtf($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dvo a(czw $$0) {
      jm $$1 = $$0.d().g();

      jm $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jm.b;
      };
      return this.m().b(d, jo.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bve $$3, cwf $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      bsd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtf $$5) {
         $$3.a($$5);
      }

      return bsh.a;
   }

   protected void a(dvo $$0, arq $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dtf $$3) {
         dai var11 = $$3.aC_();
         Optional<dav<daj>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dav<daj> $$7 = $$6.get();
            cwf $$8 = $$7.b().a(var11, $$1.H_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cwf $$9 : $$7.b().a(var11)) {
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

   public static Optional<dav<daj>> a(dff $$0, dai $$1) {
      return g.a($$0, $$1);
   }

   private void a(arq $$0, jh $$1, dtf $$2, cwf $$3, dvo $$4, dav<daj> $$5) {
      jm $$6 = $$4.c(d).a();
      bsa $$7 = dts.a($$0, $$1.a($$6));
      cwf $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dtf || $$3.L() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cwf $$9 = $$8.c(1);
            cwf $$10 = dts.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.L();
            $$8 = dts.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.L()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         ezr $$12 = ezr.b($$1);
         ezr $$13 = $$12.a($$6, 0.7);
         la.a($$0, $$8, 6, $$6, $$13);

         for (arr $$14 : $$0.a(arr.class, ezm.a($$12, 17.0, 17.0, 17.0))) {
            ao.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(d, c, b);
   }
}
