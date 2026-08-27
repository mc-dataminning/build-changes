import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record ctz(Map<String, String> d) {
   public static final ctz a = new ctz(Map.of());
   public static final Codec<ctz> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(ctz::new, ctz::b);
   private static final yg<ByteBuf, Map<String, String>> e = ye.a(Object2ObjectOpenHashMap::new, ye.k, ye.k);
   public static final yg<ByteBuf, ctz> c = e.a(ctz::new, ctz::b);

   public <T extends Comparable<T>> ctz a(dql<T> $$0, T $$1) {
      return new ctz(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> ctz a(dql<T> $$0, dpi $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dql<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dpi a(dpi $$0) {
      dpj<dch, dpi> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dql<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dpi a(dpi $$0, dql<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
