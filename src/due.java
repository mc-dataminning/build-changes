import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class due extends dps {
   private static final Map<jc.a, fgw> b = fgt.b(dno.a(4.0, 4.0, 16.0));

   protected due(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends due> a();

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
