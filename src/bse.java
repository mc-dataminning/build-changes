import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bse(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bsr> e,
   List<bsk> f,
   bsm.a g,
   bsq.a h,
   bsn<bso> i,
   bsn<bso> j,
   bsn<bsj> k,
   bsn<bsj> l,
   bsl.a m,
   bsl.a n,
   List<bsi> o,
   List<bsp> p
) {
   public List<Pair<eeo, bst<bsi>>> a() {
      Map<eeo, List<bsi>> $$0 = this.o.stream().collect(Collectors.groupingBy(bsi::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((eeo)$$0x.getKey(), bst.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<eeo, bst<bsi>>, Duration>comparing($$0x -> ((bst)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bsg().a(this);
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

   public List<bsr> g() {
      return this.e;
   }

   public List<bsk> h() {
      return this.f;
   }

   public bsm.a i() {
      return this.g;
   }

   public bsq.a j() {
      return this.h;
   }

   public bsn<bso> k() {
      return this.i;
   }

   public bsn<bso> l() {
      return this.j;
   }

   public bsn<bsj> m() {
      return this.k;
   }

   public bsn<bsj> n() {
      return this.l;
   }

   public bsl.a o() {
      return this.m;
   }

   public bsl.a p() {
      return this.n;
   }

   public List<bsi> q() {
      return this.o;
   }

   public List<bsp> r() {
      return this.p;
   }
}
