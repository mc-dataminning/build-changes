import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bqu<T> {
   private final bqu.a a;
   private final List<Pair<T, bqu.a>> b;
   private final Duration c;

   public bqu(Duration $$0, List<Pair<T, bqu.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bqu.a>map(Pair::getSecond).reduce(new bqu.a(0L, 0L), bqu.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bqu.a.c)).limit(10L).toList();
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

   public List<Pair<T, bqu.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bqu.a> c = Comparator.comparing(bqu.a::c).thenComparing(bqu.a::b).reversed();

      bqu.a a(bqu.a $$0) {
         return new bqu.a(this.a + $$0.a, this.b + $$0.b);
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
