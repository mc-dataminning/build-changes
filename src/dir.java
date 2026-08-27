import com.mojang.serialization.MapCodec;

public class dir extends dcq {
   public static final MapCodec<dir> a = b(dir::new);
   protected static final float b = 6.0F;
   protected static final etc c = dch.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   protected dir(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(ave.aL) || $$0.a(dcj.dX) || super.b($$0, $$1, $$2);
   }
}
