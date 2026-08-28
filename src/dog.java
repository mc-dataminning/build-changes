import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dog extends dly {
   public static final MapCodec<dog> a = b(dog::new);
   public static final ebf b = ebe.bA;
   public static final ebf c = ebe.G;
   private static final ebm<jd> d = ebe.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final def g = new def(10);
   private static final int h = 17;

   public dog(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jd.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dog> a() {
      return a;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return $$1.c_($$2) instanceof dyb $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      boolean $$7 = $$0.c(c);
      dxm $$8 = $$1.c_($$2);
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
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0.C ? null : a($$2, dxo.Q, dyb::a);
   }

   private void a(@Nullable dxm $$0, boolean $$1) {
      if ($$0 instanceof dyb $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      dyb $$2 = new dyb($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public eao a(ddd $$0) {
      jb $$1 = $$0.d().g();

      jb $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jb.b;
      };
      return this.m().b(d, jd.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bxj $$3, czk $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyb $$5) {
         $$3.a($$5);
      }

      return bug.a;
   }

   protected void a(eao $$0, arq $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dyb $$3) {
         ddp var11 = $$3.ay_();
         Optional<deg<ddq>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            deg<ddq> $$7 = $$6.get();
            czk $$8 = $$7.b().a(var11, $$1.F_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (czk $$9 : $$7.b().a(var11)) {
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

   public static Optional<deg<ddq>> a(arq $$0, ddp $$1) {
      return g.a($$0, $$1);
   }

   private void a(arq $$0, iv $$1, dyb $$2, czk $$3, eao $$4, deg<?> $$5) {
      jb $$6 = $$4.c(d).a();
      btz $$7 = dyp.a($$0, $$1.a($$6));
      czk $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dyb || $$3.M() > $$7.f_($$3))) {
         while (!$$8.f()) {
            czk $$9 = $$8.c(1);
            czk $$10 = dyp.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dyp.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fex $$12 = fex.b($$1);
         fex $$13 = $$12.a($$6, 0.7);
         lg.a($$0, $$8, 6, $$6, $$13);

         for (arr $$14 : $$0.a(arr.class, fes.a($$12, 17.0, 17.0, 17.0))) {
            aq.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(d, c, b);
   }
}
