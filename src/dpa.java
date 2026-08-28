import javax.annotation.Nullable;

public abstract class dpa extends dpg implements bqm, bqx, bqy {
   private bqw d = bqw.a;
   @Nullable
   private xo e;

   protected dpa(dpi<?> $$0, iz $$1, dsb $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = bqw.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = xo.a.a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xo.a.a(this.e, $$1));
      }
   }

   @Override
   public xo af() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public xo O_() {
      return this.af();
   }

   @Nullable
   @Override
   public xo ah() {
      return this.e;
   }

   protected abstract xo k();

   public boolean d(cmw $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(cmw $$0, bqw $$1, xo $$2) {
      if (!$$0.N_() && !$$1.a($$0.eX())) {
         $$0.a(xo.a("container.isLocked", $$2), true);
         $$0.a(avz.eP, awa.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jr<cuo> j();

   protected abstract void a(jr<cuo> var1);

   @Override
   public boolean c() {
      for (cuo $$0 : this.j()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuo a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      cuo $$2 = bqn.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cuo b(int $$0) {
      return bqn.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cuo $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cmw $$0) {
      return bqm.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cpt createMenu(int $$0, cmv $$1, cmw $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cpt a(int var1, cmv var2);

   @Override
   protected void a(dpg.b $$0) {
      super.a($$0);
      this.e = $$0.a(km.g);
      this.d = $$0.a(km.ad, bqw.a);
      $$0.a(km.aa, cxk.a).a(this.j());
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.g, this.e);
      if (!this.d.equals(bqw.a)) {
         $$0.a(km.ad, this.d);
      }

      $$0.a(km.aa, cxk.a(this.j()));
   }

   @Override
   public void a(ur $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
