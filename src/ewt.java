import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewt extends exa {
   public static final MapCodec<ewt> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ewt::new));

   private ewt(int $$0, int $$1, List<ezr> $$2, List<exw> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ewz a() {
      return eww.b;
   }

   @Override
   public void a(Consumer<cxg> $$0, ewi $$1) {
   }

   public static exa.a<?> b() {
      return a(ewt::new);
   }
}
