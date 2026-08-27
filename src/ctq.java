import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record ctq(Map<String, String> d) {
   public static final ctq a = new ctq(Map.of());
   public static final Codec<ctq> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(ctq::new, ctq::b);
   private static final ye<ByteBuf, Map<String, String>> e = yc.a(Object2ObjectOpenHashMap::new, yc.k, yc.k);
   public static final ye<ByteBuf, ctq> c = e.a(ctq::new, ctq::b);

   public <T extends Comparable<T>> ctq a(dqc<T> $$0, T $$1) {
      return new ctq(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> ctq a(dqc<T> $$0, doz $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dqc<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public doz a(doz $$0) {
      dpa<dby, doz> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dqc<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> doz a(doz $$0, dqc<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
