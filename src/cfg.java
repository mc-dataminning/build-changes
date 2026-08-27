import java.util.Optional;

public class cfg extends cgb<cff> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cff r = new cgo(this, 3, 3);
   private final cge s = new cge();
   private final cfc t;
   private final cca u;

   public cfg(int $$0, cbz $$1) {
      this($$0, $$1, cfc.a);
   }

   public cfg(int $$0, cbz $$1, cfc $$2) {
      super(cfw.l, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cgf($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cgj(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cgj($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cgj($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cer $$0, cqb $$1, cca $$2, cff $$3, cge $$4) {
      if (!$$1.B) {
         aku $$5 = (aku)$$2;
         cjl $$6 = cjl.b;
         Optional<cmq<cmf>> $$7 = $$1.n().aE().a(cmt.a, $$3, $$1);
         if ($$7.isPresent()) {
            cmq<cmf> $$8 = $$7.get();
            cmf $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cjl $$10 = $$9.a($$3, $$1.G_());
               if ($$10.a($$1.G())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new xt($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bgx $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cce $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cmq<? extends cmp<cff>> $$0) {
      return $$0.b().a(this.r, this.u.dL());
   }

   @Override
   public void b(cca $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cca $$0) {
      return a(this.t, $$0, cte.cA);
   }

   @Override
   public cjl a(cca $$0, int $$1) {
      cjl $$2 = cjl.b;
      cgj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjl $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cjl.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cjl.b;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cjl.b;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cjl.b;
         }

         if ($$4.b()) {
            $$3.d(cjl.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cjl.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cjl $$0, cgj $$1) {
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
   public cgc t() {
      return cgc.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
