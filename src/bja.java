import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bja(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bjk> e, List<bjf> f, bjh.a g, bjj.a h, bji i, bji j, bjg.a k, bjg.a l, List<bje> m
) {
   public List<Pair<dng, bjm<bje>>> a() {
      Map<dng, List<bje>> $$0 = this.m.stream().collect(Collectors.groupingBy(bje::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dng)$$0x.getKey(), bjm.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dng, bjm<bje>>, Duration>comparing($$0x -> ((bjm)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bjc().a(this);
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

   public List<bjk> g() {
      return this.e;
   }

   public List<bjf> h() {
      return this.f;
   }

   public bjh.a i() {
      return this.g;
   }

   public bjj.a j() {
      return this.h;
   }

   public bji k() {
      return this.i;
   }

   public bji l() {
      return this.j;
   }

   public bjg.a m() {
      return this.k;
   }

   public bjg.a n() {
      return this.l;
   }

   public List<bje> o() {
      return this.m;
   }
}
