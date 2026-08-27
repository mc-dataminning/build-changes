import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cvi(Map<String, String> d) {
   public static final cvi a = new cvi(Map.of());
   public static final Codec<cvi> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cvi::new, cvi::b);
   private static final ys<ByteBuf, Map<String, String>> e = yq.a(Object2ObjectOpenHashMap::new, yq.k, yq.k);
   public static final ys<ByteBuf, cvi> c = e.a(cvi::new, cvi::b);

   public <T extends Comparable<T>> cvi a(drk<T> $$0, T $$1) {
      return new cvi(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cvi a(drk<T> $$0, dqh $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(drk<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dqh a(dqh $$0) {
      dqi<dde, dqh> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         drk<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dqh a(dqh $$0, drk<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
