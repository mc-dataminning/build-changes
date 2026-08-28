import com.mojang.serialization.MapCodec;

public class emd extends elw {
   public static final MapCodec<emd> b = dym.a.fieldOf("state").xmap(dyl.a::b, dku::m).xmap(emd::new, $$0 -> $$0.c);
   private final dku c;

   public emd(dku $$0) {
      this.c = $$0;
   }

   @Override
   protected elx<?> a() {
      return elx.f;
   }

   @Override
   public dym a(azs $$0, jj $$1) {
      jo.a $$2 = jo.a.a($$0);
      return this.c.m().c(drl.d, $$2);
   }
}
