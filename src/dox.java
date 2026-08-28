import com.mojang.serialization.MapCodec;

public class dox extends dqs implements drl {
   public static final MapCodec<dox> b = b(dox::new);
   public static final dyh c = dyg.I;
   public static final dyh d = dyg.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<dox> a() {
      return b;
   }

   public dox(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, jn.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etx.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dxq $$0, dgz $$1, ji $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dxq $$0, dgz $$1, ji $$2) {
      jn $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eva.a($$1, $$3, null));
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$1.ag() && (long)$$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(edo.a.b, $$2.u(), $$2.w()) - 1) {
         azd.a($$0.c(a).o(), $$1, $$2, 0.125, lt.aW, bsj.a(1, 2));
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.f($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }
}
