import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diy extends dif {
   public static final MapCodec<diy> b = b(diy::new);

   @Override
   public MapCodec<diy> a() {
      return b;
   }

   protected diy(dmd.d $$0) {
      super(dgg.b.d, $$0);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      dix.a($$0, $$1);
   }
}
