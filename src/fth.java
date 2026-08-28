import java.util.Objects;

public class fth extends fsl implements ftj<csy> {
   private final csy y;
   private final csg z = new csg() {
      @Override
      public void a(crs $$0, int $$1, cwf $$2) {
         fth.this.L();
      }

      @Override
      public void a(crs $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fth.this.M();
         }
      }
   };

   public fth(csy $$0, coq $$1, xl $$2) {
      this.y = $$0;
   }

   public csy K() {
      return this.y;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.y.a(this.z);
   }

   @Override
   public void aP_() {
      this.m.t.s();
      super.aP_();
   }

   @Override
   public void j() {
      super.j();
      this.y.b(this.z);
   }

   @Override
   protected void m() {
      if (this.m.t.gy()) {
         this.c(flw.a(xk.d, $$0 -> this.aP_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(flw.a(xl.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      cwf $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fsl.a.a($$0), fsl.d));
   }

   void M() {
      this.a(this.y.m());
   }

   @Override
   protected void J() {
      this.m.t.s();
   }
}
