import com.mojang.serialization.MapCodec;

public class dsj extends due implements duz {
   public static final MapCodec<dsj> b = b(dsj::new);
   public static final ech c = ecg.I;
   public static final ech d = ecg.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<dsj> a() {
      return b;
   }

   public dsj(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jc.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eyb.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(c) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(ebq $$0, dkj $$1, iw $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(ebq $$0, dkj $$1, iw $$2) {
      jc $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eze.a($$1, $$3, null));
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$1.ag() && (long)$$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(ehp.a.b, $$2.u(), $$2.w()) - 1) {
         bad.a($$0.c(a).o(), $$1, $$2, 0.125, lz.aW, bun.a(1, 2));
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }
}
