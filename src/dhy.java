import javax.annotation.Nullable;

public abstract class dhy extends dgo implements bkh {
   @Nullable
   protected ahg m;
   protected long n;

   protected dhy(dgw<?> $$0, hx $$1, djg $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ahg az_() {
      return this.m;
   }

   @Override
   public void a(@Nullable ahg $$0) {
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
      return this.k().stream().allMatch(cmx::b);
   }

   @Override
   public cmx a(int $$0) {
      this.e_(null);
      return this.k().get($$0);
   }

   @Override
   public cmx a(int $$0, int $$1) {
      this.e_(null);
      cmx $$2 = bju.a(this.k(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cmx b(int $$0) {
      this.e_(null);
      return bju.a(this.k(), $$0);
   }

   @Override
   public void a(int $$0, cmx $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      this.e();
   }

   @Override
   public boolean a(cfh $$0) {
      return bjt.a(this, $$0);
   }

   @Override
   public void a() {
      this.k().clear();
   }

   protected abstract iq<cmx> k();

   protected abstract void a(iq<cmx> var1);

   @Override
   public boolean d(cfh $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public cia createMenu(int $$0, cfg $$1, cfh $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
