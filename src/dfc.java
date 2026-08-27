import javax.annotation.Nullable;

public abstract class dfc extends dfi implements biu, bje, bjf {
   private bjd e = bjd.a;
   @Nullable
   private uv f;

   protected dfc(dfk<?> $$0, hx $$1, dhn $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.e = bjd.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = uv.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", uv.a.a(this.f));
      }
   }

   public void a(uv $$0) {
      this.f = $$0;
   }

   @Override
   public uv ad() {
      return this.f != null ? this.f : this.l();
   }

   @Override
   public uv Q_() {
      return this.ad();
   }

   @Nullable
   @Override
   public uv af() {
      return this.f;
   }

   protected abstract uv l();

   public boolean d(cdz $$0) {
      return a($$0, this.e, this.Q_());
   }

   public static boolean a(cdz $$0, bjd $$1, uv $$2) {
      if (!$$0.P_() && !$$1.a($$0.eU())) {
         $$0.a(uv.a("container.isLocked", $$2), true);
         $$0.a(aqv.ei, aqw.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cgr createMenu(int $$0, cdy $$1, cdz $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cgr a(int var1, cdy var2);
}
