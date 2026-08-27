import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bnn<T> {
   private final bnn.a a;
   private final List<Pair<T, bnn.a>> b;
   private final Duration c;

   public bnn(Duration $$0, List<Pair<T, bnn.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bnn.a>map(Pair::getSecond).reduce(new bnn.a(0L, 0L), bnn.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bnn.a.c)).limit(10L).toList();
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

   public List<Pair<T, bnn.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bnn.a> c = Comparator.comparing(bnn.a::c).thenComparing(bnn.a::b).reversed();

      bnn.a a(bnn.a $$0) {
         return new bnn.a(this.a + $$0.a, this.b + $$0.b);
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
