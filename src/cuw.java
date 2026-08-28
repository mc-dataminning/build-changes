import javax.annotation.Nullable;

public abstract class cuw extends cuv implements cva {
   private jp<dak> b = jp.a(36, dak.l);
   @Nullable
   private alq<fay> c;
   private long d;

   protected cuw(bxn<?> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(asb $$0, bvt $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public dak a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public dak a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public dak b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, dak $$1) {
      this.c($$0, $$1);
   }

   @Override
   public byw a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(csi $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bxe.d $$0) {
      if (!this.dV().C && $$0.a()) {
         buy.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public bvc a(csi $$0, bvb $$1) {
      return this.b_($$0);
   }

   @Override
   protected fgc a(fgc $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cwb.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bi()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.al_();
   }

   public void a(alq<fay> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cwb createMenu(int $$0, csh $$1, csi $$2) {
      if (this.c != null && $$2.aa_()) {
         return null;
      } else {
         this.f($$1.h);
         return this.a($$0, $$1);
      }
   }

   protected abstract cwb a(int var1, csh var2);

   @Nullable
   @Override
   public alq<fay> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable alq<fay> $$0) {
      this.c = $$0;
   }

   @Override
   public long s() {
      return this.d;
   }

   @Override
   public void a(long $$0) {
      this.d = $$0;
   }

   @Override
   public jp<dak> t() {
      return this.b;
   }

   @Override
   public void u() {
      this.b = jp.a(this.b(), dak.l);
   }
}
