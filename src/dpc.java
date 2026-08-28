import javax.annotation.Nullable;

public abstract class dpc extends dpi implements bqo, bqz, bra {
   private bqy d = bqy.a;
   @Nullable
   private xp e;

   protected dpc(dpk<?> $$0, iz $$1, dsd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d = bqy.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = xp.a.a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xp.a.a(this.e, $$1));
      }
   }

   @Override
   public xp af() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public xp O_() {
      return this.af();
   }

   @Nullable
   @Override
   public xp ah() {
      return this.e;
   }

   protected abstract xp k();

   public boolean d(cmy $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(cmy $$0, bqy $$1, xp $$2) {
      if (!$$0.N_() && !$$1.a($$0.eX())) {
         $$0.a(xp.a("container.isLocked", $$2), true);
         $$0.a(awa.eP, awb.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jr<cuq> j();

   protected abstract void a(jr<cuq> var1);

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
      cuq $$2 = bqp.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cuq b(int $$0) {
      return bqp.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cmy $$0) {
      return bqo.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cpv createMenu(int $$0, cmx $$1, cmy $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cpv a(int var1, cmx var2);

   @Override
   protected void a(dpi.b $$0) {
      super.a($$0);
      this.e = $$0.a(km.g);
      this.d = $$0.a(km.ad, bqy.a);
      $$0.a(km.aa, cxm.a).a(this.j());
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.g, this.e);
      if (!this.d.equals(bqy.a)) {
         $$0.a(km.ad, this.d);
      }

      $$0.a(km.aa, cxm.a(this.j()));
   }

   @Override
   public void a(us $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
