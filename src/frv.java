import java.util.Objects;

public class frv extends fqz implements frx<csc> {
   private final csc y;
   private final crk z = new crk() {
      @Override
      public void a(cqw $$0, int $$1, cvp $$2) {
         frv.this.L();
      }

      @Override
      public void a(cqw $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            frv.this.M();
         }
      }
   };

   public frv(csc $$0, cnt $$1, xd $$2) {
      this.y = $$0;
   }

   public csc K() {
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
      if (this.m.t.go()) {
         this.c(fkk.a(xc.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fkk.a(xd.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      cvp $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fqz.a.a($$0), fqz.d));
   }

   void M() {
      this.a(this.y.m());
   }

   @Override
   protected void J() {
      this.m.t.s();
   }
}
