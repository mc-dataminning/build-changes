import javax.annotation.Nullable;

public abstract class dcp extends dcv implements bgr, bhb, bhc {
   private bha c = bha.a;
   @Nullable
   private tm d;

   protected dcp(dcx<?> $$0, gw $$1, dfj $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c = bha.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.d = tm.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      this.c.a($$0);
      if (this.d != null) {
         $$0.a("CustomName", tm.a.a(this.d));
      }
   }

   public void a(tm $$0) {
      this.d = $$0;
   }

   @Override
   public tm ab() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public tm N_() {
      return this.ab();
   }

   @Nullable
   @Override
   public tm ad() {
      return this.d;
   }

   protected abstract tm g();

   public boolean d(cbu $$0) {
      return a($$0, this.c, this.N_());
   }

   public static boolean a(cbu $$0, bha $$1, tm $$2) {
      if (!$$0.M_() && !$$1.a($$0.eS())) {
         $$0.a(tm.a("container.isLocked", $$2), true);
         $$0.a(ape.ei, apf.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cel createMenu(int $$0, cbt $$1, cbu $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cel a(int var1, cbt var2);
}
