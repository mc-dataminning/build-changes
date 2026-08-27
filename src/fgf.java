import javax.annotation.Nullable;

public class fgf extends ffd {
   @Nullable
   public exm c;
   public long k;
   private fge l;
   private ezo m;

   public fgf(ffl $$0, exs $$1) {
      super($$0, $$1, vq.c("controls.keybinds.title"));
   }

   @Override
   protected void aQ_() {
      this.l = this.c(new fge(this, this.f));
      this.m = this.c(ezo.a(vq.c("controls.resetAll"), $$0 -> {
         for (exm $$1 : this.b.X) {
            $$1.b($$1.i());
         }

         this.l.d();
      }).a(this.g / 2 - 155, this.h - 29, 150, 20).a());
      this.c(ezo.a(vp.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 155 + 160, this.h - 29, 150, 20).a());
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null) {
         this.b.a(this.c, erc.b.c.a($$2));
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
            this.b.a(this.c, erc.bv);
         } else {
            this.b.a(this.c, erc.a($$0, $$1));
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      boolean $$4 = false;

      for (exm $$5 : this.b.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.m.j = $$4;
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
