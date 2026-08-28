import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cxz(Map<String, String> d) {
   public static final cxz a = new cxz(Map.of());
   public static final Codec<cxz> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cxz::new, cxz::b);
   private static final zf<ByteBuf, Map<String, String>> e = zd.a(Object2ObjectOpenHashMap::new, zd.m, zd.m);
   public static final zf<ByteBuf, cxz> c = e.a(cxz::new, cxz::b);

   public <T extends Comparable<T>> cxz a(dwg<T> $$0, T $$1) {
      return new cxz(ad.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cxz a(dwg<T> $$0, dvd $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dwg<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dvd a(dvd $$0) {
      dve<dhy, dvd> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dwg<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dvd a(dvd $$0, dwg<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
