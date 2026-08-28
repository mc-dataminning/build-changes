import javax.annotation.Nullable;

public abstract class dxx extends dye implements bum, buv, buw {
   private buu d = buu.a;
   @Nullable
   private xc e;

   protected dxx(dyg<?> $$0, iw $$1, ebg $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.d = buu.b($$0, $$1);
      this.e = a($$0.a("CustomName"), $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", (va)xe.a.encodeStart($$1.a(uo.a), this.e).getOrThrow());
      }
   }

   @Override
   public xc ai() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xc m_() {
      return this.ai();
   }

   @Nullable
   @Override
   public xc ak() {
      return this.e;
   }

   protected abstract xc j();

   public boolean d(crz $$0) {
      return a($$0, this.d, this.m_());
   }

   public static boolean a(crz $$0, buu $$1, xc $$2) {
      if (!$$0.Z_() && !$$1.a($$0.fb())) {
         $$0.a(xc.a("container.isLocked", $$2), true);
         $$0.a(awr.eT, aws.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jp<daa> f();

   protected abstract void a(jp<daa> var1);

   @Override
   public boolean c() {
      for (daa $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public daa a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public daa a(int $$0, int $$1) {
      daa $$2 = bun.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public daa b(int $$0) {
      return bun.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, daa $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(crz $$0) {
      return bum.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cvs createMenu(int $$0, cry $$1, crz $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cvs a(int var1, cry var2);

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.e = $$0.a(kl.g);
      this.d = $$0.a(kl.as, buu.a);
      $$0.a(kl.ap, dcs.a).a(this.f());
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.g, this.e);
      if (!this.d.equals(buu.a)) {
         $$0.a(kl.as, this.d);
      }

      $$0.a(kl.ap, dcs.a(this.f()));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
