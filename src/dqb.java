import javax.annotation.Nullable;

public abstract class dqb extends dqh implements bqk, bqv, bqw {
   private bqu d = bqu.a;
   @Nullable
   private wz e;

   protected dqb(dqj<?> $$0, jd $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.d = bqu.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", wz.a.a(this.e, $$1));
      }
   }

   @Override
   public wz ah() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public wz S_() {
      return this.ah();
   }

   @Nullable
   @Override
   public wz aj() {
      return this.e;
   }

   protected abstract wz k();

   public boolean d(cmx $$0) {
      return a($$0, this.d, this.S_());
   }

   public static boolean a(cmx $$0, bqu $$1, wz $$2) {
      if (!$$0.R_() && !$$1.a($$0.eT())) {
         $$0.a(wz.a("container.isLocked", $$2), true);
         $$0.a(avp.eP, avq.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jv<cuq> j();

   protected abstract void a(jv<cuq> var1);

   @Override
   public boolean c() {
      for (cuq $$0 : this.j()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuq a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      cuq $$2 = bql.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cuq b(int $$0) {
      return bql.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cmx $$0) {
      return bqk.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cpu a(int var1, cmw var2);

   @Override
   protected void a(dqh.b $$0) {
      super.a($$0);
      this.e = $$0.a(kq.g);
      this.d = $$0.a(kq.ae, bqu.a);
      $$0.a(kq.ab, cxo.a).a(this.j());
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.e);
      if (!this.d.equals(bqu.a)) {
         $$0.a(kq.ae, this.d);
      }

      $$0.a(kq.ab, cxo.a(this.j()));
   }

   @Override
   public void a(ub $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
