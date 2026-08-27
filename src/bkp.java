import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bkp<T> {
   private final bkp.a a;
   private final List<Pair<T, bkp.a>> b;
   private final Duration c;

   public bkp(Duration $$0, List<Pair<T, bkp.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bkp.a>map(Pair::getSecond).reduce(new bkp.a(0L, 0L), bkp.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bkp.a.c)).limit(10L).toList();
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

   public List<Pair<T, bkp.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bkp.a> c = Comparator.comparing(bkp.a::c).thenComparing(bkp.a::b).reversed();

      bkp.a a(bkp.a $$0) {
         return new bkp.a(this.a + $$0.a, this.b + $$0.b);
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
