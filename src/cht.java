import javax.annotation.Nullable;

public class cht extends cgw implements bwh<cht.a> {
   private static final akm<String> a = akq.a(cht.class, ako.e);

   public cht(bus<? extends cht> $$0, dfm $$1) {
      super($$0, $$1);
      this.l_();
   }

   @Override
   public int go() {
      return 5;
   }

   @Override
   public cwm V_() {
      return new cwm(cwq.qH);
   }

   @Override
   protected awm t() {
      return awn.vE;
   }

   @Override
   protected awm n_() {
      return awn.vF;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.vH;
   }

   @Override
   protected awm gn() {
      return awn.vG;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, cht.a.b.e);
   }

   @Override
   public void a(akm<?> $$0) {
      super.a($$0);
      if (a.equals($$0)) {
         this.l_();
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("type", this.gv().c());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a(cht.a.a($$0.l("type")));
   }

   @Override
   public void i(cwm $$0) {
      cha.a(this, $$0);
      cyv.a(ku.X, $$0, $$0x -> $$0x.a("type", this.gv().c()));
   }

   @Override
   public void h(ul $$0) {
      cha.a(this, $$0);
      this.a(cht.a.a($$0.l("type")));
   }

   public void a(cht.a $$0) {
      this.al.a(a, $$0.e);
   }

   public cht.a gv() {
      return cht.a.a(this.al.a(a));
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      bqs.a<cht.a> $$4 = bqs.a();
      $$4.a(cht.a.a, 30);
      $$4.a(cht.a.b, 50);
      $$4.a(cht.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gw() {
      return this.gv().f;
   }

   @Override
   protected buo e(bvt $$0) {
      return super.e($$0).a(this.gw());
   }

   public static enum a implements bai {
      a("small", 0.5F),
      b("medium", 1.0F),
      c("large", 1.5F);

      public static final bai.a<cht.a> d = bai.a(cht.a::values);
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

      static cht.a a(String $$0) {
         return d.a($$0, a);
      }
   }
}
