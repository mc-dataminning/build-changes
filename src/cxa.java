import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cxa(Map<String, String> d) {
   public static final cxa a = new cxa(Map.of());
   public static final Codec<cxa> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cxa::new, cxa::b);
   private static final zn<ByteBuf, Map<String, String>> e = zl.a(Object2ObjectOpenHashMap::new, zl.l, zl.l);
   public static final zn<ByteBuf, cxa> c = e.a(cxa::new, cxa::b);

   public <T extends Comparable<T>> cxa a(dtf<T> $$0, T $$1) {
      return new cxa(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cxa a(dtf<T> $$0, dsc $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dtf<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dsc a(dsc $$0) {
      dsd<dez, dsc> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dtf<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dsc a(dsc $$0, dtf<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
