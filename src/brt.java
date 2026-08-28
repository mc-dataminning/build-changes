import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record brt(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bsg> e,
   List<brz> f,
   bsb.a g,
   bsf.a h,
   bsc<bsd> i,
   bsc<bsd> j,
   bsc<bry> k,
   bsc<bry> l,
   bsa.a m,
   bsa.a n,
   List<brx> o,
   List<bse> p
) {
   public List<Pair<eec, bsi<brx>>> a() {
      Map<eec, List<brx>> $$0 = this.o.stream().collect(Collectors.groupingBy(brx::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((eec)$$0x.getKey(), bsi.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<eec, bsi<brx>>, Duration>comparing($$0x -> ((bsi)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new brv().a(this);
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

   public List<bsg> g() {
      return this.e;
   }

   public List<brz> h() {
      return this.f;
   }

   public bsb.a i() {
      return this.g;
   }

   public bsf.a j() {
      return this.h;
   }

   public bsc<bsd> k() {
      return this.i;
   }

   public bsc<bsd> l() {
      return this.j;
   }

   public bsc<bry> m() {
      return this.k;
   }

   public bsc<bry> n() {
      return this.l;
   }

   public bsa.a o() {
      return this.m;
   }

   public bsa.a p() {
      return this.n;
   }

   public List<brx> q() {
      return this.o;
   }

   public List<bse> r() {
      return this.p;
   }
}
