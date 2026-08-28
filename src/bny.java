import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bny(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bok> e,
   List<boe> f,
   bog.a g,
   boj.a h,
   boh<boi> i,
   boh<boi> j,
   boh<bod> k,
   boh<bod> l,
   bof.a m,
   bof.a n,
   List<boc> o
) {
   public List<Pair<dux, bom<boc>>> a() {
      Map<dux, List<boc>> $$0 = this.o.stream().collect(Collectors.groupingBy(boc::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dux)$$0x.getKey(), bom.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dux, bom<boc>>, Duration>comparing($$0x -> ((bom)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new boa().a(this);
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

   public List<bok> g() {
      return this.e;
   }

   public List<boe> h() {
      return this.f;
   }

   public bog.a i() {
      return this.g;
   }

   public boj.a j() {
      return this.h;
   }

   public boh<boi> k() {
      return this.i;
   }

   public boh<boi> l() {
      return this.j;
   }

   public boh<bod> m() {
      return this.k;
   }

   public boh<bod> n() {
      return this.l;
   }

   public bof.a o() {
      return this.m;
   }

   public bof.a p() {
      return this.n;
   }

   public List<boc> q() {
      return this.o;
   }
}
