import java.util.Optional;

public class cov extends cpr<cou> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cou r = new cqg(this, 3, 3);
   private final cpu s = new cpu();
   private final cop t;
   private final clh u;

   public cov(int $$0, clg $$1) {
      this($$0, $$1, cop.a);
   }

   public cov(int $$0, clg $$1, cop $$2) {
      super(cpl.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new cpv($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cpz(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cpz($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cpz($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cod $$0, dad $$1, clh $$2, cou $$3, cpu $$4) {
      if (!$$1.B) {
         aqi $$5 = (aqi)$$2;
         csz $$6 = csz.i;
         Optional<cxf<cwu>> $$7 = $$1.o().aJ().a(cxi.a, $$3, $$1);
         if ($$7.isPresent()) {
            cxf<cwu> $$8 = $$7.get();
            cwu $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               csz $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.J())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.d.b(new acj($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bpf $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cll $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cxf<? extends cxd<cou>> $$0) {
      return $$0.b().a(this.r, this.u.dN());
   }

   @Override
   public void b(clh $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(clh $$0) {
      return a(this.t, $$0, ddg.cA);
   }

   @Override
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csz $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.f().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return csz.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return csz.i;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return csz.i;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return csz.i;
         }

         if ($$4.d()) {
            $$3.e(csz.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csz.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(csz $$0, cpz $$1) {
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
   public cps t() {
      return cps.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
