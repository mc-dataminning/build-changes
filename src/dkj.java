import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkj extends dic {
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final dwm b = dwl.bx;
   public static final dwm c = dwl.A;
   private static final dws<jo> d = dwl.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final dbb g = new dbb(10);
   private static final int h = 17;

   public dkj(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jo.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dkj> a() {
      return a;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return $$1.c_($$2) instanceof dtm $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dsy $$8 = $$1.c_($$2);
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
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0.C ? null : a($$2, dta.P, dtm::a);
   }

   private void a(@Nullable dsy $$0, boolean $$1) {
      if ($$0 instanceof dtm $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      dtm $$2 = new dtm($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dvv a(dad $$0) {
      jm $$1 = $$0.d().g();

      jm $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jm.b;
      };
      return this.m().b(d, jo.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bvh $$3, cwm $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtm $$5) {
         $$3.a($$5);
      }

      return bsk.a;
   }

   protected void a(dvv $$0, arp $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dtm $$3) {
         dap var11 = $$3.aB_();
         Optional<dbc<daq>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dbc<daq> $$7 = $$6.get();
            cwm $$8 = $$7.b().a(var11, $$1.J_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cwm $$9 : $$7.b().a(var11)) {
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

   public static Optional<dbc<daq>> a(dfm $$0, dap $$1) {
      return g.a($$0, $$1);
   }

   private void a(arp $$0, jh $$1, dtm $$2, cwm $$3, dvv $$4, dbc<daq> $$5) {
      jm $$6 = $$4.c(d).a();
      bsd $$7 = dtz.a($$0, $$1.a($$6));
      cwm $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dtm || $$3.L() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cwm $$9 = $$8.c(1);
            cwm $$10 = dtz.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.L();
            $$8 = dtz.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.L()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         ezy $$12 = ezy.b($$1);
         ezy $$13 = $$12.a($$6, 0.7);
         la.a($$0, $$8, 6, $$6, $$13);

         for (arq $$14 : $$0.a(arq.class, ezt.a($$12, 17.0, 17.0, 17.0))) {
            ao.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(d, c, b);
   }
}
