import javax.annotation.Nullable;

public abstract class dpz extends dqf implements bqj, bqu, bqv {
   private bqt d = bqt.a;
   @Nullable
   private wy e;

   protected dpz(dqh<?> $$0, jd $$1, dta $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.d = bqt.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", wy.a.a(this.e, $$1));
      }
   }

   @Override
   public wy ah() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public wy O_() {
      return this.ah();
   }

   @Nullable
   @Override
   public wy aj() {
      return this.e;
   }

   protected abstract wy k();

   public boolean d(cmv $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(cmv $$0, bqt $$1, wy $$2) {
      if (!$$0.N_() && !$$1.a($$0.eU())) {
         $$0.a(wy.a("container.isLocked", $$2), true);
         $$0.a(avo.eP, avp.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jv<cuo> j();

   protected abstract void a(jv<cuo> var1);

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
      cuo $$2 = bqk.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cuo b(int $$0) {
      return bqk.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cuo $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cmv $$0) {
      return bqj.a(this, $$0);
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
   protected void a(dqf.b $$0) {
      super.a($$0);
      this.e = $$0.a(kq.g);
      this.d = $$0.a(kq.ae, bqt.a);
      $$0.a(kq.ab, cxm.a).a(this.j());
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.e);
      if (!this.d.equals(bqt.a)) {
         $$0.a(kq.ae, this.d);
      }

      $$0.a(kq.ab, cxm.a(this.j()));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
