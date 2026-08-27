import javax.annotation.Nullable;

public abstract class dck extends dcq implements bgm, bgw, bgx {
   private bgv c = bgv.a;
   @Nullable
   private ti d;

   protected dck(dcs<?> $$0, gw $$1, dfe $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.c = bgv.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.d = ti.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      this.c.a($$0);
      if (this.d != null) {
         $$0.a("CustomName", ti.a.a(this.d));
      }
   }

   public void a(ti $$0) {
      this.d = $$0;
   }

   @Override
   public ti ab() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public ti H_() {
      return this.ab();
   }

   @Nullable
   @Override
   public ti ad() {
      return this.d;
   }

   protected abstract ti g();

   public boolean d(cbp $$0) {
      return a($$0, this.c, this.H_());
   }

   public static boolean a(cbp $$0, bgv $$1, ti $$2) {
      if (!$$0.G_() && !$$1.a($$0.eR())) {
         $$0.a(ti.a("container.isLocked", $$2), true);
         $$0.a(aoz.ei, apa.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public ceg createMenu(int $$0, cbo $$1, cbp $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract ceg a(int var1, cbo var2);
}
