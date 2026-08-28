import java.util.Objects;

public class fsk extends fro implements fsm<csp> {
   private final csp y;
   private final crx z = new crx() {
      @Override
      public void a(crj $$0, int $$1, cvx $$2) {
         fsk.this.L();
      }

      @Override
      public void a(crj $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fsk.this.M();
         }
      }
   };

   public fsk(csp $$0, cog $$1, xh $$2) {
      this.y = $$0;
   }

   public csp K() {
      return this.y;
   }

   @Override
   protected void aS_() {
      super.aS_();
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
         this.c(fkz.a(xg.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fkz.a(xh.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      cvx $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fro.a.a($$0), fro.d));
   }

   void M() {
      this.a(this.y.m());
   }

   @Override
   protected void J() {
      this.m.t.s();
   }
}
