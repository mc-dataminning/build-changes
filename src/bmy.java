import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bmy(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bnk> e,
   List<bne> f,
   bng.a g,
   bnj.a h,
   bnh<bni> i,
   bnh<bni> j,
   bnh<bnd> k,
   bnh<bnd> l,
   bnf.a m,
   bnf.a n,
   List<bnc> o
) {
   public List<Pair<dtw, bnm<bnc>>> a() {
      Map<dtw, List<bnc>> $$0 = this.o.stream().collect(Collectors.groupingBy(bnc::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dtw)$$0x.getKey(), bnm.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dtw, bnm<bnc>>, Duration>comparing($$0x -> ((bnm)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bna().a(this);
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

   public List<bnk> g() {
      return this.e;
   }

   public List<bne> h() {
      return this.f;
   }

   public bng.a i() {
      return this.g;
   }

   public bnj.a j() {
      return this.h;
   }

   public bnh<bni> k() {
      return this.i;
   }

   public bnh<bni> l() {
      return this.j;
   }

   public bnh<bnd> m() {
      return this.k;
   }

   public bnh<bnd> n() {
      return this.l;
   }

   public bnf.a o() {
      return this.m;
   }

   public bnf.a p() {
      return this.n;
   }

   public List<bnc> q() {
      return this.o;
   }
}
