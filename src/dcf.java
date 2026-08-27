import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dcf extends dfo {
   public static final MapCodec<dcf> b = b(dcf::new);

   @Override
   public MapCodec<dcf> a() {
      return b;
   }

   protected dcf(djf.d $$0) {
      super(ddq.b.e, $$0);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      cwr.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cmx> a(djg $$0, ehb.a $$1) {
      return cwr.gK.a($$0, $$1);
   }
}
