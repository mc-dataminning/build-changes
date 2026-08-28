import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bre(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<brr> e,
   List<brk> f,
   brm.a g,
   brq.a h,
   brn<bro> i,
   brn<bro> j,
   brn<brj> k,
   brn<brj> l,
   brl.a m,
   brl.a n,
   List<bri> o,
   List<brp> p
) {
   public List<Pair<ecx, brt<bri>>> a() {
      Map<ecx, List<bri>> $$0 = this.o.stream().collect(Collectors.groupingBy(bri::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((ecx)$$0x.getKey(), brt.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<ecx, brt<bri>>, Duration>comparing($$0x -> ((brt)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new brg().a(this);
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

   public List<brr> g() {
      return this.e;
   }

   public List<brk> h() {
      return this.f;
   }

   public brm.a i() {
      return this.g;
   }

   public brq.a j() {
      return this.h;
   }

   public brn<bro> k() {
      return this.i;
   }

   public brn<bro> l() {
      return this.j;
   }

   public brn<brj> m() {
      return this.k;
   }

   public brn<brj> n() {
      return this.l;
   }

   public brl.a o() {
      return this.m;
   }

   public brl.a p() {
      return this.n;
   }

   public List<bri> q() {
      return this.o;
   }

   public List<brp> r() {
      return this.p;
   }
}
