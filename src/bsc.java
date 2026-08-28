import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bsc<T> {
   private final bsc.a a;
   private final List<Pair<T, bsc.a>> b;
   private final Duration c;

   public bsc(Duration $$0, List<Pair<T, bsc.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bsc.a>map(Pair::getSecond).reduce(new bsc.a(0L, 0L), bsc.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bsc.a.c)).limit(10L).toList();
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

   public List<Pair<T, bsc.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bsc.a> c = Comparator.comparing(bsc.a::c).thenComparing(bsc.a::b).reversed();

      bsc.a a(bsc.a $$0) {
         return new bsc.a(this.a + $$0.a, this.b + $$0.b);
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
