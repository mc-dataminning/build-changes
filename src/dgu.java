import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgu extends den {
   public static final MapCodec<dgu> a = b(dgu::new);
   public static final dsv b = dsu.bx;
   public static final dsv c = dsu.A;
   private static final dtc<jg> d = dsu.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cyy g = new cyy(10);
   private static final int h = 17;

   public dgu(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jg.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dgu> a() {
      return a;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return $$1.c_($$2) instanceof dpx $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dpj $$8 = $$1.c_($$2);
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
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0.B ? null : a($$2, dpl.P, dpx::a);
   }

   private void a(@Nullable dpj $$0, boolean $$1) {
      if ($$0 instanceof dpx $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      dpx $$2 = new dpx($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dse a(cyc $$0) {
      je $$1 = $$0.d().g();

      je $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> je.b;
      };
      return this.o().a(d, jg.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, btr $$3, cur $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      bqs.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dpx) {
            $$3.a((dpx)$$5);
         }

         return bqw.c;
      }
   }

   protected void a(dse $$0, arf $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dpx $$3) {
         Optional<cyz<cyo>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cyz<cyo> $$6 = $$5.get();
            cur $$7 = $$6.b().a($$3, $$1.H_());
            if ($$7.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (cur $$8 : $$6.b().a($$3)) {
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

   public static Optional<cyz<cyo>> a(dca $$0, cqm $$1) {
      return g.a($$0, $$1);
   }

   private void a(arf $$0, iz $$1, dpx $$2, cur $$3, dse $$4, cyz<cyo> $$5) {
      je $$6 = $$4.c(d).a();
      bqp $$7 = dqi.a($$0, $$1.a($$6));
      cur $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dpx || $$3.I() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cur $$9 = $$8.c(1);
            cur $$10 = dqi.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.I();
            $$8 = dqi.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.I()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         evt $$12 = evt.b($$1);
         evt $$13 = $$12.a($$6, 0.7);
         ks.a($$0, $$8, 6, $$6, $$13);

         for (arg $$14 : $$0.a(arg.class, evo.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(d, c, b);
   }
}
