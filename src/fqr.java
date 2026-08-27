import java.util.Objects;

public class fqr extends fpu implements fqt<cql> {
   private final cql x;
   private final cps y = new cps() {
      @Override
      public void a(cpg $$0, int $$1, cuh $$2) {
         fqr.this.K();
      }

      @Override
      public void a(cpg $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fqr.this.L();
         }
      }
   };

   public fqr(cql $$0, clx $$1, xe $$2) {
      this.x = $$0;
   }

   public cql J() {
      return this.x;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.x.a(this.y);
   }

   @Override
   public void d() {
      this.m.s.t();
      super.d();
   }

   @Override
   public void j() {
      super.j();
      this.x.b(this.y);
   }

   @Override
   protected void B() {
      if (this.m.s.gz()) {
         this.c(fin.a(xd.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fin.a(xe.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
      } else {
         super.B();
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
      cuh $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(fpu.a.a($$0), fpu.d));
   }

   void L() {
      this.a(this.x.m());
   }

   @Override
   protected void I() {
      this.m.s.t();
   }
}
