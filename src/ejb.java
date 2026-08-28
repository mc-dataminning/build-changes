import com.mojang.serialization.MapCodec;

public class ejb extends eiu {
   public static final MapCodec<ejb> b = dvo.a.fieldOf("state").xmap(dvn.a::b, dij::m).xmap(ejb::new, $$0 -> $$0.c);
   private final dij c;

   public ejb(dij $$0) {
      this.c = $$0;
   }

   @Override
   protected eiv<?> a() {
      return eiv.f;
   }

   @Override
   public dvo a(azv $$0, jh $$1) {
      jm.a $$2 = jm.a.a($$0);
      return this.c.m().c(dov.i, $$2);
   }
}
