import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cyr extends dby {
   public static final MapCodec<cyr> b = b(cyr::new);

   @Override
   public MapCodec<cyr> a() {
      return b;
   }

   protected cyr(dfc.d $$0) {
      super(dac.b.e, $$0);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      cte.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cjl> a(dfd $$0, ecq.a $$1) {
      return cte.gK.a($$0, $$1);
   }
}
