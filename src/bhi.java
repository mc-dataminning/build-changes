import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bhi(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bhs> e, List<bhn> f, bhp.a g, bhr.a h, bhq i, bhq j, bho.a k, bho.a l, List<bhm> m
) {
   public List<Pair<dlq, bhu<bhm>>> a() {
      Map<dlq, List<bhm>> $$0 = this.m.stream().collect(Collectors.groupingBy(bhm::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dlq)$$0x.getKey(), bhu.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dlq, bhu<bhm>>, Duration>comparing($$0x -> ((bhu)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bhk().a(this);
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

   public List<bhs> g() {
      return this.e;
   }

   public List<bhn> h() {
      return this.f;
   }

   public bhp.a i() {
      return this.g;
   }

   public bhr.a j() {
      return this.h;
   }

   public bhq k() {
      return this.i;
   }

   public bhq l() {
      return this.j;
   }

   public bho.a m() {
      return this.k;
   }

   public bho.a n() {
      return this.l;
   }

   public List<bhm> o() {
      return this.m;
   }
}
