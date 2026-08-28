import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cxd(Map<String, String> d) {
   public static final cxd a = new cxd(Map.of());
   public static final Codec<cxd> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cxd::new, cxd::b);
   private static final yx<ByteBuf, Map<String, String>> e = yv.a(Object2ObjectOpenHashMap::new, yv.l, yv.l);
   public static final yx<ByteBuf, cxd> c = e.a(cxd::new, cxd::b);

   public <T extends Comparable<T>> cxd a(duf<T> $$0, T $$1) {
      return new cxd(ad.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cxd a(duf<T> $$0, dtc $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(duf<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dtc a(dtc $$0) {
      dtd<dfy, dtc> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         duf<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dtc a(dtc $$0, duf<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
