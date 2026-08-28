import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dha extends det {
   public static final MapCodec<dha> a = b(dha::new);
   public static final dtb b = dta.bx;
   public static final dtb c = dta.A;
   private static final dti<jh> d = dta.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cyj g = new cyj(10);
   private static final int h = 17;

   public dha(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jh.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dha> a() {
      return a;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return $$1.c_($$2) instanceof dqd $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dpp $$8 = $$1.c_($$2);
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
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0.B ? null : a($$2, dpr.P, dqd::a);
   }

   private void a(@Nullable dpp $$0, boolean $$1) {
      if ($$0 instanceof dqd $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      dqd $$2 = new dqd($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dsk a(cxm $$0) {
      jf $$1 = $$0.d().g();

      jf $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jf.b;
      };
      return this.o().a(d, jh.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, btb $$3, cuc $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      bqc.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dqd) {
            $$3.a((dqd)$$5);
         }

         return bqg.c;
      }
   }

   protected void a(dsk $$0, aqm $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqd $$3) {
         cxy var11 = $$3.aA_();
         Optional<cyk<cxz>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cyk<cxz> $$7 = $$6.get();
            cuc $$8 = $$7.b().a(var11, $$1.H_());
            if ($$8.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cuc $$9 : $$7.b().a(var11)) {
                  if (!$$9.e()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
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

   public static Optional<cyk<cxz>> a(dcf $$0, cxy $$1) {
      return g.a($$0, $$1);
   }

   private void a(aqm $$0, ja $$1, dqd $$2, cuc $$3, dsk $$4, cyk<cxz> $$5) {
      jf $$6 = $$4.c(d).a();
      bpz $$7 = dqp.a($$0, $$1.a($$6));
      cuc $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dqd || $$3.H() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cuc $$9 = $$8.c(1);
            cuc $$10 = dqp.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.H();
            $$8 = dqp.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.H()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         ewf $$12 = ewf.b($$1);
         ewf $$13 = $$12.a($$6, 0.7);
         kt.a($$0, $$8, 6, $$6, $$13);

         for (aqn $$14 : $$0.a(aqn.class, ewa.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(d, c, b);
   }
}
