import java.util.Objects;

public class fpc extends fof implements fpe<cqm> {
   private final cqm x;
   private final cpu y = new cpu() {
      @Override
      public void a(cph $$0, int $$1, cuc $$2) {
         fpc.this.M();
      }

      @Override
      public void a(cph $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fpc.this.N();
         }
      }
   };

   public fpc(cqm $$0, cmj $$1, wu $$2) {
      this.x = $$0;
   }

   public cqm L() {
      return this.x;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.x.a(this.y);
   }

   @Override
   public void d() {
      this.l.s.r();
      super.d();
   }

   @Override
   public void j() {
      super.j();
      this.x.b(this.y);
   }

   @Override
   protected void m() {
      if (this.l.s.gl()) {
         this.c(fhs.a(wt.d, $$0 -> this.d()).a(this.m / 2 - 100, 196, 98, 20).a());
         this.c(fhs.a(wu.c("lectern.take_book"), $$0 -> this.g(3)).a(this.m / 2 + 2, 196, 98, 20).a());
      } else {
         super.m();
      }
   }

   @Override
   protected void G() {
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
      this.l.q.a(this.x.j, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void M() {
      cuc $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(fof.a.a($$0), fof.q));
   }

   void N() {
      this.a(this.x.m());
   }

   @Override
   protected void K() {
      this.l.s.r();
   }
}
