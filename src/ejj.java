import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ejj extends ejq {
   public static final Codec<ejj> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ejj::new));

   private ejj(int $$0, int $$1, List<elu> $$2, List<eki> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ejp a() {
      return ejm.b;
   }

   @Override
   public void a(Consumer<coz> $$0, eiv $$1) {
   }

   public static ejq.a<?> b() {
      return a(ejj::new);
   }
}
