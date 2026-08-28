import javax.annotation.Nullable;

public class cgq extends cft implements bve<cgq.a> {
   private static final akg<String> b = akk.a(cgq.class, aki.e);

   public cgq(btq<? extends cgq> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   public int gq() {
      return 5;
   }

   @Override
   public cvl V_() {
      return new cvl(cvo.qH);
   }

   @Override
   protected awc w() {
      return awd.vG;
   }

   @Override
   protected awc n_() {
      return awd.vH;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.vJ;
   }

   @Override
   protected awc gp() {
      return awd.vI;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, cgq.a.b.e);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("type", this.gx().c());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgq.a.a($$0.l("type")));
   }

   public void a(cgq.a $$0) {
      this.am.a(b, $$0.e);
   }

   public cgq.a gx() {
      return cgq.a.a(this.am.a(b));
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      bpu.a<cgq.a> $$4 = bpu.a();
      $$4.a(cgq.a.a, 30);
      $$4.a(cgq.a.b, 50);
      $$4.a(cgq.a.c, 15);
      $$4.a().a(this.af).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static enum a implements azy {
      a("small"),
      b("medium"),
      c("large");

      public static final azy.a<cgq.a> d = azy.a(cgq.a::values);
      final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      static cgq.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
