import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class daq extends ddy {
   public static final MapCodec<daq> b = b(daq::new);

   @Override
   public MapCodec<daq> a() {
      return b;
   }

   protected daq(dhh.d $$0) {
      super(dcb.b.e, $$0);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      cvc.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<clj> a(dhi $$0, efd.a $$1) {
      return cvc.gK.a($$0, $$1);
   }
}
