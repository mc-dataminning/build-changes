import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehj extends ehq {
   public static final Codec<ehj> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ehj::new));

   private ehj(int $$0, int $$1, List<eju> $$2, List<eii> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ehp a() {
      return ehm.b;
   }

   @Override
   public void a(Consumer<cmx> $$0, egv $$1) {
   }

   public static ehq.a<?> b() {
      return a(ehj::new);
   }
}
