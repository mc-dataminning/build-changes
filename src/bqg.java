import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bqg(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bqs> e,
   List<bqm> f,
   bqo.a g,
   bqr.a h,
   bqp<bqq> i,
   bqp<bqq> j,
   bqp<bql> k,
   bqp<bql> l,
   bqn.a m,
   bqn.a n,
   List<bqk> o
) {
   public List<Pair<eaj, bqu<bqk>>> a() {
      Map<eaj, List<bqk>> $$0 = this.o.stream().collect(Collectors.groupingBy(bqk::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((eaj)$$0x.getKey(), bqu.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<eaj, bqu<bqk>>, Duration>comparing($$0x -> ((bqu)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bqi().a(this);
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

   public List<bqs> g() {
      return this.e;
   }

   public List<bqm> h() {
      return this.f;
   }

   public bqo.a i() {
      return this.g;
   }

   public bqr.a j() {
      return this.h;
   }

   public bqp<bqq> k() {
      return this.i;
   }

   public bqp<bqq> l() {
      return this.j;
   }

   public bqp<bql> m() {
      return this.k;
   }

   public bqp<bql> n() {
      return this.l;
   }

   public bqn.a o() {
      return this.m;
   }

   public bqn.a p() {
      return this.n;
   }

   public List<bqk> q() {
      return this.o;
   }
}
