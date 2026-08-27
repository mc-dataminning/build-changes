import javax.annotation.Nullable;

public abstract class dkc extends dki implements bmw, bnh, bni {
   private bng e = bng.a;
   @Nullable
   private vu f;

   protected dkc(dkk<?> $$0, ib $$1, dnb $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.e = bng.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = vu.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", vu.a.a(this.f));
      }
   }

   public void a(vu $$0) {
      this.f = $$0;
   }

   @Override
   public vu ad() {
      return this.f != null ? this.f : this.k();
   }

   @Override
   public vu O_() {
      return this.ad();
   }

   @Nullable
   @Override
   public vu af() {
      return this.f;
   }

   protected abstract vu k();

   public boolean d(ciu $$0) {
      return a($$0, this.e, this.O_());
   }

   public static boolean a(ciu $$0, bng $$1, vu $$2) {
      if (!$$0.N_() && !$$1.a($$0.eU())) {
         $$0.a(vu.a("container.isLocked", $$2), true);
         $$0.a(aty.eO, atz.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public clq createMenu(int $$0, cit $$1, ciu $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract clq a(int var1, cit var2);
}
