import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bnt(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bof> e,
   List<bnz> f,
   bob.a g,
   boe.a h,
   boc<bod> i,
   boc<bod> j,
   boc<bny> k,
   boc<bny> l,
   boa.a m,
   boa.a n,
   List<bnx> o
) {
   public List<Pair<dus, boh<bnx>>> a() {
      Map<dus, List<bnx>> $$0 = this.o.stream().collect(Collectors.groupingBy(bnx::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dus)$$0x.getKey(), boh.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dus, boh<bnx>>, Duration>comparing($$0x -> ((boh)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bnv().a(this);
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

   public List<bof> g() {
      return this.e;
   }

   public List<bnz> h() {
      return this.f;
   }

   public bob.a i() {
      return this.g;
   }

   public boe.a j() {
      return this.h;
   }

   public boc<bod> k() {
      return this.i;
   }

   public boc<bod> l() {
      return this.j;
   }

   public boc<bny> m() {
      return this.k;
   }

   public boc<bny> n() {
      return this.l;
   }

   public boa.a o() {
      return this.m;
   }

   public boa.a p() {
      return this.n;
   }

   public List<bnx> q() {
      return this.o;
   }
}
