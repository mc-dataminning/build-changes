import javax.annotation.Nullable;

public class cis extends chv implements bxg<cis.a> {
   private static final alc<String> a = alg.a(cis.class, ale.e);

   public cis(bvr<? extends cis> $$0, dhi $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   public int gp() {
      return 5;
   }

   @Override
   public cxp X_() {
      return new cxp(cxt.re);
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
   protected axe e(bua $$0) {
      return axf.wc;
   }

   @Override
   protected axe go() {
      return axf.wb;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, cis.a.b.e);
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
      $$0.a("type", this.gw().c());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cis.a.a($$0.l("type")));
   }

   @Override
   public void i(cxp $$0) {
      chz.a(this, $$0);
      czy.a(ku.X, $$0, $$0x -> $$0x.a("type", this.gw().c()));
   }

   @Override
   public void h(ux $$0) {
      chz.a(this, $$0);
      this.a(cis.a.a($$0.l("type")));
   }

   public void a(cis.a $$0) {
      this.al.a(a, $$0.e);
   }

   public cis.a gw() {
      return cis.a.a(this.al.a(a));
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      brr.a<cis.a> $$4 = brr.a();
      $$4.a(cis.a.a, 30);
      $$4.a(cis.a.b, 50);
      $$4.a(cis.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gx() {
      return this.gw().f;
   }

   @Override
   protected bvn e(bws $$0) {
      return super.e($$0).a(this.gx());
   }

   public static enum a implements bba {
      a("small", 0.5F),
      b("medium", 1.0F),
      c("large", 1.5F);

      public static final bba.a<cis.a> d = bba.a(cis.a::values);
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

      static cis.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
