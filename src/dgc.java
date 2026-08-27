import com.mojang.serialization.MapCodec;

public class dgc extends daf {
   public static final MapCodec<dgc> c = b(dgc::new);
   protected static final emm g = cwq.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dgc> a() {
      return c;
   }

   public dgc(djg.d $$0) {
      super($$0, ic.a, g, false, 0.1);
   }

   @Override
   protected int a(auv $$0) {
      return dbv.a($$0);
   }

   @Override
   protected cwq b() {
      return cws.oA;
   }

   @Override
   protected boolean g(djh $$0) {
      return dbv.a($$0);
   }
}
