import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efq extends efx {
   public static final Codec<efq> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, efq::new));

   private efq(int $$0, int $$1, List<eib> $$2, List<egp> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public efw a() {
      return eft.b;
   }

   @Override
   public void a(Consumer<clo> $$0, efc $$1) {
   }

   public static efx.a<?> b() {
      return a(efq::new);
   }
}
