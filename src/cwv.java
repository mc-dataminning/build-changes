import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cwv(Map<String, String> d) {
   public static final cwv a = new cwv(Map.of());
   public static final Codec<cwv> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(cwv::new, cwv::b);
   private static final zj<ByteBuf, Map<String, String>> e = zh.a(Object2ObjectOpenHashMap::new, zh.l, zh.l);
   public static final zj<ByteBuf, cwv> c = e.a(cwv::new, cwv::b);

   public <T extends Comparable<T>> cwv a(dta<T> $$0, T $$1) {
      return new cwv(ac.a(this.d, $$0.f(), $$0.a($$1)));
   }

   public <T extends Comparable<T>> cwv a(dta<T> $$0, drx $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(dta<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public drx a(drx $$0) {
      dry<deu, drx> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         dta<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> drx a(drx $$0, dta<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   public Map<String, String> b() {
      return this.d;
   }
}
