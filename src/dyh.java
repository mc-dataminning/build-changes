import javax.annotation.Nullable;

public abstract class dyh extends dyo implements buv, bve, bvf {
   private bvd d = bvd.a;
   @Nullable
   private xg e;

   protected dyh(dyq<?> $$0, iw $$1, ebq $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.d = bvd.b($$0, $$1);
      this.e = a($$0.a("CustomName"), $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", (va)xi.a.encodeStart($$1.a(uo.a), this.e).getOrThrow());
      }
   }

   @Override
   public xg ah() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xg P_() {
      return this.ah();
   }

   @Nullable
   @Override
   public xg aj() {
      return this.e;
   }

   protected abstract xg j();

   public boolean d(csi $$0) {
      return a($$0, this.d, this.P_());
   }

   public static boolean a(csi $$0, bvd $$1, xg $$2) {
      if (!$$0.ak() && !$$1.a($$0.fb())) {
         $$0.a(xg.a("container.isLocked", $$2), true);
         $$0.a(awy.eT, awz.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jp<dak> f();

   protected abstract void a(jp<dak> var1);

   @Override
   public boolean c() {
      for (dak $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dak a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public dak a(int $$0, int $$1) {
      dak $$2 = buw.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public dak b(int $$0) {
      return buw.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, dak $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(csi $$0) {
      return buv.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cwb createMenu(int $$0, csh $$1, csi $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cwb a(int var1, csh var2);

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.e = $$0.a(kl.g);
      this.d = $$0.a(kl.as, bvd.a);
      $$0.a(kl.ap, ddc.a).a(this.f());
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.g, this.e);
      if (!this.d.equals(bvd.a)) {
         $$0.a(kl.as, this.d);
      }

      $$0.a(kl.ap, ddc.a(this.f()));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
