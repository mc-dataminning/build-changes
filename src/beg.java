import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record beg(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<beq> e, List<bel> f, ben.a g, bep.a h, beo i, beo j, bem.a k, bem.a l, List<bek> m
) {
   public List<Pair<dhm, bes<bek>>> a() {
      Map<dhm, List<bek>> $$0 = this.m.stream().collect(Collectors.groupingBy(bek::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dhm)$$0x.getKey(), bes.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dhm, bes<bek>>, Duration>comparing($$0x -> ((bes)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bei().a(this);
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

   public List<beq> g() {
      return this.e;
   }

   public List<bel> h() {
      return this.f;
   }

   public ben.a i() {
      return this.g;
   }

   public bep.a j() {
      return this.h;
   }

   public beo k() {
      return this.i;
   }

   public beo l() {
      return this.j;
   }

   public bem.a m() {
      return this.k;
   }

   public bem.a n() {
      return this.l;
   }

   public List<bek> o() {
      return this.m;
   }
}
