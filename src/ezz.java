import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezz extends fag {
   public static final MapCodec<ezz> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ezz::new));

   private ezz(int $$0, int $$1, List<fcx> $$2, List<fbc> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public faf a() {
      return fac.b;
   }

   @Override
   public void a(Consumer<czk> $$0, ezo $$1) {
   }

   public static fag.a<?> b() {
      return a(ezz::new);
   }
}
