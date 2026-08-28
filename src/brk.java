import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class brk<T> {
   private final brk.a a;
   private final List<Pair<T, brk.a>> b;
   private final Duration c;

   public brk(Duration $$0, List<Pair<T, brk.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<brk.a>map(Pair::getSecond).reduce(new brk.a(0L, 0L), brk.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, brk.a.c)).limit(10L).toList();
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

   public List<Pair<T, brk.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<brk.a> c = Comparator.comparing(brk.a::c).thenComparing(brk.a::b).reversed();

      brk.a a(brk.a $$0) {
         return new brk.a(this.a + $$0.a, this.b + $$0.b);
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
