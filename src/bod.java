import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bod<T> {
   private final bod.a a;
   private final List<Pair<T, bod.a>> b;
   private final Duration c;

   public bod(Duration $$0, List<Pair<T, bod.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bod.a>map(Pair::getSecond).reduce(new bod.a(0L, 0L), bod.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bod.a.c)).limit(10L).toList();
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

   public List<Pair<T, bod.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bod.a> c = Comparator.comparing(bod.a::c).thenComparing(bod.a::b).reversed();

      bod.a a(bod.a $$0) {
         return new bod.a(this.a + $$0.a, this.b + $$0.b);
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
