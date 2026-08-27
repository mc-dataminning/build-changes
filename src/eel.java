import com.mojang.serialization.MapCodec;

public class eel extends eee {
   public static final MapCodec<eel> b = drd.b.fieldOf("state").xmap(drc.a::b, dea::n).xmap(eel::new, $$0 -> $$0.c);
   private final dea c;

   public eel(dea $$0) {
      this.c = $$0;
   }

   @Override
   protected eef<?> a() {
      return eef.f;
   }

   @Override
   public drd a(aym $$0, io $$1) {
      it.a $$2 = it.a.a($$0);
      return this.c.n().a(dkm.i, $$2);
   }
}
