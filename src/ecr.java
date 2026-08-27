import com.mojang.serialization.Codec;

public class ecr extends ecs {
   public static final Codec<ecr> a = Codec.unit(() -> ecr.b);
   public static final ecr b = new ecr();

   private ecr() {
   }

   @Override
   public boolean a(hx $$0, hx $$1, hx $$2, auu $$3) {
      return true;
   }

   @Override
   protected ect<?> a() {
      return ect.a;
   }
}
