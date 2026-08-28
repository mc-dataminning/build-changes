import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqv extends erc {
   public static final MapCodec<eqv> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eqv::new));

   private eqv(int $$0, int $$1, List<etu> $$2, List<erx> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public erb a() {
      return eqy.b;
   }

   @Override
   public void a(Consumer<cur> $$0, eqk $$1) {
   }

   public static erc.a<?> b() {
      return a(eqv::new);
   }
}
