import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record czh(Map<String, String> d) {
   public static final czh a = new czh(Map.of());
   public static final Codec<czh> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(czh::new, czh::b);
   private static final yn<ByteBuf, Map<String, String>> e = yl.a(Object2ObjectOpenHashMap::new, yl.o, yl.o);
   public static final yn<ByteBuf, czh> c = e.a(czh::new, czh::b);

   public <T extends Comparable<T>> czh a(dyt<T> $$0, T $$1) {
      return new czh(af.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> czh a(dyt<T> $$0, dxq $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dyt<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dxq a(dxq $$0) {
      dxr<dke, dxq> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dyt<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dxq a(dxq $$0, dyt<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
