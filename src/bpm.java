import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bpm(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpz> e,
   List<bps> f,
   bpu.a g,
   bpy.a h,
   bpv<bpw> i,
   bpv<bpw> j,
   bpv<bpr> k,
   bpv<bpr> l,
   bpt.a m,
   bpt.a n,
   List<bpq> o,
   List<bpx> p
) {
   public List<Pair<dzu, bqb<bpq>>> a() {
      Map<dzu, List<bpq>> $$0 = this.o.stream().collect(Collectors.groupingBy(bpq::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dzu)$$0x.getKey(), bqb.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dzu, bqb<bpq>>, Duration>comparing($$0x -> ((bqb)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bpo().a(this);
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

   public List<bpz> g() {
      return this.e;
   }

   public List<bps> h() {
      return this.f;
   }

   public bpu.a i() {
      return this.g;
   }

   public bpy.a j() {
      return this.h;
   }

   public bpv<bpw> k() {
      return this.i;
   }

   public bpv<bpw> l() {
      return this.j;
   }

   public bpv<bpr> m() {
      return this.k;
   }

   public bpv<bpr> n() {
      return this.l;
   }

   public bpt.a o() {
      return this.m;
   }

   public bpt.a p() {
      return this.n;
   }

   public List<bpq> q() {
      return this.o;
   }

   public List<bpx> r() {
      return this.p;
   }
}
