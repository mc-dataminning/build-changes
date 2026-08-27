import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bgl {
   private final bgl.a a;
   private final List<Pair<bgl.b, bgl.a>> b;
   private final Duration c;

   public bgl(Duration $$0, List<Pair<bgl.b, bgl.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bgl.a>map(Pair::getSecond).reduce(bgl.a::a).orElseGet(() -> new bgl.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bgl.a.c)).limit(10L).toList();
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

   public List<Pair<bgl.b, bgl.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bgl.a> c = Comparator.comparing(bgl.a::b).thenComparing(bgl.a::a).reversed();

      bgl.a a(bgl.a $$0) {
         return new bgl.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(wl a, String b, int c) {
      private static final Map<bgl.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bgl.b a(RecordedEvent $$0) {
         return new bgl.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? wl.b : wl.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public wl b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bgl.b, String> $$0 = ImmutableMap.builder();

         for (tt $$1 : tt.values()) {
            for (wl $$2 : wl.values()) {
               Int2ObjectMap<Class<? extends wk<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bgl.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
