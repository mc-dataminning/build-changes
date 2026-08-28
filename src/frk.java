import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class frk<T extends cqw> extends fqs<T> {
   private static final alc G = alc.b("container/inventory/effect_background_large");
   private static final alc H = alc.b("container/inventory/effect_background_small");

   public frk(T $$0, cnt $$1, xd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2);
   }

   public boolean J() {
      int $$0 = this.C + this.s + 2;
      int $$1 = this.n - $$0;
      return $$1 >= 32;
   }

   private void c(fjx $$0, int $$1, int $$2) {
      int $$3 = this.C + this.s + 2;
      int $$4 = this.n - $$3;
      Collection<bsv> $$5 = this.m.t.ex();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bsv> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.D;
            bsv $$10 = null;

            for (bsv $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<xd> $$12 = List.of(this.a($$10), bsw.a($$10, 1.0F, this.m.s.s().f()));
               $$0.a(this.p, $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fjx $$0, int $$1, int $$2, Iterable<bsv> $$3, boolean $$4) {
      int $$5 = this.D;

      for (bsv $$6 : $$3) {
         if ($$4) {
            $$0.a(ghq::B, G, $$1, $$5, 120, 32);
         } else {
            $$0.a(ghq::B, H, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fjx $$0, int $$1, int $$2, Iterable<bsv> $$3, boolean $$4) {
      gya $$5 = this.m.aG();
      int $$6 = this.D;

      for (bsv $$7 : $$3) {
         jn<bst> $$8 = $$7.c();
         gxb $$9 = $$5.a($$8);
         $$0.a(ghq::B, $$9, $$1 + ($$4 ? 6 : 7), $$6 + 7, 18, 18);
         $$6 += $$2;
      }
   }

   private void a(fjx $$0, int $$1, int $$2, Iterable<bsv> $$3) {
      int $$4 = this.D;

      for (bsv $$5 : $$3) {
         xd $$6 = this.a($$5);
         $$0.b(this.p, $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         xd $$7 = bsw.a($$5, 1.0F, this.m.s.s().f());
         $$0.b(this.p, $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private xd a(bsv $$0) {
      xr $$1 = $$0.c().a().e().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(xc.v).b(xd.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
