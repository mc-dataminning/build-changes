import com.mojang.serialization.MapCodec;

public class ekv extends ekw {
   public static final MapCodec<ekv> a = MapCodec.unit(() -> ekv.b);
   public static final ekv b = new ekv();

   private ekv() {
   }

   @Override
   public boolean a(io $$0, io $$1, io $$2, ayk $$3) {
      return true;
   }

   @Override
   protected ekx<?> a() {
      return ekx.a;
   }
}
