import javax.annotation.Nullable;

public abstract class dts extends dty implements bsc, bsl, bsm {
   private bsk d = bsk.a;
   @Nullable
   private wp e;

   protected dts(dua<?> $$0, ji $$1, dww $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d = bsk.b($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", wp.a.a(this.e, $$1));
      }
   }

   @Override
   public wp al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public wp p_() {
      return this.al();
   }

   @Nullable
   @Override
   public wp an() {
      return this.e;
   }

   protected abstract wp j();

   public boolean d(cow $$0) {
      return a($$0, this.d, this.p_());
   }

   public static boolean a(cow $$0, bsk $$1, wp $$2) {
      if (!$$0.Z_() && !$$1.a($$0.eZ())) {
         $$0.a(wp.a("container.isLocked", $$2), true);
         $$0.a(awa.eR, awb.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract ka<cwo> f();

   protected abstract void a(ka<cwo> var1);

   @Override
   public boolean c() {
      for (cwo $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwo a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cwo a(int $$0, int $$1) {
      cwo $$2 = bsd.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cwo b(int $$0) {
      return bsd.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cwo $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cow $$0) {
      return bsc.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public csb createMenu(int $$0, cov $$1, cow $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract csb a(int var1, cov var2);

   @Override
   protected void a(dty.b $$0) {
      super.a($$0);
      this.e = $$0.a(kv.g);
      this.d = $$0.a(kv.ao, bsk.a);
      $$0.a(kv.al, czg.a).a(this.f());
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.g, this.e);
      if (!this.d.equals(bsk.a)) {
         $$0.a(kv.ao, this.d);
      }

      $$0.a(kv.al, czg.a(this.f()));
   }

   @Override
   public void a(tq $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
