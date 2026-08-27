import javax.annotation.Nullable;

public abstract class dcr extends dcx implements bgt, bhd, bhe {
   private bhc c = bhc.a;
   @Nullable
   private tn d;

   protected dcr(dcz<?> $$0, gw $$1, dfl $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c = bhc.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.d = tn.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      this.c.a($$0);
      if (this.d != null) {
         $$0.a("CustomName", tn.a.a(this.d));
      }
   }

   public void a(tn $$0) {
      this.d = $$0;
   }

   @Override
   public tn ab() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public tn N_() {
      return this.ab();
   }

   @Nullable
   @Override
   public tn ad() {
      return this.d;
   }

   protected abstract tn g();

   public boolean d(cbw $$0) {
      return a($$0, this.c, this.N_());
   }

   public static boolean a(cbw $$0, bhc $$1, tn $$2) {
      if (!$$0.M_() && !$$1.a($$0.eS())) {
         $$0.a(tn.a("container.isLocked", $$2), true);
         $$0.a(apf.ei, apg.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cen createMenu(int $$0, cbv $$1, cbw $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cen a(int var1, cbv var2);
}
