import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcr extends dcd implements dde {
   public static final MapCodec<dcr> c = b(dcr::new);
   protected static final eol g = cyo.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dcr> a() {
      return c;
   }

   protected dcr(dle.d $$0) {
      super($$0, ie.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dlf $$0) {
      return $$0.a(cyq.G);
   }

   @Override
   protected cyo b() {
      return cyq.md;
   }

   @Override
   protected boolean m(dlf $$0) {
      return !$$0.a(cyq.kJ);
   }

   @Override
   public boolean a(@Nullable chh $$0, cut $$1, hz $$2, dlf $$3, ego $$4) {
      return false;
   }

   @Override
   public boolean a(cvo $$0, hz $$1, dlf $$2, egp $$3) {
      return false;
   }

   @Override
   protected int a(awo $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      return $$1.a(aue.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected egp c_(dlf $$0) {
      return egq.c.a(false);
   }
}
