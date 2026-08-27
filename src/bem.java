import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bem {
   private final bem.a a;
   private final List<Pair<bem.b, bem.a>> b;
   private final Duration c;

   public bem(Duration $$0, List<Pair<bem.b, bem.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bem.a>map(Pair::getSecond).reduce(bem.a::a).orElseGet(() -> new bem.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bem.a.c)).limit(10L).toList();
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

   public List<Pair<bem.b, bem.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bem.a> c = Comparator.comparing(bem.a::b).thenComparing(bem.a::a).reversed();

      bem.a a(bem.a $$0) {
         return new bem.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(ve a, String b, int c) {
      private static final Map<bem.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bem.b a(RecordedEvent $$0) {
         return new bem.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? ve.b : ve.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public ve b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bem.b, String> $$0 = ImmutableMap.builder();

         for (sn $$1 : sn.values()) {
            for (ve $$2 : ve.values()) {
               Int2ObjectMap<Class<? extends vd<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bem.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
