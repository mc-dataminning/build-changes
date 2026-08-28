import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dow extends dih implements dib, dmo {
   public static final MapCodec<dow> a = b(dow::new);
   protected static final float b = 6.0F;
   protected static final fab c = dhy.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   protected dow(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.c($$1, $$2, jl.b) && !$$0.a(dia.kJ);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return $$1.a(axf.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      dvd $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.l()) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$0.a_($$1.d()).a(dia.G);
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   protected ere b_(dvd $$0) {
      return erf.c.a(false);
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      dvd $$4 = dia.bx.m();
      dvd $$5 = $$4.b(dqe.d, dvz.a);
      jg $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
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
