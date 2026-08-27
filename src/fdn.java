import javax.annotation.Nullable;

public class fdn extends fcl {
   @Nullable
   public euy c;
   public long k;
   private fdm l;
   private ewy m;

   public fdn(fct $$0, eve $$1) {
      super($$0, $$1, vd.c("controls.keybinds.title"));
   }

   @Override
   protected void aN_() {
      this.l = this.d(new fdm(this, this.f));
      this.m = this.d(ewy.a(vd.c("controls.resetAll"), $$0 -> {
         for (euy $$1 : this.b.X) {
            $$1.b($$1.i());
         }

         this.l.d();
      }).a(this.g / 2 - 155, this.h - 29, 150, 20).a());
      this.d(ewy.a(vc.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 155 + 160, this.h - 29, 150, 20).a());
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null) {
         this.b.a(this.c, eoo.b.c.a($$2));
         this.c = null;
         this.l.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.c != null) {
         if ($$0 == 256) {
            this.b.a(this.c, eoo.bv);
         } else {
            this.b.a(this.c, eoo.a($$0, $$1));
         }

         this.c = null;
         this.k = ac.b();
         this.l.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      boolean $$4 = false;

      for (euy $$5 : this.b.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.m.j = $$4;
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
