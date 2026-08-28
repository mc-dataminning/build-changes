import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bpj(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpw> e,
   List<bpp> f,
   bpr.a g,
   bpv.a h,
   bps<bpt> i,
   bps<bpt> j,
   bps<bpo> k,
   bps<bpo> l,
   bpq.a m,
   bpq.a n,
   List<bpn> o,
   List<bpu> p
) {
   public List<Pair<dzr, bpy<bpn>>> a() {
      Map<dzr, List<bpn>> $$0 = this.o.stream().collect(Collectors.groupingBy(bpn::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dzr)$$0x.getKey(), bpy.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dzr, bpy<bpn>>, Duration>comparing($$0x -> ((bpy)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bpl().a(this);
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

   public List<bpw> g() {
      return this.e;
   }

   public List<bpp> h() {
      return this.f;
   }

   public bpr.a i() {
      return this.g;
   }

   public bpv.a j() {
      return this.h;
   }

   public bps<bpt> k() {
      return this.i;
   }

   public bps<bpt> l() {
      return this.j;
   }

   public bps<bpo> m() {
      return this.k;
   }

   public bps<bpo> n() {
      return this.l;
   }

   public bpq.a o() {
      return this.m;
   }

   public bpq.a p() {
      return this.n;
   }

   public List<bpn> q() {
      return this.o;
   }

   public List<bpu> r() {
      return this.p;
   }
}
