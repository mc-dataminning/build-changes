import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ejq extends ejx {
   public static final Codec<ejq> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ejq::new));

   private ejq(int $$0, int $$1, List<emb> $$2, List<ekp> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ejw a() {
      return ejt.b;
   }

   @Override
   public void a(Consumer<cpd> $$0, ejc $$1) {
   }

   public static ejx.a<?> b() {
      return a(ejq::new);
   }
}
