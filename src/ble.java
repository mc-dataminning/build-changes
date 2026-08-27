import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record ble(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<blq> e,
   List<blk> f,
   blm.a g,
   blp.a h,
   bln<blo> i,
   bln<blo> j,
   bln<blj> k,
   bln<blj> l,
   bll.a m,
   bll.a n,
   List<bli> o
) {
   public List<Pair<dru, bls<bli>>> a() {
      Map<dru, List<bli>> $$0 = this.o.stream().collect(Collectors.groupingBy(bli::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dru)$$0x.getKey(), bls.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dru, bls<bli>>, Duration>comparing($$0x -> ((bls)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new blg().a(this);
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

   public List<blq> g() {
      return this.e;
   }

   public List<blk> h() {
      return this.f;
   }

   public blm.a i() {
      return this.g;
   }

   public blp.a j() {
      return this.h;
   }

   public bln<blo> k() {
      return this.i;
   }

   public bln<blo> l() {
      return this.j;
   }

   public bln<blj> m() {
      return this.k;
   }

   public bln<blj> n() {
      return this.l;
   }

   public bll.a o() {
      return this.m;
   }

   public bll.a p() {
      return this.n;
   }

   public List<bli> q() {
      return this.o;
   }
}
