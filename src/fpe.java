import java.util.Objects;

public class fpe extends foh implements fpg<cqx> {
   private final cqx x;
   private final cqf y = new cqf() {
      @Override
      public void a(cpt $$0, int $$1, cuo $$2) {
         fpe.this.M();
      }

      @Override
      public void a(cpt $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fpe.this.N();
         }
      }
   };

   public fpe(cqx $$0, cmv $$1, xo $$2) {
      this.x = $$0;
   }

   public cqx L() {
      return this.x;
   }

   @Override
   protected void aM_() {
      super.aM_();
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
         this.c(fhd.a(xn.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fhd.a(xo.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
      } else {
         super.m();
      }
   }

   @Override
   protected void I() {
      this.g(1);
   }

   @Override
   protected void J() {
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

   void M() {
      cuo $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(foh.a.a($$0), foh.d));
   }

   void N() {
      this.a(this.x.m());
   }

   @Override
   protected void K() {
      this.m.s.r();
   }
}
