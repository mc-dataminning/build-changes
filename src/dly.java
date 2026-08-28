import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dly extends djq {
   public static final MapCodec<dly> a = b(dly::new);
   public static final dye b = dyd.by;
   public static final dye c = dyd.B;
   private static final dyk<jo> d = dyd.U;
   private static final int e = 6;
   private static final int f = 4;
   private static final dcc g = new dcc(10);
   private static final int h = 17;

   public dly(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jo.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dly> a() {
      return a;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return $$1.c_($$2) instanceof dvd $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dup $$8 = $$1.c_($$2);
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
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0.C ? null : a($$2, dur.Q, dvd::a);
   }

   private void a(@Nullable dup $$0, boolean $$1) {
      if ($$0 instanceof dvd $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      dvd $$2 = new dvd($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dxn a(dbb $$0) {
      jm $$1 = $$0.d().g();

      jm $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jm.b;
      };
      return this.m().b(d, jo.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bwb $$3, cxk $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      bta.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvd $$5) {
         $$3.a($$5);
      }

      return bte.a;
   }

   protected void a(dxn $$0, ash $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dvd $$3) {
         dbo var11 = $$3.aC_();
         Optional<dcd<dbp>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dcd<dbp> $$7 = $$6.get();
            cxk $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cxk $$9 : $$7.b().a(var11)) {
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

   public static Optional<dcd<dbp>> a(ash $$0, dbo $$1) {
      return g.a($$0, $$1);
   }

   private void a(ash $$0, jh $$1, dvd $$2, cxk $$3, dxn $$4, dcd<?> $$5) {
      jm $$6 = $$4.c(d).a();
      bsx $$7 = dvr.a($$0, $$1.a($$6));
      cxk $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dvd || $$3.L() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cxk $$9 = $$8.c(1);
            cxk $$10 = dvr.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.L();
            $$8 = dvr.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.L()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fbs $$12 = fbs.b($$1);
         fbs $$13 = $$12.a($$6, 0.7);
         la.a($$0, $$8, 6, $$6, $$13);

         for (asi $$14 : $$0.a(asi.class, fbn.a($$12, 17.0, 17.0, 17.0))) {
            ao.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(d, c, b);
   }
}
