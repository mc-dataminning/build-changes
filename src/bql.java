import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bql(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bqx> e,
   List<bqr> f,
   bqt.a g,
   bqw.a h,
   bqu<bqv> i,
   bqu<bqv> j,
   bqu<bqq> k,
   bqu<bqq> l,
   bqs.a m,
   bqs.a n,
   List<bqp> o
) {
   public List<Pair<ear, bqz<bqp>>> a() {
      Map<ear, List<bqp>> $$0 = this.o.stream().collect(Collectors.groupingBy(bqp::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((ear)$$0x.getKey(), bqz.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<ear, bqz<bqp>>, Duration>comparing($$0x -> ((bqz)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bqn().a(this);
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

   public List<bqx> g() {
      return this.e;
   }

   public List<bqr> h() {
      return this.f;
   }

   public bqt.a i() {
      return this.g;
   }

   public bqw.a j() {
      return this.h;
   }

   public bqu<bqv> k() {
      return this.i;
   }

   public bqu<bqv> l() {
      return this.j;
   }

   public bqu<bqq> m() {
      return this.k;
   }

   public bqu<bqq> n() {
      return this.l;
   }

   public bqs.a o() {
      return this.m;
   }

   public bqs.a p() {
      return this.n;
   }

   public List<bqp> q() {
      return this.o;
   }
}
