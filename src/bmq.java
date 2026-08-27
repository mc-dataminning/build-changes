import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bmq(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bnc> e,
   List<bmw> f,
   bmy.a g,
   bnb.a h,
   bmz<bna> i,
   bmz<bna> j,
   bmz<bmv> k,
   bmz<bmv> l,
   bmx.a m,
   bmx.a n,
   List<bmu> o
) {
   public List<Pair<dtc, bne<bmu>>> a() {
      Map<dtc, List<bmu>> $$0 = this.o.stream().collect(Collectors.groupingBy(bmu::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dtc)$$0x.getKey(), bne.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dtc, bne<bmu>>, Duration>comparing($$0x -> ((bne)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bms().a(this);
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

   public List<bnc> g() {
      return this.e;
   }

   public List<bmw> h() {
      return this.f;
   }

   public bmy.a i() {
      return this.g;
   }

   public bnb.a j() {
      return this.h;
   }

   public bmz<bna> k() {
      return this.i;
   }

   public bmz<bna> l() {
      return this.j;
   }

   public bmz<bmv> m() {
      return this.k;
   }

   public bmz<bmv> n() {
      return this.l;
   }

   public bmx.a o() {
      return this.m;
   }

   public bmx.a p() {
      return this.n;
   }

   public List<bmu> q() {
      return this.o;
   }
}
