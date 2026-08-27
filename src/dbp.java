import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dbp extends dey {
   public static final MapCodec<dbp> b = b(dbp::new);

   @Override
   public MapCodec<dbp> a() {
      return b;
   }

   protected dbp(dio.d $$0) {
      super(dda.b.e, $$0);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      cwb.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cmh> a(dip $$0, egk.a $$1) {
      return cwb.gK.a($$0, $$1);
   }
}
