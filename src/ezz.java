import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class ezz<T extends cel> extends ezi<T> {
   private static final aew x = new aew("container/inventory/effect_background_large");
   private static final aew y = new aew("container/inventory/effect_background_small");

   public ezz(T $$0, cbt $$1, tl $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   @Override
   public boolean H() {
      int $$0 = this.t + this.c + 2;
      int $$1 = this.g - $$0;
      return $$1 >= 32;
   }

   private void c(esf $$0, int $$1, int $$2) {
      int $$3 = this.t + this.c + 2;
      int $$4 = this.g - $$3;
      Collection<bid> $$5 = this.f.s.er();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bid> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.u;
            bid $$10 = null;

            for (bid $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<tl> $$12 = List.of(this.a($$10), bie.a($$10, 1.0F));
               $$0.a(this.i, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(esf $$0, int $$1, int $$2, Iterable<bid> $$3, boolean $$4) {
      int $$5 = this.u;

      for (bid $$6 : $$3) {
         if ($$4) {
            $$0.a(x, $$1, $$5, 120, 32);
         } else {
            $$0.a(y, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(esf $$0, int $$1, int $$2, Iterable<bid> $$3, boolean $$4) {
      gac $$5 = this.f.aE();
      int $$6 = this.u;

      for (bid $$7 : $$3) {
         bib $$8 = $$7.c();
         fze $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(esf $$0, int $$1, int $$2, Iterable<bid> $$3) {
      int $$4 = this.u;

      for (bid $$5 : $$3) {
         tl $$6 = this.a($$5);
         $$0.b(this.i, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         tl $$7 = bie.a($$5, 1.0F);
         $$0.b(this.i, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private tl a(bid $$0) {
      ty $$1 = $$0.c().e().e();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(tk.u).b(tl.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
