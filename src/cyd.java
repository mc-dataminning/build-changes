import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cyd(Map<String, String> d) {
   public static final cyd a = new cyd(Map.of());
   public static final Codec<cyd> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cyd::new, cyd::b);
   private static final zg<ByteBuf, Map<String, String>> e = ze.a(Object2ObjectOpenHashMap::new, ze.m, ze.m);
   public static final zg<ByteBuf, cyd> c = e.a(cyd::new, cyd::b);

   public <T extends Comparable<T>> cyd a(dwm<T> $$0, T $$1) {
      return new cyd(ae.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> cyd a(dwm<T> $$0, dvj $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dwm<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dvj a(dvj $$0) {
      dvk<die, dvj> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dwm<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dvj a(dvj $$0, dwm<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
