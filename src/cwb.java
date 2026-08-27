import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cwb(Map<String, String> d) {
   public static final cwb a = new cwb(Map.of());
   public static final Codec<cwb> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cwb::new, cwb::b);
   private static final yv<ByteBuf, Map<String, String>> e = yt.a(Object2ObjectOpenHashMap::new, yt.k, yt.k);
   public static final yv<ByteBuf, cwb> c = e.a(cwb::new, cwb::b);

   public <T extends Comparable<T>> cwb a(dsg<T> $$0, T $$1) {
      return new cwb(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cwb a(dsg<T> $$0, drd $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dsg<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public drd a(drd $$0) {
      dre<dea, drd> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dsg<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> drd a(drd $$0, dsg<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
