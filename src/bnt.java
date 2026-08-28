import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bnt<T> {
   private final bnt.a a;
   private final List<Pair<T, bnt.a>> b;
   private final Duration c;

   public bnt(Duration $$0, List<Pair<T, bnt.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bnt.a>map(Pair::getSecond).reduce(new bnt.a(0L, 0L), bnt.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bnt.a.c)).limit(10L).toList();
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

   public List<Pair<T, bnt.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bnt.a> c = Comparator.comparing(bnt.a::c).thenComparing(bnt.a::b).reversed();

      bnt.a a(bnt.a $$0) {
         return new bnt.a(this.a + $$0.a, this.b + $$0.b);
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
