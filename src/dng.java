import javax.annotation.Nullable;

public abstract class dng extends dnm implements bpf, bpq, bpr {
   private bpp d = bpp.a;
   @Nullable
   private wu e;

   protected dng(dno<?> $$0, in $$1, dqh $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.d = bpp.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = wu.a.a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", wu.a.a(this.e, $$1));
      }
   }

   @Override
   public wu ad() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public wu O_() {
      return this.ad();
   }

   @Nullable
   @Override
   public wu af() {
      return this.e;
   }

   protected abstract wu k();

   public boolean d(clh $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(clh $$0, bpp $$1, wu $$2) {
      if (!$$0.N_() && !$$1.a($$0.eV())) {
         $$0.a(wu.a("container.isLocked", $$2), true);
         $$0.a(avc.eP, avd.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jf<csz> j();

   protected abstract void a(jf<csz> var1);

   @Override
   public boolean c() {
      for (csz $$0 : this.j()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csz a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public csz a(int $$0, int $$1) {
      csz $$2 = bpg.a(this.j(), $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public csz b(int $$0) {
      return bpg.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, csz $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.a($$1));
      this.e();
   }

   @Override
   public boolean a(clh $$0) {
      return bpf.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cod createMenu(int $$0, clg $$1, clh $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cod a(int var1, clg var2);

   @Override
   public void a(jw $$0) {
      this.e = $$0.a(ka.f);
      this.d = $$0.a(ka.aa, bpp.a);
      $$0.a(ka.X, cvt.a).a(this.j());
   }

   @Override
   public void a(jw.a $$0) {
      $$0.a(ka.f, this.e);
      if (!this.d.equals(bpp.a)) {
         $$0.a(ka.aa, this.d);
      }

      $$0.a(ka.X, cvt.a(this.j()));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
