import com.mojang.serialization.MapCodec;

public class elg extends ekz {
   public static final MapCodec<elg> b = dxq.a.fieldOf("state").xmap(dxp.a::b, dke::m).xmap(elg::new, $$0 -> $$0.c);
   private final dke c;

   public elg(dke $$0) {
      this.c = $$0;
   }

   @Override
   protected ela<?> a() {
      return ela.f;
   }

   @Override
   public dxq a(azh $$0, ji $$1) {
      jn.a $$2 = jn.a.a($$0);
      return this.c.m().c(dqv.d, $$2);
   }
}
