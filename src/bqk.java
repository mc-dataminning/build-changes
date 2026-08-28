import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bqk<T> {
   private final bqk.a a;
   private final List<Pair<T, bqk.a>> b;
   private final Duration c;

   public bqk(Duration $$0, List<Pair<T, bqk.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bqk.a>map(Pair::getSecond).reduce(new bqk.a(0L, 0L), bqk.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bqk.a.c)).limit(10L).toList();
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

   public List<Pair<T, bqk.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bqk.a> c = Comparator.comparing(bqk.a::c).thenComparing(bqk.a::b).reversed();

      bqk.a a(bqk.a $$0) {
         return new bqk.a(this.a + $$0.a, this.b + $$0.b);
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
