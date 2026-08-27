import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bkg(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bks> e,
   List<bkm> f,
   bko.a g,
   bkr.a h,
   bkp<bkq> i,
   bkp<bkq> j,
   bkp<bkl> k,
   bkp<bkl> l,
   bkn.a m,
   bkn.a n,
   List<bkk> o
) {
   public List<Pair<dpa, bku<bkk>>> a() {
      Map<dpa, List<bkk>> $$0 = this.o.stream().collect(Collectors.groupingBy(bkk::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dpa)$$0x.getKey(), bku.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dpa, bku<bkk>>, Duration>comparing($$0x -> ((bku)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bki().a(this);
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

   public List<bks> g() {
      return this.e;
   }

   public List<bkm> h() {
      return this.f;
   }

   public bko.a i() {
      return this.g;
   }

   public bkr.a j() {
      return this.h;
   }

   public bkp<bkq> k() {
      return this.i;
   }

   public bkp<bkq> l() {
      return this.j;
   }

   public bkp<bkl> m() {
      return this.k;
   }

   public bkp<bkl> n() {
      return this.l;
   }

   public bkn.a o() {
      return this.m;
   }

   public bkn.a p() {
      return this.n;
   }

   public List<bkk> q() {
      return this.o;
   }
}
