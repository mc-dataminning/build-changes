import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class boc<T> {
   private final boc.a a;
   private final List<Pair<T, boc.a>> b;
   private final Duration c;

   public boc(Duration $$0, List<Pair<T, boc.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<boc.a>map(Pair::getSecond).reduce(new boc.a(0L, 0L), boc.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, boc.a.c)).limit(10L).toList();
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

   public List<Pair<T, boc.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<boc.a> c = Comparator.comparing(boc.a::c).thenComparing(boc.a::b).reversed();

      boc.a a(boc.a $$0) {
         return new boc.a(this.a + $$0.a, this.b + $$0.b);
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
