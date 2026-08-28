import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class euy extends evf {
   public static final MapCodec<euy> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, euy::new));

   private euy(int $$0, int $$1, List<exy> $$2, List<ewb> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eve a() {
      return evb.b;
   }

   @Override
   public void a(Consumer<cwm> $$0, eun $$1) {
   }

   public static evf.a<?> b() {
      return a(euy::new);
   }
}
