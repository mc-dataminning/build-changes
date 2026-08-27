import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class beb {
   private final beb.a a;
   private final List<Pair<beb.b, beb.a>> b;
   private final Duration c;

   public beb(Duration $$0, List<Pair<beb.b, beb.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<beb.a>map(Pair::getSecond).reduce(beb.a::a).orElseGet(() -> new beb.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, beb.a.c)).limit(10L).toList();
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

   public List<Pair<beb.b, beb.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<beb.a> c = Comparator.comparing(beb.a::b).thenComparing(beb.a::a).reversed();

      beb.a a(beb.a $$0) {
         return new beb.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(ux a, String b, int c) {
      private static final Map<beb.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static beb.b a(RecordedEvent $$0) {
         return new beb.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? ux.b : ux.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public ux b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<beb.b, String> $$0 = ImmutableMap.builder();

         for (sg $$1 : sg.values()) {
            for (ux $$2 : ux.values()) {
               Int2ObjectMap<Class<? extends uw<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new beb.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
