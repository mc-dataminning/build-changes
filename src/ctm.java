import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctm extends csu {
   private static final int p = 3;
   private static final int q = 3;
   public static final int o = 0;
   private static final int r = 1;
   private static final int s = 9;
   private static final int t = 10;
   private static final int u = 10;
   private static final int v = 37;
   private static final int w = 37;
   private static final int x = 46;
   private final ctg y;
   private final cpo z;
   private boolean A;

   public ctm(int $$0, cpn $$1) {
      this($$0, $$1, ctg.a);
   }

   public ctm(int $$0, cpn $$1, ctg $$2) {
      super(cuc.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cst $$0, arx $$1, cpo $$2, ctl $$3, cul $$4, @Nullable dca<dbk> $$5) {
      dbj $$6 = $$3.aC_();
      ary $$7 = (ary)$$2;
      cxg $$8 = cxg.j;
      Optional<dca<dbk>> $$9 = $$1.p().aI().a(dcg.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dca<dbk> $$10 = $$9.get();
         dbk $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cxg $$12 = $$11.a($$6, $$1.K_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new add($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(bst $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof arx $$2) {
               a(this, $$2, this.z, this.m, this.n, null);
            }
         });
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(arx $$0, dca<dbk> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cpo $$0) {
      return a(this.y, $$0, dkf.cI);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cxg.j;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cxg.j;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxg $$0, cuq $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cuq m() {
      return this.k.get(0);
   }

   @Override
   public List<cuq> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cuj an_() {
      return cuj.a;
   }

   @Override
   protected cpo q() {
      return this.z;
   }
}
