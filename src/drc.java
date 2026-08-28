import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drc extends dqk implements doz {
   public static final MapCodec<drc> a = b(drc::new);
   public static final dvu c = dvt.C;

   @Override
   protected MapCodec<? extends drc> a() {
      return a;
   }

   protected drc(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(erf.c)));
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
      return $$0.c(c) ? erf.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }
}
