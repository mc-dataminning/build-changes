import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record dxo(Map<akl<duu>, duu> b) {
   public static final MapCodec<dxo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akl.a(lf.aT), duu.a).fieldOf("dimensions").forGetter(dxo::d)).apply($$0, $$0.stable(dxo::new))
   );
   private static final Set<akl<duu>> c = ImmutableSet.of(duu.b, duu.c, duu.d);
   private static final int d = c.size();

   public dxo(Map<akl<duu>, duu> b) {
      duu $$1 = b.get(duu.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dxo(jk<duu> $$0) {
      this($$0.h().collect(Collectors.toMap(ix.c::h, ix.c::a)));
   }

   public static Stream<akl<duu>> a(Stream<akl<duu>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dxo a(jl $$0, dsy $$1) {
      jk<dut> $$2 = $$0.d(lf.aE);
      Map<akl<duu>, duu> $$3 = a($$2, this.b, $$1);
      return new dxo($$3);
   }

   public static Map<akl<duu>, duu> a(jk<dut> $$0, Map<akl<duu>, duu> $$1, dsy $$2) {
      duu $$3 = $$1.get(duu.b);
      ix<dut> $$4 = (ix<dut>)($$3 == null ? $$0.g(dur.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akl<duu>, duu> a(Map<akl<duu>, duu> $$0, ix<dut> $$1, dsy $$2) {
      Builder<akl<duu>, duu> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(duu.b, new duu($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dsy a() {
      duu $$0 = this.b.get(duu.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<duu> a(akl<duu> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akl<dax>> b() {
      return this.d().keySet().stream().map(lf::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dwk;
   }

   private static eoz.a b(jk<duu> $$0) {
      return $$0.e(duu.b).map($$0x -> {
         dsy $$1 = $$0x.b();
         if ($$1 instanceof dwk) {
            return eoz.a.c;
         } else {
            return $$1 instanceof dwo ? eoz.a.b : eoz.a.a;
         }
      }).orElse(eoz.a.a);
   }

   static Lifecycle a(akl<duu> $$0, duu $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akl<duu> $$0, duu $$1) {
      if ($$0 == duu.b) {
         return a($$1);
      } else if ($$0 == duu.c) {
         return b($$1);
      } else {
         return $$0 == duu.d ? c($$1) : false;
      }
   }

   private static boolean a(duu $$0) {
      ix<dut> $$1 = $$0.a();
      if (!$$1.a(dur.a) && !$$1.a(dur.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof dcj $$2 && !$$2.a(dcl.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(duu $$0) {
      return $$0.a().a(dur.b) && $$0.b() instanceof dww $$1 && $$1.a(dwy.f) && $$1.c() instanceof dcj $$2 && $$2.a(dcl.a);
   }

   private static boolean c(duu $$0) {
      return $$0.a().a(dur.c) && $$0.b() instanceof dww $$1 && $$1.a(dwy.g) && $$1.c() instanceof dcn;
   }

   public dxo.b a(jk<duu> $$0) {
      Stream<akl<duu>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(akl<duu> a, duu b) {

         jj c() {
            return new jj(Optional.empty(), dxo.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jt<duu> $$4 = new jf<>(lf.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jk<duu> $$5 = $$4.l();
      eoz.a $$6 = b($$5);
      return new dxo.b($$5.l(), $$6);
   }

   public Map<akl<duu>, duu> d() {
      return this.b;
   }

   public static record b(jk<duu> a, eoz.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jl.b b() {
         return new jl.c(List.of(this.a)).d();
      }

      public jk<duu> c() {
         return this.a;
      }

      public eoz.a d() {
         return this.b;
      }
   }
}
