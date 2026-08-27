import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class fer<T extends cia> extends fdz<T> {
   private static final ahg x = new ahg("container/inventory/effect_background_large");
   private static final ahg y = new ahg("container/inventory/effect_background_small");

   public fer(T $$0, cfg $$1, vf $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   public boolean J() {
      int $$0 = this.t + this.c + 2;
      int $$1 = this.g - $$0;
      return $$1 >= 32;
   }

   private void c(ewt $$0, int $$1, int $$2) {
      int $$3 = this.t + this.c + 2;
      int $$4 = this.g - $$3;
      Collection<blh> $$5 = this.f.s.es();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<blh> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.u;
            blh $$10 = null;

            for (blh $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<vf> $$12 = List.of(this.a($$10), bli.a($$10, 1.0F, this.f.r.s().f()));
               $$0.a(this.i, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(ewt $$0, int $$1, int $$2, Iterable<blh> $$3, boolean $$4) {
      int $$5 = this.u;

      for (blh $$6 : $$3) {
         if ($$4) {
            $$0.a(x, $$1, $$5, 120, 32);
         } else {
            $$0.a(y, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(ewt $$0, int $$1, int $$2, Iterable<blh> $$3, boolean $$4) {
      gfj $$5 = this.f.aE();
      int $$6 = this.u;

      for (blh $$7 : $$3) {
         blf $$8 = $$7.c();
         gem $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(ewt $$0, int $$1, int $$2, Iterable<blh> $$3) {
      int $$4 = this.u;

      for (blh $$5 : $$3) {
         vf $$6 = this.a($$5);
         $$0.b(this.i, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         vf $$7 = bli.a($$5, 1.0F, this.f.r.s().f());
         $$0.b(this.i, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private vf a(blh $$0) {
      vt $$1 = $$0.c().e().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(ve.u).b(vf.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
