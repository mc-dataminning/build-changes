import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class bpc<T> {
   private final bpc.a a;
   private final List<Pair<T, bpc.a>> b;
   private final Duration c;

   public bpc(Duration $$0, List<Pair<T, bpc.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<bpc.a>map(Pair::getSecond).reduce(new bpc.a(0L, 0L), bpc.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bpc.a.c)).limit(10L).toList();
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

   public List<Pair<T, bpc.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      static final Comparator<bpc.a> c = Comparator.comparing(bpc.a::c).thenComparing(bpc.a::b).reversed();

      bpc.a a(bpc.a $$0) {
         return new bpc.a(this.a + $$0.a, this.b + $$0.b);
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
