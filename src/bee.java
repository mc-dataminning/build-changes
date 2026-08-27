import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bee(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<beo> e, List<bej> f, bel.a g, ben.a h, bem i, bem j, bek.a k, bek.a l, List<bei> m
) {
   public List<Pair<dhk, beq<bei>>> a() {
      Map<dhk, List<bei>> $$0 = this.m.stream().collect(Collectors.groupingBy(bei::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dhk)$$0x.getKey(), beq.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dhk, beq<bei>>, Duration>comparing($$0x -> ((beq)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new beg().a(this);
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

   public List<beo> g() {
      return this.e;
   }

   public List<bej> h() {
      return this.f;
   }

   public bel.a i() {
      return this.g;
   }

   public ben.a j() {
      return this.h;
   }

   public bem k() {
      return this.i;
   }

   public bem l() {
      return this.j;
   }

   public bek.a m() {
      return this.k;
   }

   public bek.a n() {
      return this.l;
   }

   public List<bei> o() {
      return this.m;
   }
}
