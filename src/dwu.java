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

public record dwu(Map<akg<dua>, dua> b) {
   public static final MapCodec<dwu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akg.a(le.aT), dua.a).fieldOf("dimensions").forGetter(dwu::d)).apply($$0, $$0.stable(dwu::new))
   );
   private static final Set<akg<dua>> c = ImmutableSet.of(dua.b, dua.c, dua.d);
   private static final int d = c.size();

   public dwu(Map<akg<dua>, dua> b) {
      dua $$1 = b.get(dua.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dwu(jj<dua> $$0) {
      this($$0.h().collect(Collectors.toMap(iw.c::h, iw.c::a)));
   }

   public static Stream<akg<dua>> a(Stream<akg<dua>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dwu a(jk $$0, dse $$1) {
      jj<dtz> $$2 = $$0.d(le.aE);
      Map<akg<dua>, dua> $$3 = a($$2, this.b, $$1);
      return new dwu($$3);
   }

   public static Map<akg<dua>, dua> a(jj<dtz> $$0, Map<akg<dua>, dua> $$1, dse $$2) {
      dua $$3 = $$1.get(dua.b);
      iw<dtz> $$4 = (iw<dtz>)($$3 == null ? $$0.g(dtx.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akg<dua>, dua> a(Map<akg<dua>, dua> $$0, iw<dtz> $$1, dse $$2) {
      Builder<akg<dua>, dua> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dua.b, new dua($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dse a() {
      dua $$0 = this.b.get(dua.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dua> a(akg<dua> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akg<dad>> b() {
      return this.d().keySet().stream().map(le::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dvq;
   }

   private static eof.a b(jj<dua> $$0) {
      return $$0.e(dua.b).map($$0x -> {
         dse $$1 = $$0x.b();
         if ($$1 instanceof dvq) {
            return eof.a.c;
         } else {
            return $$1 instanceof dvu ? eof.a.b : eof.a.a;
         }
      }).orElse(eof.a.a);
   }

   static Lifecycle a(akg<dua> $$0, dua $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akg<dua> $$0, dua $$1) {
      if ($$0 == dua.b) {
         return a($$1);
      } else if ($$0 == dua.c) {
         return b($$1);
      } else {
         return $$0 == dua.d ? c($$1) : false;
      }
   }

   private static boolean a(dua $$0) {
      iw<dtz> $$1 = $$0.a();
      if (!$$1.a(dtx.a) && !$$1.a(dtx.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof dbp $$2 && !$$2.a(dbr.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dua $$0) {
      return $$0.a().a(dtx.b) && $$0.b() instanceof dwc $$1 && $$1.a(dwe.f) && $$1.c() instanceof dbp $$2 && $$2.a(dbr.a);
   }

   private static boolean c(dua $$0) {
      return $$0.a().a(dtx.c) && $$0.b() instanceof dwc $$1 && $$1.a(dwe.g) && $$1.c() instanceof dbt;
   }

   public dwu.b a(jj<dua> $$0) {
      Stream<akg<dua>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(akg<dua> a, dua b) {

         ji c() {
            return new ji(Optional.empty(), dwu.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      js<dua> $$4 = new je<>(le.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jj<dua> $$5 = $$4.l();
      eof.a $$6 = b($$5);
      return new dwu.b($$5.l(), $$6);
   }

   public Map<akg<dua>, dua> d() {
      return this.b;
   }

   public static record b(jj<dua> a, eof.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jk.b b() {
         return new jk.c(List.of(this.a)).d();
      }

      public jj<dua> c() {
         return this.a;
      }

      public eof.a d() {
         return this.b;
      }
   }
}
