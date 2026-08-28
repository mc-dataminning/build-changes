import com.mojang.serialization.MapCodec;

public class dse extends dme {
   public static final MapCodec<dse> c = b(dse::new);
   protected static final fas g = diq.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dse> a() {
      return c;
   }

   public dse(dvu.d $$0) {
      super($$0, jm.a, g, false, 0.1);
   }

   @Override
   protected int a(azu $$0) {
      return dnv.a($$0);
   }

   @Override
   protected diq b() {
      return dis.oA;
   }

   @Override
   protected boolean h(dvv $$0) {
      return dnv.a($$0);
   }
}
