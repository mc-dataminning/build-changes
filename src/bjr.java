import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bjr(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bkb> e, List<bjw> f, bjy.a g, bka.a h, bjz i, bjz j, bjx.a k, bjx.a l, List<bjv> m
) {
   public List<Pair<dof, bkd<bjv>>> a() {
      Map<dof, List<bjv>> $$0 = this.m.stream().collect(Collectors.groupingBy(bjv::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dof)$$0x.getKey(), bkd.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dof, bkd<bjv>>, Duration>comparing($$0x -> ((bkd)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bjt().a(this);
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

   public List<bkb> g() {
      return this.e;
   }

   public List<bjw> h() {
      return this.f;
   }

   public bjy.a i() {
      return this.g;
   }

   public bka.a j() {
      return this.h;
   }

   public bjz k() {
      return this.i;
   }

   public bjz l() {
      return this.j;
   }

   public bjx.a m() {
      return this.k;
   }

   public bjx.a n() {
      return this.l;
   }

   public List<bjv> o() {
      return this.m;
   }
}
