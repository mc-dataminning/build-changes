import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgr extends dek {
   public static final MapCodec<dgr> a = b(dgr::new);
   public static final dss b = dsr.bx;
   public static final dss c = dsr.A;
   private static final dsz<jg> d = dsr.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cyv g = new cyv(10);
   private static final int h = 17;

   public dgr(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jg.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dgr> a() {
      return a;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return $$1.c_($$2) instanceof dpu $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dpg $$8 = $$1.c_($$2);
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
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0.B ? null : a($$2, dpi.P, dpu::a);
   }

   private void a(@Nullable dpg $$0, boolean $$1) {
      if ($$0 instanceof dpu $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      dpu $$2 = new dpu($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dsb a(cxz $$0) {
      je $$1 = $$0.d().g();

      je $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> je.b;
      };
      return this.o().a(d, jg.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bto $$3, cuo $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      bqp.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof dpu) {
            $$3.a((dpu)$$5);
         }

         return bqt.c;
      }
   }

   protected void a(dsb $$0, are $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dpu $$3) {
         Optional<cyw<cyl>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cyw<cyl> $$6 = $$5.get();
            cuo $$7 = $$6.b().a($$3, $$1.H_());
            if ($$7.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (cuo $$8 : $$6.b().a($$3)) {
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

   public static Optional<cyw<cyl>> a(dbx $$0, cqj $$1) {
      return g.a($$0, $$1);
   }

   private void a(are $$0, iz $$1, dpu $$2, cuo $$3, dsb $$4, cyw<cyl> $$5) {
      je $$6 = $$4.c(d).a();
      bqm $$7 = dqf.a($$0, $$1.a($$6));
      cuo $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dpu || $$3.I() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cuo $$9 = $$8.c(1);
            cuo $$10 = dqf.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.I();
            $$8 = dqf.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.I()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         evq $$12 = evq.b($$1);
         evq $$13 = $$12.a($$6, 0.7);
         ks.a($$0, $$8, 6, $$6, $$13);

         for (arf $$14 : $$0.a(arf.class, evl.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(d, c, b);
   }
}
