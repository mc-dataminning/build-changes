import com.mojang.serialization.MapCodec;
import java.util.List;

class eco extends ecs {
   public static final MapCodec<eco> a = a(eco::new);

   public eco(List<ecq> $$0) {
      super($$0);
   }

   public boolean a(dgd $$0, jh $$1) {
      for (ecq $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ecr<?> a() {
      return ecr.j;
   }
}
