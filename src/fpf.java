import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class fpf<T extends cps> extends fom<T> {
   private static final akq D = akq.b("container/inventory/effect_background_large");
   private static final akq E = akq.b("container/inventory/effect_background_small");

   public fpf(T $$0, cmu $$1, wy $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   public boolean J() {
      int $$0 = this.z + this.c + 2;
      int $$1 = this.m - $$0;
      return $$1 >= 32;
   }

   private void c(fht $$0, int $$1, int $$2) {
      int $$3 = this.z + this.c + 2;
      int $$4 = this.m - $$3;
      Collection<bry> $$5 = this.l.s.eu();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bry> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.A;
            bry $$10 = null;

            for (bry $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<wy> $$12 = List.of(this.a($$10), brz.a($$10, 1.0F, this.l.r.s().f()));
               $$0.a(this.o, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fht $$0, int $$1, int $$2, Iterable<bry> $$3, boolean $$4) {
      int $$5 = this.A;

      for (bry $$6 : $$3) {
         if ($$4) {
            $$0.a(D, $$1, $$5, 120, 32);
         } else {
            $$0.a(E, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fht $$0, int $$1, int $$2, Iterable<bry> $$3, boolean $$4) {
      grd $$5 = this.l.aE();
      int $$6 = this.A;

      for (bry $$7 : $$3) {
         jm<brw> $$8 = $$7.c();
         gqf $$9 = $$5.a($$8);
         $$0.a($$1 + ($$4 ? 6 : 7), $$6 + 7, 0, 18, 18, $$9);
         $$6 += $$2;
      }
   }

   private void a(fht $$0, int $$1, int $$2, Iterable<bry> $$3) {
      int $$4 = this.A;

      for (bry $$5 : $$3) {
         wy $$6 = this.a($$5);
         $$0.b(this.o, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         wy $$7 = brz.a($$5, 1.0F, this.l.r.s().f());
         $$0.b(this.o, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private wy a(bry $$0) {
      xm $$1 = $$0.c().a().e().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(wx.v).b(wy.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
