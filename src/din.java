import javax.annotation.Nullable;

public abstract class din extends dit implements bln, bly, blz {
   private blx e = blx.a;
   @Nullable
   private vq f;

   protected din(div<?> $$0, hz $$1, dlf $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.e = blx.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = vq.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", vq.a.a(this.f));
      }
   }

   public void a(vq $$0) {
      this.f = $$0;
   }

   @Override
   public vq ad() {
      return this.f != null ? this.f : this.l();
   }

   @Override
   public vq Q_() {
      return this.ad();
   }

   @Nullable
   @Override
   public vq af() {
      return this.f;
   }

   protected abstract vq l();

   public boolean d(chh $$0) {
      return a($$0, this.e, this.Q_());
   }

   public static boolean a(chh $$0, blx $$1, vq $$2) {
      if (!$$0.P_() && !$$1.a($$0.eT())) {
         $$0.a(vq.a("container.isLocked", $$2), true);
         $$0.a(atk.eG, atl.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public ckb createMenu(int $$0, chg $$1, chh $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract ckb a(int var1, chg var2);
}
