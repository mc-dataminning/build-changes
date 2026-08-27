import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bes {
   private final bes.a a;
   private final List<Pair<bes.b, bes.a>> b;
   private final Duration c;

   public bes(Duration $$0, List<Pair<bes.b, bes.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bes.a>map(Pair::getSecond).reduce(bes.a::a).orElseGet(() -> new bes.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bes.a.c)).limit(10L).toList();
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

   public List<Pair<bes.b, bes.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bes.a> c = Comparator.comparing(bes.a::b).thenComparing(bes.a::a).reversed();

      bes.a a(bes.a $$0) {
         return new bes.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(vf a, String b, int c) {
      private static final Map<bes.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bes.b a(RecordedEvent $$0) {
         return new bes.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? vf.b : vf.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public vf b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bes.b, String> $$0 = ImmutableMap.builder();

         for (sn $$1 : sn.values()) {
            for (vf $$2 : vf.values()) {
               Int2ObjectMap<Class<? extends ve<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bes.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
