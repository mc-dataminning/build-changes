import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record blu(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bmg> e,
   List<bma> f,
   bmc.a g,
   bmf.a h,
   bmd<bme> i,
   bmd<bme> j,
   bmd<blz> k,
   bmd<blz> l,
   bmb.a m,
   bmb.a n,
   List<bly> o
) {
   public List<Pair<dst, bmi<bly>>> a() {
      Map<dst, List<bly>> $$0 = this.o.stream().collect(Collectors.groupingBy(bly::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dst)$$0x.getKey(), bmi.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dst, bmi<bly>>, Duration>comparing($$0x -> ((bmi)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new blw().a(this);
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

   public List<bmg> g() {
      return this.e;
   }

   public List<bma> h() {
      return this.f;
   }

   public bmc.a i() {
      return this.g;
   }

   public bmf.a j() {
      return this.h;
   }

   public bmd<bme> k() {
      return this.i;
   }

   public bmd<bme> l() {
      return this.j;
   }

   public bmd<blz> m() {
      return this.k;
   }

   public bmd<blz> n() {
      return this.l;
   }

   public bmb.a o() {
      return this.m;
   }

   public bmb.a p() {
      return this.n;
   }

   public List<bly> q() {
      return this.o;
   }
}
