import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eht extends eia {
   public static final Codec<eht> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eht::new));

   private eht(int $$0, int $$1, List<eke> $$2, List<eis> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ehz a() {
      return ehw.b;
   }

   @Override
   public void a(Consumer<cng> $$0, ehf $$1) {
   }

   public static eia.a<?> b() {
      return a(eht::new);
   }
}
