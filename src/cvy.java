import com.mojang.serialization.MapCodec;

public class cvy extends cwa {
   public static final MapCodec<cvy> a = b(cvy::new);
   private static final emm b = cwq.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends cvy> a() {
      return a;
   }

   protected cvy(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }
}
