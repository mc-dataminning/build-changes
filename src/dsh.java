import com.mojang.serialization.MapCodec;

public class dsh extends dma {
   public static final MapCodec<dsh> a = b(dsh::new);
   public static final eaq b = dsk.b;

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   public dsh(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dzz $$0, div $$1, iu $$2, cqy $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bwd $$3) {
      if (!$$3.ce()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (bub)($$0.h() instanceof cxg && new dcr($$4, $$5, $$0, $$6).b() ? bub.e : bub.a);
   }

   private static void d(dzz $$0, div $$1, iu $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, cyy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btm.a(1, 5));
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(div $$0, iu $$1) {
      double $$2 = 0.5625;
      azv $$3 = $$0.A;

      for (ja $$4 : ja.values()) {
         iu $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            ja.a $$6 = $$4.o();
            double $$7 = $$6 == ja.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ja.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ja.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ls.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }
}
