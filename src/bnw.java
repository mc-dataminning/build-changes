import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnw(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<boi> e,
   List<boc> f,
   boe.a g,
   boh.a h,
   bof<bog> i,
   bof<bog> j,
   bof<bob> k,
   bof<bob> l,
   bod.a m,
   bod.a n,
   List<boa> o
) {
   public List<Pair<duv, bok<boa>>> a() {
      Map<duv, List<boa>> $$0 = this.o.stream().collect(Collectors.groupingBy(boa::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((duv)$$0x.getKey(), bok.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<duv, bok<boa>>, Duration>comparing($$0x -> ((bok)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bny().a(this);
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

   public List<boi> g() {
      return this.e;
   }

   public List<boc> h() {
      return this.f;
   }

   public boe.a i() {
      return this.g;
   }

   public boh.a j() {
      return this.h;
   }

   public bof<bog> k() {
      return this.i;
   }

   public bof<bog> l() {
      return this.j;
   }

   public bof<bob> m() {
      return this.k;
   }

   public bof<bob> n() {
      return this.l;
   }

   public bod.a o() {
      return this.m;
   }

   public bod.a p() {
      return this.n;
   }

   public List<boa> q() {
      return this.o;
   }
}
