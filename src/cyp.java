import com.mojang.serialization.MapCodec;

public class cyp extends cwz {
   public static final MapCodec<cyp> a = b(cyp::new);
   protected static final float b = 6.0F;
   protected static final emm c = cwq.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<cyp> a() {
      return a;
   }

   protected cyp(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(ash.cd);
   }
}
