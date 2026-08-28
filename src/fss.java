import java.util.Objects;

public class fss extends frw implements fsu<csu> {
   private final csu y;
   private final csc z = new csc() {
      @Override
      public void a(cro $$0, int $$1, cwb $$2) {
         fss.this.L();
      }

      @Override
      public void a(cro $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fss.this.M();
         }
      }
   };

   public fss(csu $$0, col $$1, xi $$2) {
      this.y = $$0;
   }

   public csu K() {
      return this.y;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.y.a(this.z);
   }

   @Override
   public void d() {
      this.m.t.s();
      super.d();
   }

   @Override
   public void j() {
      super.j();
      this.y.b(this.z);
   }

   @Override
   protected void m() {
      if (this.m.t.gw()) {
         this.c(flh.a(xh.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(flh.a(xi.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
      } else {
         super.m();
      }
   }

   @Override
   protected void F() {
      this.g(1);
   }

   @Override
   protected void G() {
      this.g(2);
   }

   @Override
   protected boolean b(int $$0) {
      if ($$0 != this.y.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.m.r.a(this.y.l, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void L() {
      cwb $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(frw.a.a($$0), frw.d));
   }

   void M() {
      this.a(this.y.m());
   }

   @Override
   protected void J() {
      this.m.t.s();
   }
}
