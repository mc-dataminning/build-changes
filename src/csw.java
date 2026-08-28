import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csw extends cse {
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
   private final csq y;
   private final coy z;
   private boolean A;

   public csw(int $$0, cox $$1) {
      this($$0, $$1, csq.a);
   }

   public csw(int $$0, cox $$1, csq $$2) {
      super(ctm.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(csd $$0, ard $$1, coy $$2, csv $$3, ctv $$4, @Nullable dbk<dau> $$5) {
      dat $$6 = $$3.aB_();
      are $$7 = (are)$$2;
      cwq $$8 = cwq.j;
      Optional<dbk<dau>> $$9 = $$1.p().aI().a(dbq.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dbk<dau> $$10 = $$9.get();
         dau $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cwq $$12 = $$11.a($$6, $$1.K_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new aci($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(bse $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof ard $$2) {
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
   public void a(ard $$0, dbk<dau> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(coy $$0) {
      return a(this.y, $$0, djp.cI);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cwq.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cwq.j;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cwq.j;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwq $$0, cua $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cua m() {
      return this.k.get(0);
   }

   @Override
   public List<cua> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public ctt am_() {
      return ctt.a;
   }

   @Override
   protected coy q() {
      return this.z;
   }
}
