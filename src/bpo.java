import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bpo<T> {
   private final bpo.a a;
   private final List<Pair<T, bpo.a>> b;
   private final Duration c;

   public bpo(Duration $$0, List<Pair<T, bpo.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bpo.a>map(Pair::getSecond).reduce(new bpo.a(0L, 0L), bpo.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bpo.a.c)).limit(10L).toList();
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

   public List<Pair<T, bpo.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bpo.a> c = Comparator.comparing(bpo.a::c).thenComparing(bpo.a::b).reversed();

      bpo.a a(bpo.a $$0) {
         return new bpo.a(this.a + $$0.a, this.b + $$0.b);
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
