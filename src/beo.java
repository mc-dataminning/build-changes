import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class beo {
   private final beo.a a;
   private final List<Pair<beo.b, beo.a>> b;
   private final Duration c;

   public beo(Duration $$0, List<Pair<beo.b, beo.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<beo.a>map(Pair::getSecond).reduce(beo.a::a).orElseGet(() -> new beo.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, beo.a.c)).limit(10L).toList();
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

   public List<Pair<beo.b, beo.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<beo.a> c = Comparator.comparing(beo.a::b).thenComparing(beo.a::a).reversed();

      beo.a a(beo.a $$0) {
         return new beo.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(vg a, String b, int c) {
      private static final Map<beo.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static beo.b a(RecordedEvent $$0) {
         return new beo.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? vg.b : vg.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public vg b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<beo.b, String> $$0 = ImmutableMap.builder();

         for (sp $$1 : sp.values()) {
            for (vg $$2 : vg.values()) {
               Int2ObjectMap<Class<? extends vf<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new beo.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
