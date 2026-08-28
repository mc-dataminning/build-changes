import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record das(Map<String, String> d) implements dbx {
   public static final das a = new das(Map.of());
   public static final Codec<das> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(das::new, das::b);
   private static final yu<ByteBuf, Map<String, String>> e = ys.a(Object2ObjectOpenHashMap::new, ys.o, ys.o);
   public static final yu<ByteBuf, das> c = e.a(das::new, das::b);

   public <T extends Comparable<T>> das a(ear<T> $$0, T $$1) {
      return new das(af.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> das a(ear<T> $$0, dzo $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(ear<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public dzo a(dzo $$0) {
      dzp<dlu, dzo> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         ear<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> dzo a(dzo $$0, ear<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      Integer $$4 = this.a(dlo.c);
      if ($$4 != null) {
         $$1.accept(ww.a("container.beehive.honey", $$4, 5).a(n.h));
      }
   }

   public Map<String, String> b() {
      return this.d;
   }
}
