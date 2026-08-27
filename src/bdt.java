import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bdt(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bed> e, List<bdy> f, bea.a g, bec.a h, beb i, beb j, bdz.a k, bdz.a l, List<bdx> m
) {
   public List<Pair<dgz, beg<bdx>>> a() {
      Map<dgz, List<bdx>> $$0 = this.m.stream().collect(Collectors.groupingBy(bdx::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dgz)$$0x.getKey(), beg.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dgz, beg<bdx>>, Duration>comparing($$0x -> ((beg)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bdv().a(this);
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

   public List<bed> g() {
      return this.e;
   }

   public List<bdy> h() {
      return this.f;
   }

   public bea.a i() {
      return this.g;
   }

   public bec.a j() {
      return this.h;
   }

   public beb k() {
      return this.i;
   }

   public beb l() {
      return this.j;
   }

   public bdz.a m() {
      return this.k;
   }

   public bdz.a n() {
      return this.l;
   }

   public List<bdx> o() {
      return this.m;
   }
}
