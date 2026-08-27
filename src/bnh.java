import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bnh<T> {
   private final bnh.a a;
   private final List<Pair<T, bnh.a>> b;
   private final Duration c;

   public bnh(Duration $$0, List<Pair<T, bnh.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bnh.a>map(Pair::getSecond).reduce(new bnh.a(0L, 0L), bnh.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bnh.a.c)).limit(10L).toList();
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

   public List<Pair<T, bnh.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bnh.a> c = Comparator.comparing(bnh.a::c).thenComparing(bnh.a::b).reversed();

      bnh.a a(bnh.a $$0) {
         return new bnh.a(this.a + $$0.a, this.b + $$0.b);
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
