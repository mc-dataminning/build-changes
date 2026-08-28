import com.mojang.serialization.MapCodec;

public class dnt extends dip {
   public static final MapCodec<dnt> c = b(dnt::new);
   public static final ewl g = dfa.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dnt> a() {
      return c;
   }

   public dnt(dsc.d $$0) {
      super($$0, je.b, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dkg.a($$0);
   }

   @Override
   protected dfa b() {
      return dfc.oC;
   }

   @Override
   protected boolean g(dsd $$0) {
      return dkg.a($$0);
   }
}
