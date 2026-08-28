import com.mojang.serialization.MapCodec;

public class efk extends efd {
   public static final MapCodec<efk> b = dsc.b.fieldOf("state").xmap(dsb.a::b, dez::o).xmap(efk::new, $$0 -> $$0.c);
   private final dez c;

   public efk(dez $$0) {
      this.c = $$0;
   }

   @Override
   protected efe<?> a() {
      return efe.f;
   }

   @Override
   public dsc a(azh $$0, iz $$1) {
      je.a $$2 = je.a.a($$0);
      return this.c.o().a(dll.i, $$2);
   }
}
