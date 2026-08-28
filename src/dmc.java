import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmc extends dll implements dmo {
   public static final MapCodec<dmc> c = b(dmc::new);

   @Override
   public MapCodec<dmc> a() {
      return c;
   }

   protected dmc(dvc.d $$0) {
      super($$0, jl.b, ezy.b(), true);
   }

   @Override
   protected dlm c() {
      return (dlm)dia.mc;
   }

   @Override
   protected ere b_(dvd $$0) {
      return erf.c.a(false);
   }

   @Override
   protected boolean o(dvd $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable coh $$0, dea $$1, jg $$2, dvd $$3, erd $$4) {
      return false;
   }

   @Override
   public boolean a(dew $$0, jg $$1, dvd $$2, ere $$3) {
      return false;
   }
}
