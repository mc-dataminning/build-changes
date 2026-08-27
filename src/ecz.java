import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecz extends edg {
   public static final Codec<ecz> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ecz::new));

   private ecz(int $$0, int $$1, List<efk> $$2, List<edy> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public edf a() {
      return edc.b;
   }

   @Override
   public void a(Consumer<cja> $$0, ecl $$1) {
   }

   public static edg.a<?> b() {
      return a(ecz::new);
   }
}
