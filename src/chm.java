import javax.annotation.Nullable;

public class chm extends cgp implements bwa<chm.a> {
   private static final akl<String> b = akp.a(chm.class, akn.e);

   public chm(bul<? extends chm> $$0, dfb $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   public int gw() {
      return 5;
   }

   @Override
   public cwb X_() {
      return new cwb(cwf.qH);
   }

   @Override
   protected awk w() {
      return awl.vE;
   }

   @Override
   protected awk o_() {
      return awl.vF;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.vH;
   }

   @Override
   protected awk gv() {
      return awl.vG;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, chm.a.b.e);
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.j_();
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("type", this.gD().c());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(chm.a.a($$0.l("type")));
   }

   @Override
   public void k(cwb $$0) {
      cgt.a(this, $$0);
      cyk.a(ku.X, $$0, $$0x -> $$0x.a("type", this.gD().c()));
   }

   @Override
   public void h(uk $$0) {
      cgt.a(this, $$0);
      this.a(chm.a.a($$0.l("type")));
   }

   public void a(chm.a $$0) {
      this.am.a(b, $$0.e);
   }

   public chm.a gD() {
      return chm.a.a(this.am.a(b));
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      bql.a<chm.a> $$4 = bql.a();
      $$4.a(chm.a.a, 30);
      $$4.a(chm.a.b, 50);
      $$4.a(chm.a.c, 15);
      $$4.a().a(this.af).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gE() {
      return this.gD().f;
   }

   @Override
   protected buh e(bvm $$0) {
      return super.e($$0).a(this.gE());
   }

   public static enum a implements bag {
      a("small", 0.5F),
      b("medium", 1.0F),
      c("large", 1.5F);

      public static final bag.a<chm.a> d = bag.a(chm.a::values);
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

      static chm.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
