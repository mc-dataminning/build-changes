import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqo extends eqv {
   public static final MapCodec<eqo> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eqo::new));

   private eqo(int $$0, int $$1, List<etn> $$2, List<erq> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public equ a() {
      return eqr.b;
   }

   @Override
   public void a(Consumer<cuk> $$0, eqd $$1) {
   }

   public static eqv.a<?> b() {
      return a(eqo::new);
   }
}
