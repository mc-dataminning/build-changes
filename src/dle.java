import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dle extends dix {
   public static final MapCodec<dle> a = b(dle::new);
   public static final dxn b = dxm.bA;
   public static final dxn c = dxm.H;
   private static final dxt<jp> d = dxm.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dbh g = new dbh(10);
   private static final int h = 17;

   public dle(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jp.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dle> a() {
      return a;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return $$1.c_($$2) instanceof dum $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dty $$8 = $$1.c_($$2);
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
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0.C ? null : a($$2, dua.Q, dum::a);
   }

   private void a(@Nullable dty $$0, boolean $$1) {
      if ($$0 instanceof dum $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      dum $$2 = new dum($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dww a(daf $$0) {
      jn $$1 = $$0.d().g();

      jn $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jn.b;
      };
      return this.m().b(d, jp.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, bvg $$3, cwo $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dum $$5) {
         $$3.a($$5);
      }

      return bsj.a;
   }

   protected void a(dww $$0, ard $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dum $$3) {
         dar var11 = $$3.aB_();
         Optional<dbi<das>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dbi<das> $$7 = $$6.get();
            cwo $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cwo $$9 : $$7.b().a(var11)) {
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

   public static Optional<dbi<das>> a(ard $$0, dar $$1) {
      return g.a($$0, $$1);
   }

   private void a(ard $$0, ji $$1, dum $$2, cwo $$3, dww $$4, dbi<?> $$5) {
      jn $$6 = $$4.c(d).a();
      bsc $$7 = dva.a($$0, $$1.a($$6));
      cwo $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dum || $$3.M() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cwo $$9 = $$8.c(1);
            cwo $$10 = dva.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dva.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         faz $$12 = faz.b($$1);
         faz $$13 = $$12.a($$6, 0.7);
         lb.a($$0, $$8, 6, $$6, $$13);

         for (are $$14 : $$0.a(are.class, fau.a($$12, 17.0, 17.0, 17.0))) {
            ap.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(d, c, b);
   }
}
