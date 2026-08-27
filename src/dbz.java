import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dbz extends dfi {
   public static final MapCodec<dbz> b = b(dbz::new);

   @Override
   public MapCodec<dbz> a() {
      return b;
   }

   protected dbz(diz.d $$0) {
      super(ddk.b.e, $$0);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      cwl.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cmr> a(dja $$0, egv.a $$1) {
      return cwl.gK.a($$0, $$1);
   }
}
