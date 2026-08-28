import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmf extends djx {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final dyl b = dyk.by;
   public static final dyl c = dyk.B;
   private static final dyr<jo> d = dyk.U;
   private static final int e = 6;
   private static final int f = 4;
   private static final dch g = new dch(10);
   private static final int h = 17;

   public dmf(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jo.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dmf> a() {
      return a;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return $$1.c_($$2) instanceof dvk $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      duw $$8 = $$1.c_($$2);
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
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0.C ? null : a($$2, duy.Q, dvk::a);
   }

   private void a(@Nullable duw $$0, boolean $$1) {
      if ($$0 instanceof dvk $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      dvk $$2 = new dvk($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dxu a(dbf $$0) {
      jm $$1 = $$0.d().g();

      jm $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jm.b;
      };
      return this.m().b(d, jo.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bwf $$3, cxo $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      bte.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvk $$5) {
         $$3.a($$5);
      }

      return bti.a;
   }

   protected void a(dxu $$0, ash $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dvk $$3) {
         dbr var11 = $$3.aC_();
         Optional<dci<dbs>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dci<dbs> $$7 = $$6.get();
            cxo $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cxo $$9 : $$7.b().a(var11)) {
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

   public static Optional<dci<dbs>> a(ash $$0, dbr $$1) {
      return g.a($$0, $$1);
   }

   private void a(ash $$0, jh $$1, dvk $$2, cxo $$3, dxu $$4, dci<?> $$5) {
      jm $$6 = $$4.c(d).a();
      btb $$7 = dvy.a($$0, $$1.a($$6));
      cxo $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dvk || $$3.L() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cxo $$9 = $$8.c(1);
            cxo $$10 = dvy.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.L();
            $$8 = dvy.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.L()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fbx $$12 = fbx.b($$1);
         fbx $$13 = $$12.a($$6, 0.7);
         la.a($$0, $$8, 6, $$6, $$13);

         for (asi $$14 : $$0.a(asi.class, fbs.a($$12, 17.0, 17.0, 17.0))) {
            ao.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(d, c, b);
   }
}
