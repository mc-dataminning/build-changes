import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bof<T> {
   private final bof.a a;
   private final List<Pair<T, bof.a>> b;
   private final Duration c;

   public bof(Duration $$0, List<Pair<T, bof.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bof.a>map(Pair::getSecond).reduce(new bof.a(0L, 0L), bof.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bof.a.c)).limit(10L).toList();
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

   public List<Pair<T, bof.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bof.a> c = Comparator.comparing(bof.a::c).thenComparing(bof.a::b).reversed();

      bof.a a(bof.a $$0) {
         return new bof.a(this.a + $$0.a, this.b + $$0.b);
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
