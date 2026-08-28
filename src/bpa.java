import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bpa(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<bpm> e,
   List<bpg> f,
   bpi.a g,
   bpl.a h,
   bpj<bpk> i,
   bpj<bpk> j,
   bpj<bpf> k,
   bpj<bpf> l,
   bph.a m,
   bph.a n,
   List<bpe> o
) {
   public List<Pair<dya, bpo<bpe>>> a() {
      Map<dya, List<bpe>> $$0 = this.o.stream().collect(Collectors.groupingBy(bpe::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((dya)$$0x.getKey(), bpo.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<dya, bpo<bpe>>, Duration>comparing($$0x -> ((bpo)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bpc().a(this);
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

   public List<bpm> g() {
      return this.e;
   }

   public List<bpg> h() {
      return this.f;
   }

   public bpi.a i() {
      return this.g;
   }

   public bpl.a j() {
      return this.h;
   }

   public bpj<bpk> k() {
      return this.i;
   }

   public bpj<bpk> l() {
      return this.j;
   }

   public bpj<bpf> m() {
      return this.k;
   }

   public bpj<bpf> n() {
      return this.l;
   }

   public bph.a o() {
      return this.m;
   }

   public bph.a p() {
      return this.n;
   }

   public List<bpe> q() {
      return this.o;
   }
}
