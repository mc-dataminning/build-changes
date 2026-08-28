import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bot(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpf> e,
   List<boz> f,
   bpb.a g,
   bpe.a h,
   bpc<bpd> i,
   bpc<bpd> j,
   bpc<boy> k,
   bpc<boy> l,
   bpa.a m,
   bpa.a n,
   List<box> o
) {
   public List<Pair<dxl, bph<box>>> a() {
      Map<dxl, List<box>> $$0 = this.o.stream().collect(Collectors.groupingBy(box::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dxl)$$0x.getKey(), bph.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dxl, bph<box>>, Duration>comparing($$0x -> ((bph)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bov().a(this);
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

   public List<bpf> g() {
      return this.e;
   }

   public List<boz> h() {
      return this.f;
   }

   public bpb.a i() {
      return this.g;
   }

   public bpe.a j() {
      return this.h;
   }

   public bpc<bpd> k() {
      return this.i;
   }

   public bpc<bpd> l() {
      return this.j;
   }

   public bpc<boy> m() {
      return this.k;
   }

   public bpc<boy> n() {
      return this.l;
   }

   public bpa.a o() {
      return this.m;
   }

   public bpa.a p() {
      return this.n;
   }

   public List<box> q() {
      return this.o;
   }
}
