import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends dhk implements doz {
   public static final MapCodec<djl> a = b(djl::new);
   public static final dvu b = dvt.C;
   private static final int d = 3;
   protected static final fab c = dhy.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   public djl(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dss($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.z, $$0.C ? dss::a : dss::b);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.b;
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(b) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axf.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
