import com.mojang.serialization.MapCodec;

public class epp extends epq {
   public static final MapCodec<epp> a = MapCodec.unit(() -> epp.b);
   public static final epp b = new epp();

   private epp() {
   }

   @Override
   public boolean a(jh $$0, jh $$1, jh $$2, azv $$3) {
      return true;
   }

   @Override
   protected epr<?> a() {
      return epr.a;
   }
}
