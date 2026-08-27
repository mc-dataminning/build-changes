import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dik extends dhr {
   public static final MapCodec<dik> b = b(dik::new);

   @Override
   public MapCodec<dik> a() {
      return b;
   }

   protected dik(dli.d $$0) {
      super(dft.b.d, $$0);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      dij.a($$0, $$1);
   }
}
