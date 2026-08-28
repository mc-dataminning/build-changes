import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends dny {
   public static final MapCodec<dor> b = b(dor::new);

   @Override
   public MapCodec<dor> a() {
      return b;
   }

   protected dor(drz.d $$0) {
      super(dlz.b.d, $$0);
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, @Nullable btn $$3, cun $$4) {
      doq.a($$0, $$1);
   }
}
