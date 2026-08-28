import com.mojang.serialization.MapCodec;
import java.util.List;

class ecp extends ecs {
   public static final MapCodec<ecp> a = a(ecp::new);

   public ecp(List<ecq> $$0) {
      super($$0);
   }

   public boolean a(dgd $$0, jh $$1) {
      for (ecq $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ecr<?> a() {
      return ecr.i;
   }
}
