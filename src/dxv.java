import javax.annotation.Nullable;

public abstract class dxv extends dyc implements buk, but, buu {
   private bus d = bus.a;
   @Nullable
   private xa e;

   protected dxv(dye<?> $$0, iv $$1, ebe $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.d = bus.b($$0, $$1);
      this.e = a($$0.a("CustomName"), $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", (uy)xc.a.encodeStart($$1.a(un.a), this.e).getOrThrow());
      }
   }

   @Override
   public xa ai() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xa m_() {
      return this.ai();
   }

   @Nullable
   @Override
   public xa ak() {
      return this.e;
   }

   protected abstract xa j();

   public boolean d(crx $$0) {
      return a($$0, this.d, this.m_());
   }

   public static boolean a(crx $$0, bus $$1, xa $$2) {
      if (!$$0.Z_() && !$$1.a($$0.fb())) {
         $$0.a(xa.a("container.isLocked", $$2), true);
         $$0.a(awp.eT, awq.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jo<czy> f();

   protected abstract void a(jo<czy> var1);

   @Override
   public boolean c() {
      for (czy $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czy a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public czy a(int $$0, int $$1) {
      czy $$2 = bul.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public czy b(int $$0) {
      return bul.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, czy $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(crx $$0) {
      return buk.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cvq createMenu(int $$0, crw $$1, crx $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cvq a(int var1, crw var2);

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.e = $$0.a(kk.g);
      this.d = $$0.a(kk.as, bus.a);
      $$0.a(kk.ap, dcq.a).a(this.f());
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.g, this.e);
      if (!this.d.equals(bus.a)) {
         $$0.a(kk.as, this.d);
      }

      $$0.a(kk.ap, dcq.a(this.f()));
   }

   @Override
   public void a(tz $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
