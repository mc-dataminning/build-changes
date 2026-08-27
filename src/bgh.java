import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bgh(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bgr> e, List<bgm> f, bgo.a g, bgq.a h, bgp i, bgp j, bgn.a k, bgn.a l, List<bgl> m
) {
   public List<Pair<djo, bgt<bgl>>> a() {
      Map<djo, List<bgl>> $$0 = this.m.stream().collect(Collectors.groupingBy(bgl::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((djo)$$0x.getKey(), bgt.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<djo, bgt<bgl>>, Duration>comparing($$0x -> ((bgt)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bgj().a(this);
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

   public List<bgr> g() {
      return this.e;
   }

   public List<bgm> h() {
      return this.f;
   }

   public bgo.a i() {
      return this.g;
   }

   public bgq.a j() {
      return this.h;
   }

   public bgp k() {
      return this.i;
   }

   public bgp l() {
      return this.j;
   }

   public bgn.a m() {
      return this.k;
   }

   public bgn.a n() {
      return this.l;
   }

   public List<bgl> o() {
      return this.m;
   }
}
