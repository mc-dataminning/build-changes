import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgn extends deg {
   public static final MapCodec<dgn> a = b(dgn::new);
   public static final dso b = dsn.bx;
   public static final dso c = dsn.A;
   private static final dsv<jg> d = dsn.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cyr g = new cyr(10);
   private static final int h = 17;

   public dgn(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jg.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dgn> a() {
      return a;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return $$1.c_($$2) instanceof dpq $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dpc $$8 = $$1.c_($$2);
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
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0.B ? null : a($$2, dpe.P, dpq::a);
   }

   private void a(@Nullable dpc $$0, boolean $$1) {
      if ($$0 instanceof dpq $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      dpq $$2 = new dpq($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public drx a(cxv $$0) {
      je $$1 = $$0.d().g();

      je $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> je.b;
      };
      return this.n().a(d, jg.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      bql.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof dpq) {
            $$3.a((dpq)$$5);
         }

         return bqp.c;
      }
   }

   protected void a(drx $$0, arb $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dpq $$3) {
         Optional<cys<cyh>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cys<cyh> $$6 = $$5.get();
            cuk $$7 = $$6.b().a($$3, $$1.H_());
            if ($$7.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (cuk $$8 : $$6.b().a($$3)) {
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

   public static Optional<cys<cyh>> a(dbt $$0, cqf $$1) {
      return g.a($$0, $$1);
   }

   private void a(arb $$0, iz $$1, dpq $$2, cuk $$3, drx $$4, cys<cyh> $$5) {
      je $$6 = $$4.c(d).a();
      bqi $$7 = dqb.a($$0, $$1.a($$6));
      cuk $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dpq || $$3.I() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cuk $$9 = $$8.c(1);
            cuk $$10 = dqb.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.I();
            $$8 = dqb.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.I()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         evm $$12 = evm.b($$1);
         evm $$13 = $$12.a($$6, 0.7);
         ks.a($$0, $$8, 6, $$6, $$13);

         for (arc $$14 : $$0.a(arc.class, evh.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(d, c, b);
   }
}
