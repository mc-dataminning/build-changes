import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class beh {
   private final beh.a a;
   private final List<Pair<beh.b, beh.a>> b;
   private final Duration c;

   public beh(Duration $$0, List<Pair<beh.b, beh.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<beh.a>map(Pair::getSecond).reduce(beh.a::a).orElseGet(() -> new beh.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, beh.a.c)).limit(10L).toList();
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

   public List<Pair<beh.b, beh.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<beh.a> c = Comparator.comparing(beh.a::b).thenComparing(beh.a::a).reversed();

      beh.a a(beh.a $$0) {
         return new beh.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(vb a, String b, int c) {
      private static final Map<beh.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static beh.b a(RecordedEvent $$0) {
         return new beh.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? vb.b : vb.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public vb b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<beh.b, String> $$0 = ImmutableMap.builder();

         for (sk $$1 : sk.values()) {
            for (vb $$2 : vb.values()) {
               Int2ObjectMap<Class<? extends va<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new beh.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
