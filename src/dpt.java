import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpt extends dpa {
   public static final MapCodec<dpt> b = b(dpt::new);

   @Override
   public MapCodec<dpt> a() {
      return b;
   }

   protected dpt(dtb.d $$0) {
      super(dnb.b.d, $$0);
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, @Nullable btn $$3, cuq $$4) {
      dps.a($$0, $$1);
   }
}
