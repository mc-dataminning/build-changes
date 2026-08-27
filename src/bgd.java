import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bgd(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bgn> e, List<bgi> f, bgk.a g, bgm.a h, bgl i, bgl j, bgj.a k, bgj.a l, List<bgh> m
) {
   public List<Pair<djj, bgp<bgh>>> a() {
      Map<djj, List<bgh>> $$0 = this.m.stream().collect(Collectors.groupingBy(bgh::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((djj)$$0x.getKey(), bgp.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<djj, bgp<bgh>>, Duration>comparing($$0x -> ((bgp)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bgf().a(this);
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

   public List<bgn> g() {
      return this.e;
   }

   public List<bgi> h() {
      return this.f;
   }

   public bgk.a i() {
      return this.g;
   }

   public bgm.a j() {
      return this.h;
   }

   public bgl k() {
      return this.i;
   }

   public bgl l() {
      return this.j;
   }

   public bgj.a m() {
      return this.k;
   }

   public bgj.a n() {
      return this.l;
   }

   public List<bgh> o() {
      return this.m;
   }
}
