import javax.annotation.Nullable;

public abstract class dct extends dcz implements bgx, bhh, bhi {
   private bhg c = bhg.a;
   @Nullable
   private tl d;

   protected dct(ddb<?> $$0, gw $$1, dfd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.c = bhg.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.d = tl.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      this.c.a($$0);
      if (this.d != null) {
         $$0.a("CustomName", tl.a.a(this.d));
      }
   }

   public void a(tl $$0) {
      this.d = $$0;
   }

   @Override
   public tl ab() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public tl N_() {
      return this.ab();
   }

   @Nullable
   @Override
   public tl ad() {
      return this.d;
   }

   protected abstract tl g();

   public boolean d(cca $$0) {
      return a($$0, this.c, this.N_());
   }

   public static boolean a(cca $$0, bhg $$1, tl $$2) {
      if (!$$0.M_() && !$$1.a($$0.eS())) {
         $$0.a(tl.a("container.isLocked", $$2), true);
         $$0.a(apg.ei, aph.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cer createMenu(int $$0, cbz $$1, cca $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cer a(int var1, cbz var2);
}
