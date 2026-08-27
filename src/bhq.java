import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bhq {
   private final bhq.a a;
   private final List<Pair<bhq.b, bhq.a>> b;
   private final Duration c;

   public bhq(Duration $$0, List<Pair<bhq.b, bhq.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bhq.a>map(Pair::getSecond).reduce(bhq.a::a).orElseGet(() -> new bhq.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bhq.a.c)).limit(10L).toList();
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

   public List<Pair<bhq.b, bhq.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bhq.a> c = Comparator.comparing(bhq.a::b).thenComparing(bhq.a::a).reversed();

      bhq.a a(bhq.a $$0) {
         return new bhq.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(xh a, String b, int c) {
      private static final Map<bhq.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bhq.b a(RecordedEvent $$0) {
         return new bhq.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? xh.b : xh.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public xh b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bhq.b, String> $$0 = ImmutableMap.builder();

         for (ui $$1 : ui.values()) {
            for (xh $$2 : xh.values()) {
               Int2ObjectMap<Class<? extends xg<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bhq.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
