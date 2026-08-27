import javax.annotation.Nullable;

public abstract class del extends der implements bij, bit, biu {
   private bis c = bis.a;
   @Nullable
   private ur d;

   protected del(det<?> $$0, ht $$1, dgw $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c = bis.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.d = ur.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.c.a($$0);
      if (this.d != null) {
         $$0.a("CustomName", ur.a.a(this.d));
      }
   }

   public void a(ur $$0) {
      this.d = $$0;
   }

   @Override
   public ur ab() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public ur O_() {
      return this.ab();
   }

   @Nullable
   @Override
   public ur ad() {
      return this.d;
   }

   protected abstract ur g();

   public boolean d(cdm $$0) {
      return a($$0, this.c, this.O_());
   }

   public static boolean a(cdm $$0, bis $$1, ur $$2) {
      if (!$$0.N_() && !$$1.a($$0.eS())) {
         $$0.a(ur.a("container.isLocked", $$2), true);
         $$0.a(aqn.ei, aqo.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cge createMenu(int $$0, cdl $$1, cdm $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cge a(int var1, cdl var2);
}
