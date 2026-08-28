import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bpt<T> {
   private final bpt.a a;
   private final List<Pair<T, bpt.a>> b;
   private final Duration c;

   public bpt(Duration $$0, List<Pair<T, bpt.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bpt.a>map(Pair::getSecond).reduce(new bpt.a(0L, 0L), bpt.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bpt.a.c)).limit(10L).toList();
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

   public List<Pair<T, bpt.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bpt.a> c = Comparator.comparing(bpt.a::c).thenComparing(bpt.a::b).reversed();

      bpt.a a(bpt.a $$0) {
         return new bpt.a(this.a + $$0.a, this.b + $$0.b);
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
