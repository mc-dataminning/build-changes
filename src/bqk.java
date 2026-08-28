import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bqk(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bqw> e,
   List<bqq> f,
   bqs.a g,
   bqv.a h,
   bqt<bqu> i,
   bqt<bqu> j,
   bqt<bqp> k,
   bqt<bqp> l,
   bqr.a m,
   bqr.a n,
   List<bqo> o
) {
   public List<Pair<eaq, bqy<bqo>>> a() {
      Map<eaq, List<bqo>> $$0 = this.o.stream().collect(Collectors.groupingBy(bqo::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((eaq)$$0x.getKey(), bqy.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<eaq, bqy<bqo>>, Duration>comparing($$0x -> ((bqy)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bqm().a(this);
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

   public List<bqw> g() {
      return this.e;
   }

   public List<bqq> h() {
      return this.f;
   }

   public bqs.a i() {
      return this.g;
   }

   public bqv.a j() {
      return this.h;
   }

   public bqt<bqu> k() {
      return this.i;
   }

   public bqt<bqu> l() {
      return this.j;
   }

   public bqt<bqp> m() {
      return this.k;
   }

   public bqt<bqp> n() {
      return this.l;
   }

   public bqr.a o() {
      return this.m;
   }

   public bqr.a p() {
      return this.n;
   }

   public List<bqo> q() {
      return this.o;
   }
}
