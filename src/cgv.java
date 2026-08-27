import java.util.Optional;

public class cgv extends chr<cgu> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cgu r = new cie(this, 3, 3);
   private final chu s = new chu();
   private final cgp t;
   private final cdm u;

   public cgv(int $$0, cdl $$1) {
      this($$0, $$1, cgp.a);
   }

   public cgv(int $$0, cdl $$1, cgp $$2) {
      super(chl.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new chv($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new chz(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new chz($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new chz($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cge $$0, crs $$1, cdm $$2, cgu $$3, chu $$4) {
      if (!$$1.B) {
         amb $$5 = (amb)$$2;
         clb $$6 = clb.b;
         Optional<coh<cnv>> $$7 = $$1.n().aE().a(cok.a, $$3, $$1);
         if ($$7.isPresent()) {
            coh<cnv> $$8 = $$7.get();
            cnv $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               clb $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.G())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new yz($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bij $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cdq $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(coh<? extends cof<cgu>> $$0) {
      return $$0.b().a(this.r, this.u.dL());
   }

   @Override
   public void b(cdm $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cdm $$0) {
      return a(this.t, $$0, cuv.cA);
   }

   @Override
   public clb a(cdm $$0, int $$1) {
      clb $$2 = clb.b;
      chz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clb $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return clb.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return clb.b;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return clb.b;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return clb.b;
         }

         if ($$4.b()) {
            $$3.e(clb.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clb.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(clb $$0, chz $$1) {
      return $$1.d != this.s && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.r.ax_();
   }

   @Override
   public int o() {
      return this.r.ay_();
   }

   @Override
   public int p() {
      return 10;
   }

   @Override
   public chs t() {
      return chs.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
