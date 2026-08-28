import com.mojang.serialization.MapCodec;

public class drx extends dts implements dun {
   public static final MapCodec<drx> b = b(drx::new);
   public static final ebv c = ebu.I;
   public static final ebv d = ebu.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<drx> a() {
      return b;
   }

   public drx(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exp.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(c) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(ebe $$0, djx $$1, iv $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(ebe $$0, djx $$1, iv $$2) {
      jb $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eys.a($$1, $$3, null));
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$1.ag() && (long)$$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(ehd.a.b, $$2.u(), $$2.w()) - 1) {
         azs.a($$0.c(a).o(), $$1, $$2, 0.125, ly.aW, buc.a(1, 2));
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }
}
