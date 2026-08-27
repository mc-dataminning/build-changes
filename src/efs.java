import com.mojang.serialization.Codec;

public class efs extends eft {
   public static final Codec<efs> a = Codec.unit(() -> efs.b);
   public static final efs b = new efs();

   private efs() {
   }

   @Override
   public boolean a(ib $$0, ib $$1, ib $$2, awt $$3) {
      return true;
   }

   @Override
   protected efu<?> a() {
      return efu.a;
   }
}
