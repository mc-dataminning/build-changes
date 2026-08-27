import javax.annotation.Nullable;

public abstract class dex extends dfd implements biq, bja, bjb {
   private biz c = biz.a;
   @Nullable
   private ur d;

   protected dex(dff<?> $$0, ht $$1, dhi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c = biz.b($$0);
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
   public ur ad() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public ur P_() {
      return this.ad();
   }

   @Nullable
   @Override
   public ur af() {
      return this.d;
   }

   protected abstract ur g();

   public boolean d(cdu $$0) {
      return a($$0, this.c, this.P_());
   }

   public static boolean a(cdu $$0, biz $$1, ur $$2) {
      if (!$$0.O_() && !$$1.a($$0.eU())) {
         $$0.a(ur.a("container.isLocked", $$2), true);
         $$0.a(aqr.ei, aqs.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cgm createMenu(int $$0, cdt $$1, cdu $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cgm a(int var1, cdt var2);
}
