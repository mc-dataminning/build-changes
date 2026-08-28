import com.mojang.serialization.MapCodec;

public class dpi extends dhy {
   public static final MapCodec<dpi> b = b(dpi::new);
   public static final dvu c = dvt.z;

   @Override
   protected MapCodec<? extends dpi> a() {
      return b;
   }

   protected dpi(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.b ? $$0.b(c, Boolean.valueOf(o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dvd $$0) {
      return $$0.a(awz.bA);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }
}
