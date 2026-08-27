import javax.annotation.Nullable;

public abstract class dgi extends dgo implements bjo, bjy, bjz {
   private bjx e = bjx.a;
   @Nullable
   private vd f;

   protected dgi(dgq<?> $$0, hx $$1, dja $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.e = bjx.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = vd.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", vd.a.a(this.f));
      }
   }

   public void a(vd $$0) {
      this.f = $$0;
   }

   @Override
   public vd ad() {
      return this.f != null ? this.f : this.l();
   }

   @Override
   public vd Q_() {
      return this.ad();
   }

   @Nullable
   @Override
   public vd af() {
      return this.f;
   }

   protected abstract vd l();

   public boolean d(cfb $$0) {
      return a($$0, this.e, this.Q_());
   }

   public static boolean a(cfb $$0, bjx $$1, vd $$2) {
      if (!$$0.P_() && !$$1.a($$0.eT())) {
         $$0.a(vd.a("container.isLocked", $$2), true);
         $$0.a(arm.er, arn.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public chu createMenu(int $$0, cfa $$1, cfb $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract chu a(int var1, cfa var2);
}
