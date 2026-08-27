import java.util.Objects;

public class foa extends fne implements foc<cpz> {
   private final cpz x;
   private final cph y = new cph() {
      @Override
      public void a(cov $$0, int $$1, ctq $$2) {
         foa.this.K();
      }

      @Override
      public void a(cov $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            foa.this.L();
         }
      }
   };

   public foa(cpz $$0, clx $$1, wx $$2) {
      this.x = $$0;
   }

   public cpz J() {
      return this.x;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.x.a(this.y);
   }

   @Override
   public void d() {
      this.m.s.r();
      super.d();
   }

   @Override
   public void j() {
      super.j();
      this.x.b(this.y);
   }

   @Override
   protected void m() {
      if (this.m.s.go()) {
         this.c(fga.a(ww.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fga.a(wx.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
      } else {
         super.m();
      }
   }

   @Override
   protected void E() {
      this.g(1);
   }

   @Override
   protected void F() {
      this.g(2);
   }

   @Override
   protected boolean b(int $$0) {
      if ($$0 != this.x.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.m.q.a(this.x.j, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void K() {
      ctq $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(fne.a.a($$0), fne.d));
   }

   void L() {
      this.a(this.x.m());
   }

   @Override
   protected void I() {
      this.m.s.r();
   }
}
