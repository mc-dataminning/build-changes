import javax.annotation.Nullable;

public abstract class dgo extends dgu implements bjt, bkd, bke {
   private bkc e = bkc.a;
   @Nullable
   private vf f;

   protected dgo(dgw<?> $$0, hx $$1, djg $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.e = bkc.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = vf.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", vf.a.a(this.f));
      }
   }

   public void a(vf $$0) {
      this.f = $$0;
   }

   @Override
   public vf ad() {
      return this.f != null ? this.f : this.l();
   }

   @Override
   public vf Q_() {
      return this.ad();
   }

   @Nullable
   @Override
   public vf af() {
      return this.f;
   }

   protected abstract vf l();

   public boolean d(cfh $$0) {
      return a($$0, this.e, this.Q_());
   }

   public static boolean a(cfh $$0, bkc $$1, vf $$2) {
      if (!$$0.P_() && !$$1.a($$0.eT())) {
         $$0.a(vf.a("container.isLocked", $$2), true);
         $$0.a(arr.er, ars.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cia createMenu(int $$0, cfg $$1, cfh $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cia a(int var1, cfg var2);
}
