import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bpf<T> {
   private final bpf.a a;
   private final List<Pair<T, bpf.a>> b;
   private final Duration c;

   public bpf(Duration $$0, List<Pair<T, bpf.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bpf.a>map(Pair::getSecond).reduce(new bpf.a(0L, 0L), bpf.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bpf.a.c)).limit(10L).toList();
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

   public List<Pair<T, bpf.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bpf.a> c = Comparator.comparing(bpf.a::c).thenComparing(bpf.a::b).reversed();

      bpf.a a(bpf.a $$0) {
         return new bpf.a(this.a + $$0.a, this.b + $$0.b);
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
