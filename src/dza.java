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

public record dza(Map<akj<dwg>, dwg> b) {
   public static final MapCodec<dza> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akj.a(lr.ba), dwg.a).fieldOf("dimensions").forGetter(dza::d)).apply($$0, $$0.stable(dza::new))
   );
   private static final Set<akj<dwg>> c = ImmutableSet.of(dwg.b, dwg.c, dwg.d);
   private static final int d = c.size();

   public dza(Map<akj<dwg>, dwg> b) {
      dwg $$1 = b.get(dwg.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dza(jw<dwg> $$0) {
      this($$0.i().collect(Collectors.toMap(jj.c::h, jj.c::a)));
   }

   public static Stream<akj<dwg>> a(Stream<akj<dwg>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dza a(jx $$0, duh $$1) {
      jw<dwf> $$2 = $$0.d(lr.aJ);
      Map<akj<dwg>, dwg> $$3 = a($$2, this.b, $$1);
      return new dza($$3);
   }

   public static Map<akj<dwg>, dwg> a(jw<dwf> $$0, Map<akj<dwg>, dwg> $$1, duh $$2) {
      dwg $$3 = $$1.get(dwg.b);
      jj<dwf> $$4 = (jj<dwf>)($$3 == null ? $$0.g(dwd.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akj<dwg>, dwg> a(Map<akj<dwg>, dwg> $$0, jj<dwf> $$1, duh $$2) {
      Builder<akj<dwg>, dwg> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dwg.b, new dwg($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public duh a() {
      dwg $$0 = this.b.get(dwg.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dwg> a(akj<dwg> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akj<dcf>> b() {
      return this.d().keySet().stream().map(lr::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxw;
   }

   private static eqm.a b(jw<dwg> $$0) {
      return $$0.e(dwg.b).map($$0x -> {
         duh $$1 = $$0x.b();
         if ($$1 instanceof dxw) {
            return eqm.a.c;
         } else {
            return $$1 instanceof dya ? eqm.a.b : eqm.a.a;
         }
      }).orElse(eqm.a.a);
   }

   static Lifecycle a(akj<dwg> $$0, dwg $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akj<dwg> $$0, dwg $$1) {
      if ($$0 == dwg.b) {
         return a($$1);
      } else if ($$0 == dwg.c) {
         return b($$1);
      } else {
         return $$0 == dwg.d ? c($$1) : false;
      }
   }

   private static boolean a(dwg $$0) {
      jj<dwf> $$1 = $$0.a();
      if (!$$1.a(dwd.a) && !$$1.a(dwd.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dds $$2 && !$$2.a(ddu.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dwg $$0) {
      return $$0.a().a(dwd.b) && $$0.b() instanceof dyi $$1 && $$1.a(dyk.f) && $$1.d() instanceof dds $$2 && $$2.a(ddu.a);
   }

   private static boolean c(dwg $$0) {
      return $$0.a().a(dwd.c) && $$0.b() instanceof dyi $$1 && $$1.a(dyk.g) && $$1.d() instanceof ddw;
   }

   public dza.b a(jw<dwg> $$0) {
      Stream<akj<dwg>> $$1 = Stream.concat($$0.g().stream(), this.b.keySet().stream()).distinct();

      record a(akj<dwg> a, dwg b) {

         jv c() {
            return new jv(Optional.empty(), dza.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kf<dwg> $$4 = new jr<>(lr.ba, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jw<dwg> $$5 = $$4.m();
      eqm.a $$6 = b($$5);
      return new dza.b($$5.m(), $$6);
   }

   public Map<akj<dwg>, dwg> d() {
      return this.b;
   }

   public static record b(jw<dwg> a, eqm.a b) {
      public Lifecycle a() {
         return this.a.e();
      }

      public jx.b b() {
         return new jx.c(List.of(this.a)).d();
      }

      public jw<dwg> c() {
         return this.a;
      }

      public eqm.a d() {
         return this.b;
      }
   }
}
