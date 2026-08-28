import com.mojang.serialization.MapCodec;

public class efx extends efq {
   public static final MapCodec<efx> b = dsl.b.fieldOf("state").xmap(dsk.a::b, dfi::o).xmap(efx::new, $$0 -> $$0.c);
   private final dfi c;

   public efx(dfi $$0) {
      this.c = $$0;
   }

   @Override
   protected efr<?> a() {
      return efr.f;
   }

   @Override
   public dsl a(ayo $$0, ja $$1) {
      jf.a $$2 = jf.a.a($$0);
      return this.c.o().b(dlu.i, $$2);
   }
}
