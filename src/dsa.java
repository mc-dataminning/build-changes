import javax.annotation.Nullable;

public abstract class dsa extends dsg implements brr, bsa, bsb {
   private brz d = brz.a;
   @Nullable
   private xh e;

   protected dsa(dsi<?> $$0, jg $$1, dvd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.d = brz.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xh.a.a(this.e, $$1));
      }
   }

   @Override
   public xh al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xh S_() {
      return this.al();
   }

   @Nullable
   @Override
   public xh an() {
      return this.e;
   }

   protected abstract xh j();

   public boolean d(coh $$0) {
      return a($$0, this.d, this.S_());
   }

   public static boolean a(coh $$0, brz $$1, xh $$2) {
      if (!$$0.R_() && !$$1.a($$0.fb())) {
         $$0.a(xh.a("container.isLocked", $$2), true);
         $$0.a(awk.eQ, awl.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jy<cvx> f();

   protected abstract void a(jy<cvx> var1);

   @Override
   public boolean c() {
      for (cvx $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvx a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cvx a(int $$0, int $$1) {
      cvx $$2 = brs.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cvx b(int $$0) {
      return brs.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(coh $$0) {
      return brr.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public crj createMenu(int $$0, cog $$1, coh $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract crj a(int var1, cog var2);

   @Override
   protected void a(dsg.b $$0) {
      super.a($$0);
      this.e = $$0.a(kt.g);
      this.d = $$0.a(kt.an, brz.a);
      $$0.a(kt.ak, cyn.a).a(this.f());
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      $$0.a(kt.g, this.e);
      if (!this.d.equals(brz.a)) {
         $$0.a(kt.an, this.d);
      }

      $$0.a(kt.ak, cyn.a(this.f()));
   }

   @Override
   public void a(uj $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
