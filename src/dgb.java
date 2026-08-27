import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgb extends dfn implements dgo {
   public static final MapCodec<dgb> c = b(dgb::new);
   protected static final est g = dby.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dgb> a() {
      return c;
   }

   protected dgb(doy.d $$0) {
      super($$0, ih.b, g, true, 0.14);
   }

   @Override
   protected boolean g(doz $$0) {
      return $$0.a(dca.G);
   }

   @Override
   protected dby b() {
      return dca.md;
   }

   @Override
   protected boolean m(doz $$0) {
      return !$$0.a(dca.kJ);
   }

   @Override
   public boolean a(@Nullable cjt $$0, cyd $$1, ib $$2, doz $$3, ekr $$4) {
      return false;
   }

   @Override
   public boolean a(cyy $$0, ib $$1, doz $$2, eks $$3) {
      return false;
   }

   @Override
   protected int a(axr $$0) {
      return 1;
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      return $$1.a(avh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eks c_(doz $$0) {
      return ekt.c.a(false);
   }
}
