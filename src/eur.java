import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eur extends euy {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eur::new));

   private eur(int $$0, int $$1, List<exr> $$2, List<evu> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eux a() {
      return euu.b;
   }

   @Override
   public void a(Consumer<cwf> $$0, eug $$1) {
   }

   public static euy.a<?> b() {
      return a(eur::new);
   }
}
