import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbt extends czm {
   public static final MapCodec<dbt> a = b(dbt::new);
   public static final dnq b = dnp.bx;
   public static final dnq c = dnp.A;
   private static final dnx<ij> d = dnp.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cto g = new cto(10);

   public dbt(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ij.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dbt> a() {
      return a;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return $$1.c_($$2) instanceof dku $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dkg $$8 = $$1.c_($$2);
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
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0.B ? null : a($$2, dki.P, dku::a);
   }

   private void a(@Nullable dkg $$0, boolean $$1) {
      if ($$0 instanceof dku $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      dku $$2 = new dku($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dmz a(css $$0) {
      ih $$1 = $$0.d().g();

      ih $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ih.b;
      };
      return this.o().a(d, ij.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$4.B() && $$0.c_($$1) instanceof dku $$5) {
         $$5.a($$4.z());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      bmy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof dku) {
            $$3.a((dku)$$5);
         }

         return bnc.b;
      }
   }

   protected void a(dmz $$0, apf $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dku $$3) {
         Optional<cte> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cte $$6 = $$5.get();
            cqk $$7 = $$6.a($$3, $$1.H_());
            if ($$7.b()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0);

               for (cqk $$8 : $$6.a($$3)) {
                  if (!$$8.b()) {
                     this.a($$1, $$2, $$3, $$8, $$0);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.b()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cte> a(cwz $$0, cme $$1) {
      return g.a($$0, $$1);
   }

   private void a(cwz $$0, ib $$1, dku $$2, cqk $$3, dmz $$4) {
      ih $$5 = $$4.c(d).a();
      bmv $$6 = dlf.a($$0, $$1.a($$5));
      cqk $$7 = $$3.q();
      if ($$6 != null && ($$6 instanceof dku || $$3.M() > $$6.ak_())) {
         while (!$$7.b()) {
            cqk $$8 = $$7.c(1);
            cqk $$9 = dlf.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.M();
            $$7 = dlf.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.M()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         epr $$11 = epr.b($$1).a($$5, 0.7);
         jn.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(d, c, b);
   }
}
