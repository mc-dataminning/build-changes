import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctq extends csy {
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
   private final ctk y;
   private final cps z;
   private boolean A;

   public ctq(int $$0, cpr $$1) {
      this($$0, $$1, ctk.a);
   }

   public ctq(int $$0, cpr $$1, ctk $$2) {
      super(cug.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(csx $$0, ash $$1, cps $$2, ctp $$3, cup $$4, @Nullable dcd<dbp> $$5) {
      dbo $$6 = $$3.aC_();
      asi $$7 = (asi)$$2;
      cxk $$8 = cxk.k;
      Optional<dcd<dbp>> $$9 = $$1.p().aI().a(dcj.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dcd<dbp> $$10 = $$9.get();
         dbp $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cxk $$12 = $$11.a($$6, $$1.K_());
            if ($$12.a($$1.J())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new ado($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(bsx $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof ash $$2) {
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
   public void a(ash $$0, dcd<dbp> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cps $$0) {
      return a(this.y, $$0, dkg.cI);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cxk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cxk.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cxk.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxk $$0, cuu $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cuu m() {
      return this.k.get(0);
   }

   @Override
   public List<cuu> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cun an_() {
      return cun.a;
   }

   @Override
   protected cps q() {
      return this.z;
   }
}
