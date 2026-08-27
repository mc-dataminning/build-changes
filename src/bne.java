import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bne(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bnq> e,
   List<bnk> f,
   bnm.a g,
   bnp.a h,
   bnn<bno> i,
   bnn<bno> j,
   bnn<bnj> k,
   bnn<bnj> l,
   bnl.a m,
   bnl.a n,
   List<bni> o
) {
   public List<Pair<dvx, bns<bni>>> a() {
      Map<dvx, List<bni>> $$0 = this.o.stream().collect(Collectors.groupingBy(bni::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dvx)$$0x.getKey(), bns.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dvx, bns<bni>>, Duration>comparing($$0x -> ((bns)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bng().a(this);
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

   public List<bnq> g() {
      return this.e;
   }

   public List<bnk> h() {
      return this.f;
   }

   public bnm.a i() {
      return this.g;
   }

   public bnp.a j() {
      return this.h;
   }

   public bnn<bno> k() {
      return this.i;
   }

   public bnn<bno> l() {
      return this.j;
   }

   public bnn<bnj> m() {
      return this.k;
   }

   public bnn<bnj> n() {
      return this.l;
   }

   public bnl.a o() {
      return this.m;
   }

   public bnl.a p() {
      return this.n;
   }

   public List<bni> q() {
      return this.o;
   }
}
