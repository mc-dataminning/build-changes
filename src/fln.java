import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class fln<T extends cmw> extends fkv<T> {
   private static final ajv A = new ajv("container/inventory/effect_background_large");
   private static final ajv B = new ajv("container/inventory/effect_background_small");

   public fln(T $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   public boolean I() {
      int $$0 = this.w + this.c + 2;
      int $$1 = this.k - $$0;
      return $$1 >= 32;
   }

   private void c(fdl $$0, int $$1, int $$2) {
      int $$3 = this.w + this.c + 2;
      int $$4 = this.k - $$3;
      Collection<bpm> $$5 = this.j.s.eu();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bpm> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.x;
            bpm $$10 = null;

            for (bpm $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<wi> $$12 = List.of(this.a($$10), bpn.a($$10, 1.0F, this.j.r.s().f()));
               $$0.a(this.m, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fdl $$0, int $$1, int $$2, Iterable<bpm> $$3, boolean $$4) {
      int $$5 = this.x;

      for (bpm $$6 : $$3) {
         if ($$4) {
            $$0.a(A, $$1, $$5, 120, 32);
         } else {
            $$0.a(B, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fdl $$0, int $$1, int $$2, Iterable<bpm> $$3, boolean $$4) {
      gmp $$5 = this.j.aG();
      int $$6 = this.x;

      for (bpm $$7 : $$3) {
         in<bpk> $$8 = $$7.b();
         gls $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(fdl $$0, int $$1, int $$2, Iterable<bpm> $$3) {
      int $$4 = this.x;

      for (bpm $$5 : $$3) {
         wi $$6 = this.a($$5);
         $$0.b(this.m, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         wi $$7 = bpn.a($$5, 1.0F, this.j.r.s().f());
         $$0.b(this.m, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private wi a(bpm $$0) {
      ww $$1 = $$0.b().a().e().f();
      if ($$0.d() >= 1 && $$0.d() <= 9) {
         $$1.b(wh.v).b(wi.c("enchantment.level." + ($$0.d() + 1)));
      }

      return $$1;
   }
}
