import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efl extends efs {
   public static final Codec<efl> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, efl::new));

   private efl(int $$0, int $$1, List<ehw> $$2, List<egk> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public efr a() {
      return efo.b;
   }

   @Override
   public void a(Consumer<clj> $$0, eex $$1) {
   }

   public static efs.a<?> b() {
      return a(efl::new);
   }
}
