public class cia extends cgr {
   protected static final int k = 0;
   protected static final int l = 1;
   protected static final int m = 2;
   private static final int n = 3;
   private static final int o = 30;
   private static final int p = 30;
   private static final int q = 39;
   private static final int r = 136;
   private static final int s = 162;
   private static final int t = 220;
   private static final int u = 37;
   private final crc v;
   private final chz w;
   private int x;
   private boolean y;
   private boolean z;

   public cia(int $$0, cdy $$1) {
      this($$0, $$1, new cdj($$1.m));
   }

   public cia(int $$0, cdy $$1, crc $$2) {
      super(chy.t, $$0);
      this.v = $$2;
      this.w = new chz($$2);
      this.a(new cim(this.w, 0, 136, 37));
      this.a(new cim(this.w, 1, 162, 37));
      this.a(new cib($$1.m, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cim($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cim($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(biu $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(cdz $$0) {
      return this.v.gf() == $$0;
   }

   public int l() {
      return this.v.w();
   }

   public int m() {
      return this.w.h();
   }

   public void f(int $$0) {
      this.v.t($$0);
   }

   public int n() {
      return this.x;
   }

   public void g(int $$0) {
      this.x = $$0;
   }

   public void b(boolean $$0) {
      this.z = $$0;
   }

   public boolean o() {
      return this.z;
   }

   @Override
   public boolean a(clo $$0, cim $$1) {
      return false;
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return clo.b;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return clo.b;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return clo.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
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
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gn()) {
         bkv $$0 = (bkv)this.v;
         $$0.dN().a($$0.ds(), $$0.du(), $$0.dy(), this.v.gj(), aqw.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gn()) {
         if (!$$0.bx() || $$0 instanceof amj && ((amj)$$0).v()) {
            clo $$1 = this.w.b(0);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof amj) {
            $$0.fT().f(this.w.b(0));
            $$0.fT().f(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         clo $$1 = this.w.a(0);
         if (!$$1.b()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         clo $$2 = this.w.a(1);
         if (!$$2.b()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).b() && this.w.a(1).b()) {
            clo $$3 = this.p().get($$0).b();
            this.c(0, $$3);
            clo $$4 = this.p().get($$0).c();
            this.c(1, $$4);
         }
      }
   }

   private void c(int $$0, clo $$1) {
      if (!$$1.b()) {
         for (int $$2 = 3; $$2 < 39; $$2++) {
            clo $$3 = this.i.get($$2).f();
            if (!$$3.b() && clo.c($$1, $$3)) {
               clo $$4 = this.w.a($$0);
               int $$5 = $$4.b() ? 0 : $$4.L();
               int $$6 = Math.min($$1.g() - $$5, $$3.L());
               clo $$7 = $$3.p();
               int $$8 = $$5 + $$6;
               $$3.h($$6);
               $$7.f($$8);
               this.w.a($$0, $$7);
               if ($$8 >= $$1.g()) {
                  break;
               }
            }
         }
      }
   }

   public void a(cre $$0) {
      this.v.a($$0);
   }

   public cre p() {
      return this.v.gh();
   }

   public boolean q() {
      return this.y;
   }
}
