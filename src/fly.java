import java.util.Objects;

public class fly extends flc implements fma<coa> {
   private final coa u;
   private final cni v = new cni() {
      @Override
      public void a(cmw $$0, int $$1, crs $$2) {
         fly.this.K();
      }

      @Override
      public void a(cmw $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fly.this.L();
         }
      }
   };

   public fly(coa $$0, cjz $$1, wi $$2) {
      this.u = $$0;
   }

   public coa J() {
      return this.u;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.u.a(this.v);
   }

   @Override
   public void d() {
      this.j.s.r();
      super.d();
   }

   @Override
   public void j() {
      super.j();
      this.u.b(this.v);
   }

   @Override
   protected void m() {
      if (this.j.s.gl()) {
         this.c(fdy.a(wh.d, $$0 -> this.d()).a(this.k / 2 - 100, 196, 98, 20).a());
         this.c(fdy.a(wi.c("lectern.take_book"), $$0 -> this.g(3)).a(this.k / 2 + 2, 196, 98, 20).a());
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
      if ($$0 != this.u.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.j.q.a(this.u.j, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void K() {
      crs $$0 = this.u.l();
      this.a(Objects.requireNonNullElse(flc.a.a($$0), flc.d));
   }

   void L() {
      this.a(this.u.m());
   }

   @Override
   protected void I() {
      this.j.s.r();
   }
}
