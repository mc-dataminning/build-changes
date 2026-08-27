import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bfp {
   private final bfp.a a;
   private final List<Pair<bfp.b, bfp.a>> b;
   private final Duration c;

   public bfp(Duration $$0, List<Pair<bfp.b, bfp.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bfp.a>map(Pair::getSecond).reduce(bfp.a::a).orElseGet(() -> new bfp.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bfp.a.c)).limit(10L).toList();
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

   public List<Pair<bfp.b, bfp.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bfp.a> c = Comparator.comparing(bfp.a::b).thenComparing(bfp.a::a).reversed();

      bfp.a a(bfp.a $$0) {
         return new bfp.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(wc a, String b, int c) {
      private static final Map<bfp.b, String> d;

      public String a() {
         return d.getOrDefault(this, "unknown");
      }

      public static bfp.b a(RecordedEvent $$0) {
         return new bfp.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? wc.b : wc.a, $$0.getString("protocolId"), $$0.getInt("packetId"));
      }

      public wc b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<bfp.b, String> $$0 = ImmutableMap.builder();

         for (tk $$1 : tk.values()) {
            for (wc $$2 : wc.values()) {
               Int2ObjectMap<Class<? extends wb<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new bfp.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
