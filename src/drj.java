import com.mojang.serialization.MapCodec;

public class drj extends dme {
   public static final MapCodec<drj> c = b(drj::new);
   public static final fas g = diq.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<drj> a() {
      return c;
   }

   public drj(dvu.d $$0) {
      super($$0, jm.b, g, false, 0.1);
   }

   @Override
   protected int a(azu $$0) {
      return dnv.a($$0);
   }

   @Override
   protected diq b() {
      return dis.oC;
   }

   @Override
   protected boolean h(dvv $$0) {
      return dnv.a($$0);
   }
}
