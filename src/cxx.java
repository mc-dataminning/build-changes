import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cxx(Map<String, String> d) {
   public static final cxx a = new cxx(Map.of());
   public static final Codec<cxx> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cxx::new, cxx::b);
   private static final zb<ByteBuf, Map<String, String>> e = yz.a(Object2ObjectOpenHashMap::new, yz.l, yz.l);
   public static final zb<ByteBuf, cxx> c = e.a(cxx::new, cxx::b);

   public <T extends Comparable<T>> cxx a(dvr<T> $$0, T $$1) {
      return new cxx(ad.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cxx a(dvr<T> $$0, duo $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dvr<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public duo a(duo $$0) {
      dup<dhj, duo> $$1 = $$0.b().n();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dvr<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> duo a(duo $$0, dvr<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
