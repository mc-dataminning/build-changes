import javax.annotation.Nullable;

public abstract class drp extends drv implements brl, bru, brv {
   private brt d = brt.a;
   @Nullable
   private xe e;

   protected drp(drx<?> $$0, jf $$1, dus $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.d = brt.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", xe.a.a(this.e, $$1));
      }
   }

   @Override
   public xe aj() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xe R_() {
      return this.aj();
   }

   @Nullable
   @Override
   public xe al() {
      return this.e;
   }

   protected abstract xe j();

   public boolean d(cnx $$0) {
      return a($$0, this.d, this.R_());
   }

   public static boolean a(cnx $$0, brt $$1, xe $$2) {
      if (!$$0.Q_() && !$$1.a($$0.eW())) {
         $$0.a(xe.a("container.isLocked", $$2), true);
         $$0.a(awg.eQ, awh.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jx<cvs> f();

   protected abstract void a(jx<cvs> var1);

   @Override
   public boolean c() {
      for (cvs $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvs a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cvs a(int $$0, int $$1) {
      cvs $$2 = brm.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cvs b(int $$0) {
      return brm.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(cnx $$0) {
      return brl.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cqz createMenu(int $$0, cnw $$1, cnx $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cqz a(int var1, cnw var2);

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      this.e = $$0.a(ks.g);
      this.d = $$0.a(ks.aj, brt.a);
      $$0.a(ks.ag, cyo.a).a(this.f());
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.g, this.e);
      if (!this.d.equals(brt.a)) {
         $$0.a(ks.aj, this.d);
      }

      $$0.a(ks.ag, cyo.a(this.f()));
   }

   @Override
   public void a(ug $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
