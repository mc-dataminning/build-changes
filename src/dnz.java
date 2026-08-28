import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnz extends dlr {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final eay b = eax.bA;
   public static final eay c = eax.G;
   private static final ebf<jc> d = eax.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final ddy g = new ddy(10);
   private static final int h = 17;

   public dnz(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jc.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dnz> a() {
      return a;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return $$1.c_($$2) instanceof dxu $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      boolean $$7 = $$0.c(c);
      dxf $$8 = $$1.c_($$2);
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
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0.C ? null : a($$2, dxh.Q, dxu::a);
   }

   private void a(@Nullable dxf $$0, boolean $$1) {
      if ($$0 instanceof dxu $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      dxu $$2 = new dxu($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public eah a(dcw $$0) {
      ja $$1 = $$0.d().g();

      ja $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ja.b;
      };
      return this.m().b(d, jc.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bxe $$3, czd $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxu $$5) {
         $$3.a($$5);
      }

      return bud.a;
   }

   protected void a(eah $$0, arq $$1, iu $$2) {
      if ($$1.c_($$2) instanceof dxu $$3) {
         ddi var11 = $$3.ay_();
         Optional<ddz<ddj>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            ddz<ddj> $$7 = $$6.get();
            czd $$8 = $$7.b().a(var11, $$1.F_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (czd $$9 : $$7.b().a(var11)) {
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

   public static Optional<ddz<ddj>> a(arq $$0, ddi $$1) {
      return g.a($$0, $$1);
   }

   private void a(arq $$0, iu $$1, dxu $$2, czd $$3, eah $$4, ddz<?> $$5) {
      ja $$6 = $$4.c(d).a();
      btw $$7 = dyi.a($$0, $$1.a($$6));
      czd $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dxu || $$3.M() > $$7.f_($$3))) {
         while (!$$8.f()) {
            czd $$9 = $$8.c(1);
            czd $$10 = dyi.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dyi.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         feq $$12 = feq.b($$1);
         feq $$13 = $$12.a($$6, 0.7);
         lf.a($$0, $$8, 6, $$6, $$13);

         for (arr $$14 : $$0.a(arr.class, fel.a($$12, 17.0, 17.0, 17.0))) {
            ap.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(d, c, b);
   }
}
