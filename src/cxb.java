import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cxb(Map<String, String> d) {
   public static final cxb a = new cxb(Map.of());
   public static final Codec<cxb> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cxb::new, cxb::b);
   private static final zn<ByteBuf, Map<String, String>> e = zl.a(Object2ObjectOpenHashMap::new, zl.l, zl.l);
   public static final zn<ByteBuf, cxb> c = e.a(cxb::new, cxb::b);

   public <T extends Comparable<T>> cxb a(dtg<T> $$0, T $$1) {
      return new cxb(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cxb a(dtg<T> $$0, dsd $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dtg<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dsd a(dsd $$0) {
      dse<dfa, dsd> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dtg<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dsd a(dsd $$0, dtg<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
