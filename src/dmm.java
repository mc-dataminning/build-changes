import com.mojang.serialization.MapCodec;

public class dmm extends doh implements doz {
   public static final MapCodec<dmm> b = b(dmm::new);
   public static final dvu c = dvt.C;
   public static final dvu d = dvt.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dmm> a() {
      return b;
   }

   public dmm(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jl.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erf.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dvd $$0, dev $$1, jg $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dvd $$0, dev $$1, jg $$2) {
      jl $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, esi.a($$1, $$3, null));
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$1.ad() && (long)$$1.A.a(200) <= $$1.aa() % 200L && $$2.v() == $$1.a(eaz.a.b, $$2.u(), $$2.w()) - 1) {
         azn.a($$0.c(a).o(), $$1, $$2, 0.125, lq.aT, brj.a(1, 2));
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }
}
