import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record brg(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<brt> e,
   List<brm> f,
   bro.a g,
   brs.a h,
   brp<brq> i,
   brp<brq> j,
   brp<brl> k,
   brp<brl> l,
   brn.a m,
   brn.a n,
   List<brk> o,
   List<brr> p
) {
   public List<Pair<edf, brv<brk>>> a() {
      Map<edf, List<brk>> $$0 = this.o.stream().collect(Collectors.groupingBy(brk::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((edf)$$0x.getKey(), brv.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<edf, brv<brk>>, Duration>comparing($$0x -> ((brv)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bri().a(this);
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

   public List<brt> g() {
      return this.e;
   }

   public List<brm> h() {
      return this.f;
   }

   public bro.a i() {
      return this.g;
   }

   public brs.a j() {
      return this.h;
   }

   public brp<brq> k() {
      return this.i;
   }

   public brp<brq> l() {
      return this.j;
   }

   public brp<brl> m() {
      return this.k;
   }

   public brp<brl> n() {
      return this.l;
   }

   public brn.a o() {
      return this.m;
   }

   public brn.a p() {
      return this.n;
   }

   public List<brk> q() {
      return this.o;
   }

   public List<brr> r() {
      return this.p;
   }
}
