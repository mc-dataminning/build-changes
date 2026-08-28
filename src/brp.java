import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class brp<T> {
   private final brp.a a;
   private final List<Pair<T, brp.a>> b;
   private final Duration c;

   public brp(Duration $$0, List<Pair<T, brp.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<brp.a>map(Pair::getSecond).reduce(new brp.a(0L, 0L), brp.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, brp.a.c)).limit(10L).toList();
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

   public List<Pair<T, brp.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<brp.a> c = Comparator.comparing(brp.a::c).thenComparing(brp.a::b).reversed();

      brp.a a(brp.a $$0) {
         return new brp.a(this.a + $$0.a, this.b + $$0.b);
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
