import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cxb(Map<String, String> d) {
   public static final cxb a = new cxb(Map.of());
   public static final Codec<cxb> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cxb::new, cxb::b);
   private static final yw<ByteBuf, Map<String, String>> e = yu.a(Object2ObjectOpenHashMap::new, yu.l, yu.l);
   public static final yw<ByteBuf, cxb> c = e.a(cxb::new, cxb::b);

   public <T extends Comparable<T>> cxb a(dud<T> $$0, T $$1) {
      return new cxb(ad.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cxb a(dud<T> $$0, dta $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dud<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dta a(dta $$0) {
      dtb<dfw, dta> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dud<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dta a(dta $$0, dud<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
