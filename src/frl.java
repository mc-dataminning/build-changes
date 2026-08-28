import java.util.Objects;

public class frl extends fqp implements frn<crw> {
   private final crw y;
   private final cre z = new cre() {
      @Override
      public void a(cqq $$0, int $$1, cvl $$2) {
         frl.this.L();
      }

      @Override
      public void a(cqq $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            frl.this.M();
         }
      }
   };

   public frl(crw $$0, cno $$1, xd $$2) {
      this.y = $$0;
   }

   public crw K() {
      return this.y;
   }

   @Override
   protected void aT_() {
      super.aT_();
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
         this.c(fka.a(xc.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fka.a(xd.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      cvl $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fqp.a.a($$0), fqp.d));
   }

   void M() {
      this.a(this.y.m());
   }

   @Override
   protected void J() {
      this.m.t.s();
   }
}
