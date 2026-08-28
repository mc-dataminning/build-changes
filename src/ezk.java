import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezk extends ezr {
   public static final MapCodec<ezk> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ezk::new));

   private ezk(int $$0, int $$1, List<fci> $$2, List<fan> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ezq a() {
      return ezn.b;
   }

   @Override
   public void a(Consumer<cyy> $$0, eyz $$1) {
   }

   public static ezr.a<?> b() {
      return a(ezk::new);
   }
}
