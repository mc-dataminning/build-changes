import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dli extends drs {
   public static final MapCodec<dli> a = b(dli::new);
   public static final dzk<jo> b = dzc.T;

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   public dli(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(b, jo.c));
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return !$$0.C ? a($$2, dvn.K, ($$0x, $$1x, $$2x, $$3) -> edv.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
