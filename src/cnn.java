import java.util.Optional;

public class cnn extends coj<cnm> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cnm r = new coz(this, 3, 3);
   private final com s = new com();
   private final cnh t;
   private final cka u;

   public cnn(int $$0, cjz $$1) {
      this($$0, $$1, cnh.a);
   }

   public cnn(int $$0, cjz $$1, cnh $$2) {
      super(cod.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new coo($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cos(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cos($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cos($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cmw $$0, czg $$1, cka $$2, cnm $$3, com $$4) {
      if (!$$1.B) {
         apv $$5 = (apv)$$2;
         crs $$6 = crs.i;
         Optional<cvu<cvj>> $$7 = $$1.o().aJ().a(cvx.a, $$3, $$1);
         if ($$7.isPresent()) {
            cvu<cvj> $$8 = $$7.get();
            cvj $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               crs $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.J())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.d.b(new abx($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bny $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cke $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cvu<? extends cvs<cnm>> $$0) {
      return $$0.b().a(this.r, this.u.dM());
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cka $$0) {
      return a(this.t, $$0, dcj.cA);
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.f().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return crs.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return crs.i;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return crs.i;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(crs $$0, cos $$1) {
      return $$1.d != this.s && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.r.f();
   }

   @Override
   public int o() {
      return this.r.g();
   }

   @Override
   public int p() {
      return 10;
   }

   @Override
   public cok t() {
      return cok.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
