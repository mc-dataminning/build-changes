import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bkh(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bkt> e,
   List<bkn> f,
   bkp.a g,
   bks.a h,
   bkq<bkr> i,
   bkq<bkr> j,
   bkq<bkm> k,
   bkq<bkm> l,
   bko.a m,
   bko.a n,
   List<bkl> o
) {
   public List<Pair<dpc, bkv<bkl>>> a() {
      Map<dpc, List<bkl>> $$0 = this.o.stream().collect(Collectors.groupingBy(bkl::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dpc)$$0x.getKey(), bkv.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dpc, bkv<bkl>>, Duration>comparing($$0x -> ((bkv)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bkj().a(this);
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

   public List<bkt> g() {
      return this.e;
   }

   public List<bkn> h() {
      return this.f;
   }

   public bkp.a i() {
      return this.g;
   }

   public bks.a j() {
      return this.h;
   }

   public bkq<bkr> k() {
      return this.i;
   }

   public bkq<bkr> l() {
      return this.j;
   }

   public bkq<bkm> m() {
      return this.k;
   }

   public bkq<bkm> n() {
      return this.l;
   }

   public bko.a o() {
      return this.m;
   }

   public bko.a p() {
      return this.n;
   }

   public List<bkl> q() {
      return this.o;
   }
}
