import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bpl(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpy> e,
   List<bpr> f,
   bpt.a g,
   bpx.a h,
   bpu<bpv> i,
   bpu<bpv> j,
   bpu<bpq> k,
   bpu<bpq> l,
   bps.a m,
   bps.a n,
   List<bpp> o,
   List<bpw> p
) {
   public List<Pair<dzt, bqa<bpp>>> a() {
      Map<dzt, List<bpp>> $$0 = this.o.stream().collect(Collectors.groupingBy(bpp::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dzt)$$0x.getKey(), bqa.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dzt, bqa<bpp>>, Duration>comparing($$0x -> ((bqa)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bpn().a(this);
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

   public List<bpy> g() {
      return this.e;
   }

   public List<bpr> h() {
      return this.f;
   }

   public bpt.a i() {
      return this.g;
   }

   public bpx.a j() {
      return this.h;
   }

   public bpu<bpv> k() {
      return this.i;
   }

   public bpu<bpv> l() {
      return this.j;
   }

   public bpu<bpq> m() {
      return this.k;
   }

   public bpu<bpq> n() {
      return this.l;
   }

   public bps.a o() {
      return this.m;
   }

   public bps.a p() {
      return this.n;
   }

   public List<bpp> q() {
      return this.o;
   }

   public List<bpw> r() {
      return this.p;
   }
}
