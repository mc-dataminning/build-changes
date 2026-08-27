import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bdz(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bej> e, List<bee> f, beg.a g, bei.a h, beh i, beh j, bef.a k, bef.a l, List<bed> m
) {
   public List<Pair<dhf, bel<bed>>> a() {
      Map<dhf, List<bed>> $$0 = this.m.stream().collect(Collectors.groupingBy(bed::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dhf)$$0x.getKey(), bel.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dhf, bel<bed>>, Duration>comparing($$0x -> ((bel)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new beb().a(this);
   }

   public Instant c() {
      return this.a;
   }

   public Instant d() {
      return this.b;
   }

   public Duration e() {
      return this.c;
   }

   @Nullable
   public Duration f() {
      return this.d;
   }

   public List<bej> g() {
      return this.e;
   }

   public List<bee> h() {
      return this.f;
   }

   public beg.a i() {
      return this.g;
   }

   public bei.a j() {
      return this.h;
   }

   public beh k() {
      return this.i;
   }

   public beh l() {
      return this.j;
   }

   public bef.a m() {
      return this.k;
   }

   public bef.a n() {
      return this.l;
   }

   public List<bed> o() {
      return this.m;
   }
}
