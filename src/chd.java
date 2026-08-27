import java.util.Optional;

public class chd extends chz<chc> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final chc r = new cim(this, 3, 3);
   private final cic s = new cic();
   private final cgx t;
   private final cdu u;

   public chd(int $$0, cdt $$1) {
      this($$0, $$1, cgx.a);
   }

   public chd(int $$0, cdt $$1, cgx $$2) {
      super(cht.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cid($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cih(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cih($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cih($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cgm $$0, csa $$1, cdu $$2, chc $$3, cic $$4) {
      if (!$$1.B) {
         amf $$5 = (amf)$$2;
         clj $$6 = clj.b;
         Optional<coq<cod>> $$7 = $$1.n().aG().a(cot.a, $$3, $$1);
         if ($$7.isPresent()) {
            coq<cod> $$8 = $$7.get();
            cod $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               clj $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.H())) {
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
   public void a(biq $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cdy $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(coq<? extends coo<chc>> $$0) {
      return $$0.b().a(this.r, this.u.dN());
   }

   @Override
   public void b(cdu $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cdu $$0) {
      return a(this.t, $$0, cvc.cA);
   }

   @Override
   public clj a(cdu $$0, int $$1) {
      clj $$2 = clj.b;
      cih $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clj $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return clj.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return clj.b;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return clj.b;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return clj.b;
         }

         if ($$4.b()) {
            $$3.e(clj.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clj.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(clj $$0, cih $$1) {
      return $$1.d != this.s && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.r.ay_();
   }

   @Override
   public int o() {
      return this.r.az_();
   }

   @Override
   public int p() {
      return 10;
   }

   @Override
   public cia t() {
      return cia.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
