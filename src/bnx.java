import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnx(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<boj> e,
   List<bod> f,
   bof.a g,
   boi.a h,
   bog<boh> i,
   bog<boh> j,
   bog<boc> k,
   bog<boc> l,
   boe.a m,
   boe.a n,
   List<bob> o
) {
   public List<Pair<duw, bol<bob>>> a() {
      Map<duw, List<bob>> $$0 = this.o.stream().collect(Collectors.groupingBy(bob::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((duw)$$0x.getKey(), bol.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<duw, bol<bob>>, Duration>comparing($$0x -> ((bol)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bnz().a(this);
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

   public List<boj> g() {
      return this.e;
   }

   public List<bod> h() {
      return this.f;
   }

   public bof.a i() {
      return this.g;
   }

   public boi.a j() {
      return this.h;
   }

   public bog<boh> k() {
      return this.i;
   }

   public bog<boh> l() {
      return this.j;
   }

   public bog<boc> m() {
      return this.k;
   }

   public bog<boc> n() {
      return this.l;
   }

   public boe.a o() {
      return this.m;
   }

   public boe.a p() {
      return this.n;
   }

   public List<bob> q() {
      return this.o;
   }
}
