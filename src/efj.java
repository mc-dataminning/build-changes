import com.mojang.serialization.MapCodec;

public class efj extends efc {
   public static final MapCodec<efj> b = dsb.b.fieldOf("state").xmap(dsa.a::b, dey::o).xmap(efj::new, $$0 -> $$0.c);
   private final dey c;

   public efj(dey $$0) {
      this.c = $$0;
   }

   @Override
   protected efd<?> a() {
      return efd.f;
   }

   @Override
   public dsb a(azg $$0, iz $$1) {
      je.a $$2 = je.a.a($$0);
      return this.c.o().a(dlk.i, $$2);
   }
}
