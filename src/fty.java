import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fty extends fta<biy, ffo<biy>> {
   private static final Map<bik<?>, aep> a = ImmutableMap.of(
      bik.aw,
      new aep("textures/entity/piglin/piglin.png"),
      bik.bs,
      new aep("textures/entity/piglin/zombified_piglin.png"),
      bik.ax,
      new aep("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fty(fsj.a $$0, fhh $$1, fhh $$2, fhh $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fwh<>(this, new few($$0.a($$2)), new few($$0.a($$3)), $$0.g()));
   }

   private static ffo<biy> a(fhf $$0, fhh $$1, boolean $$2) {
      ffo<biy> $$3 = new ffo<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public aep b(biy $$0) {
      aep $$1 = a.get($$0.ag());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ag());
      } else {
         return $$1;
      }
   }

   protected boolean c(biy $$0) {
      return super.a($$0) || $$0 instanceof caa && ((caa)$$0).fZ();
   }
}
