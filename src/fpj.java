import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class fpj<T extends cpu> extends foq<T> {
   private static final akr E = akr.b("container/inventory/effect_background_large");
   private static final akr F = akr.b("container/inventory/effect_background_small");

   public fpj(T $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   public boolean G() {
      int $$0 = this.A + this.c + 2;
      int $$1 = this.m - $$0;
      return $$1 >= 32;
   }

   private void c(fhx $$0, int $$1, int $$2) {
      int $$3 = this.A + this.c + 2;
      int $$4 = this.m - $$3;
      Collection<brz> $$5 = this.l.s.eu();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<brz> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.B;
            brz $$10 = null;

            for (brz $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<wz> $$12 = List.of(this.a($$10), bsa.a($$10, 1.0F, this.l.r.s().f()));
               $$0.a(this.o, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fhx $$0, int $$1, int $$2, Iterable<brz> $$3, boolean $$4) {
      int $$5 = this.B;

      for (brz $$6 : $$3) {
         if ($$4) {
            $$0.a(E, $$1, $$5, 120, 32);
         } else {
            $$0.a(F, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fhx $$0, int $$1, int $$2, Iterable<brz> $$3, boolean $$4) {
      grh $$5 = this.l.aE();
      int $$6 = this.B;

      for (brz $$7 : $$3) {
         jm<brx> $$8 = $$7.c();
         gqj $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(fhx $$0, int $$1, int $$2, Iterable<brz> $$3) {
      int $$4 = this.B;

      for (brz $$5 : $$3) {
         wz $$6 = this.a($$5);
         $$0.b(this.o, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         wz $$7 = bsa.a($$5, 1.0F, this.l.r.s().f());
         $$0.b(this.o, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private wz a(brz $$0) {
      xn $$1 = $$0.c().a().e().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(wy.v).b(wz.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
