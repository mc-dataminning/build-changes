import com.mojang.serialization.MapCodec;

public class epl extends epm {
   public static final MapCodec<epl> a = MapCodec.unit(() -> epl.b);
   public static final epl b = new epl();

   private epl() {
   }

   @Override
   public boolean a(jh $$0, jh $$1, jh $$2, azs $$3) {
      return true;
   }

   @Override
   protected epn<?> a() {
      return epn.a;
   }
}
