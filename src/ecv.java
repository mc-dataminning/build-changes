import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecv extends edc {
   public static final Codec<ecv> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ecv::new));

   private ecv(int $$0, int $$1, List<efg> $$2, List<edu> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public edb a() {
      return ecy.b;
   }

   @Override
   public void a(Consumer<ciy> $$0, ech $$1) {
   }

   public static edc.a<?> b() {
      return a(ecv::new);
   }
}
