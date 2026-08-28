import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cwk(Map<String, String> d) {
   public static final cwk a = new cwk(Map.of());
   public static final Codec<cwk> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cwk::new, cwk::b);
   private static final ys<ByteBuf, Map<String, String>> e = yq.a(Object2ObjectOpenHashMap::new, yq.l, yq.l);
   public static final ys<ByteBuf, cwk> c = e.a(cwk::new, cwk::b);

   public <T extends Comparable<T>> cwk a(dtk<T> $$0, T $$1) {
      return new cwk(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cwk a(dtk<T> $$0, dsh $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dtk<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dsh a(dsh $$0) {
      dsi<dff, dsh> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dtk<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dsh a(dsh $$0, dtk<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
