import java.util.Optional;

public class chi extends cie<chh> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final chh r = new cir(this, 3, 3);
   private final cih s = new cih();
   private final chc t;
   private final cdz u;

   public chi(int $$0, cdy $$1) {
      this($$0, $$1, chc.a);
   }

   public chi(int $$0, cdy $$1, chc $$2) {
      super(chy.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cii($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cim(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cim($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cim($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cgr $$0, csf $$1, cdz $$2, chh $$3, cih $$4) {
      if (!$$1.B) {
         amj $$5 = (amj)$$2;
         clo $$6 = clo.b;
         Optional<cov<coi>> $$7 = $$1.n().aG().a(coy.a, $$3, $$1);
         if ($$7.isPresent()) {
            cov<coi> $$8 = $$7.get();
            coi $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               clo $$10 = $$9.a($$3, $$1.I_());
               if ($$10.a($$1.H())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new zd($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(biu $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(ced $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cov<? extends cot<chh>> $$0) {
      return $$0.b().a(this.r, this.u.dN());
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cdz $$0) {
      return a(this.t, $$0, cvh.cA);
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return clo.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return clo.b;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return clo.b;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.e(clo.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clo.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(clo $$0, cim $$1) {
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
   public cif t() {
      return cif.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
