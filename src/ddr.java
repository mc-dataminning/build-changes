import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddr extends dbk {
   public static final MapCodec<ddr> a = b(ddr::new);
   public static final dpq b = dpp.bx;
   public static final dpq c = dpp.A;
   private static final dpx<ij> d = dpp.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cvk g = new cvk(10);

   public ddr(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ij.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<ddr> a() {
      return a;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return $$1.c_($$2) instanceof dmt $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dmf $$8 = $$1.c_($$2);
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
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0.B ? null : a($$2, dmh.P, dmt::a);
   }

   private void a(@Nullable dmf $$0, boolean $$1) {
      if ($$0 instanceof dmt $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      dmt $$2 = new dmt($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public doz a(cuo $$0) {
      ih $$1 = $$0.d().g();

      ih $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ih.b;
      };
      return this.n().a(d, ij.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      bnw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dmt) {
            $$3.a((dmt)$$5);
         }

         return boa.b;
      }
   }

   protected void a(doz $$0, aps $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dmt $$3) {
         Optional<cva> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cva $$6 = $$5.get();
            crj $$7 = $$6.a($$3, $$1.H_());
            if ($$7.d()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0);

               for (crj $$8 : $$6.a($$3)) {
                  if (!$$8.d()) {
                     this.a($$1, $$2, $$3, $$8, $$0);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.d()) {
                     $$0x.g(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cva> a(cyx $$0, cnf $$1) {
      return g.a($$0, $$1);
   }

   private void a(cyx $$0, ib $$1, dmt $$2, crj $$3, doz $$4) {
      ih $$5 = $$4.c(d).a();
      bnt $$6 = dne.a($$0, $$1.a($$5));
      crj $$7 = $$3.r();
      if ($$6 != null && ($$6 instanceof dmt || $$3.G() > $$6.aj_())) {
         while (!$$7.d()) {
            crj $$8 = $$7.c(1);
            crj $$9 = dne.a($$2, $$6, $$8, $$5.g());
            if (!$$9.d()) {
               break;
            }

            $$7.g(1);
         }
      } else if ($$6 != null) {
         while (!$$7.d()) {
            int $$10 = $$7.G();
            $$7 = dne.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.G()) {
               break;
            }
         }
      }

      if (!$$7.d()) {
         esa $$11 = esa.b($$1).a($$5, 0.7);
         jw.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(d, c, b);
   }
}
