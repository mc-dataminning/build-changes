import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bpj<T> {
   private final bpj.a a;
   private final List<Pair<T, bpj.a>> b;
   private final Duration c;

   public bpj(Duration $$0, List<Pair<T, bpj.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bpj.a>map(Pair::getSecond).reduce(new bpj.a(0L, 0L), bpj.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bpj.a.c)).limit(10L).toList();
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

   public List<Pair<T, bpj.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bpj.a> c = Comparator.comparing(bpj.a::c).thenComparing(bpj.a::b).reversed();

      bpj.a a(bpj.a $$0) {
         return new bpj.a(this.a + $$0.a, this.b + $$0.b);
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
