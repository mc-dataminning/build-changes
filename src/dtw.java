import com.mojang.serialization.MapCodec;

public class dtw extends dno {
   public static final MapCodec<dtw> a = b(dtw::new);
   public static final ech b = dtz.b;

   @Override
   public MapCodec<dtw> a() {
      return a;
   }

   public dtw(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(ebq $$0, dkj $$1, iw $$2, csi $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, bxe $$3) {
      if (!$$3.cd()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (bvc)($$0.h() instanceof cys && new ded($$4, $$5, $$0, $$6).b() ? bvc.e : bvc.a);
   }

   private static void d(ebq $$0, dkj $$1, iw $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dak $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bun.a(1, 5));
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dkj $$0, iw $$1) {
      double $$2 = 0.5625;
      bai $$3 = $$0.A;

      for (jc $$4 : jc.values()) {
         iw $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jc.a $$6 = $$4.o();
            double $$7 = $$6 == jc.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jc.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jc.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lu.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }
}
