import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;

public record bpe(Instant a, long b, bpe.b c) {
   public static bpe a(RecordedEvent $$0) {
      return new bpe($$0.getStartTime(), $$0.getLong("heapUsed"), $$0.getString("when").equalsIgnoreCase("before gc") ? bpe.b.a : bpe.b.b);
   }

   public static bpe.a a(Duration $$0, List<bpe> $$1, Duration $$2, int $$3) {
      return new bpe.a($$0, $$2, $$3, a($$1));
   }

   private static double a(List<bpe> $$0) {
      long $$1 = 0L;
      Map<bpe.b, List<bpe>> $$2 = $$0.stream().collect(Collectors.groupingBy($$0x -> $$0x.c));
      List<bpe> $$3 = $$2.get(bpe.b.a);
      List<bpe> $$4 = $$2.get(bpe.b.b);

      for (int $$5 = 1; $$5 < $$3.size(); $$5++) {
         bpe $$6 = $$3.get($$5);
         bpe $$7 = $$4.get($$5 - 1);
         $$1 += $$6.b - $$7.b;
      }

      Duration $$8 = Duration.between($$0.get(1).a, $$0.get($$0.size() - 1).a);
      return (double)$$1 / (double)$$8.getSeconds();
   }

   public static record a(Duration a, Duration b, int c, double d) {
      public float a() {
         return (float)this.b.toMillis() / (float)this.a.toMillis();
      }

      public Duration b() {
         return this.a;
      }

      public Duration c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      public double e() {
         return this.d;
      }
   }

   static enum b {
      a,
      b;
   }
}
