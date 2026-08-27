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

public record dvv(Map<aju<dtb>, dtb> b) {
   public static final MapCodec<dvv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(aju.a(ku.aQ), dtb.a).fieldOf("dimensions").forGetter(dvv::d)).apply($$0, $$0.stable(dvv::new))
   );
   private static final Set<aju<dtb>> c = ImmutableSet.of(dtb.b, dtb.c, dtb.d);
   private static final int d = c.size();

   public dvv(Map<aju<dtb>, dtb> b) {
      dtb $$1 = b.get(dtb.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dvv(ja<dtb> $$0) {
      this($$0.h().collect(Collectors.toMap(in.c::h, in.c::a)));
   }

   public static Stream<aju<dtb>> a(Stream<aju<dtb>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dvv a(jb $$0, drf $$1) {
      ja<dta> $$2 = $$0.d(ku.aB);
      Map<aju<dtb>, dtb> $$3 = a($$2, this.b, $$1);
      return new dvv($$3);
   }

   public static Map<aju<dtb>, dtb> a(ja<dta> $$0, Map<aju<dtb>, dtb> $$1, drf $$2) {
      dtb $$3 = $$1.get(dtb.b);
      in<dta> $$4 = (in<dta>)($$3 == null ? $$0.g(dsy.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<aju<dtb>, dtb> a(Map<aju<dtb>, dtb> $$0, in<dta> $$1, drf $$2) {
      Builder<aju<dtb>, dtb> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dtb.b, new dtb($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public drf a() {
      dtb $$0 = this.b.get(dtb.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dtb> a(aju<dtb> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<aju<czg>> b() {
      return this.d().keySet().stream().map(ku::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dur;
   }

   private static ene.a b(ja<dtb> $$0) {
      return $$0.e(dtb.b).map($$0x -> {
         drf $$1 = $$0x.b();
         if ($$1 instanceof dur) {
            return ene.a.c;
         } else {
            return $$1 instanceof duv ? ene.a.b : ene.a.a;
         }
      }).orElse(ene.a.a);
   }

   static Lifecycle a(aju<dtb> $$0, dtb $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aju<dtb> $$0, dtb $$1) {
      if ($$0 == dtb.b) {
         return a($$1);
      } else if ($$0 == dtb.c) {
         return b($$1);
      } else {
         return $$0 == dtb.d ? c($$1) : false;
      }
   }

   private static boolean a(dtb $$0) {
      in<dta> $$1 = $$0.a();
      if (!$$1.a(dsy.a) && !$$1.a(dsy.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof das $$2 && !$$2.a(dau.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dtb $$0) {
      return $$0.a().a(dsy.b) && $$0.b() instanceof dvd $$1 && $$1.a(dvf.f) && $$1.c() instanceof das $$2 && $$2.a(dau.a);
   }

   private static boolean c(dtb $$0) {
      return $$0.a().a(dsy.c) && $$0.b() instanceof dvd $$1 && $$1.a(dvf.g) && $$1.c() instanceof daw;
   }

   public dvv.b a(ja<dtb> $$0) {
      Stream<aju<dtb>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(aju<dtb> a, dtb b) {

         iz c() {
            return new iz(Optional.empty(), dvv.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jj<dtb> $$4 = new iv<>(ku.aQ, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ja<dtb> $$5 = $$4.l();
      ene.a $$6 = b($$5);
      return new dvv.b($$5.l(), $$6);
   }

   public Map<aju<dtb>, dtb> d() {
      return this.b;
   }

   public static record b(ja<dtb> a, ene.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jb.b b() {
         return new jb.c(List.of(this.a)).d();
      }

      public ja<dtb> c() {
         return this.a;
      }

      public ene.a d() {
         return this.b;
      }
   }
}
