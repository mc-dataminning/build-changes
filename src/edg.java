import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edg extends edn {
   public static final Codec<edg> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, edg::new));

   private edg(int $$0, int $$1, List<efr> $$2, List<eef> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public edm a() {
      return edj.b;
   }

   @Override
   public void a(Consumer<cjh> $$0, ecs $$1) {
   }

   public static edn.a<?> b() {
      return a(edg::new);
   }
}
