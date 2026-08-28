import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record czi(Map<String, String> d) {
   public static final czi a = new czi(Map.of());
   public static final Codec<czi> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(czi::new, czi::b);
   private static final zi<ByteBuf, Map<String, String>> e = zg.a(Object2ObjectOpenHashMap::new, zg.o, zg.o);
   public static final zi<ByteBuf, czi> c = e.a(czi::new, czi::b);

   public <T extends Comparable<T>> czi a(dyq<T> $$0, T $$1) {
      return new czi(ae.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> czi a(dyq<T> $$0, dxo $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dyq<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dxo a(dxo $$0) {
      dxp<dkd, dxo> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dyq<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dxo a(dxo $$0, dyq<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
