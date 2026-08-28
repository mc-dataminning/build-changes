import javax.annotation.Nullable;

public abstract class dtr extends dtx implements bsb, bsk, bsl {
   private bsj d = bsj.a;
   @Nullable
   private wo e;

   protected dtr(dtz<?> $$0, ji $$1, dwv $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d = bsj.b($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", wo.a.a(this.e, $$1));
      }
   }

   @Override
   public wo al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public wo p_() {
      return this.al();
   }

   @Nullable
   @Override
   public wo an() {
      return this.e;
   }

   protected abstract wo j();

   public boolean d(cov $$0) {
      return a($$0, this.d, this.p_());
   }

   public static boolean a(cov $$0, bsj $$1, wo $$2) {
      if (!$$0.Z_() && !$$1.a($$0.eZ())) {
         $$0.a(wo.a("container.isLocked", $$2), true);
         $$0.a(avz.eR, awa.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract ka<cwn> f();

   protected abstract void a(ka<cwn> var1);

   @Override
   public boolean c() {
      for (cwn $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwn a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cwn a(int $$0, int $$1) {
      cwn $$2 = bsc.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cwn b(int $$0) {
      return bsc.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cwn $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cov $$0) {
      return bsb.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public csa createMenu(int $$0, cou $$1, cov $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract csa a(int var1, cou var2);

   @Override
   protected void a(dtx.b $$0) {
      super.a($$0);
      this.e = $$0.a(kv.g);
      this.d = $$0.a(kv.ao, bsj.a);
      $$0.a(kv.al, czf.a).a(this.f());
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.g, this.e);
      if (!this.d.equals(bsj.a)) {
         $$0.a(kv.ao, this.d);
      }

      $$0.a(kv.al, czf.a(this.f()));
   }

   @Override
   public void a(tq $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
