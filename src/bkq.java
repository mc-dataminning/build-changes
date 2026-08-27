import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bkq<T> {
   private final bkq.a a;
   private final List<Pair<T, bkq.a>> b;
   private final Duration c;

   public bkq(Duration $$0, List<Pair<T, bkq.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bkq.a>map(Pair::getSecond).reduce(new bkq.a(0L, 0L), bkq.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bkq.a.c)).limit(10L).toList();
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

   public List<Pair<T, bkq.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bkq.a> c = Comparator.comparing(bkq.a::c).thenComparing(bkq.a::b).reversed();

      bkq.a a(bkq.a $$0) {
         return new bkq.a(this.a + $$0.a, this.b + $$0.b);
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
