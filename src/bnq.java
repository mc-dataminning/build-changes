import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bnq<T> {
   private final bnq.a a;
   private final List<Pair<T, bnq.a>> b;
   private final Duration c;

   public bnq(Duration $$0, List<Pair<T, bnq.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bnq.a>map(Pair::getSecond).reduce(new bnq.a(0L, 0L), bnq.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bnq.a.c)).limit(10L).toList();
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

   public List<Pair<T, bnq.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bnq.a> c = Comparator.comparing(bnq.a::c).thenComparing(bnq.a::b).reversed();

      bnq.a a(bnq.a $$0) {
         return new bnq.a(this.a + $$0.a, this.b + $$0.b);
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
