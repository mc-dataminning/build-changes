import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fbe extends fbl {
   public static final MapCodec<fbe> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, fbe::new));

   private fbe(int $$0, int $$1, List<fec> $$2, List<fch> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public fbk a() {
      return fbh.b;
   }

   @Override
   public void a(Consumer<dak> $$0, fat $$1) {
   }

   public static fbl.a<?> b() {
      return a(fbe::new);
   }
}
