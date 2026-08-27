import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class ezk<T extends cec> extends eyt<T> {
   private static final aep x = new aep("container/inventory/effect_background_large");
   private static final aep y = new aep("container/inventory/effect_background_small");

   public ezk(T $$0, cbk $$1, te $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   @Override
   public boolean F() {
      int $$0 = this.t + this.c + 2;
      int $$1 = this.g - $$0;
      return $$1 >= 32;
   }

   private void c(erx $$0, int $$1, int $$2) {
      int $$3 = this.t + this.c + 2;
      int $$4 = this.g - $$3;
      Collection<bht> $$5 = this.f.t.eq();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bht> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.u;
            bht $$10 = null;

            for (bht $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<te> $$12 = List.of(this.a($$10), bhu.a($$10, 1.0F));
               $$0.a(this.i, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(erx $$0, int $$1, int $$2, Iterable<bht> $$3, boolean $$4) {
      int $$5 = this.u;

      for (bht $$6 : $$3) {
         if ($$4) {
            $$0.a(x, $$1, $$5, 120, 32);
         } else {
            $$0.a(y, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(erx $$0, int $$1, int $$2, Iterable<bht> $$3, boolean $$4) {
      fze $$5 = this.f.aE();
      int $$6 = this.u;

      for (bht $$7 : $$3) {
         bhr $$8 = $$7.c();
         fyg $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(erx $$0, int $$1, int $$2, Iterable<bht> $$3) {
      int $$4 = this.u;

      for (bht $$5 : $$3) {
         te $$6 = this.a($$5);
         $$0.b(this.i, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         te $$7 = bhu.a($$5, 1.0F);
         $$0.b(this.i, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private te a(bht $$0) {
      tr $$1 = $$0.c().e().e();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(td.u).b(te.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
