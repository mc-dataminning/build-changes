import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqz extends erg {
   public static final MapCodec<eqz> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eqz::new));

   private eqz(int $$0, int $$1, List<etz> $$2, List<esc> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public erf a() {
      return erc.b;
   }

   @Override
   public void a(Consumer<cua> $$0, eqo $$1) {
   }

   public static erg.a<?> b() {
      return a(eqz::new);
   }
}
