import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ekm extends ekt {
   public static final Codec<ekm> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ekm::new));

   private ekm(int $$0, int $$1, List<emx> $$2, List<ell> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eks a() {
      return ekp.b;
   }

   @Override
   public void a(Consumer<cpq> $$0, ejy $$1) {
   }

   public static ekt.a<?> b() {
      return a(ekm::new);
   }
}
