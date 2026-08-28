import javax.annotation.Nullable;

public abstract class dxk extends dxr implements btz, bui, buj {
   private buh d = buh.a;
   @Nullable
   private wy e;

   protected dxk(dxt<?> $$0, iv $$1, eat $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.d = buh.b($$0, $$1);
      this.e = a($$0.a("CustomName"), $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", (uw)xa.a.encodeStart($$1.a(un.a), this.e).getOrThrow());
      }
   }

   @Override
   public wy ai() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public wy m_() {
      return this.ai();
   }

   @Nullable
   @Override
   public wy ak() {
      return this.e;
   }

   protected abstract wy j();

   public boolean d(crm $$0) {
      return a($$0, this.d, this.m_());
   }

   public static boolean a(crm $$0, buh $$1, wy $$2) {
      if (!$$0.V_() && !$$1.a($$0.fa())) {
         $$0.a(wy.a("container.isLocked", $$2), true);
         $$0.a(awn.eT, awo.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jo<czn> f();

   protected abstract void a(jo<czn> var1);

   @Override
   public boolean c() {
      for (czn $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czn a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public czn a(int $$0, int $$1) {
      czn $$2 = bua.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public czn b(int $$0) {
      return bua.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, czn $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(crm $$0) {
      return btz.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cvf createMenu(int $$0, crl $$1, crm $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cvf a(int var1, crl var2);

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.e = $$0.a(kk.g);
      this.d = $$0.a(kk.as, buh.a);
      $$0.a(kk.ap, dcf.a).a(this.f());
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.g, this.e);
      if (!this.d.equals(buh.a)) {
         $$0.a(kk.as, this.d);
      }

      $$0.a(kk.ap, dcf.a(this.f()));
   }

   @Override
   public void a(tz $$0) {
      $$0.p("CustomName");
      $$0.p("lock");
      $$0.p("Items");
   }
}
