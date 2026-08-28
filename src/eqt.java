import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqt extends era {
   public static final MapCodec<eqt> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eqt::new));

   private eqt(int $$0, int $$1, List<ets> $$2, List<erv> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eqz a() {
      return eqw.b;
   }

   @Override
   public void a(Consumer<cup> $$0, eqi $$1) {
   }

   public static era.a<?> b() {
      return a(eqt::new);
   }
}
