import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnz(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bol> e,
   List<bof> f,
   boh.a g,
   bok.a h,
   boi<boj> i,
   boi<boj> j,
   boi<boe> k,
   boi<boe> l,
   bog.a m,
   bog.a n,
   List<bod> o
) {
   public List<Pair<duy, bon<bod>>> a() {
      Map<duy, List<bod>> $$0 = this.o.stream().collect(Collectors.groupingBy(bod::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((duy)$$0x.getKey(), bon.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<duy, bon<bod>>, Duration>comparing($$0x -> ((bon)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bob().a(this);
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

   public List<bol> g() {
      return this.e;
   }

   public List<bof> h() {
      return this.f;
   }

   public boh.a i() {
      return this.g;
   }

   public bok.a j() {
      return this.h;
   }

   public boi<boj> k() {
      return this.i;
   }

   public boi<boj> l() {
      return this.j;
   }

   public boi<boe> m() {
      return this.k;
   }

   public boi<boe> n() {
      return this.l;
   }

   public bog.a o() {
      return this.m;
   }

   public bog.a p() {
      return this.n;
   }

   public List<bod> q() {
      return this.o;
   }
}
