import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class fmt<T extends cod> extends fmb<T> {
   private static final akh D = new akh("container/inventory/effect_background_large");
   private static final akh E = new akh("container/inventory/effect_background_small");

   public fmt(T $$0, clg $$1, wu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   public boolean I() {
      int $$0 = this.z + this.c + 2;
      int $$1 = this.n - $$0;
      return $$1 >= 32;
   }

   private void c(fer $$0, int $$1, int $$2) {
      int $$3 = this.z + this.c + 2;
      int $$4 = this.n - $$3;
      Collection<bqt> $$5 = this.m.s.ev();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bqt> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.A;
            bqt $$10 = null;

            for (bqt $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<wu> $$12 = List.of(this.a($$10), bqu.a($$10, 1.0F, this.m.r.s().f()));
               $$0.a(this.p, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fer $$0, int $$1, int $$2, Iterable<bqt> $$3, boolean $$4) {
      int $$5 = this.A;

      for (bqt $$6 : $$3) {
         if ($$4) {
            $$0.a(D, $$1, $$5, 120, 32);
         } else {
            $$0.a(E, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fer $$0, int $$1, int $$2, Iterable<bqt> $$3, boolean $$4) {
      gnw $$5 = this.m.aG();
      int $$6 = this.A;

      for (bqt $$7 : $$3) {
         iw<bqr> $$8 = $$7.c();
         gmy $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(fer $$0, int $$1, int $$2, Iterable<bqt> $$3) {
      int $$4 = this.A;

      for (bqt $$5 : $$3) {
         wu $$6 = this.a($$5);
         $$0.b(this.p, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         wu $$7 = bqu.a($$5, 1.0F, this.m.r.s().f());
         $$0.b(this.p, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private wu a(bqt $$0) {
      xi $$1 = $$0.c().a().e().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(wt.v).b(wu.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
