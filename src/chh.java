import javax.annotation.Nullable;

public class chh extends cgk implements bvv<chh.a> {
   private static final akk<String> b = ako.a(chh.class, akm.e);

   public chh(bug<? extends chh> $$0, dev $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   public int gx() {
      return 5;
   }

   @Override
   public cvx X_() {
      return new cvx(cwb.qH);
   }

   @Override
   protected awj w() {
      return awk.vE;
   }

   @Override
   protected awj o_() {
      return awk.vF;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.vH;
   }

   @Override
   protected awj gw() {
      return awk.vG;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, chh.a.b.e);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.j_();
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("type", this.gE().c());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(chh.a.a($$0.l("type")));
   }

   @Override
   public void k(cvx $$0) {
      cgo.a(this, $$0);
      cyg.a(kt.W, $$0, $$0x -> $$0x.a("type", this.gE().c()));
   }

   @Override
   public void h(uj $$0) {
      cgo.a(this, $$0);
      this.a(chh.a.a($$0.l("type")));
   }

   public void a(chh.a $$0) {
      this.am.a(b, $$0.e);
   }

   public chh.a gE() {
      return chh.a.a(this.am.a(b));
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      bqg.a<chh.a> $$4 = bqg.a();
      $$4.a(chh.a.a, 30);
      $$4.a(chh.a.b, 50);
      $$4.a(chh.a.c, 15);
      $$4.a().a(this.af).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gF() {
      return this.gE().f;
   }

   @Override
   protected buc e(bvh $$0) {
      return super.e($$0).a(this.gF());
   }

   public static enum a implements baf {
      a("small", 0.5F),
      b("medium", 1.0F),
      c("large", 1.5F);

      public static final baf.a<chh.a> d = baf.a(chh.a::values);
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

      static chh.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
