import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewz extends exg {
   public static final MapCodec<ewz> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ewz::new));

   private ewz(int $$0, int $$1, List<ezx> $$2, List<eyc> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public exf a() {
      return exc.b;
   }

   @Override
   public void a(Consumer<cxo> $$0, ewo $$1) {
   }

   public static exg.a<?> b() {
      return a(ewz::new);
   }
}
