import java.util.Objects;

public class fpu extends foy implements fpw<cqz> {
   private final cqz y;
   private final cqh z = new cqh() {
      @Override
      public void a(cpu $$0, int $$1, cuq $$2) {
         fpu.this.K();
      }

      @Override
      public void a(cpu $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fpu.this.L();
         }
      }
   };

   public fpu(cqz $$0, cmw $$1, wz $$2) {
      this.y = $$0;
   }

   public cqz J() {
      return this.y;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.y.a(this.z);
   }

   @Override
   public void d() {
      this.l.s.s();
      super.d();
   }

   @Override
   public void j() {
      super.j();
      this.y.b(this.z);
   }

   @Override
   protected void m() {
      if (this.l.s.gl()) {
         this.c(fik.a(wy.d, $$0 -> this.d()).a(this.m / 2 - 100, 196, 98, 20).a());
         this.c(fik.a(wz.c("lectern.take_book"), $$0 -> this.g(3)).a(this.m / 2 + 2, 196, 98, 20).a());
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
      if ($$0 != this.y.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.l.q.a(this.y.j, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void K() {
      cuq $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(foy.a.a($$0), foy.r));
   }

   void L() {
      this.a(this.y.m());
   }

   @Override
   protected void G() {
      this.l.s.s();
   }
}
