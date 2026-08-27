import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import jdk.jfr.consumer.RecordedEvent;

public final class bjk {
   private final bjk.a a;
   private final List<Pair<bjk.b, bjk.a>> b;
   private final Duration c;

   public bjk(Duration $$0, List<Pair<bjk.b, bjk.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bjk.a>map(Pair::getSecond).reduce(bjk.a::a).orElseGet(() -> new bjk.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bjk.a.c)).limit(10L).toList();
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

   public List<Pair<bjk.b, bjk.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bjk.a> c = Comparator.comparing(bjk.a::b).thenComparing(bjk.a::a).reversed();

      bjk.a a(bjk.a $$0) {
         return new bjk.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(String a, String b, String c) {
      public static bjk.b a(RecordedEvent $$0) {
         return new bjk.b($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
      }
   }
}
