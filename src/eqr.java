import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqr extends eqy {
   public static final MapCodec<eqr> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eqr::new));

   private eqr(int $$0, int $$1, List<etq> $$2, List<ert> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eqx a() {
      return equ.b;
   }

   @Override
   public void a(Consumer<cun> $$0, eqg $$1) {
   }

   public static eqy.a<?> b() {
      return a(eqr::new);
   }
}
