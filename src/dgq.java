import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgq extends dej {
   public static final MapCodec<dgq> a = b(dgq::new);
   public static final dsr b = dsq.bx;
   public static final dsr c = dsq.A;
   private static final dsy<jg> d = dsq.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cyu g = new cyu(10);
   private static final int h = 17;

   public dgq(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jg.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dgq> a() {
      return a;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return $$1.c_($$2) instanceof dpt $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dpf $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0.B ? null : a($$2, dph.P, dpt::a);
   }

   private void a(@Nullable dpf $$0, boolean $$1) {
      if ($$0 instanceof dpt $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      dpt $$2 = new dpt($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dsa a(cxy $$0) {
      je $$1 = $$0.d().g();

      je $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> je.b;
      };
      return this.o().a(d, jg.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, btn $$3, cun $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      bqo.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         dpf $$5 = $$1.c_($$2);
         if ($$5 instanceof dpt) {
            $$3.a((dpt)$$5);
         }

         return bqs.c;
      }
   }

   protected void a(dsa $$0, are $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dpt $$3) {
         Optional<cyv<cyk>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cyv<cyk> $$6 = $$5.get();
            cun $$7 = $$6.b().a($$3, $$1.H_());
            if ($$7.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (cun $$8 : $$6.b().a($$3)) {
                  if (!$$8.e()) {
                     this.a($$1, $$2, $$3, $$8, $$0, $$6);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.e()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cyv<cyk>> a(dbw $$0, cqi $$1) {
      return g.a($$0, $$1);
   }

   private void a(are $$0, iz $$1, dpt $$2, cun $$3, dsa $$4, cyv<cyk> $$5) {
      je $$6 = $$4.c(d).a();
      bql $$7 = dqe.a($$0, $$1.a($$6));
      cun $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dpt || $$3.I() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cun $$9 = $$8.c(1);
            cun $$10 = dqe.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.I();
            $$8 = dqe.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.I()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         evp $$12 = evp.b($$1);
         evp $$13 = $$12.a($$6, 0.7);
         ks.a($$0, $$8, 6, $$6, $$13);

         for (arf $$14 : $$0.a(arf.class, evk.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(d, c, b);
   }
}
