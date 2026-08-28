import javax.annotation.Nullable;

public abstract class dsl extends dsr implements bsa, bsj, bsk {
   private bsi d = bsi.a;
   @Nullable
   private xl e;

   protected dsl(dst<?> $$0, jh $$1, dvo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = bsi.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xl.a.a(this.e, $$1));
      }
   }

   @Override
   public xl am() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xl S_() {
      return this.am();
   }

   @Nullable
   @Override
   public xl ao() {
      return this.e;
   }

   protected abstract xl j();

   public boolean d(cor $$0) {
      return a($$0, this.d, this.S_());
   }

   public static boolean a(cor $$0, bsi $$1, xl $$2) {
      if (!$$0.R_() && !$$1.a($$0.fc())) {
         $$0.a(xl.a("container.isLocked", $$2), true);
         $$0.a(awo.eQ, awp.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jz<cwf> f();

   protected abstract void a(jz<cwf> var1);

   @Override
   public boolean c() {
      for (cwf $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwf a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cwf a(int $$0, int $$1) {
      cwf $$2 = bsb.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cwf b(int $$0) {
      return bsb.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cwf $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cor $$0) {
      return bsa.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public crs createMenu(int $$0, coq $$1, cor $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract crs a(int var1, coq var2);

   @Override
   protected void a(dsr.b $$0) {
      super.a($$0);
      this.e = $$0.a(ku.g);
      this.d = $$0.a(ku.ao, bsi.a);
      $$0.a(ku.al, cyx.a).a(this.f());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.e);
      if (!this.d.equals(bsi.a)) {
         $$0.a(ku.ao, this.d);
      }

      $$0.a(ku.al, cyx.a(this.f()));
   }

   @Override
   public void a(un $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
