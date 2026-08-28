import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnv(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<boh> e,
   List<bob> f,
   bod.a g,
   bog.a h,
   boe<bof> i,
   boe<bof> j,
   boe<boa> k,
   boe<boa> l,
   boc.a m,
   boc.a n,
   List<bnz> o
) {
   public List<Pair<dvz, boj<bnz>>> a() {
      Map<dvz, List<bnz>> $$0 = this.o.stream().collect(Collectors.groupingBy(bnz::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dvz)$$0x.getKey(), boj.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dvz, boj<bnz>>, Duration>comparing($$0x -> ((boj)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bnx().a(this);
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

   public List<boh> g() {
      return this.e;
   }

   public List<bob> h() {
      return this.f;
   }

   public bod.a i() {
      return this.g;
   }

   public bog.a j() {
      return this.h;
   }

   public boe<bof> k() {
      return this.i;
   }

   public boe<bof> l() {
      return this.j;
   }

   public boe<boa> m() {
      return this.k;
   }

   public boe<boa> n() {
      return this.l;
   }

   public boc.a o() {
      return this.m;
   }

   public boc.a p() {
      return this.n;
   }

   public List<bnz> q() {
      return this.o;
   }
}
