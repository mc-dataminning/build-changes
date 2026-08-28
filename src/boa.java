import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record boa(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bom> e,
   List<bog> f,
   boi.a g,
   bol.a h,
   boj<bok> i,
   boj<bok> j,
   boj<bof> k,
   boj<bof> l,
   boh.a m,
   boh.a n,
   List<boe> o
) {
   public List<Pair<duz, boo<boe>>> a() {
      Map<duz, List<boe>> $$0 = this.o.stream().collect(Collectors.groupingBy(boe::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((duz)$$0x.getKey(), boo.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<duz, boo<boe>>, Duration>comparing($$0x -> ((boo)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new boc().a(this);
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

   public List<bom> g() {
      return this.e;
   }

   public List<bog> h() {
      return this.f;
   }

   public boi.a i() {
      return this.g;
   }

   public bol.a j() {
      return this.h;
   }

   public boj<bok> k() {
      return this.i;
   }

   public boj<bok> l() {
      return this.j;
   }

   public boj<bof> m() {
      return this.k;
   }

   public boj<bof> n() {
      return this.l;
   }

   public boh.a o() {
      return this.m;
   }

   public boh.a p() {
      return this.n;
   }

   public List<boe> q() {
      return this.o;
   }
}
