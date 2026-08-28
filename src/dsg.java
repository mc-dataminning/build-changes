import javax.annotation.Nullable;

public abstract class dsg extends dsm implements brw, bsf, bsg {
   private bse d = bse.a;
   @Nullable
   private xi e;

   protected dsg(dso<?> $$0, jh $$1, dvj $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = bse.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xi.a.a(this.e, $$1));
      }
   }

   @Override
   public xi am() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xi S_() {
      return this.am();
   }

   @Nullable
   @Override
   public xi ao() {
      return this.e;
   }

   protected abstract xi j();

   public boolean d(com $$0) {
      return a($$0, this.d, this.S_());
   }

   public static boolean a(com $$0, bse $$1, xi $$2) {
      if (!$$0.R_() && !$$1.a($$0.fb())) {
         $$0.a(xi.a("container.isLocked", $$2), true);
         $$0.a(awl.eQ, awm.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jz<cwb> f();

   protected abstract void a(jz<cwb> var1);

   @Override
   public boolean c() {
      for (cwb $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwb a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cwb a(int $$0, int $$1) {
      cwb $$2 = brx.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cwb b(int $$0) {
      return brx.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cwb $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(com $$0) {
      return brw.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cro createMenu(int $$0, col $$1, com $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cro a(int var1, col var2);

   @Override
   protected void a(dsm.b $$0) {
      super.a($$0);
      this.e = $$0.a(ku.g);
      this.d = $$0.a(ku.ao, bse.a);
      $$0.a(ku.al, cyt.a).a(this.f());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.e);
      if (!this.d.equals(bse.a)) {
         $$0.a(ku.ao, this.d);
      }

      $$0.a(ku.al, cyt.a(this.f()));
   }

   @Override
   public void a(uk $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
