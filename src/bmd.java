import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bmd<T> {
   private final bmd.a a;
   private final List<Pair<T, bmd.a>> b;
   private final Duration c;

   public bmd(Duration $$0, List<Pair<T, bmd.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bmd.a>map(Pair::getSecond).reduce(new bmd.a(0L, 0L), bmd.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bmd.a.c)).limit(10L).toList();
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

   public List<Pair<T, bmd.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bmd.a> c = Comparator.comparing(bmd.a::c).thenComparing(bmd.a::b).reversed();

      bmd.a a(bmd.a $$0) {
         return new bmd.a(this.a + $$0.a, this.b + $$0.b);
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
