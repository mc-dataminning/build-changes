import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esc extends esj {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, esc::new));

   private esc(int $$0, int $$1, List<evc> $$2, List<etf> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public esi a() {
      return esf.b;
   }

   @Override
   public void a(Consumer<cuq> $$0, err $$1) {
   }

   public static esj.a<?> b() {
      return a(esc::new);
   }
}
