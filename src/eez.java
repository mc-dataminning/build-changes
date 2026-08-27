import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eez extends efg {
   public static final Codec<eez> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eez::new));

   private eez(int $$0, int $$1, List<ehk> $$2, List<efy> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eff a() {
      return efc.b;
   }

   @Override
   public void a(Consumer<clb> $$0, eel $$1) {
   }

   public static efg.a<?> b() {
      return a(eez::new);
   }
}
