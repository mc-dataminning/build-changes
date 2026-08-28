import javax.annotation.Nullable;

public abstract class duq extends duw implements btb, btk, btl {
   private btj d = btj.a;
   @Nullable
   private xv e;

   protected duq(duy<?> $$0, jh $$1, dxu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = btj.b($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", xv.a.a(this.e, $$1));
      }
   }

   @Override
   public xv al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xv p_() {
      return this.al();
   }

   @Nullable
   @Override
   public xv an() {
      return this.e;
   }

   protected abstract xv j();

   public boolean d(cpw $$0) {
      return a($$0, this.d, this.p_());
   }

   public static boolean a(cpw $$0, btj $$1, xv $$2) {
      if (!$$0.aa_() && !$$1.a($$0.eX())) {
         $$0.a(xv.a("container.isLocked", $$2), true);
         $$0.a(axf.eR, axg.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jz<cxo> f();

   protected abstract void a(jz<cxo> var1);

   @Override
   public boolean c() {
      for (cxo $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxo a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cxo a(int $$0, int $$1) {
      cxo $$2 = btc.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cxo b(int $$0) {
      return btc.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cxo $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cpw $$0) {
      return btb.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public ctb createMenu(int $$0, cpv $$1, cpw $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract ctb a(int var1, cpv var2);

   @Override
   protected void a(duw.b $$0) {
      super.a($$0);
      this.e = $$0.a(ku.g);
      this.d = $$0.a(ku.ao, btj.a);
      $$0.a(ku.al, dag.a).a(this.f());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.e);
      if (!this.d.equals(btj.a)) {
         $$0.a(ku.ao, this.d);
      }

      $$0.a(ku.al, dag.a(this.f()));
   }

   @Override
   public void a(ux $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
