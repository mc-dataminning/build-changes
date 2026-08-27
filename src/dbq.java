import com.mojang.serialization.MapCodec;

public class dbq extends dbr {
   public static final MapCodec<dbq> a = b(dbq::new);
   protected static final float b = 6.0F;
   protected static final etc c = dch.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   protected dbq(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }
}
