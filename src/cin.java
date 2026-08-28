import javax.annotation.Nullable;

public class cin extends chq implements bxb<cin.a> {
   private static final alc<String> a = alg.a(cin.class, ale.e);

   public cin(bvm<? extends cin> $$0, dha $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   public int gn() {
      return 5;
   }

   @Override
   public cxk X_() {
      return new cxk(cxo.re);
   }

   @Override
   protected axe u() {
      return axf.vY;
   }

   @Override
   protected axe o_() {
      return axf.vZ;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.wb;
   }

   @Override
   protected axe gm() {
      return axf.wa;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, cin.a.b.e);
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
      this.a(cin.a.a($$0.l("type")));
   }

   @Override
   public void i(cxk $$0) {
      chu.a(this, $$0);
      czt.a(ku.X, $$0, $$0x -> $$0x.a("type", this.gu().c()));
   }

   @Override
   public void h(ux $$0) {
      chu.a(this, $$0);
      this.a(cin.a.a($$0.l("type")));
   }

   public void a(cin.a $$0) {
      this.al.a(a, $$0.e);
   }

   public cin.a gu() {
      return cin.a.a(this.al.a(a));
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      brm.a<cin.a> $$4 = brm.a();
      $$4.a(cin.a.a, 30);
      $$4.a(cin.a.b, 50);
      $$4.a(cin.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gv() {
      return this.gu().f;
   }

   @Override
   protected bvi e(bwn $$0) {
      return super.e($$0).a(this.gv());
   }

   public static enum a implements bba {
      a("small", 0.5F),
      b("medium", 1.0F),
      c("large", 1.5F);

      public static final bba.a<cin.a> d = bba.a(cin.a::values);
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

      static cin.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
