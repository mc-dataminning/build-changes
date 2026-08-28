import javax.annotation.Nullable;

public class fqu extends fqn {
   private static final wu u = wu.c("controls.keybinds.title");
   @Nullable
   public ffu a;
   public long s;
   private fqt v;
   private fhu w;

   public fqu(fnl $$0, fga $$1) {
      super($$0, $$1, u);
   }

   @Override
   protected void aQ_() {
      this.v = this.r.c(new fqt(this, this.l));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      this.w = fhu.a(wu.c("controls.resetAll"), $$0x -> {
         for (ffu $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.v.c();
      }).a();
      fll $$0 = this.r.b(fll.e().a(8));
      $$0.a(this.w);
      $$0.a(fhu.a(wt.d, $$0x -> this.d()).a());
   }

   @Override
   protected void c() {
      this.r.a();
      this.v.a(this.m, this.r);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.c.a(this.a, ezj.b.c.a($$2));
         this.a = null;
         this.v.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.c.a(this.a, ezj.bv);
         } else {
            this.c.a(this.a, ezj.a($$0, $$1));
         }

         this.a = null;
         this.s = ac.c();
         this.v.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (ffu $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.w.j = $$4;
   }
}
