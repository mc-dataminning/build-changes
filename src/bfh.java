import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bfh(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bfr> e, List<bfm> f, bfo.a g, bfq.a h, bfp i, bfp j, bfn.a k, bfn.a l, List<bfl> m
) {
   public List<Pair<dic, bft<bfl>>> a() {
      Map<dic, List<bfl>> $$0 = this.m.stream().collect(Collectors.groupingBy(bfl::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dic)$$0x.getKey(), bft.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dic, bft<bfl>>, Duration>comparing($$0x -> ((bft)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bfj().a(this);
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

   public List<bfr> g() {
      return this.e;
   }

   public List<bfm> h() {
      return this.f;
   }

   public bfo.a i() {
      return this.g;
   }

   public bfq.a j() {
      return this.h;
   }

   public bfp k() {
      return this.i;
   }

   public bfp l() {
      return this.j;
   }

   public bfn.a m() {
      return this.k;
   }

   public bfn.a n() {
      return this.l;
   }

   public List<bfl> o() {
      return this.m;
   }
}
