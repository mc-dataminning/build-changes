import java.util.Objects;

public class flp extends fkt implements flr<cnt> {
   private final cnt u;
   private final cnb v = new cnb() {
      @Override
      public void a(cmp $$0, int $$1, crj $$2) {
         flp.this.K();
      }

      @Override
      public void a(cmp $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            flp.this.L();
         }
      }
   };

   public flp(cnt $$0, cjs $$1, wg $$2) {
      this.u = $$0;
   }

   public cnt J() {
      return this.u;
   }

   @Override
   protected void aN_() {
      super.aN_();
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
         this.c(fdp.a(wf.d, $$0 -> this.d()).a(this.k / 2 - 100, 196, 98, 20).a());
         this.c(fdp.a(wg.c("lectern.take_book"), $$0 -> this.g(3)).a(this.k / 2 + 2, 196, 98, 20).a());
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
      crj $$0 = this.u.l();
      this.a(Objects.requireNonNullElse(fkt.a.a($$0), fkt.d));
   }

   void L() {
      this.a(this.u.m());
   }

   @Override
   protected void I() {
      this.j.s.r();
   }
}
