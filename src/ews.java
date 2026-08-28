import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ews extends ewz {
   public static final MapCodec<ews> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ews::new));

   private ews(int $$0, int $$1, List<ezs> $$2, List<exv> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ewy a() {
      return ewv.b;
   }

   @Override
   public void a(Consumer<cxk> $$0, ewh $$1) {
   }

   public static ewz.a<?> b() {
      return a(ews::new);
   }
}
