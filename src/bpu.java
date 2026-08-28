import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bpu<T> {
   private final bpu.a a;
   private final List<Pair<T, bpu.a>> b;
   private final Duration c;

   public bpu(Duration $$0, List<Pair<T, bpu.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bpu.a>map(Pair::getSecond).reduce(new bpu.a(0L, 0L), bpu.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bpu.a.c)).limit(10L).toList();
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

   public List<Pair<T, bpu.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bpu.a> c = Comparator.comparing(bpu.a::c).thenComparing(bpu.a::b).reversed();

      bpu.a a(bpu.a $$0) {
         return new bpu.a(this.a + $$0.a, this.b + $$0.b);
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
