import javax.annotation.Nullable;

public abstract class dss extends dsy implements bsd, bsm, bsn {
   private bsl d = bsl.a;
   @Nullable
   private xj e;

   protected dss(dta<?> $$0, jh $$1, dvv $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = bsl.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xj.a.a(this.e, $$1));
      }
   }

   @Override
   public xj al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xj o_() {
      return this.al();
   }

   @Nullable
   @Override
   public xj an() {
      return this.e;
   }

   protected abstract xj j();

   public boolean d(cou $$0) {
      return a($$0, this.d, this.o_());
   }

   public static boolean a(cou $$0, bsl $$1, xj $$2) {
      if (!$$0.Y_() && !$$1.a($$0.eX())) {
         $$0.a(xj.a("container.isLocked", $$2), true);
         $$0.a(awn.eQ, awo.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jz<cwm> f();

   protected abstract void a(jz<cwm> var1);

   @Override
   public boolean c() {
      for (cwm $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwm a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cwm a(int $$0, int $$1) {
      cwm $$2 = bse.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cwm b(int $$0) {
      return bse.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cwm $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cou $$0) {
      return bsd.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public crz createMenu(int $$0, cot $$1, cou $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract crz a(int var1, cot var2);

   @Override
   protected void a(dsy.b $$0) {
      super.a($$0);
      this.e = $$0.a(ku.g);
      this.d = $$0.a(ku.ao, bsl.a);
      $$0.a(ku.al, cze.a).a(this.f());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.e);
      if (!this.d.equals(bsl.a)) {
         $$0.a(ku.ao, this.d);
      }

      $$0.a(ku.al, cze.a(this.f()));
   }

   @Override
   public void a(ul $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
