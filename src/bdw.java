import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bdw(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<beg> e, List<beb> f, bed.a g, bef.a h, bee i, bee j, bec.a k, bec.a l, List<bea> m
) {
   public List<Pair<dhb, bei<bea>>> a() {
      Map<dhb, List<bea>> $$0 = this.m.stream().collect(Collectors.groupingBy(bea::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dhb)$$0x.getKey(), bei.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dhb, bei<bea>>, Duration>comparing($$0x -> ((bei)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bdy().a(this);
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

   public List<beg> g() {
      return this.e;
   }

   public List<beb> h() {
      return this.f;
   }

   public bed.a i() {
      return this.g;
   }

   public bef.a j() {
      return this.h;
   }

   public bee k() {
      return this.i;
   }

   public bee l() {
      return this.j;
   }

   public bec.a m() {
      return this.k;
   }

   public bec.a n() {
      return this.l;
   }

   public List<bea> o() {
      return this.m;
   }
}
