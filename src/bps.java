import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bps<T> {
   private final bps.a a;
   private final List<Pair<T, bps.a>> b;
   private final Duration c;

   public bps(Duration $$0, List<Pair<T, bps.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bps.a>map(Pair::getSecond).reduce(new bps.a(0L, 0L), bps.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bps.a.c)).limit(10L).toList();
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

   public List<Pair<T, bps.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bps.a> c = Comparator.comparing(bps.a::c).thenComparing(bps.a::b).reversed();

      bps.a a(bps.a $$0) {
         return new bps.a(this.a + $$0.a, this.b + $$0.b);
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
