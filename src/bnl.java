import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnl(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bnx> e,
   List<bnr> f,
   bnt.a g,
   bnw.a h,
   bnu<bnv> i,
   bnu<bnv> j,
   bnu<bnq> k,
   bnu<bnq> l,
   bns.a m,
   bns.a n,
   List<bnp> o
) {
   public List<Pair<dvi, bnz<bnp>>> a() {
      Map<dvi, List<bnp>> $$0 = this.o.stream().collect(Collectors.groupingBy(bnp::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dvi)$$0x.getKey(), bnz.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dvi, bnz<bnp>>, Duration>comparing($$0x -> ((bnz)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bnn().a(this);
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

   public List<bnx> g() {
      return this.e;
   }

   public List<bnr> h() {
      return this.f;
   }

   public bnt.a i() {
      return this.g;
   }

   public bnw.a j() {
      return this.h;
   }

   public bnu<bnv> k() {
      return this.i;
   }

   public bnu<bnv> l() {
      return this.j;
   }

   public bnu<bnq> m() {
      return this.k;
   }

   public bnu<bnq> n() {
      return this.l;
   }

   public bns.a o() {
      return this.m;
   }

   public bns.a p() {
      return this.n;
   }

   public List<bnp> q() {
      return this.o;
   }
}
