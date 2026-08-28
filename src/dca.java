import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dca(Map<String, String> d) implements ddf {
   public static final dca a = new dca(Map.of());
   public static final Codec<dca> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(dca::new, dca::b);
   private static final za<ByteBuf, Map<String, String>> e = yy.a(Object2ObjectOpenHashMap::new, yy.p, yy.p);
   public static final za<ByteBuf, dca> c = e.a(dca::new, dca::b);

   public <T extends Comparable<T>> dca a(ecj<T> $$0, T $$1) {
      return new dca(ag.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> dca a(ecj<T> $$0, ebg $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(ecj<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public ebg a(ebg $$0) {
      ebh<dne, ebg> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         ecj<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> ebg a(ebg $$0, ecj<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      Integer $$4 = this.a(dmy.c);
      if ($$4 != null) {
         $$1.accept(xc.a("container.beehive.honey", $$4, 5).a(o.h));
      }
   }

   public Map<String, String> b() {
      return this.d;
   }
}
