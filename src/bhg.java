import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bhg(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bhq> e, List<bhl> f, bhn.a g, bhp.a h, bho i, bho j, bhm.a k, bhm.a l, List<bhk> m
) {
   public List<Pair<dlh, bhs<bhk>>> a() {
      Map<dlh, List<bhk>> $$0 = this.m.stream().collect(Collectors.groupingBy(bhk::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dlh)$$0x.getKey(), bhs.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dlh, bhs<bhk>>, Duration>comparing($$0x -> ((bhs)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bhi().a(this);
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

   public List<bhq> g() {
      return this.e;
   }

   public List<bhl> h() {
      return this.f;
   }

   public bhn.a i() {
      return this.g;
   }

   public bhp.a j() {
      return this.h;
   }

   public bho k() {
      return this.i;
   }

   public bho l() {
      return this.j;
   }

   public bhm.a m() {
      return this.k;
   }

   public bhm.a n() {
      return this.l;
   }

   public List<bhk> o() {
      return this.m;
   }
}
