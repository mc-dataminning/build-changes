import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cim extends chn implements bwy<cim.a> {
   private static final String a = "type";
   private static final ajx<Integer> b = akb.a(cim.class, ajz.b);

   public cim(bvi<? extends cim> $$0, dgz $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   public int x() {
      return 5;
   }

   @Override
   public cxh R_() {
      return new cxh(cxl.rp);
   }

   @Override
   protected avz u() {
      return awa.wp;
   }

   @Override
   protected avz l_() {
      return awa.wq;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.ws;
   }

   @Override
   protected avz t() {
      return awa.wr;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(b, cim.a.b.a());
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("type", this.gy().c());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cim.a.a($$0.l("type")));
   }

   @Override
   public void i(cxh $$0) {
      chr.a(this, $$0);
      czo.a(kv.Z, $$0, $$0x -> $$0x.a("type", this.gy().c()));
   }

   @Override
   public void h(tq $$0) {
      chr.a(this, $$0);
      this.a(cim.a.a($$0.l("type")));
   }

   public void a(cim.a $$0) {
      this.al.a(b, $$0.g);
   }

   public cim.a gy() {
      return cim.a.e.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      brj.a<cim.a> $$4 = brj.b();
      $$4.a(cim.a.a, 30);
      $$4.a(cim.a.b, 50);
      $$4.a(cim.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gz() {
      return this.gy().h;
   }

   @Override
   protected bvd e(bwk $$0) {
      return super.e($$0).a(this.gz());
   }

   public static enum a implements azv {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final azv.a<cim.a> d = azv.a(cim.a::values);
      static final IntFunction<cim.a> e = axq.a(cim.a::a, values(), axq.a.c);
      private final String f;
      final int g;
      final float h;

      private a(final String $$0, final int $$1, final float $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      @Override
      public String c() {
         return this.f;
      }

      int a() {
         return this.g;
      }

      static cim.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
