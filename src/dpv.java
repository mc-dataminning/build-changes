import javax.annotation.Nullable;

public abstract class dpv extends dqc implements bpt, bqe, bqf {
   private bqd d = bqd.a;
   @Nullable
   private xe e;

   protected dpv(dqe<?> $$0, ir $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.d = bqd.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = xe.a.a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xe.a.a(this.e, $$1));
      }
   }

   @Override
   public xe af() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public xe P_() {
      return this.af();
   }

   @Nullable
   @Override
   public xe ah() {
      return this.e;
   }

   protected abstract xe k();

   public boolean d(cly $$0) {
      return a($$0, this.d, this.P_());
   }

   public static boolean a(cly $$0, bqd $$1, xe $$2) {
      if (!$$0.O_() && !$$1.a($$0.fg())) {
         $$0.a(xe.a("container.isLocked", $$2), true);
         $$0.a(avo.eU, avq.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jj<cuh> j();

   protected abstract void a(jj<cuh> var1);

   @Override
   public boolean c() {
      for (cuh $$0 : this.j()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuh a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public cuh a(int $$0, int $$1) {
      cuh $$2 = bpu.a(this.j(), $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cuh b(int $$0) {
      return bpu.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.a($$1));
      this.e();
   }

   @Override
   public boolean a(cly $$0) {
      return bpt.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cpg createMenu(int $$0, clx $$1, cly $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cpg a(int var1, clx var2);

   @Override
   public void a(ka $$0) {
      this.e = $$0.a(ke.f);
      this.d = $$0.a(ke.ac, bqd.a);
      $$0.a(ke.Z, cxm.a).a(this.j());
   }

   @Override
   public void a(ka.a $$0) {
      $$0.a(ke.f, this.e);
      if (!this.d.equals(bqd.a)) {
         $$0.a(ke.ac, this.d);
      }

      $$0.a(ke.Z, cxm.a(this.j()));
   }

   @Override
   public void a(uk $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
