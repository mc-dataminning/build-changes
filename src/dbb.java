import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbb extends dan implements dbo {
   public static final MapCodec<dbb> c = b(dbb::new);
   protected static final emv g = cwy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dbb> a() {
      return c;
   }

   protected dbb(djo.d $$0) {
      super($$0, ic.b, g, true, 0.14);
   }

   @Override
   protected boolean g(djp $$0) {
      return $$0.a(cxa.G);
   }

   @Override
   protected cwy b() {
      return cxa.md;
   }

   @Override
   protected boolean h(djp $$0) {
      return !$$0.a(cxa.kJ);
   }

   @Override
   public boolean a(@Nullable cfq $$0, ctd $$1, hx $$2, djp $$3, eey $$4) {
      return false;
   }

   @Override
   public boolean a(cty $$0, hx $$1, djp $$2, eez $$3) {
      return false;
   }

   @Override
   protected int a(auw $$0) {
      return 1;
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      return $$1.a(asn.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public eez c_(djp $$0) {
      return efa.c.a(false);
   }
}
