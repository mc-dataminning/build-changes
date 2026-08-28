import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ets extends etz {
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ets::new));

   private ets(int $$0, int $$1, List<ews> $$2, List<euv> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ety a() {
      return etv.b;
   }

   @Override
   public void a(Consumer<cvp> $$0, eth $$1) {
   }

   public static etz.a<?> b() {
      return a(ets::new);
   }
}
