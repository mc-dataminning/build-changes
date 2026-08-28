import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cyr(Map<String, String> d) {
   public static final cyr a = new cyr(Map.of());
   public static final Codec<cyr> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cyr::new, cyr::b);
   private static final ym<ByteBuf, Map<String, String>> e = yk.a(Object2ObjectOpenHashMap::new, yk.o, yk.o);
   public static final ym<ByteBuf, cyr> c = e.a(cyr::new, cyr::b);

   public <T extends Comparable<T>> cyr a(dxz<T> $$0, T $$1) {
      return new cyr(af.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> cyr a(dxz<T> $$0, dwx $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dxz<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dwx a(dwx $$0) {
      dwy<djm, dwx> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dxz<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dwx a(dwx $$0, dxz<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
