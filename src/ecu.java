import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecu extends edb {
   public static final Codec<ecu> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ecu::new));

   private ecu(int $$0, int $$1, List<eff> $$2, List<edt> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eda a() {
      return ecx.b;
   }

   @Override
   public void a(Consumer<cix> $$0, ecg $$1) {
   }

   public static edb.a<?> b() {
      return a(ecu::new);
   }
}
