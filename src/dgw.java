import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgw extends den {
   public static final MapCodec<dgw> a = b(dgw::new);
   public static final dtt b = dts.bx;
   public static final dtt c = dts.A;
   private static final dua<iy> d = dts.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final czb g = new czb(10);
   private static final int h = 17;

   public dgw(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, iy.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dgw> a() {
      return a;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return $$1.c_($$2) instanceof dqq $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dqc $$8 = $$1.c_($$2);
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
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0.C ? null : a($$2, dqe.Q, dqq::a);
   }

   private void a(@Nullable dqc $$0, boolean $$1) {
      if ($$0 instanceof dqq $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      dqq $$2 = new dqq($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dtc a(cyd $$0) {
      iw $$1 = $$0.d().g();

      iw $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> iw.b;
      };
      return this.n().a(d, iy.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, bso $$3, cuh $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      bpw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof dqq) {
            $$3.a((dqq)$$5);
         }

         return bqa.b;
      }
   }

   protected void a(dtc $$0, aqt $$1, ir $$2) {
      if ($$1.c_($$2) instanceof dqq $$3) {
         Optional<czc<cyp>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            czc<cyp> $$6 = $$5.get();
            cuh $$7 = $$6.b().a($$3, $$1.I_());
            if ($$7.d()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (cuh $$8 : $$6.b().a($$3)) {
                  if (!$$8.d()) {
                     this.a($$1, $$2, $$3, $$8, $$0, $$6);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.d()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<czc<cyp>> a(dca $$0, cpw $$1) {
      return g.a($$0, $$1);
   }

   private void a(aqt $$0, ir $$1, dqq $$2, cuh $$3, dtc $$4, czc<cyp> $$5) {
      iw $$6 = $$4.c(d).a();
      bpt $$7 = drc.a($$0, $$1.a($$6));
      cuh $$8 = $$3.r();
      if ($$7 != null && ($$7 instanceof dqq || $$3.G() > $$7.a($$3))) {
         while (!$$8.d()) {
            cuh $$9 = $$8.c(1);
            cuh $$10 = drc.a($$2, $$7, $$9, $$6.g());
            if (!$$10.d()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.d()) {
            int $$11 = $$8.G();
            $$8 = drc.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.G()) {
               break;
            }
         }
      }

      if (!$$8.d()) {
         ewu $$12 = ewu.b($$1);
         ewu $$13 = $$12.a($$6, 0.7);
         kl.a($$0, $$8, 6, $$6, $$13);

         for (aqu $$14 : $$0.a(aqu.class, ewp.a($$12, 17.0, 17.0, 17.0))) {
            an.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(d, c, b);
   }
}
