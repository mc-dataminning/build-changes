import com.mojang.serialization.MapCodec;

public class eff extends eey {
   public static final MapCodec<eff> b = drx.b.fieldOf("state").xmap(drw.a::b, deu::n).xmap(eff::new, $$0 -> $$0.c);
   private final deu c;

   public eff(deu $$0) {
      this.c = $$0;
   }

   @Override
   protected eez<?> a() {
      return eez.f;
   }

   @Override
   public drx a(azc $$0, iz $$1) {
      je.a $$2 = je.a.a($$0);
      return this.c.n().a(dlg.i, $$2);
   }
}
