import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bgp {
   private final bgp.a a;
   private final List<Pair<bgp.b, bgp.a>> b;
   private final Duration c;

   public bgp(Duration $$0, List<Pair<bgp.b, bgp.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bgp.a>map(Pair::getSecond).reduce(bgp.a::a).orElseGet(() -> new bgp.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bgp.a.c)).limit(10L).toList();
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

   public List<Pair<bgp.b, bgp.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bgp.a> c = Comparator.comparing(bgp.a::b).thenComparing(bgp.a::a).reversed();

      bgp.a a(bgp.a $$0) {
         return new bgp.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(wp a, String b, int c) {
      private static final Map<bgp.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bgp.b a(RecordedEvent $$0) {
         return new bgp.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? wp.b : wp.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public wp b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bgp.b, String> $$0 = ImmutableMap.builder();

         for (tx $$1 : tx.values()) {
            for (wp $$2 : wp.values()) {
               Int2ObjectMap<Class<? extends wo<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bgp.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
