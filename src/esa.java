import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esa extends esh {
   public static final Codec<esa> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, esa::new));

   private esa(int $$0, int $$1, List<euu> $$2, List<etb> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public esg a() {
      return esd.b;
   }

   @Override
   public void a(Consumer<cuh> $$0, erp $$1) {
   }

   public static esh.a<?> b() {
      return a(esa::new);
   }
}
