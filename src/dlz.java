import javax.annotation.Nullable;

public abstract class dlz extends dmf implements bnt, boe, bof {
   private bod e = bod.a;
   @Nullable
   private wg f;

   protected dlz(dmh<?> $$0, ib $$1, doz $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.e = bod.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = wg.a.a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", wg.a.a(this.f, $$1));
      }
   }

   @Override
   public wg ad() {
      return this.f != null ? this.f : this.k();
   }

   @Override
   public wg O_() {
      return this.ad();
   }

   @Nullable
   @Override
   public wg af() {
      return this.f;
   }

   protected abstract wg k();

   public boolean d(cjt $$0) {
      return a($$0, this.e, this.O_());
   }

   public static boolean a(cjt $$0, bod $$1, wg $$2) {
      if (!$$0.N_() && !$$1.a($$0.eU())) {
         $$0.a(wg.a("container.isLocked", $$2), true);
         $$0.a(aum.eP, aun.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cmp createMenu(int $$0, cjs $$1, cjt $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cmp a(int var1, cjs var2);

   @Override
   public void a(jl $$0) {
      this.f = $$0.a(jp.d);
      this.e = $$0.a(jp.T, bod.a);
   }

   @Override
   public void a(jl.a $$0) {
      $$0.a(jp.d, this.f);
      $$0.a(jp.T, this.e);
   }

   @Override
   public void a(tm $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
   }
}
