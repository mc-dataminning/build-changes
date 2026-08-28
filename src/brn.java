import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class brn<T> {
   private final brn.a a;
   private final List<Pair<T, brn.a>> b;
   private final Duration c;

   public brn(Duration $$0, List<Pair<T, brn.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<brn.a>map(Pair::getSecond).reduce(new brn.a(0L, 0L), brn.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, brn.a.c)).limit(10L).toList();
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

   public List<Pair<T, brn.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<brn.a> c = Comparator.comparing(brn.a::c).thenComparing(brn.a::b).reversed();

      brn.a a(brn.a $$0) {
         return new brn.a(this.a + $$0.a, this.b + $$0.b);
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
