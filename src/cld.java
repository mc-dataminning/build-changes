import java.util.List;
import javax.annotation.Nullable;

public abstract class cld extends ckb {
   private static final int k = 9;
   private static final int l = 3;
   protected final ckm o;
   protected final chh p;
   protected final bln q;
   private final List<Integer> m;
   protected final clr r = new clr();
   private final int n;

   protected abstract boolean a(chh var1, boolean var2);

   protected abstract void a(chh var1, coz var2);

   protected abstract boolean a(dlf var1);

   public cld(@Nullable cli<?> $$0, int $$1, chg $$2, ckm $$3) {
      super($$0, $$1);
      this.o = $$3;
      this.p = $$2.m;
      cle $$4 = this.l();
      this.q = this.e($$4.d());
      this.m = $$4.f();
      this.n = $$4.e();
      this.a($$4);
      this.b($$4);
      this.a($$2);
   }

   private void a(cle $$0) {
      for (final cle.b $$1 : $$0.c()) {
         this.a(new clw(this.q, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(coz $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(cle $$0) {
      this.a(new clw(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(coz $$0) {
            return false;
         }

         @Override
         public boolean a(chh $$0) {
            return cld.this.a($$0, this.h());
         }

         @Override
         public void a(chh $$0, coz $$1) {
            cld.this.a($$0, $$1);
         }
      });
   }

   private void a(chg $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.a(new clw($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
         }
      }

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new clw($$0, $$3, 8 + $$3 * 18, 142));
      }
   }

   public abstract void m();

   protected abstract cle l();

   private bmd e(int $$0) {
      return new bmd($$0) {
         @Override
         public void e() {
            super.e();
            cld.this.a(this);
         }
      };
   }

   @Override
   public void a(bln $$0) {
      super.a($$0);
      if ($$0 == this.q) {
         this.m();
      }
   }

   @Override
   public void b(chh $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean a(chh $$0) {
      return this.o.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.i((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) <= 64.0, true);
   }

   @Override
   public coz a(chh $$0, int $$1) {
      coz $$2 = coz.h;
      clw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         coz $$4 = $$3.g();
         $$2 = $$4.q();
         int $$5 = this.n();
         int $$6 = this.r();
         if ($$1 == this.o()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return coz.h;
            }

            $$3.b($$4, $$2);
         } else if (this.m.contains($$1)) {
            if (!this.a($$4, $$5, $$6, false)) {
               return coz.h;
            }
         } else if (this.c($$4) && $$1 >= this.n() && $$1 < this.r()) {
            int $$7 = this.d($$2);
            if (!this.a($$4, $$7, this.o(), false)) {
               return coz.h;
            }
         } else if ($$1 >= this.n() && $$1 < this.p()) {
            if (!this.a($$4, this.q(), this.r(), false)) {
               return coz.h;
            }
         } else if ($$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)) {
            return coz.h;
         }

         if ($$4.b()) {
            $$3.e(coz.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return coz.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(coz $$0) {
      return true;
   }

   public int d(coz $$0) {
      return this.q.aj_() ? 0 : this.m.get(0);
   }

   public int o() {
      return this.n;
   }

   private int n() {
      return this.o() + 1;
   }

   private int p() {
      return this.n() + 27;
   }

   private int q() {
      return this.p();
   }

   private int r() {
      return this.q() + 9;
   }
}
