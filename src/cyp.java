import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cyp(Map<String, String> d) {
   public static final cyp a = new cyp(Map.of());
   public static final Codec<cyp> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cyp::new, cyp::b);
   private static final ym<ByteBuf, Map<String, String>> e = yk.a(Object2ObjectOpenHashMap::new, yk.o, yk.o);
   public static final ym<ByteBuf, cyp> c = e.a(cyp::new, cyp::b);

   public <T extends Comparable<T>> cyp a(dxx<T> $$0, T $$1) {
      return new cyp(af.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> cyp a(dxx<T> $$0, dwv $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dxx<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dwv a(dwv $$0) {
      dww<djk, dwv> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dxx<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dwv a(dwv $$0, dxx<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
