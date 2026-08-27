import java.util.Objects;

public class fne extends fmi implements fng<cpi> {
   private final cpi x;
   private final coq y = new coq() {
      @Override
      public void a(cod $$0, int $$1, csz $$2) {
         fne.this.K();
      }

      @Override
      public void a(cod $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fne.this.L();
         }
      }
   };

   public fne(cpi $$0, clg $$1, wu $$2) {
      this.x = $$0;
   }

   public cpi J() {
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
      if (this.m.s.gm()) {
         this.c(ffe.a(wt.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(ffe.a(wu.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      csz $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(fmi.a.a($$0), fmi.d));
   }

   void L() {
      this.a(this.x.m());
   }

   @Override
   protected void I() {
      this.m.s.r();
   }
}
