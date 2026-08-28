import com.mojang.serialization.MapCodec;

public class eix extends eiq {
   public static final MapCodec<eix> b = dvj.a.fieldOf("state").xmap(dvi.a::b, die::m).xmap(eix::new, $$0 -> $$0.c);
   private final die c;

   public eix(die $$0) {
      this.c = $$0;
   }

   @Override
   protected eir<?> a() {
      return eir.f;
   }

   @Override
   public dvj a(azs $$0, jh $$1) {
      jm.a $$2 = jm.a.a($$0);
      return this.c.m().c(doq.i, $$2);
   }
}
