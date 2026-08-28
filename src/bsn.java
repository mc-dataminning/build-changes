import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bsn<T> {
   private final bsn.a a;
   private final List<Pair<T, bsn.a>> b;
   private final Duration c;

   public bsn(Duration $$0, List<Pair<T, bsn.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bsn.a>map(Pair::getSecond).reduce(new bsn.a(0L, 0L), bsn.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bsn.a.c)).limit(10L).toList();
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

   public List<Pair<T, bsn.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bsn.a> c = Comparator.comparing(bsn.a::c).thenComparing(bsn.a::b).reversed();

      bsn.a a(bsn.a $$0) {
         return new bsn.a(this.a + $$0.a, this.b + $$0.b);
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
