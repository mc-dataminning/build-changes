import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwj extends cvr {
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
   private final cwd y;
   private final crx z;
   private boolean A;

   public cwj(int $$0, crw $$1) {
      this($$0, $$1, cwd.a);
   }

   public cwj(int $$0, crw $$1, cwd $$2) {
      super(cwz.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.h;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cvq $$0, ars $$1, crx $$2, cwi $$3, cxi $$4, @Nullable deu<dee> $$5) {
      ded $$6 = $$3.aC_();
      art $$7 = (art)$$2;
      czy $$8 = czy.k;
      Optional<deu<dee>> $$9 = $$1.p().aI().a(dfa.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         deu<dee> $$10 = $$9.get();
         dee $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            czy $$12 = $$11.a($$6, $$1.J_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new acs($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(buk $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof ars $$2) {
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
   public void a(ars $$0, deu<dee> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(crx $$0) {
      return a(this.y, $$0, dne.cL);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return czy.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return czy.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(czy $$0, cxn $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cxn m() {
      return this.k.get(0);
   }

   @Override
   public List<cxn> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cxg an_() {
      return cxg.a;
   }

   @Override
   protected crx q() {
      return this.z;
   }
}
