import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bri(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<brv> e,
   List<bro> f,
   brq.a g,
   bru.a h,
   brr<brs> i,
   brr<brs> j,
   brr<brn> k,
   brr<brn> l,
   brp.a m,
   brp.a n,
   List<brm> o,
   List<brt> p
) {
   public List<Pair<edr, brx<brm>>> a() {
      Map<edr, List<brm>> $$0 = this.o.stream().collect(Collectors.groupingBy(brm::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((edr)$$0x.getKey(), brx.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<edr, brx<brm>>, Duration>comparing($$0x -> ((brx)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new brk().a(this);
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

   public List<brv> g() {
      return this.e;
   }

   public List<bro> h() {
      return this.f;
   }

   public brq.a i() {
      return this.g;
   }

   public bru.a j() {
      return this.h;
   }

   public brr<brs> k() {
      return this.i;
   }

   public brr<brs> l() {
      return this.j;
   }

   public brr<brn> m() {
      return this.k;
   }

   public brr<brn> n() {
      return this.l;
   }

   public brp.a o() {
      return this.m;
   }

   public brp.a p() {
      return this.n;
   }

   public List<brm> q() {
      return this.o;
   }

   public List<brt> r() {
      return this.p;
   }
}
