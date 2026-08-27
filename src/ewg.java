import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class ewg<T extends cbf> extends evp<T> {
   public ewg(T $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   @Override
   public boolean F() {
      int $$0 = this.s + this.c + 2;
      int $$1 = this.g - $$0;
      return $$1 >= 32;
   }

   private void c(eox $$0, int $$1, int $$2) {
      int $$3 = this.s + this.c + 2;
      int $$4 = this.g - $$3;
      Collection<bfa> $$5 = this.f.t.eo();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bfa> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.t;
            bfa $$10 = null;

            for (bfa $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<sw> $$12 = List.of(this.a($$10), bfb.a($$10, 1.0F));
               $$0.a(this.i, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(eox $$0, int $$1, int $$2, Iterable<bfa> $$3, boolean $$4) {
      int $$5 = this.t;

      for (bfa $$6 : $$3) {
         if ($$4) {
            $$0.a(a, $$1, $$5, 0, 166, 120, 32);
         } else {
            $$0.a(a, $$1, $$5, 0, 198, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(eox $$0, int $$1, int $$2, Iterable<bfa> $$3, boolean $$4) {
      fvs $$5 = this.f.aF();
      int $$6 = this.t;

      for (bfa $$7 : $$3) {
         bey $$8 = $$7.c();
         fuv $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(eox $$0, int $$1, int $$2, Iterable<bfa> $$3) {
      int $$4 = this.t;

      for (bfa $$5 : $$3) {
         sw $$6 = this.a($$5);
         $$0.b(this.i, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         sw $$7 = bfb.a($$5, 1.0F);
         $$0.b(this.i, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private sw a(bfa $$0) {
      tj $$1 = $$0.c().e().e();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(sv.t).b(sw.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
