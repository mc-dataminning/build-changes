import javax.annotation.Nullable;

public class chq extends cgt implements bwe<chq.a> {
   private static final ako<String> b = aks.a(chq.class, akq.e);

   public chq(bup<? extends chq> $$0, dff $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   public int gx() {
      return 5;
   }

   @Override
   public cwf X_() {
      return new cwf(cwj.qH);
   }

   @Override
   protected awn w() {
      return awo.vE;
   }

   @Override
   protected awn o_() {
      return awo.vF;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.vH;
   }

   @Override
   protected awn gw() {
      return awo.vG;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, chq.a.b.e);
   }

   @Override
   public void a(ako<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.j_();
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("type", this.gE().c());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(chq.a.a($$0.l("type")));
   }

   @Override
   public void k(cwf $$0) {
      cgx.a(this, $$0);
      cyo.a(ku.X, $$0, $$0x -> $$0x.a("type", this.gE().c()));
   }

   @Override
   public void h(un $$0) {
      cgx.a(this, $$0);
      this.a(chq.a.a($$0.l("type")));
   }

   public void a(chq.a $$0) {
      this.am.a(b, $$0.e);
   }

   public chq.a gE() {
      return chq.a.a(this.am.a(b));
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      bqp.a<chq.a> $$4 = bqp.a();
      $$4.a(chq.a.a, 30);
      $$4.a(chq.a.b, 50);
      $$4.a(chq.a.c, 15);
      $$4.a().a(this.af).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gF() {
      return this.gE().f;
   }

   @Override
   protected bul e(bvq $$0) {
      return super.e($$0).a(this.gF());
   }

   public static enum a implements baj {
      a("small", 0.5F),
      b("medium", 1.0F),
      c("large", 1.5F);

      public static final baj.a<chq.a> d = baj.a(chq.a::values);
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

      static chq.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
