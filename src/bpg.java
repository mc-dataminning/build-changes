public class bpg extends ccc {
   private static final aim<Integer> cb = aiq.a(bpg.class, aio.b);

   public bpg(bpc<? extends bpg> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected ka r() {
      return kc.aN;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
   }

   @Override
   protected atx s() {
      return aty.ky;
   }

   @Override
   protected atx v() {
      return aty.kv;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.kx;
   }

   @Override
   protected atx n_() {
      return aty.kw;
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void m_() {
      super.m_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dM().a(kc.aO, this.d(0.6), this.du(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.a(cb, $$0);
   }

   public int y() {
      return this.an.a(cb);
   }

   public static boolean a(bpc<? extends bpo> $$0, cxo $$1, bps $$2, ib $$3, axd $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dac.G);
   }
}
