import javax.annotation.Nullable;

public class fbo extends fam {
   @Nullable
   public etb c;
   public long k;
   private fbn l;
   private euz m;

   public fbo(fau $$0, eth $$1) {
      super($$0, $$1, ur.c("controls.keybinds.title"));
   }

   @Override
   protected void aP_() {
      this.l = new fbn(this, this.f);
      this.e(this.l);
      this.m = this.d(euz.a(ur.c("controls.resetAll"), $$0 -> {
         for (etb $$1 : this.b.X) {
            $$1.b($$1.i());
         }

         this.l.e();
      }).a(this.g / 2 - 155, this.h - 29, 150, 20).a());
      this.d(euz.a(uq.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 155 + 160, this.h - 29, 150, 20).a());
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null) {
         this.b.a(this.c, emr.b.c.a($$2));
         this.c = null;
         this.l.e();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.c != null) {
         if ($$0 == 256) {
            this.b.a(this.c, emr.bv);
         } else {
            this.b.a(this.c, emr.a($$0, $$1));
         }

         this.c = null;
         this.k = ac.b();
         this.l.e();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      boolean $$4 = false;

      for (etb $$5 : this.b.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.m.i = $$4;
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
