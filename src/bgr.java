import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bgr(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bhb> e, List<bgw> f, bgy.a g, bha.a h, bgz i, bgz j, bgx.a k, bgx.a l, List<bgv> m
) {
   public List<Pair<dkq, bhd<bgv>>> a() {
      Map<dkq, List<bgv>> $$0 = this.m.stream().collect(Collectors.groupingBy(bgv::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dkq)$$0x.getKey(), bhd.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dkq, bhd<bgv>>, Duration>comparing($$0x -> ((bhd)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bgt().a(this);
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

   public List<bhb> g() {
      return this.e;
   }

   public List<bgw> h() {
      return this.f;
   }

   public bgy.a i() {
      return this.g;
   }

   public bha.a j() {
      return this.h;
   }

   public bgz k() {
      return this.i;
   }

   public bgz l() {
      return this.j;
   }

   public bgx.a m() {
      return this.k;
   }

   public bgx.a n() {
      return this.l;
   }

   public List<bgv> o() {
      return this.m;
   }
}
