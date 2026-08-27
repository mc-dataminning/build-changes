import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bee {
   private final bee.a a;
   private final List<Pair<bee.b, bee.a>> b;
   private final Duration c;

   public bee(Duration $$0, List<Pair<bee.b, bee.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bee.a>map(Pair::getSecond).reduce(bee.a::a).orElseGet(() -> new bee.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bee.a.c)).limit(10L).toList();
   }

   public double a() {
      return (double)this.a.a / (double)this.c.getSeconds();
   }

   public double b() {
      return (double)this.a.b / (double)this.c.getSeconds();
   }

   public long c() {
      return this.a.a;
   }

   public long d() {
      return this.a.b;
   }

   public List<Pair<bee.b, bee.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bee.a> c = Comparator.comparing(bee.a::b).thenComparing(bee.a::a).reversed();

      bee.a a(bee.a $$0) {
         return new bee.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(uy a, String b, int c) {
      private static final Map<bee.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bee.b a(RecordedEvent $$0) {
         return new bee.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? uy.b : uy.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public uy b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bee.b, String> $$0 = ImmutableMap.builder();

         for (sh $$1 : sh.values()) {
            for (uy $$2 : uy.values()) {
               Int2ObjectMap<Class<? extends ux<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bee.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
