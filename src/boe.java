import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class boe<T> {
   private final boe.a a;
   private final List<Pair<T, boe.a>> b;
   private final Duration c;

   public boe(Duration $$0, List<Pair<T, boe.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<boe.a>map(Pair::getSecond).reduce(new boe.a(0L, 0L), boe.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, boe.a.c)).limit(10L).toList();
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

   public List<Pair<T, boe.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<boe.a> c = Comparator.comparing(boe.a::c).thenComparing(boe.a::b).reversed();

      boe.a a(boe.a $$0) {
         return new boe.a(this.a + $$0.a, this.b + $$0.b);
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
