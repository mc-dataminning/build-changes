import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class enp extends enw {
   public static final Codec<enp> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, enp::new));

   private enp(int $$0, int $$1, List<eqc> $$2, List<eop> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public env a() {
      return ens.b;
   }

   @Override
   public void a(Consumer<crj> $$0, enb $$1) {
   }

   public static enw.a<?> b() {
      return a(enp::new);
   }
}
