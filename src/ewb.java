import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewb extends ewi {
   public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ewb::new));

   private ewb(int $$0, int $$1, List<eyz> $$2, List<exe> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ewh a() {
      return ewe.b;
   }

   @Override
   public void a(Consumer<cwo> $$0, evq $$1) {
   }

   public static ewi.a<?> b() {
      return a(ewb::new);
   }
}
