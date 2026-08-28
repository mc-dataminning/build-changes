import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnh(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bnt> e,
   List<bnn> f,
   bnp.a g,
   bns.a h,
   bnq<bnr> i,
   bnq<bnr> j,
   bnq<bnm> k,
   bnq<bnm> l,
   bno.a m,
   bno.a n,
   List<bnl> o
) {
   public List<Pair<dvc, bnv<bnl>>> a() {
      Map<dvc, List<bnl>> $$0 = this.o.stream().collect(Collectors.groupingBy(bnl::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dvc)$$0x.getKey(), bnv.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dvc, bnv<bnl>>, Duration>comparing($$0x -> ((bnv)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bnj().a(this);
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

   public List<bnt> g() {
      return this.e;
   }

   public List<bnn> h() {
      return this.f;
   }

   public bnp.a i() {
      return this.g;
   }

   public bns.a j() {
      return this.h;
   }

   public bnq<bnr> k() {
      return this.i;
   }

   public bnq<bnr> l() {
      return this.j;
   }

   public bnq<bnm> m() {
      return this.k;
   }

   public bnq<bnm> n() {
      return this.l;
   }

   public bno.a o() {
      return this.m;
   }

   public bno.a p() {
      return this.n;
   }

   public List<bnl> q() {
      return this.o;
   }
}
