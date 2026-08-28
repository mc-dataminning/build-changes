import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmg extends djy {
   public static final MapCodec<dmg> a = b(dmg::new);
   public static final dym b = dyl.by;
   public static final dym c = dyl.B;
   private static final dys<jo> d = dyl.U;
   private static final int e = 6;
   private static final int f = 4;
   private static final dci g = new dci(10);
   private static final int h = 17;

   public dmg(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jo.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dmg> a() {
      return a;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return $$1.c_($$2) instanceof dvl $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dux $$8 = $$1.c_($$2);
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
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0.C ? null : a($$2, duz.Q, dvl::a);
   }

   private void a(@Nullable dux $$0, boolean $$1) {
      if ($$0 instanceof dvl $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      dvl $$2 = new dvl($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dxv a(dbg $$0) {
      jm $$1 = $$0.d().g();

      jm $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jm.b;
      };
      return this.m().b(d, jo.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bwg $$3, cxp $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      btf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvl $$5) {
         $$3.a($$5);
      }

      return btj.a;
   }

   protected void a(dxv $$0, ash $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dvl $$3) {
         dbs var11 = $$3.aC_();
         Optional<dcj<dbt>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dcj<dbt> $$7 = $$6.get();
            cxp $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cxp $$9 : $$7.b().a(var11)) {
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

   public static Optional<dcj<dbt>> a(ash $$0, dbs $$1) {
      return g.a($$0, $$1);
   }

   private void a(ash $$0, jh $$1, dvl $$2, cxp $$3, dxv $$4, dcj<?> $$5) {
      jm $$6 = $$4.c(d).a();
      btc $$7 = dvz.a($$0, $$1.a($$6));
      cxp $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dvl || $$3.L() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cxp $$9 = $$8.c(1);
            cxp $$10 = dvz.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.L();
            $$8 = dvz.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.L()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fby $$12 = fby.b($$1);
         fby $$13 = $$12.a($$6, 0.7);
         la.a($$0, $$8, 6, $$6, $$13);

         for (asi $$14 : $$0.a(asi.class, fbt.a($$12, 17.0, 17.0, 17.0))) {
            ao.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(d, c, b);
   }
}
