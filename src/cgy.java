import javax.annotation.Nullable;

public class cgy extends cgb implements bvm<cgy.a> {
   private static final akh<String> b = akl.a(cgy.class, akj.e);

   public cgy(bty<? extends cgy> $$0, dej $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   public int gq() {
      return 5;
   }

   @Override
   public cvs W_() {
      return new cvs(cvw.qH);
   }

   @Override
   protected awf w() {
      return awg.vG;
   }

   @Override
   protected awf o_() {
      return awg.vH;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.vJ;
   }

   @Override
   protected awf gp() {
      return awg.vI;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, cgy.a.b.e);
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.j_();
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("type", this.gx().c());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(cgy.a.a($$0.l("type")));
   }

   @Override
   public void m(cvs $$0) {
      cgf.a(this, $$0);
      cyh.a(ks.S, $$0, $$0x -> $$0x.a("type", this.gx().c()));
   }

   @Override
   public void h(ug $$0) {
      cgf.a(this, $$0);
      this.a(cgy.a.a($$0.l("type")));
   }

   public void a(cgy.a $$0) {
      this.am.a(b, $$0.e);
   }

   public cgy.a gx() {
      return cgy.a.a(this.am.a(b));
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      bqc.a<cgy.a> $$4 = bqc.a();
      $$4.a(cgy.a.a, 30);
      $$4.a(cgy.a.b, 50);
      $$4.a(cgy.a.c, 15);
      $$4.a().a(this.af).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gy() {
      return this.gx().f;
   }

   @Override
   protected btu e(buz $$0) {
      return super.e($$0).a(this.gy());
   }

   public static enum a implements bab {
      a("small", 0.5F),
      b("medium", 1.0F),
      c("large", 1.5F);

      public static final bab.a<cgy.a> d = bab.a(cgy.a::values);
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

      static cgy.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
