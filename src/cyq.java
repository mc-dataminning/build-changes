import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cyq(Map<String, String> d) {
   public static final cyq a = new cyq(Map.of());
   public static final Codec<cyq> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cyq::new, cyq::b);
   private static final yn<ByteBuf, Map<String, String>> e = yl.a(Object2ObjectOpenHashMap::new, yl.o, yl.o);
   public static final yn<ByteBuf, cyq> c = e.a(cyq::new, cyq::b);

   public <T extends Comparable<T>> cyq a(dxy<T> $$0, T $$1) {
      return new cyq(af.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> cyq a(dxy<T> $$0, dww $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dxy<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dww a(dww $$0) {
      dwx<djl, dww> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dxy<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dww a(dww $$0, dxy<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
