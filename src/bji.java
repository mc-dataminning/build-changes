import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import jdk.jfr.consumer.RecordedEvent;

public final class bji {
   private final bji.a a;
   private final List<Pair<bji.b, bji.a>> b;
   private final Duration c;

   public bji(Duration $$0, List<Pair<bji.b, bji.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bji.a>map(Pair::getSecond).reduce(bji.a::a).orElseGet(() -> new bji.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bji.a.c)).limit(10L).toList();
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

   public List<Pair<bji.b, bji.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bji.a> c = Comparator.comparing(bji.a::b).thenComparing(bji.a::a).reversed();

      bji.a a(bji.a $$0) {
         return new bji.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(String a, String b, String c) {
      public static bji.b a(RecordedEvent $$0) {
         return new bji.b($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
      }
   }
}
