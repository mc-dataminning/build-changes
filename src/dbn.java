import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dbn(Map<String, String> d) implements dcs {
   public static final dbn a = new dbn(Map.of());
   public static final Codec<dbn> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(dbn::new, dbn::b);
   private static final yw<ByteBuf, Map<String, String>> e = yu.a(Object2ObjectOpenHashMap::new, yu.p, yu.p);
   public static final yw<ByteBuf, dbn> c = e.a(dbn::new, dbn::b);

   public <T extends Comparable<T>> dbn a(ebw<T> $$0, T $$1) {
      return new dbn(ag.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> dbn a(ebw<T> $$0, eat $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(ebw<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public eat a(eat $$0) {
      eau<dmr, eat> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         ebw<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> eat a(eat $$0, ebw<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      Integer $$4 = this.a(dml.c);
      if ($$4 != null) {
         $$1.accept(wy.a("container.beehive.honey", $$4, 5).a(o.h));
      }
   }

   public Map<String, String> b() {
      return this.d;
   }
}
