import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bow(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpi> e,
   List<bpc> f,
   bpe.a g,
   bph.a h,
   bpf<bpg> i,
   bpf<bpg> j,
   bpf<bpb> k,
   bpf<bpb> l,
   bpd.a m,
   bpd.a n,
   List<bpa> o
) {
   public List<Pair<dxp, bpk<bpa>>> a() {
      Map<dxp, List<bpa>> $$0 = this.o.stream().collect(Collectors.groupingBy(bpa::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dxp)$$0x.getKey(), bpk.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dxp, bpk<bpa>>, Duration>comparing($$0x -> ((bpk)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new boy().a(this);
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

   public List<bpi> g() {
      return this.e;
   }

   public List<bpc> h() {
      return this.f;
   }

   public bpe.a i() {
      return this.g;
   }

   public bph.a j() {
      return this.h;
   }

   public bpf<bpg> k() {
      return this.i;
   }

   public bpf<bpg> l() {
      return this.j;
   }

   public bpf<bpb> m() {
      return this.k;
   }

   public bpf<bpb> n() {
      return this.l;
   }

   public bpd.a o() {
      return this.m;
   }

   public bpd.a p() {
      return this.n;
   }

   public List<bpa> q() {
      return this.o;
   }
}
