import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnk(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bnw> e,
   List<bnq> f,
   bns.a g,
   bnv.a h,
   bnt<bnu> i,
   bnt<bnu> j,
   bnt<bnp> k,
   bnt<bnp> l,
   bnr.a m,
   bnr.a n,
   List<bno> o
) {
   public List<Pair<dvh, bny<bno>>> a() {
      Map<dvh, List<bno>> $$0 = this.o.stream().collect(Collectors.groupingBy(bno::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dvh)$$0x.getKey(), bny.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dvh, bny<bno>>, Duration>comparing($$0x -> ((bny)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bnm().a(this);
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

   public List<bnw> g() {
      return this.e;
   }

   public List<bnq> h() {
      return this.f;
   }

   public bns.a i() {
      return this.g;
   }

   public bnv.a j() {
      return this.h;
   }

   public bnt<bnu> k() {
      return this.i;
   }

   public bnt<bnu> l() {
      return this.j;
   }

   public bnt<bnp> m() {
      return this.k;
   }

   public bnt<bnp> n() {
      return this.l;
   }

   public bnr.a o() {
      return this.m;
   }

   public bnr.a p() {
      return this.n;
   }

   public List<bno> q() {
      return this.o;
   }
}
