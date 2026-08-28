import javax.annotation.Nullable;

public abstract class duk extends duq implements bst, btc, btd {
   private btb d = btb.a;
   @Nullable
   private xk e;

   protected duk(dus<?> $$0, jh $$1, dxo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d = btb.b($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", xk.a.a(this.e, $$1));
      }
   }

   @Override
   public xk al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xk p_() {
      return this.al();
   }

   @Nullable
   @Override
   public xk an() {
      return this.e;
   }

   protected abstract xk j();

   public boolean d(cpo $$0) {
      return a($$0, this.d, this.p_());
   }

   public static boolean a(cpo $$0, btb $$1, xk $$2) {
      if (!$$0.aa_() && !$$1.a($$0.eZ())) {
         $$0.a(xk.a("container.isLocked", $$2), true);
         $$0.a(awv.eR, aww.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jz<cxg> f();

   protected abstract void a(jz<cxg> var1);

   @Override
   public boolean c() {
      for (cxg $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxg a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cxg a(int $$0, int $$1) {
      cxg $$2 = bsu.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cxg b(int $$0) {
      return bsu.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cxg $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cpo $$0) {
      return bst.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cst createMenu(int $$0, cpn $$1, cpo $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cst a(int var1, cpn var2);

   @Override
   protected void a(duq.b $$0) {
      super.a($$0);
      this.e = $$0.a(ku.g);
      this.d = $$0.a(ku.ao, btb.a);
      $$0.a(ku.al, czy.a).a(this.f());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.e);
      if (!this.d.equals(btb.a)) {
         $$0.a(ku.ao, this.d);
      }

      $$0.a(ku.al, czy.a(this.f()));
   }

   @Override
   public void a(um $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
