import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eun extends euu {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eun::new));

   private eun(int $$0, int $$1, List<exn> $$2, List<evq> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eut a() {
      return euq.b;
   }

   @Override
   public void a(Consumer<cwb> $$0, euc $$1) {
   }

   public static euu.a<?> b() {
      return a(eun::new);
   }
}
