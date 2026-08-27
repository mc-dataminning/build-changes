import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bhb(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<bhl> e, List<bhg> f, bhi.a g, bhk.a h, bhj i, bhj j, bhh.a k, bhh.a l, List<bhf> m
) {
   public List<Pair<dlb, bhn<bhf>>> a() {
      Map<dlb, List<bhf>> $$0 = this.m.stream().collect(Collectors.groupingBy(bhf::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dlb)$$0x.getKey(), bhn.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dlb, bhn<bhf>>, Duration>comparing($$0x -> ((bhn)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bhd().a(this);
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

   public List<bhl> g() {
      return this.e;
   }

   public List<bhg> h() {
      return this.f;
   }

   public bhi.a i() {
      return this.g;
   }

   public bhk.a j() {
      return this.h;
   }

   public bhj k() {
      return this.i;
   }

   public bhj l() {
      return this.j;
   }

   public bhh.a m() {
      return this.k;
   }

   public bhh.a n() {
      return this.l;
   }

   public List<bhf> o() {
      return this.m;
   }
}
