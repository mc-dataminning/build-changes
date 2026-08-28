import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bqt(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<brg> e,
   List<bqz> f,
   brb.a g,
   brf.a h,
   brc<brd> i,
   brc<brd> j,
   brc<bqy> k,
   brc<bqy> l,
   bra.a m,
   bra.a n,
   List<bqx> o,
   List<bre> p
) {
   public List<Pair<ebk, bri<bqx>>> a() {
      Map<ebk, List<bqx>> $$0 = this.o.stream().collect(Collectors.groupingBy(bqx::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((ebk)$$0x.getKey(), bri.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<ebk, bri<bqx>>, Duration>comparing($$0x -> ((bri)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bqv().a(this);
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

   public List<brg> g() {
      return this.e;
   }

   public List<bqz> h() {
      return this.f;
   }

   public brb.a i() {
      return this.g;
   }

   public brf.a j() {
      return this.h;
   }

   public brc<brd> k() {
      return this.i;
   }

   public brc<brd> l() {
      return this.j;
   }

   public brc<bqy> m() {
      return this.k;
   }

   public brc<bqy> n() {
      return this.l;
   }

   public bra.a o() {
      return this.m;
   }

   public bra.a p() {
      return this.n;
   }

   public List<bqx> q() {
      return this.o;
   }

   public List<bre> r() {
      return this.p;
   }
}
