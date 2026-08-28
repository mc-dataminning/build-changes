import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class boh<T> {
   private final boh.a a;
   private final List<Pair<T, boh.a>> b;
   private final Duration c;

   public boh(Duration $$0, List<Pair<T, boh.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<boh.a>map(Pair::getSecond).reduce(new boh.a(0L, 0L), boh.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, boh.a.c)).limit(10L).toList();
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

   public List<Pair<T, boh.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<boh.a> c = Comparator.comparing(boh.a::c).thenComparing(boh.a::b).reversed();

      boh.a a(boh.a $$0) {
         return new boh.a(this.a + $$0.a, this.b + $$0.b);
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
