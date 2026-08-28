import com.mojang.serialization.MapCodec;

public class dlq extends dhy implements doz {
   public static final MapCodec<dlq> a = b(dlq::new);
   private static final fab c = dhy.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dvu b = dvt.C;

   public dlq(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(b) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(erf.c)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
