import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bhh(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bhr> e, List<bhm> f, bho.a g, bhq.a h, bhp i, bhp j, bhn.a k, bhn.a l, List<bhl> m
) {
   public List<Pair<dli, bht<bhl>>> a() {
      Map<dli, List<bhl>> $$0 = this.m.stream().collect(Collectors.groupingBy(bhl::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dli)$$0x.getKey(), bht.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dli, bht<bhl>>, Duration>comparing($$0x -> ((bht)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bhj().a(this);
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

   public List<bhr> g() {
      return this.e;
   }

   public List<bhm> h() {
      return this.f;
   }

   public bho.a i() {
      return this.g;
   }

   public bhq.a j() {
      return this.h;
   }

   public bhp k() {
      return this.i;
   }

   public bhp l() {
      return this.j;
   }

   public bhn.a m() {
      return this.k;
   }

   public bhn.a n() {
      return this.l;
   }

   public List<bhl> o() {
      return this.m;
   }
}
