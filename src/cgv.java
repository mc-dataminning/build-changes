import javax.annotation.Nullable;

public class cgv extends cfy implements bvj<cgv.a> {
   private static final akg<String> b = akk.a(cgv.class, aki.e);

   public cgv(btv<? extends cgv> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   public int gr() {
      return 5;
   }

   @Override
   public cvp V_() {
      return new cvp(cvt.qH);
   }

   @Override
   protected awd w() {
      return awe.vG;
   }

   @Override
   protected awd n_() {
      return awe.vH;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.vJ;
   }

   @Override
   protected awd gq() {
      return awe.vI;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, cgv.a.b.e);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("type", this.gy().c());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgv.a.a($$0.l("type")));
   }

   public void a(cgv.a $$0) {
      this.am.a(b, $$0.e);
   }

   public cgv.a gy() {
      return cgv.a.a(this.am.a(b));
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      bpz.a<cgv.a> $$4 = bpz.a();
      $$4.a(cgv.a.a, 30);
      $$4.a(cgv.a.b, 50);
      $$4.a(cgv.a.c, 15);
      $$4.a().a(this.af).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static enum a implements azz {
      a("small"),
      b("medium"),
      c("large");

      public static final azz.a<cgv.a> d = azz.a(cgv.a::values);
      final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      static cgv.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
