import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bbk {
   private final bbk.a a;
   private final List<Pair<bbk.b, bbk.a>> b;
   private final Duration c;

   public bbk(Duration $$0, List<Pair<bbk.b, bbk.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bbk.a>map(Pair::getSecond).reduce(bbk.a::a).orElseGet(() -> new bbk.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bbk.a.c)).limit(10L).toList();
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

   public List<Pair<bbk.b, bbk.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bbk.a> c = Comparator.comparing(bbk.a::b).thenComparing(bbk.a::a).reversed();

      bbk.a a(bbk.a $$0) {
         return new bbk.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(up a, int b, int c) {
      private static final Map<bbk.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bbk.b a(RecordedEvent $$0) {
         return new bbk.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? up.b : up.a, $$0.getInt("protocolId"), $$0.getInt("packetId"));
      }

      public up b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bbk.b, String> $$0 = ImmutableMap.builder();

         for (se $$1 : se.values()) {
            for (up $$2 : up.values()) {
               Int2ObjectMap<Class<? extends uo<?>>> $$3 = $$1.b($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bbk.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
