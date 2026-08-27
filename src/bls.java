import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bls<T> {
   private final bls.a a;
   private final List<Pair<T, bls.a>> b;
   private final Duration c;

   public bls(Duration $$0, List<Pair<T, bls.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bls.a>map(Pair::getSecond).reduce(new bls.a(0L, 0L), bls.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bls.a.c)).limit(10L).toList();
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

   public List<Pair<T, bls.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bls.a> c = Comparator.comparing(bls.a::c).thenComparing(bls.a::b).reversed();

      bls.a a(bls.a $$0) {
         return new bls.a(this.a + $$0.a, this.b + $$0.b);
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
