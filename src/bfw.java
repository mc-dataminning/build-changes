import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bfw(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bgg> e, List<bgb> f, bgd.a g, bgf.a h, bge i, bge j, bgc.a k, bgc.a l, List<bga> m
) {
   public List<Pair<dix, bgi<bga>>> a() {
      Map<dix, List<bga>> $$0 = this.m.stream().collect(Collectors.groupingBy(bga::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dix)$$0x.getKey(), bgi.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dix, bgi<bga>>, Duration>comparing($$0x -> ((bgi)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bfy().a(this);
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

   public List<bgg> g() {
      return this.e;
   }

   public List<bgb> h() {
      return this.f;
   }

   public bgd.a i() {
      return this.g;
   }

   public bgf.a j() {
      return this.h;
   }

   public bge k() {
      return this.i;
   }

   public bge l() {
      return this.j;
   }

   public bgc.a m() {
      return this.k;
   }

   public bgc.a n() {
      return this.l;
   }

   public List<bga> o() {
      return this.m;
   }
}
