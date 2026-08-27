import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dav extends ded {
   public static final MapCodec<dav> b = b(dav::new);

   @Override
   public MapCodec<dav> a() {
      return b;
   }

   protected dav(dhm.d $$0) {
      super(dcg.b.e, $$0);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      cvh.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<clo> a(dhn $$0, efi.a $$1) {
      return cvh.gK.a($$0, $$1);
   }
}
