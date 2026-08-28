import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bpk(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpx> e,
   List<bpq> f,
   bps.a g,
   bpw.a h,
   bpt<bpu> i,
   bpt<bpu> j,
   bpt<bpp> k,
   bpt<bpp> l,
   bpr.a m,
   bpr.a n,
   List<bpo> o,
   List<bpv> p
) {
   public List<Pair<dzt, bpz<bpo>>> a() {
      Map<dzt, List<bpo>> $$0 = this.o.stream().collect(Collectors.groupingBy(bpo::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dzt)$$0x.getKey(), bpz.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dzt, bpz<bpo>>, Duration>comparing($$0x -> ((bpz)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bpm().a(this);
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

   public List<bpx> g() {
      return this.e;
   }

   public List<bpq> h() {
      return this.f;
   }

   public bps.a i() {
      return this.g;
   }

   public bpw.a j() {
      return this.h;
   }

   public bpt<bpu> k() {
      return this.i;
   }

   public bpt<bpu> l() {
      return this.j;
   }

   public bpt<bpp> m() {
      return this.k;
   }

   public bpt<bpp> n() {
      return this.l;
   }

   public bpr.a o() {
      return this.m;
   }

   public bpr.a p() {
      return this.n;
   }

   public List<bpo> q() {
      return this.o;
   }

   public List<bpv> r() {
      return this.p;
   }
}
