import javax.annotation.Nullable;

public abstract class dka extends dkg implements bmv, bng, bnh {
   private bnf e = bnf.a;
   @Nullable
   private vu f;

   protected dka(dki<?> $$0, ib $$1, dmz $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.e = bnf.b($$0);
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

   public boolean d(cis $$0) {
      return a($$0, this.e, this.O_());
   }

   public static boolean a(cis $$0, bnf $$1, vu $$2) {
      if (!$$0.N_() && !$$1.a($$0.eU())) {
         $$0.a(vu.a("container.isLocked", $$2), true);
         $$0.a(aty.eK, atz.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public clo createMenu(int $$0, cir $$1, cis $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract clo a(int var1, cir var2);
}
