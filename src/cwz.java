import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cwz(Map<String, String> d) {
   public static final cwz a = new cwz(Map.of());
   public static final Codec<cwz> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cwz::new, cwz::b);
   private static final zm<ByteBuf, Map<String, String>> e = zk.a(Object2ObjectOpenHashMap::new, zk.l, zk.l);
   public static final zm<ByteBuf, cwz> c = e.a(cwz::new, cwz::b);

   public <T extends Comparable<T>> cwz a(dte<T> $$0, T $$1) {
      return new cwz(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cwz a(dte<T> $$0, dsb $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dte<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dsb a(dsb $$0) {
      dsc<dey, dsb> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dte<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dsb a(dsb $$0, dte<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
