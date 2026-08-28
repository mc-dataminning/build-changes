import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record czm(Map<String, String> d) {
   public static final czm a = new czm(Map.of());
   public static final Codec<czm> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(czm::new, czm::b);
   private static final zt<ByteBuf, Map<String, String>> e = zr.a(Object2ObjectOpenHashMap::new, zr.o, zr.o);
   public static final zt<ByteBuf, czm> c = e.a(czm::new, czm::b);

   public <T extends Comparable<T>> czm a(dyp<T> $$0, T $$1) {
      return new czm(ae.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> czm a(dyp<T> $$0, dxn $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dyp<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dxn a(dxn $$0) {
      dxo<dke, dxn> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dyp<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dxn a(dxn $$0, dyp<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
