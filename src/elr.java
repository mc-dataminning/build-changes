import com.mojang.serialization.MapCodec;

public class elr extends els {
   public static final MapCodec<elr> a = MapCodec.unit(() -> elr.b);
   public static final elr b = new elr();

   private elr() {
   }

   @Override
   public boolean a(iz $$0, iz $$1, iz $$2, azc $$3) {
      return true;
   }

   @Override
   protected elt<?> a() {
      return elt.a;
   }
}
