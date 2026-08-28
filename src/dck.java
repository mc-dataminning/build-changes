import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dck(Map<String, String> d) implements ddp {
   public static final dck a = new dck(Map.of());
   public static final Codec<dck> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(dck::new, dck::b);
   private static final ze<ByteBuf, Map<String, String>> e = zc.a(Object2ObjectOpenHashMap::new, zc.p, zc.p);
   public static final ze<ByteBuf, dck> c = e.a(dck::new, dck::b);

   public <T extends Comparable<T>> dck a(ect<T> $$0, T $$1) {
      return new dck(ag.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> dck a(ect<T> $$0, ebq $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(ect<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public ebq a(ebq $$0) {
      ebr<dno, ebq> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         ect<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> ebq a(ebq $$0, ect<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      Integer $$4 = this.a(dni.c);
      if ($$4 != null) {
         $$1.accept(xg.a("container.beehive.honey", $$4, 5).a(o.h));
      }
   }

   public Map<String, String> b() {
      return this.d;
   }
}
