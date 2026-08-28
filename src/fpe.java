import java.util.Objects;

public class fpe extends foh implements fpg<cqn> {
   private final cqn x;
   private final cpv y = new cpv() {
      @Override
      public void a(cpi $$0, int $$1, cud $$2) {
         fpe.this.L();
      }

      @Override
      public void a(cpi $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fpe.this.M();
         }
      }
   };

   public fpe(cqn $$0, cmk $$1, wu $$2) {
      this.x = $$0;
   }

   public cqn K() {
      return this.x;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.x.a(this.y);
   }

   @Override
   public void d() {
      this.l.s.s();
      super.d();
   }

   @Override
   public void j() {
      super.j();
      this.x.b(this.y);
   }

   @Override
   protected void m() {
      if (this.l.s.gm()) {
         this.c(fhu.a(wt.d, $$0 -> this.d()).a(this.m / 2 - 100, 196, 98, 20).a());
         this.c(fhu.a(wu.c("lectern.take_book"), $$0 -> this.g(3)).a(this.m / 2 + 2, 196, 98, 20).a());
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
      if ($$0 != this.x.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.l.q.a(this.x.j, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void L() {
      cud $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(foh.a.a($$0), foh.q));
   }

   void M() {
      this.a(this.x.m());
   }

   @Override
   protected void J() {
      this.l.s.s();
   }
}
