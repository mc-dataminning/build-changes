import javax.annotation.Nullable;

public abstract class doz extends dpf implements bql, bqw, bqx {
   private bqv d = bqv.a;
   @Nullable
   private xo e;

   protected doz(dph<?> $$0, iz $$1, dsa $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = bqv.b($$0);
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

   public boolean d(cmv $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(cmv $$0, bqv $$1, xo $$2) {
      if (!$$0.N_() && !$$1.a($$0.eX())) {
         $$0.a(xo.a("container.isLocked", $$2), true);
         $$0.a(avz.eP, awa.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jr<cun> j();

   protected abstract void a(jr<cun> var1);

   @Override
   public boolean c() {
      for (cun $$0 : this.j()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cun a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public cun a(int $$0, int $$1) {
      cun $$2 = bqm.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cun b(int $$0) {
      return bqm.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cun $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cmv $$0) {
      return bql.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cps createMenu(int $$0, cmu $$1, cmv $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cps a(int var1, cmu var2);

   @Override
   protected void a(dpf.b $$0) {
      super.a($$0);
      this.e = $$0.a(km.f);
      this.d = $$0.a(km.ac, bqv.a);
      $$0.a(km.Z, cxj.a).a(this.j());
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.f, this.e);
      if (!this.d.equals(bqv.a)) {
         $$0.a(km.ac, this.d);
      }

      $$0.a(km.Z, cxj.a(this.j()));
   }

   @Override
   public void a(ur $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
