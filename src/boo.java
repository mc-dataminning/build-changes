import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record boo(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpa> e,
   List<bou> f,
   bow.a g,
   boz.a h,
   box<boy> i,
   box<boy> j,
   box<bot> k,
   box<bot> l,
   bov.a m,
   bov.a n,
   List<bos> o
) {
   public List<Pair<dwx, bpc<bos>>> a() {
      Map<dwx, List<bos>> $$0 = this.o.stream().collect(Collectors.groupingBy(bos::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dwx)$$0x.getKey(), bpc.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dwx, bpc<bos>>, Duration>comparing($$0x -> ((bpc)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new boq().a(this);
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

   public List<bpa> g() {
      return this.e;
   }

   public List<bou> h() {
      return this.f;
   }

   public bow.a i() {
      return this.g;
   }

   public boz.a j() {
      return this.h;
   }

   public box<boy> k() {
      return this.i;
   }

   public box<boy> l() {
      return this.j;
   }

   public box<bot> m() {
      return this.k;
   }

   public box<bot> n() {
      return this.l;
   }

   public bov.a o() {
      return this.m;
   }

   public bov.a p() {
      return this.n;
   }

   public List<bos> q() {
      return this.o;
   }
}
