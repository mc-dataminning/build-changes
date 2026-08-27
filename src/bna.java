import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bna(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bnm> e,
   List<bng> f,
   bni.a g,
   bnl.a h,
   bnj<bnk> i,
   bnj<bnk> j,
   bnj<bnf> k,
   bnj<bnf> l,
   bnh.a m,
   bnh.a n,
   List<bne> o
) {
   public List<Pair<dty, bno<bne>>> a() {
      Map<dty, List<bne>> $$0 = this.o.stream().collect(Collectors.groupingBy(bne::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dty)$$0x.getKey(), bno.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dty, bno<bne>>, Duration>comparing($$0x -> ((bno)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bnc().a(this);
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

   public List<bnm> g() {
      return this.e;
   }

   public List<bng> h() {
      return this.f;
   }

   public bni.a i() {
      return this.g;
   }

   public bnl.a j() {
      return this.h;
   }

   public bnj<bnk> k() {
      return this.i;
   }

   public bnj<bnk> l() {
      return this.j;
   }

   public bnj<bnf> m() {
      return this.k;
   }

   public bnj<bnf> n() {
      return this.l;
   }

   public bnh.a o() {
      return this.m;
   }

   public bnh.a p() {
      return this.n;
   }

   public List<bne> q() {
      return this.o;
   }
}
