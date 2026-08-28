import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fae extends fal {
   public static final MapCodec<fae> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, fae::new));

   private fae(int $$0, int $$1, List<fdc> $$2, List<fbh> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public fak a() {
      return fah.b;
   }

   @Override
   public void a(Consumer<czn> $$0, ezt $$1) {
   }

   public static fal.a<?> b() {
      return a(fae::new);
   }
}
