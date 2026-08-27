import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bhj {
   private final bhj.a a;
   private final List<Pair<bhj.b, bhj.a>> b;
   private final Duration c;

   public bhj(Duration $$0, List<Pair<bhj.b, bhj.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bhj.a>map(Pair::getSecond).reduce(bhj.a::a).orElseGet(() -> new bhj.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bhj.a.c)).limit(10L).toList();
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

   public List<Pair<bhj.b, bhj.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bhj.a> c = Comparator.comparing(bhj.a::b).thenComparing(bhj.a::a).reversed();

      bhj.a a(bhj.a $$0) {
         return new bhj.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(xe a, String b, int c) {
      private static final Map<bhj.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bhj.b a(RecordedEvent $$0) {
         return new bhj.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? xe.b : xe.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public xe b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bhj.b, String> $$0 = ImmutableMap.builder();

         for (uf $$1 : uf.values()) {
            for (xe $$2 : xe.values()) {
               Int2ObjectMap<Class<? extends xd<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bhj.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
