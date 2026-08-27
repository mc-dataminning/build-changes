import javax.annotation.Nullable;

public abstract class dhs extends dgi implements bkc {
   @Nullable
   protected ahd m;
   protected long n;

   protected dhs(dgq<?> $$0, hx $$1, dja $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ahd az_() {
      return this.m;
   }

   @Override
   public void a(@Nullable ahd $$0) {
      this.m = $$0;
   }

   @Override
   public long aA_() {
      return this.n;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public boolean ai_() {
      this.e_(null);
      return this.k().stream().allMatch(cmr::b);
   }

   @Override
   public cmr a(int $$0) {
      this.e_(null);
      return this.k().get($$0);
   }

   @Override
   public cmr a(int $$0, int $$1) {
      this.e_(null);
      cmr $$2 = bjp.a(this.k(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cmr b(int $$0) {
      this.e_(null);
      return bjp.a(this.k(), $$0);
   }

   @Override
   public void a(int $$0, cmr $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      this.e();
   }

   @Override
   public boolean a(cfb $$0) {
      return bjo.a(this, $$0);
   }

   @Override
   public void a() {
      this.k().clear();
   }

   protected abstract iq<cmr> k();

   protected abstract void a(iq<cmr> var1);

   @Override
   public boolean d(cfb $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public chu createMenu(int $$0, cfa $$1, cfb $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
