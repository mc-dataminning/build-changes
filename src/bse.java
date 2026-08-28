import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bse<T> {
   private final bse.a a;
   private final List<Pair<T, bse.a>> b;
   private final Duration c;

   public bse(Duration $$0, List<Pair<T, bse.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bse.a>map(Pair::getSecond).reduce(new bse.a(0L, 0L), bse.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bse.a.c)).limit(10L).toList();
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

   public List<Pair<T, bse.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bse.a> c = Comparator.comparing(bse.a::c).thenComparing(bse.a::b).reversed();

      bse.a a(bse.a $$0) {
         return new bse.a(this.a + $$0.a, this.b + $$0.b);
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
