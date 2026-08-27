import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fqn extends fpp<bgb, fcj<bgb>> {
   private static final Map<bfn<?>, acq> a = ImmutableMap.of(
      bfn.aw,
      new acq("textures/entity/piglin/piglin.png"),
      bfn.bs,
      new acq("textures/entity/piglin/zombified_piglin.png"),
      bfn.ax,
      new acq("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fqn(foy.a $$0, fec $$1, fec $$2, fec $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fsw<>(this, new fbr($$0.a($$2)), new fbr($$0.a($$3)), $$0.g()));
   }

   private static fcj<bgb> a(fea $$0, fec $$1, boolean $$2) {
      fcj<bgb> $$3 = new fcj<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public acq b(bgb $$0) {
      acq $$1 = a.get($$0.ae());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ae());
      } else {
         return $$1;
      }
   }

   protected boolean c(bgb $$0) {
      return super.a($$0) || $$0 instanceof bxd && ((bxd)$$0).fY();
   }
}
