import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csu extends csc {
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
   private final cso y;
   private final cow z;
   private boolean A;

   public csu(int $$0, cov $$1) {
      this($$0, $$1, cso.a);
   }

   public csu(int $$0, cov $$1, cso $$2) {
      super(ctk.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(csb $$0, ard $$1, cow $$2, cst $$3, ctt $$4, @Nullable dbi<das> $$5) {
      dar $$6 = $$3.aB_();
      are $$7 = (are)$$2;
      cwo $$8 = cwo.j;
      Optional<dbi<das>> $$9 = $$1.p().aI().a(dbo.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dbi<das> $$10 = $$9.get();
         das $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cwo $$12 = $$11.a($$6, $$1.K_());
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
   public void a(bsc $$0) {
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
   public void a(ard $$0, dbi<das> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cow $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cow $$0) {
      return a(this.y, $$0, djn.cI);
   }

   @Override
   public cwo b(cow $$0, int $$1) {
      cwo $$2 = cwo.j;
      cty $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cwo.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cwo.j;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cwo.j;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cwo.j;
         }

         if ($$4.f()) {
            $$3.e(cwo.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwo.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwo $$0, cty $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cty m() {
      return this.k.get(0);
   }

   @Override
   public List<cty> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public ctr am_() {
      return ctr.a;
   }

   @Override
   protected cow q() {
      return this.z;
   }
}
