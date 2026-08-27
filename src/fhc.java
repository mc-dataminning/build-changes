import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class fhc<T extends ckf> extends fgk<T> {
   private static final aiy x = new aiy("container/inventory/effect_background_large");
   private static final aiy y = new aiy("container/inventory/effect_background_small");

   public fhc(T $$0, chk $$1, vq $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   public boolean K() {
      int $$0 = this.t + this.c + 2;
      int $$1 = this.g - $$0;
      return $$1 >= 32;
   }

   private void c(ezb $$0, int $$1, int $$2) {
      int $$3 = this.t + this.c + 2;
      int $$4 = this.g - $$3;
      Collection<bnd> $$5 = this.f.s.et();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bnd> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.u;
            bnd $$10 = null;

            for (bnd $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<vq> $$12 = List.of(this.a($$10), bne.a($$10, 1.0F, this.f.r.s().f()));
               $$0.a(this.i, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(ezb $$0, int $$1, int $$2, Iterable<bnd> $$3, boolean $$4) {
      int $$5 = this.u;

      for (bnd $$6 : $$3) {
         if ($$4) {
            $$0.a(x, $$1, $$5, 120, 32);
         } else {
            $$0.a(y, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(ezb $$0, int $$1, int $$2, Iterable<bnd> $$3, boolean $$4) {
      ghy $$5 = this.f.aF();
      int $$6 = this.u;

      for (bnd $$7 : $$3) {
         ij<bnb> $$8 = $$7.b();
         ghb $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(ezb $$0, int $$1, int $$2, Iterable<bnd> $$3) {
      int $$4 = this.u;

      for (bnd $$5 : $$3) {
         vq $$6 = this.a($$5);
         $$0.b(this.i, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         vq $$7 = bne.a($$5, 1.0F, this.f.r.s().f());
         $$0.b(this.i, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private vq a(bnd $$0) {
      we $$1 = $$0.b().a().e().f();
      if ($$0.d() >= 1 && $$0.d() <= 9) {
         $$1.b(vp.v).b(vq.c("enchantment.level." + ($$0.d() + 1)));
      }

      return $$1;
   }
}
