import javax.annotation.Nullable;

public abstract class dce extends dck implements bgh, bgr, bgs {
   private bgq c = bgq.a;
   @Nullable
   private te d;

   protected dce(dcm<?> $$0, gv $$1, dey $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.c = bgq.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.d = te.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      this.c.a($$0);
      if (this.d != null) {
         $$0.a("CustomName", te.a.a(this.d));
      }
   }

   public void a(te $$0) {
      this.d = $$0;
   }

   @Override
   public te ab() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public te H_() {
      return this.ab();
   }

   @Nullable
   @Override
   public te ad() {
      return this.d;
   }

   protected abstract te g();

   public boolean d(cbl $$0) {
      return a($$0, this.c, this.H_());
   }

   public static boolean a(cbl $$0, bgq $$1, te $$2) {
      if (!$$0.G_() && !$$1.a($$0.eR())) {
         $$0.a(te.a("container.isLocked", $$2), true);
         $$0.a(aou.ei, aov.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cec createMenu(int $$0, cbk $$1, cbl $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cec a(int var1, cbk var2);
}
