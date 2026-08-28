import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cyh(Map<String, String> d) {
   public static final cyh a = new cyh(Map.of());
   public static final Codec<cyh> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cyh::new, cyh::b);
   private static final zj<ByteBuf, Map<String, String>> e = zh.a(Object2ObjectOpenHashMap::new, zh.m, zh.m);
   public static final zj<ByteBuf, cyh> c = e.a(cyh::new, cyh::b);

   public <T extends Comparable<T>> cyh a(dwq<T> $$0, T $$1) {
      return new cyh(ae.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> cyh a(dwq<T> $$0, dvo $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dwq<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dvo a(dvo $$0) {
      dvp<dij, dvo> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dwq<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dvo a(dvo $$0, dwq<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
