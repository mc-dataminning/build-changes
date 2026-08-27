import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bek(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<beu> e, List<bep> f, ber.a g, bet.a h, bes i, bes j, beq.a k, beq.a l, List<beo> m
) {
   public List<Pair<dhe, bew<beo>>> a() {
      Map<dhe, List<beo>> $$0 = this.m.stream().collect(Collectors.groupingBy(beo::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dhe)$$0x.getKey(), bew.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dhe, bew<beo>>, Duration>comparing($$0x -> ((bew)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bem().a(this);
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

   public List<beu> g() {
      return this.e;
   }

   public List<bep> h() {
      return this.f;
   }

   public ber.a i() {
      return this.g;
   }

   public bet.a j() {
      return this.h;
   }

   public bes k() {
      return this.i;
   }

   public bes l() {
      return this.j;
   }

   public beq.a m() {
      return this.k;
   }

   public beq.a n() {
      return this.l;
   }

   public List<beo> o() {
      return this.m;
   }
}
