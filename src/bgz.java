import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bgz {
   private final bgz.a a;
   private final List<Pair<bgz.b, bgz.a>> b;
   private final Duration c;

   public bgz(Duration $$0, List<Pair<bgz.b, bgz.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bgz.a>map(Pair::getSecond).reduce(bgz.a::a).orElseGet(() -> new bgz.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bgz.a.c)).limit(10L).toList();
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

   public List<Pair<bgz.b, bgz.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bgz.a> c = Comparator.comparing(bgz.a::b).thenComparing(bgz.a::a).reversed();

      bgz.a a(bgz.a $$0) {
         return new bgz.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(wv a, String b, int c) {
      private static final Map<bgz.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bgz.b a(RecordedEvent $$0) {
         return new bgz.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? wv.b : wv.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public wv b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bgz.b, String> $$0 = ImmutableMap.builder();

         for (ud $$1 : ud.values()) {
            for (wv $$2 : wv.values()) {
               Int2ObjectMap<Class<? extends wu<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bgz.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
