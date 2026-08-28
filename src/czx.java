import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record czx(Map<String, String> d) {
   public static final czx a = new czx(Map.of());
   public static final Codec<czx> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(czx::new, czx::b);
   private static final yt<ByteBuf, Map<String, String>> e = yr.a(Object2ObjectOpenHashMap::new, yr.o, yr.o);
   public static final yt<ByteBuf, czx> c = e.a(czx::new, czx::b);

   public <T extends Comparable<T>> czx a(dzp<T> $$0, T $$1) {
      return new czx(af.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> czx a(dzp<T> $$0, dym $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dzp<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dym a(dym $$0) {
      dyn<dku, dym> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dzp<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dym a(dym $$0, dzp<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
