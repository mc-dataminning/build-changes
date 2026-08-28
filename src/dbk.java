import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dbk(Map<String, String> d) implements dcp {
   public static final dbk a = new dbk(Map.of());
   public static final Codec<dbk> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(dbk::new, dbk::b);
   private static final yw<ByteBuf, Map<String, String>> e = yu.a(Object2ObjectOpenHashMap::new, yu.p, yu.p);
   public static final yw<ByteBuf, dbk> c = e.a(dbk::new, dbk::b);

   public <T extends Comparable<T>> dbk a(ebr<T> $$0, T $$1) {
      return new dbk(ag.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> dbk a(ebr<T> $$0, eao $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(ebr<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public eao a(eao $$0) {
      eap<dmm, eao> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         ebr<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> eao a(eao $$0, ebr<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      Integer $$4 = this.a(dmg.c);
      if ($$4 != null) {
         $$1.accept(wy.a("container.beehive.honey", $$4, 5).a(o.h));
      }
   }

   public Map<String, String> b() {
      return this.d;
   }
}
