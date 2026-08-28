import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cys(Map<String, String> d) {
   public static final cys a = new cys(Map.of());
   public static final Codec<cys> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cys::new, cys::b);
   private static final yn<ByteBuf, Map<String, String>> e = yl.a(Object2ObjectOpenHashMap::new, yl.o, yl.o);
   public static final yn<ByteBuf, cys> c = e.a(cys::new, cys::b);

   public <T extends Comparable<T>> cys a(dya<T> $$0, T $$1) {
      return new cys(af.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> cys a(dya<T> $$0, dwy $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dya<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dwy a(dwy $$0) {
      dwz<djn, dwy> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dya<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dwy a(dwy $$0, dya<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
