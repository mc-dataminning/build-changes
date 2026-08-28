import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqs extends eqz {
   public static final MapCodec<eqs> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eqs::new));

   private eqs(int $$0, int $$1, List<etr> $$2, List<eru> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eqy a() {
      return eqv.b;
   }

   @Override
   public void a(Consumer<cuo> $$0, eqh $$1) {
   }

   public static eqz.a<?> b() {
      return a(eqs::new);
   }
}
