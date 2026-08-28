import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class brr<T> {
   private final brr.a a;
   private final List<Pair<T, brr.a>> b;
   private final Duration c;

   public brr(Duration $$0, List<Pair<T, brr.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<brr.a>map(Pair::getSecond).reduce(new brr.a(0L, 0L), brr.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, brr.a.c)).limit(10L).toList();
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

   public List<Pair<T, brr.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<brr.a> c = Comparator.comparing(brr.a::c).thenComparing(brr.a::b).reversed();

      brr.a a(brr.a $$0) {
         return new brr.a(this.a + $$0.a, this.b + $$0.b);
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
