import javax.annotation.Nullable;

public abstract class dgp extends dgv implements bju, bke, bkf {
   private bkd e = bkd.a;
   @Nullable
   private vf f;

   protected dgp(dgx<?> $$0, hx $$1, djh $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.e = bkd.b($$0);
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

   public boolean d(cfi $$0) {
      return a($$0, this.e, this.Q_());
   }

   public static boolean a(cfi $$0, bkd $$1, vf $$2) {
      if (!$$0.P_() && !$$1.a($$0.eT())) {
         $$0.a(vf.a("container.isLocked", $$2), true);
         $$0.a(ars.er, art.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cib createMenu(int $$0, cfh $$1, cfi $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cib a(int var1, cfh var2);
}
