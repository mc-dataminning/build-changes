import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record brv(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bsi> e,
   List<bsb> f,
   bsd.a g,
   bsh.a h,
   bse<bsf> i,
   bse<bsf> j,
   bse<bsa> k,
   bse<bsa> l,
   bsc.a m,
   bsc.a n,
   List<brz> o,
   List<bsg> p
) {
   public List<Pair<eee, bsk<brz>>> a() {
      Map<eee, List<brz>> $$0 = this.o.stream().collect(Collectors.groupingBy(brz::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((eee)$$0x.getKey(), bsk.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<eee, bsk<brz>>, Duration>comparing($$0x -> ((bsk)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new brx().a(this);
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

   public List<bsi> g() {
      return this.e;
   }

   public List<bsb> h() {
      return this.f;
   }

   public bsd.a i() {
      return this.g;
   }

   public bsh.a j() {
      return this.h;
   }

   public bse<bsf> k() {
      return this.i;
   }

   public bse<bsf> l() {
      return this.j;
   }

   public bse<bsa> m() {
      return this.k;
   }

   public bse<bsa> n() {
      return this.l;
   }

   public bsc.a o() {
      return this.m;
   }

   public bsc.a p() {
      return this.n;
   }

   public List<brz> q() {
      return this.o;
   }

   public List<bsg> r() {
      return this.p;
   }
}
