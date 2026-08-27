import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import jdk.jfr.consumer.RecordedEvent;

public final class bjz {
   private final bjz.a a;
   private final List<Pair<bjz.b, bjz.a>> b;
   private final Duration c;

   public bjz(Duration $$0, List<Pair<bjz.b, bjz.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bjz.a>map(Pair::getSecond).reduce(bjz.a::a).orElseGet(() -> new bjz.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bjz.a.c)).limit(10L).toList();
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

   public List<Pair<bjz.b, bjz.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bjz.a> c = Comparator.comparing(bjz.a::b).thenComparing(bjz.a::a).reversed();

      bjz.a a(bjz.a $$0) {
         return new bjz.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(String a, String b, String c) {
      public static bjz.b a(RecordedEvent $$0) {
         return new bjz.b($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
      }
   }
}
