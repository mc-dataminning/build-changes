import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cvz(Map<String, String> d) {
   public static final cvz a = new cvz(Map.of());
   public static final Codec<cvz> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cvz::new, cvz::b);
   private static final yv<ByteBuf, Map<String, String>> e = yt.a(Object2ObjectOpenHashMap::new, yt.k, yt.k);
   public static final yv<ByteBuf, cvz> c = e.a(cvz::new, cvz::b);

   public <T extends Comparable<T>> cvz a(dse<T> $$0, T $$1) {
      return new cvz(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cvz a(dse<T> $$0, drb $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dse<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public drb a(drb $$0) {
      drc<ddy, drb> $$1 = $$0.b().m();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dse<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> drb a(drb $$0, dse<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
