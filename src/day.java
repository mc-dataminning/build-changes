import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class day extends cyr {
   public static final MapCodec<day> a = b(day::new);
   public static final dmv b = dmu.bx;
   public static final dmv c = dmu.A;
   private static final dnc<ij> d = dmu.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cst g = new cst(10);

   public day(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ij.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<day> a() {
      return a;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return $$1.c_($$2) instanceof djz $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      djl $$8 = $$1.c_($$2);
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
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0.B ? null : a($$2, djn.P, djz::a);
   }

   private void a(@Nullable djl $$0, boolean $$1) {
      if ($$0 instanceof djz $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      djz $$2 = new djz($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dme a(crx $$0) {
      ih $$1 = $$0.d().g();

      ih $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ih.b;
      };
      return this.o().a(d, ij.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B() && $$0.c_($$1) instanceof djz $$5) {
         $$5.a($$4.z());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      bmh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof djz) {
            $$3.a((djz)$$5);
         }

         return bml.b;
      }
   }

   protected void a(dme $$0, apa $$1, ib $$2) {
      if ($$1.c_($$2) instanceof djz $$3) {
         Optional<csj> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            csj $$6 = $$5.get();
            cpq $$7 = $$6.a($$3, $$1.I_());
            if ($$7.b()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0);

               for (cpq $$8 : $$6.a($$3)) {
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

   public static Optional<csj> a(cwe $$0, clk $$1) {
      return g.a($$0, $$1);
   }

   private void a(cwe $$0, ib $$1, djz $$2, cpq $$3, dme $$4) {
      ih $$5 = $$4.c(d).a();
      bme $$6 = dkk.a($$0, $$1.a($$5));
      cpq $$7 = $$3.q();
      if ($$6 != null && ($$6 instanceof djz || $$3.M() > $$6.al_())) {
         while (!$$7.b()) {
            cpq $$8 = $$7.c(1);
            cpq $$9 = dkk.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.M();
            $$7 = dkk.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.M()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         eov $$11 = eov.b($$1).a($$5, 0.7);
         jm.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(d, c, b);
   }
}
