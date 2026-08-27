import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecy extends edf {
   public static final Codec<ecy> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ecy::new));

   private ecy(int $$0, int $$1, List<efj> $$2, List<edx> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ede a() {
      return edb.b;
   }

   @Override
   public void a(Consumer<cjl> $$0, eck $$1) {
   }

   public static edf.a<?> b() {
      return a(ecy::new);
   }
}
