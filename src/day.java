import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record day(Map<String, String> d) implements dcd {
   public static final day a = new day(Map.of());
   public static final Codec<day> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(day::new, day::b);
   private static final yw<ByteBuf, Map<String, String>> e = yu.a(Object2ObjectOpenHashMap::new, yu.o, yu.o);
   public static final yw<ByteBuf, day> c = e.a(day::new, day::b);

   public <T extends Comparable<T>> day a(ebc<T> $$0, T $$1) {
      return new day(af.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> day a(ebc<T> $$0, dzz $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(ebc<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dzz a(dzz $$0) {
      eaa<dma, dzz> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         ebc<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dzz a(dzz $$0, ebc<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      Integer $$4 = this.a(dlu.c);
      if ($$4 != null) {
         $$1.accept(wy.a("container.beehive.honey", $$4, 5).a(n.h));
      }
   }

   public Map<String, String> b() {
      return this.d;
   }
}
