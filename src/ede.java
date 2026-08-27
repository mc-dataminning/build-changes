import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ede extends edl {
   public static final Codec<ede> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ede::new));

   private ede(int $$0, int $$1, List<efp> $$2, List<eed> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public edk a() {
      return edh.b;
   }

   @Override
   public void a(Consumer<cjf> $$0, ecq $$1) {
   }

   public static edl.a<?> b() {
      return a(ede::new);
   }
}
