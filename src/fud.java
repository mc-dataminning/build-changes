import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fud extends ftf<bja, ffs<bja>> {
   private static final Map<bim<?>, aer> a = ImmutableMap.of(
      bim.aw,
      new aer("textures/entity/piglin/piglin.png"),
      bim.bs,
      new aer("textures/entity/piglin/zombified_piglin.png"),
      bim.ax,
      new aer("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fud(fso.a $$0, fhl $$1, fhl $$2, fhl $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fwm<>(this, new ffa($$0.a($$2)), new ffa($$0.a($$3)), $$0.g()));
   }

   private static ffs<bja> a(fhj $$0, fhl $$1, boolean $$2) {
      ffs<bja> $$3 = new ffs<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public aer b(bja $$0) {
      aer $$1 = a.get($$0.ag());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ag());
      } else {
         return $$1;
      }
   }

   protected boolean c(bja $$0) {
      return super.a($$0) || $$0 instanceof cac && ((cac)$$0).fZ();
   }
}
