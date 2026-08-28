import java.util.Objects;

public class fow extends fnz implements foy<cqj> {
   private final cqj x;
   private final cpr y = new cpr() {
      @Override
      public void a(cpe $$0, int $$1, cua $$2) {
         fow.this.M();
      }

      @Override
      public void a(cpe $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fow.this.N();
         }
      }
   };

   public fow(cqj $$0, cmg $$1, wu $$2) {
      this.x = $$0;
   }

   public cqj L() {
      return this.x;
   }

   @Override
   protected void aO_() {
      super.aO_();
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
      if (this.l.s.gk()) {
         this.c(fhm.a(wt.d, $$0 -> this.d()).a(this.m / 2 - 100, 196, 98, 20).a());
         this.c(fhm.a(wu.c("lectern.take_book"), $$0 -> this.g(3)).a(this.m / 2 + 2, 196, 98, 20).a());
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
      cua $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(fnz.a.a($$0), fnz.q));
   }

   void N() {
      this.a(this.x.m());
   }

   @Override
   protected void K() {
      this.l.s.r();
   }
}
