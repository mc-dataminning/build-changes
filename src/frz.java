import java.util.Objects;

public class frz extends frd implements fsb<csf> {
   private final csf y;
   private final crn z = new crn() {
      @Override
      public void a(cqz $$0, int $$1, cvs $$2) {
         frz.this.L();
      }

      @Override
      public void a(cqz $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            frz.this.M();
         }
      }
   };

   public frz(csf $$0, cnw $$1, xe $$2) {
      this.y = $$0;
   }

   public csf K() {
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
      if (this.m.t.gp()) {
         this.c(fko.a(xd.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fko.a(xe.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      cvs $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(frd.a.a($$0), frd.d));
   }

   void M() {
      this.a(this.y.m());
   }

   @Override
   protected void J() {
      this.m.t.s();
   }
}
