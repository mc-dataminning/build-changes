import javax.annotation.Nullable;

public class fuc extends ftv {
   private static final xh v = xh.c("controls.keybinds.title");
   @Nullable
   public fiy a;
   public long u;
   private fub w;
   private fkz x;

   public fuc(fqs $$0, fje $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void E() {
      this.w = this.s.c(new fub(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      this.x = fkz.a(xh.c("controls.resetAll"), $$0x -> {
         for (fiy $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.c();
      }).a();
      fos $$0 = this.s.b(fos.e().a(8));
      $$0.a(this.x);
      $$0.a(fkz.a(xg.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fco.b.c.a($$2));
         this.a = null;
         this.w.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.a.b(fco.bv);
         } else {
            this.a.b(fco.a($$0, $$1));
         }

         this.a = null;
         this.u = ad.c();
         this.w.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fiy $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
