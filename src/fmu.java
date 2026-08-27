import java.util.Objects;

public class fmu extends fly implements fmw<col> {
   private final col x;
   private final cnt y = new cnt() {
      @Override
      public void a(cnh $$0, int $$1, csd $$2) {
         fmu.this.K();
      }

      @Override
      public void a(cnh $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fmu.this.L();
         }
      }
   };

   public fmu(col $$0, ckk $$1, ws $$2) {
      this.x = $$0;
   }

   public col J() {
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
         this.c(feu.a(wr.d, $$0 -> this.d()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(feu.a(ws.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      csd $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(fly.a.a($$0), fly.d));
   }

   void L() {
      this.a(this.x.m());
   }

   @Override
   protected void I() {
      this.m.s.r();
   }
}
