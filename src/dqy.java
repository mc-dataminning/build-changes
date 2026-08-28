import javax.annotation.Nullable;

public abstract class dqy extends dre implements brd, brm, brn {
   private brl d = brl.a;
   @Nullable
   private xd e;

   protected dqy(drg<?> $$0, je $$1, dua $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.d = brl.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xd.a.a(this.e, $$1));
      }
   }

   @Override
   public xd aj() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xd Q_() {
      return this.aj();
   }

   @Nullable
   @Override
   public xd al() {
      return this.e;
   }

   protected abstract xd j();

   public boolean d(cnp $$0) {
      return a($$0, this.d, this.Q_());
   }

   public static boolean a(cnp $$0, brl $$1, xd $$2) {
      if (!$$0.P_() && !$$1.a($$0.eW())) {
         $$0.a(xd.a("container.isLocked", $$2), true);
         $$0.a(awd.eQ, awe.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jw<cvl> f();

   protected abstract void a(jw<cvl> var1);

   @Override
   public boolean c() {
      for (cvl $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvl a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cvl a(int $$0, int $$1) {
      cvl $$2 = bre.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cvl b(int $$0) {
      return bre.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(cnp $$0) {
      return brd.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cqq createMenu(int $$0, cno $$1, cnp $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cqq a(int var1, cno var2);

   @Override
   protected void a(dre.b $$0) {
      super.a($$0);
      this.e = $$0.a(kr.g);
      this.d = $$0.a(kr.ag, brl.a);
      $$0.a(kr.ad, cyh.a).a(this.f());
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.g, this.e);
      if (!this.d.equals(brl.a)) {
         $$0.a(kr.ag, this.d);
      }

      $$0.a(kr.ad, cyh.a(this.f()));
   }

   @Override
   public void a(uf $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
