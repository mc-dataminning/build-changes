import javax.annotation.Nullable;

public abstract class dmi extends dmo implements bny, boj, bok {
   private boi e = boi.a;
   @Nullable
   private wi f;

   protected dmi(dmq<?> $$0, id $$1, dpi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.e = boi.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = wi.a.a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", wi.a.a(this.f, $$1));
      }
   }

   @Override
   public wi ad() {
      return this.f != null ? this.f : this.k();
   }

   @Override
   public wi O_() {
      return this.ad();
   }

   @Nullable
   @Override
   public wi af() {
      return this.f;
   }

   protected abstract wi k();

   public boolean d(cka $$0) {
      return a($$0, this.e, this.O_());
   }

   public static boolean a(cka $$0, boi $$1, wi $$2) {
      if (!$$0.N_() && !$$1.a($$0.eU())) {
         $$0.a(wi.a("container.isLocked", $$2), true);
         $$0.a(auo.eP, aup.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract iw<crs> j();

   protected abstract void a(iw<crs> var1);

   @Override
   public boolean c() {
      for (crs $$0 : this.j()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crs a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public crs a(int $$0, int $$1) {
      crs $$2 = bnz.a(this.j(), $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public crs b(int $$0) {
      return bnz.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, crs $$1) {
      this.j().set($$0, $$1);
      if ($$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }

      this.e();
   }

   @Override
   public boolean a(cka $$0) {
      return bny.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cmw createMenu(int $$0, cjz $$1, cka $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cmw a(int var1, cjz var2);

   @Override
   public void a(jn $$0) {
      this.f = $$0.a(jr.d);
      this.e = $$0.a(jr.T, boi.a);
      $$0.a(jr.Q, cuj.a).a(this.j());
   }

   @Override
   public void a(jn.a $$0) {
      $$0.a(jr.d, this.f);
      if (!this.e.equals(boi.a)) {
         $$0.a(jr.T, this.e);
      }

      $$0.a(jr.Q, cuj.a(this.j()));
   }

   @Override
   public void a(to $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
