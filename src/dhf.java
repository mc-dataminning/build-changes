import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhf extends dhy implements doz {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final dvu b = dvt.C;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   protected dhf(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dvd $$0) {
      return $$0.y().c();
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.a;
   }

   @Override
   protected float c(dvd $$0, dea $$1, jg $$2) {
      return 1.0F;
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

   @Nullable
   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == erf.c));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   public cvx a(@Nullable coh $$0, dew $$1, jg $$2, dvd $$3) {
      return $$0 != null && $$0.f() ? doz.super.a($$0, $$1, $$2, $$3) : cvx.k;
   }

   @Override
   public boolean a(@Nullable coh $$0, dea $$1, jg $$2, dvd $$3, erd $$4) {
      return $$0 != null && $$0.f() ? doz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
