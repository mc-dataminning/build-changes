import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bqp<T> {
   private final bqp.a a;
   private final List<Pair<T, bqp.a>> b;
   private final Duration c;

   public bqp(Duration $$0, List<Pair<T, bqp.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bqp.a>map(Pair::getSecond).reduce(new bqp.a(0L, 0L), bqp.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bqp.a.c)).limit(10L).toList();
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

   public List<Pair<T, bqp.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bqp.a> c = Comparator.comparing(bqp.a::c).thenComparing(bqp.a::b).reversed();

      bqp.a a(bqp.a $$0) {
         return new bqp.a(this.a + $$0.a, this.b + $$0.b);
      }

      public float a() {
         return (float)this.b / (float)this.a;
      }

      public long b() {
         return this.a;
      }

      public long c() {
         return this.b;
      }
   }
}
