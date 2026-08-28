import java.util.Objects;

public class fpd extends fog implements fpf<cqw> {
   private final cqw x;
   private final cqe y = new cqe() {
      @Override
      public void a(cps $$0, int $$1, cun $$2) {
         fpd.this.L();
      }

      @Override
      public void a(cps $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fpd.this.M();
         }
      }
   };

   public fpd(cqw $$0, cmu $$1, xo $$2) {
      this.x = $$0;
   }

   public cqw K() {
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
         this.c(fhc.a(xn.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fhc.a(xo.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
      } else {
         super.m();
      }
   }

   @Override
   protected void F() {
      this.g(1);
   }

   @Override
   protected void I() {
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

   void L() {
      cun $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(fog.a.a($$0), fog.d));
   }

   void M() {
      this.a(this.x.m());
   }

   @Override
   protected void J() {
      this.m.s.r();
   }
}
