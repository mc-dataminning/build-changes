import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class euh extends euo {
   public static final MapCodec<euh> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, euh::new));

   private euh(int $$0, int $$1, List<exh> $$2, List<evk> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eun a() {
      return euk.b;
   }

   @Override
   public void a(Consumer<cvx> $$0, etw $$1) {
   }

   public static euo.a<?> b() {
      return a(euh::new);
   }
}
