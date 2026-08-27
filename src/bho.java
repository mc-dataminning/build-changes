import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bho {
   private final bho.a a;
   private final List<Pair<bho.b, bho.a>> b;
   private final Duration c;

   public bho(Duration $$0, List<Pair<bho.b, bho.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bho.a>map(Pair::getSecond).reduce(bho.a::a).orElseGet(() -> new bho.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bho.a.c)).limit(10L).toList();
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

   public List<Pair<bho.b, bho.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bho.a> c = Comparator.comparing(bho.a::b).thenComparing(bho.a::a).reversed();

      bho.a a(bho.a $$0) {
         return new bho.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(xg a, String b, int c) {
      private static final Map<bho.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bho.b a(RecordedEvent $$0) {
         return new bho.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? xg.b : xg.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public xg b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bho.b, String> $$0 = ImmutableMap.builder();

         for (uh $$1 : uh.values()) {
            for (xg $$2 : xg.values()) {
               Int2ObjectMap<Class<? extends xf<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bho.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
