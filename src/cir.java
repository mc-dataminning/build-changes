import javax.annotation.Nullable;

public class cir extends chu implements bxf<cir.a> {
   private static final alc<String> a = alg.a(cir.class, ale.e);

   public cir(bvq<? extends cir> $$0, dhh $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   public int gn() {
      return 5;
   }

   @Override
   public cxo X_() {
      return new cxo(cxs.re);
   }

   @Override
   protected axe u() {
      return axf.vZ;
   }

   @Override
   protected axe o_() {
      return axf.wa;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.wc;
   }

   @Override
   protected axe gm() {
      return axf.wb;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, cir.a.b.e);
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (a.equals($$0)) {
         this.m_();
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("type", this.gu().c());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cir.a.a($$0.l("type")));
   }

   @Override
   public void i(cxo $$0) {
      chy.a(this, $$0);
      czx.a(ku.X, $$0, $$0x -> $$0x.a("type", this.gu().c()));
   }

   @Override
   public void h(ux $$0) {
      chy.a(this, $$0);
      this.a(cir.a.a($$0.l("type")));
   }

   public void a(cir.a $$0) {
      this.al.a(a, $$0.e);
   }

   public cir.a gu() {
      return cir.a.a(this.al.a(a));
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      brq.a<cir.a> $$4 = brq.a();
      $$4.a(cir.a.a, 30);
      $$4.a(cir.a.b, 50);
      $$4.a(cir.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gv() {
      return this.gu().f;
   }

   @Override
   protected bvm e(bwr $$0) {
      return super.e($$0).a(this.gv());
   }

   public static enum a implements bba {
      a("small", 0.5F),
      b("medium", 1.0F),
      c("large", 1.5F);

      public static final bba.a<cir.a> d = bba.a(cir.a::values);
      final String e;
      final float f;

      private a(final String $$0, final float $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      static cir.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
