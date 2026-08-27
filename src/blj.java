import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record blj(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<blv> e,
   List<blp> f,
   blr.a g,
   blu.a h,
   bls<blt> i,
   bls<blt> j,
   bls<blo> k,
   bls<blo> l,
   blq.a m,
   blq.a n,
   List<bln> o
) {
   public List<Pair<dsd, blx<bln>>> a() {
      Map<dsd, List<bln>> $$0 = this.o.stream().collect(Collectors.groupingBy(bln::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dsd)$$0x.getKey(), blx.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dsd, blx<bln>>, Duration>comparing($$0x -> ((blx)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bll().a(this);
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

   public List<blv> g() {
      return this.e;
   }

   public List<blp> h() {
      return this.f;
   }

   public blr.a i() {
      return this.g;
   }

   public blu.a j() {
      return this.h;
   }

   public bls<blt> k() {
      return this.i;
   }

   public bls<blt> l() {
      return this.j;
   }

   public bls<blo> m() {
      return this.k;
   }

   public bls<blo> n() {
      return this.l;
   }

   public blq.a o() {
      return this.m;
   }

   public blq.a p() {
      return this.n;
   }

   public List<bln> q() {
      return this.o;
   }
}
