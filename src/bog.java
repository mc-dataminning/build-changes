import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bog<T> {
   private final bog.a a;
   private final List<Pair<T, bog.a>> b;
   private final Duration c;

   public bog(Duration $$0, List<Pair<T, bog.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bog.a>map(Pair::getSecond).reduce(new bog.a(0L, 0L), bog.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bog.a.c)).limit(10L).toList();
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

   public List<Pair<T, bog.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bog.a> c = Comparator.comparing(bog.a::c).thenComparing(bog.a::b).reversed();

      bog.a a(bog.a $$0) {
         return new bog.a(this.a + $$0.a, this.b + $$0.b);
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
