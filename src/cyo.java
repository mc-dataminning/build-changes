import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cyo(Map<String, String> d) {
   public static final cyo a = new cyo(Map.of());
   public static final Codec<cyo> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cyo::new, cyo::b);
   private static final zh<ByteBuf, Map<String, String>> e = zf.a(Object2ObjectOpenHashMap::new, zf.n, zf.n);
   public static final zh<ByteBuf, cyo> c = e.a(cyo::new, cyo::b);

   public <T extends Comparable<T>> cyo a(dwx<T> $$0, T $$1) {
      return new cyo(ae.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> cyo a(dwx<T> $$0, dvv $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dwx<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dvv a(dvv $$0) {
      dvw<diq, dvv> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dwx<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dvv a(dvv $$0, dwx<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
