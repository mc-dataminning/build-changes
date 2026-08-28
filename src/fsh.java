import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class fsh<T extends cro> extends frp<T> {
   private static final ali G = ali.b("container/inventory/effect_background_large");
   private static final ali H = ali.b("container/inventory/effect_background_small");

   public fsh(T $$0, col $$1, xi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   public boolean J() {
      int $$0 = this.C + this.s + 2;
      int $$1 = this.n - $$0;
      return $$1 >= 32;
   }

   private void c(fku $$0, int $$1, int $$2) {
      int $$3 = this.C + this.s + 2;
      int $$4 = this.n - $$3;
      Collection<btj> $$5 = this.m.t.eD();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<btj> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.D;
            btj $$10 = null;

            for (btj $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<xi> $$12 = List.of(this.a($$10), btk.a($$10, 1.0F, this.m.s.s().f()));
               $$0.a(this.p, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fku $$0, int $$1, int $$2, Iterable<btj> $$3, boolean $$4) {
      int $$5 = this.D;

      for (btj $$6 : $$3) {
         if ($$4) {
            $$0.a(gir::B, G, $$1, $$5, 120, 32);
         } else {
            $$0.a(gir::B, H, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fku $$0, int $$1, int $$2, Iterable<btj> $$3, boolean $$4) {
      gzc $$5 = this.m.aG();
      int $$6 = this.D;

      for (btj $$7 : $$3) {
         jq<bth> $$8 = $$7.c();
         gyd $$9 = $$5.a($$8);
         $$0.a(gir::B, $$9, $$1 + ($$4 ? 6 : 7), $$6 + 7, 18, 18);
         $$6 += $$2;
      }
   }

   private void a(fku $$0, int $$1, int $$2, Iterable<btj> $$3) {
      int $$4 = this.D;

      for (btj $$5 : $$3) {
         xi $$6 = this.a($$5);
         $$0.b(this.p, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         xi $$7 = btk.a($$5, 1.0F, this.m.s.s().f());
         $$0.b(this.p, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private xi a(btj $$0) {
      xw $$1 = $$0.c().a().e().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(xh.v).b(xi.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
