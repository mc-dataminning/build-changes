import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlw extends djp {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final dyf b = dye.bA;
   public static final dyf c = dye.H;
   private static final dyl<jo> d = dye.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dbz g = new dbz(10);
   private static final int h = 17;

   public dlw(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jo.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dlw> a() {
      return a;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return $$1.c_($$2) instanceof dve $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      duq $$8 = $$1.c_($$2);
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
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0.C ? null : a($$2, dus.Q, dve::a);
   }

   private void a(@Nullable duq $$0, boolean $$1) {
      if ($$0 instanceof dve $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      dve $$2 = new dve($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dxo a(dax $$0) {
      jm $$1 = $$0.d().g();

      jm $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jm.b;
      };
      return this.m().b(d, jo.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvx $$3, cxg $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      bsw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dve $$5) {
         $$3.a($$5);
      }

      return bta.a;
   }

   protected void a(dxo $$0, arx $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dve $$3) {
         dbj var11 = $$3.aC_();
         Optional<dca<dbk>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dca<dbk> $$7 = $$6.get();
            cxg $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cxg $$9 : $$7.b().a(var11)) {
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

   public static Optional<dca<dbk>> a(arx $$0, dbj $$1) {
      return g.a($$0, $$1);
   }

   private void a(arx $$0, jh $$1, dve $$2, cxg $$3, dxo $$4, dca<?> $$5) {
      jm $$6 = $$4.c(d).a();
      bst $$7 = dvs.a($$0, $$1.a($$6));
      cxg $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dve || $$3.M() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cxg $$9 = $$8.c(1);
            cxg $$10 = dvs.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dvs.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fbr $$12 = fbr.b($$1);
         fbr $$13 = $$12.a($$6, 0.7);
         la.a($$0, $$8, 6, $$6, $$13);

         for (ary $$14 : $$0.a(ary.class, fbm.a($$12, 17.0, 17.0, 17.0))) {
            ao.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(d, c, b);
   }
}
