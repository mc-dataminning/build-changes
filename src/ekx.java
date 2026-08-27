import com.mojang.serialization.MapCodec;

public class ekx extends eky {
   public static final MapCodec<ekx> a = MapCodec.unit(() -> ekx.b);
   public static final ekx b = new ekx();

   private ekx() {
   }

   @Override
   public boolean a(io $$0, io $$1, io $$2, aym $$3) {
      return true;
   }

   @Override
   protected ekz<?> a() {
      return ekz.a;
   }
}
