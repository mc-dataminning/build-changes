import java.util.Objects;

public class ftp extends fst implements ftr<ctf> {
   private final ctf y;
   private final csn z = new csn() {
      @Override
      public void a(crz $$0, int $$1, cwm $$2) {
         ftp.this.N();
      }

      @Override
      public void a(crz $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            ftp.this.O();
         }
      }
   };

   public ftp(ctf $$0, cot $$1, xj $$2) {
      this.y = $$0;
   }

   public ctf M() {
      return this.y;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.y.a(this.z);
   }

   @Override
   public void aO_() {
      this.m.t.p();
      super.aO_();
   }

   @Override
   public void j() {
      super.j();
      this.y.b(this.z);
   }

   @Override
   protected void m() {
      if (this.m.t.gt()) {
         this.c(fmd.a(xi.d, $$0 -> this.aO_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fmd.a(xj.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
      } else {
         super.m();
      }
   }

   @Override
   protected void J() {
      this.g(1);
   }

   @Override
   protected void K() {
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

   void N() {
      cwm $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fst.a.a($$0), fst.d));
   }

   void O() {
      this.a(this.y.m());
   }

   @Override
   protected void L() {
      this.m.t.p();
   }
}
