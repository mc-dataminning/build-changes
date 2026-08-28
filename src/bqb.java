import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bqb(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bqo> e,
   List<bqh> f,
   bqj.a g,
   bqn.a h,
   bqk<bql> i,
   bqk<bql> j,
   bqk<bqg> k,
   bqk<bqg> l,
   bqi.a m,
   bqi.a n,
   List<bqf> o,
   List<bqm> p
) {
   public List<Pair<eak, bqq<bqf>>> a() {
      Map<eak, List<bqf>> $$0 = this.o.stream().collect(Collectors.groupingBy(bqf::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((eak)$$0x.getKey(), bqq.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<eak, bqq<bqf>>, Duration>comparing($$0x -> ((bqq)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bqd().a(this);
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

   public List<bqo> g() {
      return this.e;
   }

   public List<bqh> h() {
      return this.f;
   }

   public bqj.a i() {
      return this.g;
   }

   public bqn.a j() {
      return this.h;
   }

   public bqk<bql> k() {
      return this.i;
   }

   public bqk<bql> l() {
      return this.j;
   }

   public bqk<bqg> m() {
      return this.k;
   }

   public bqk<bqg> n() {
      return this.l;
   }

   public bqi.a o() {
      return this.m;
   }

   public bqi.a p() {
      return this.n;
   }

   public List<bqf> q() {
      return this.o;
   }

   public List<bqm> r() {
      return this.p;
   }
}
