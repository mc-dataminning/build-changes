import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record brb(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bro> e,
   List<brh> f,
   brj.a g,
   brn.a h,
   brk<brl> i,
   brk<brl> j,
   brk<brg> k,
   brk<brg> l,
   bri.a m,
   bri.a n,
   List<brf> o,
   List<brm> p
) {
   public List<Pair<ecm, brq<brf>>> a() {
      Map<ecm, List<brf>> $$0 = this.o.stream().collect(Collectors.groupingBy(brf::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((ecm)$$0x.getKey(), brq.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<ecm, brq<brf>>, Duration>comparing($$0x -> ((brq)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new brd().a(this);
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

   public List<bro> g() {
      return this.e;
   }

   public List<brh> h() {
      return this.f;
   }

   public brj.a i() {
      return this.g;
   }

   public brn.a j() {
      return this.h;
   }

   public brk<brl> k() {
      return this.i;
   }

   public brk<brl> l() {
      return this.j;
   }

   public brk<brg> m() {
      return this.k;
   }

   public brk<brg> n() {
      return this.l;
   }

   public bri.a o() {
      return this.m;
   }

   public bri.a p() {
      return this.n;
   }

   public List<brf> q() {
      return this.o;
   }

   public List<brm> r() {
      return this.p;
   }
}
