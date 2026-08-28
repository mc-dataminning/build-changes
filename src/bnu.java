import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnu(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bog> e,
   List<boa> f,
   boc.a g,
   bof.a h,
   bod<boe> i,
   bod<boe> j,
   bod<bnz> k,
   bod<bnz> l,
   bob.a m,
   bob.a n,
   List<bny> o
) {
   public List<Pair<dvx, boi<bny>>> a() {
      Map<dvx, List<bny>> $$0 = this.o.stream().collect(Collectors.groupingBy(bny::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dvx)$$0x.getKey(), boi.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dvx, boi<bny>>, Duration>comparing($$0x -> ((boi)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bnw().a(this);
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

   public List<bog> g() {
      return this.e;
   }

   public List<boa> h() {
      return this.f;
   }

   public boc.a i() {
      return this.g;
   }

   public bof.a j() {
      return this.h;
   }

   public bod<boe> k() {
      return this.i;
   }

   public bod<boe> l() {
      return this.j;
   }

   public bod<bnz> m() {
      return this.k;
   }

   public bod<bnz> n() {
      return this.l;
   }

   public bob.a o() {
      return this.m;
   }

   public bob.a p() {
      return this.n;
   }

   public List<bny> q() {
      return this.o;
   }
}
