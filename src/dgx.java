import javax.annotation.Nullable;

public abstract class dgx extends dhd implements bjv, bkg, bkh {
   private bkf e = bkf.a;
   @Nullable
   private vg f;

   protected dgx(dhf<?> $$0, hx $$1, djp $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.e = bkf.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = vg.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", vg.a.a(this.f));
      }
   }

   public void a(vg $$0) {
      this.f = $$0;
   }

   @Override
   public vg ad() {
      return this.f != null ? this.f : this.l();
   }

   @Override
   public vg Q_() {
      return this.ad();
   }

   @Nullable
   @Override
   public vg af() {
      return this.f;
   }

   protected abstract vg l();

   public boolean d(cfq $$0) {
      return a($$0, this.e, this.Q_());
   }

   public static boolean a(cfq $$0, bkf $$1, vg $$2) {
      if (!$$0.P_() && !$$1.a($$0.eT())) {
         $$0.a(vg.a("container.isLocked", $$2), true);
         $$0.a(art.eG, aru.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cij createMenu(int $$0, cfp $$1, cfq $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cij a(int var1, cfp var2);
}
