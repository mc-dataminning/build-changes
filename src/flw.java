import javax.annotation.Nullable;

public class flw extends fkv {
   private static final wu s = wu.c("controls.keybinds.title");
   @Nullable
   public fdc a;
   public long r;
   private flv u;
   private ffe v;

   public flw(fld $$0, fdi $$1) {
      super($$0, $$1, s);
   }

   @Override
   protected void aM_() {
      this.u = this.c(new flv(this, this.m));
      this.v = ffe.a(wu.c("controls.resetAll"), $$0 -> {
         for (fdc $$1 : this.c.X) {
            $$1.b($$1.i());
         }

         this.u.d();
      }).a();
      super.aM_();
   }

   @Override
   protected void h() {
      fiv $$0 = this.d.b(fiv.e().a(8));
      $$0.a(this.v);
      $$0.a(ffe.a(wt.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.d.a();
      this.u.a(this.n, this.d);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, ews.b.c.a($$2));
         this.a = null;
         this.u.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.c.a(this.a, ews.bv);
         } else {
            this.c.a(this.a, ews.a($$0, $$1));
         }

         this.a = null;
         this.r = ac.b();
         this.u.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fdc $$5 : this.c.X) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.v.j = $$4;
   }
}
