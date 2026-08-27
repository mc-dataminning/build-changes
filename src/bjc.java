import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bjc(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bjm> e, List<bjh> f, bjj.a g, bjl.a h, bjk i, bjk j, bji.a k, bji.a l, List<bjg> m
) {
   public List<Pair<dnk, bjo<bjg>>> a() {
      Map<dnk, List<bjg>> $$0 = this.m.stream().collect(Collectors.groupingBy(bjg::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dnk)$$0x.getKey(), bjo.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dnk, bjo<bjg>>, Duration>comparing($$0x -> ((bjo)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bje().a(this);
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

   public List<bjm> g() {
      return this.e;
   }

   public List<bjh> h() {
      return this.f;
   }

   public bjj.a i() {
      return this.g;
   }

   public bjl.a j() {
      return this.h;
   }

   public bjk k() {
      return this.i;
   }

   public bjk l() {
      return this.j;
   }

   public bji.a m() {
      return this.k;
   }

   public bji.a n() {
      return this.l;
   }

   public List<bjg> o() {
      return this.m;
   }
}
