import java.util.Optional;

public class ces extends cfn<cer> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cer r = new cga(this, 3, 3);
   private final cfq s = new cfq();
   private final ceo t;
   private final cbm u;

   public ces(int $$0, cbl $$1) {
      this($$0, $$1, ceo.a);
   }

   public ces(int $$0, cbl $$1, ceo $$2) {
      super(cfi.l, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cfr($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cfv(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cfv($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cfv($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(ced $$0, cpl $$1, cbm $$2, cer $$3, cfq $$4) {
      if (!$$1.B) {
         akl $$5 = (akl)$$2;
         cix $$6 = cix.b;
         Optional<clr> $$7 = $$1.n().aE().a(cmd.a, $$3, $$1);
         if ($$7.isPresent()) {
            clr $$8 = $$7.get();
            if ($$4.a($$1, $$5, $$8)) {
               cix $$9 = $$8.a($$3, $$1.B_());
               if ($$9.a($$1.G())) {
                  $$6 = $$9;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new xm($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bgj $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cbq $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cma<? super cer> $$0) {
      return $$0.a(this.r, this.u.dK());
   }

   @Override
   public void b(cbm $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cbm $$0) {
      return a(this.t, $$0, csm.cA);
   }

   @Override
   public cix a(cbm $$0, int $$1) {
      cix $$2 = cix.b;
      cfv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cix $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cix.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cix.b;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cix.b;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cix.b;
         }

         if ($$4.b()) {
            $$3.d(cix.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cix.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cix $$0, cfv $$1) {
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
   public cfo t() {
      return cfo.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
