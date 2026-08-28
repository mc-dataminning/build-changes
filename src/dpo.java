import com.mojang.serialization.MapCodec;

public class dpo extends dhy {
   public static final MapCodec<dpo> a = b(dpo::new);
   private static final fab b = dhy.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   public dpo(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return dhy.a($$1, $$2.d(), jl.a) && !$$1.z($$2);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.b && !this.a($$0, $$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lq.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jg.a $$10 = new jg.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azj.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azj.a($$3, -10, 10));
         dvd $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lq.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }
}
