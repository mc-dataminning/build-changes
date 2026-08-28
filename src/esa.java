import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esa extends esh {
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, esa::new));

   private esa(int $$0, int $$1, List<eva> $$2, List<etd> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public esg a() {
      return esd.b;
   }

   @Override
   public void a(Consumer<cuq> $$0, erp $$1) {
   }

   public static esh.a<?> b() {
      return a(esa::new);
   }
}
