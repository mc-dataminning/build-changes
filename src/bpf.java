import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bpf(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpr> e,
   List<bpl> f,
   bpn.a g,
   bpq.a h,
   bpo<bpp> i,
   bpo<bpp> j,
   bpo<bpk> k,
   bpo<bpk> l,
   bpm.a m,
   bpm.a n,
   List<bpj> o
) {
   public List<Pair<dyg, bpt<bpj>>> a() {
      Map<dyg, List<bpj>> $$0 = this.o.stream().collect(Collectors.groupingBy(bpj::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dyg)$$0x.getKey(), bpt.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dyg, bpt<bpj>>, Duration>comparing($$0x -> ((bpt)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bph().a(this);
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

   public List<bpr> g() {
      return this.e;
   }

   public List<bpl> h() {
      return this.f;
   }

   public bpn.a i() {
      return this.g;
   }

   public bpq.a j() {
      return this.h;
   }

   public bpo<bpp> k() {
      return this.i;
   }

   public bpo<bpp> l() {
      return this.j;
   }

   public bpo<bpk> m() {
      return this.k;
   }

   public bpo<bpk> n() {
      return this.l;
   }

   public bpm.a o() {
      return this.m;
   }

   public bpm.a p() {
      return this.n;
   }

   public List<bpj> q() {
      return this.o;
   }
}
