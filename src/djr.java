import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djr extends dhk {
   public static final MapCodec<djr> a = b(djr::new);
   public static final dvu b = dvt.bx;
   public static final dvu c = dvt.A;
   private static final dwb<jn> d = dvt.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final dak g = new dak(10);
   private static final int h = 17;

   public djr(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jn.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<djr> a() {
      return a;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return $$1.c_($$2) instanceof dsu $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dsg $$8 = $$1.c_($$2);
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
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0.C ? null : a($$2, dsi.P, dsu::a);
   }

   private void a(@Nullable dsg $$0, boolean $$1) {
      if ($$0 instanceof dsu $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      dsu $$2 = new dsu($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dvd a(czm $$0) {
      jl $$1 = $$0.d().g();

      jl $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jl.b;
      };
      return this.m().b(d, jn.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      bru.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsu $$5) {
         $$3.a($$5);
      }

      return bry.a;
   }

   protected void a(dvd $$0, arm $$1, jg $$2) {
      if ($$1.c_($$2) instanceof dsu $$3) {
         czy var11 = $$3.aD_();
         Optional<dal<czz>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dal<czz> $$7 = $$6.get();
            cvx $$8 = $$7.b().a(var11, $$1.H_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cvx $$9 : $$7.b().a(var11)) {
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

   public static Optional<dal<czz>> a(dev $$0, czy $$1) {
      return g.a($$0, $$1);
   }

   private void a(arm $$0, jg $$1, dsu $$2, cvx $$3, dvd $$4, dal<czz> $$5) {
      jl $$6 = $$4.c(d).a();
      brr $$7 = dth.a($$0, $$1.a($$6));
      cvx $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dsu || $$3.L() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cvx $$9 = $$8.c(1);
            cvx $$10 = dth.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.L();
            $$8 = dth.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.L()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         ezh $$12 = ezh.b($$1);
         ezh $$13 = $$12.a($$6, 0.7);
         kz.a($$0, $$8, 6, $$6, $$13);

         for (arn $$14 : $$0.a(arn.class, ezc.a($$12, 17.0, 17.0, 17.0))) {
            an.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(d, c, b);
   }
}
