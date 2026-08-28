import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dql extends dud {
   public static final MapCodec<dql> b = b(dql::new);
   private static final Map<jo, fdo> e = fdl.c(dku.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dql> a() {
      return b;
   }

   public dql(dyl.d $$0) {
      super(dsc.b.h, $$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e.get($$0.c(d));
   }
}
