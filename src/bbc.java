import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bbc(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bbm> e, List<bbh> f, bbj.a g, bbl.a h, bbk i, bbk j, bbi.a k, bbi.a l, List<bbg> m
) {
   public List<Pair<dec, bbp<bbg>>> a() {
      Map<dec, List<bbg>> $$0 = this.m.stream().collect(Collectors.groupingBy(bbg::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dec)$$0x.getKey(), bbp.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dec, bbp<bbg>>, Duration>comparing($$0x -> ((bbp)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bbe().a(this);
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

   public List<bbm> g() {
      return this.e;
   }

   public List<bbh> h() {
      return this.f;
   }

   public bbj.a i() {
      return this.g;
   }

   public bbl.a j() {
      return this.h;
   }

   public bbk k() {
      return this.i;
   }

   public bbk l() {
      return this.j;
   }

   public bbi.a m() {
      return this.k;
   }

   public bbi.a n() {
      return this.l;
   }

   public List<bbg> o() {
      return this.m;
   }
}
