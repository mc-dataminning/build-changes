import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dby(Map<String, String> d) implements ddd {
   public static final dby a = new dby(Map.of());
   public static final Codec<dby> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(dby::new, dby::b);
   private static final yy<ByteBuf, Map<String, String>> e = yw.a(Object2ObjectOpenHashMap::new, yw.p, yw.p);
   public static final yy<ByteBuf, dby> c = e.a(dby::new, dby::b);

   public <T extends Comparable<T>> dby a(ech<T> $$0, T $$1) {
      return new dby(ag.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> dby a(ech<T> $$0, ebe $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(ech<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public ebe a(ebe $$0) {
      ebf<dnc, ebe> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         ech<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> ebe a(ebe $$0, ech<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      Integer $$4 = this.a(dmw.c);
      if ($$4 != null) {
         $$1.accept(xa.a("container.beehive.honey", $$4, 5).a(o.h));
      }
   }

   public Map<String, String> b() {
      return this.d;
   }
}
