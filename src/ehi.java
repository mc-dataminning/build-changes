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

public record ehi(Map<alf<eem>, eem> b) {
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alf.a(mh.bp), eem.a).fieldOf("dimensions").forGetter(ehi::d)).apply($$0, $$0.stable(ehi::new))
   );
   private static final Set<alf<eem>> c = ImmutableSet.of(eem.b, eem.c, eem.d);
   private static final int d = c.size();

   public ehi(Map<alf<eem>, eem> b) {
      eem $$1 = b.get(eem.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ehi(js<eem> $$0) {
      this($$0.c().collect(Collectors.toMap(jf.c::h, jf.c::a)));
   }

   public static Stream<alf<eem>> a(Stream<alf<eem>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ehi a(jh.a $$0, ecm $$1) {
      jh<eel> $$2 = $$0.e(mh.aP);
      Map<alf<eem>, eem> $$3 = a($$2, this.b, $$1);
      return new ehi($$3);
   }

   public static Map<alf<eem>, eem> a(jh<eel> $$0, Map<alf<eem>, eem> $$1, ecm $$2) {
      eem $$3 = $$1.get(eem.b);
      jf<eel> $$4 = (jf<eel>)($$3 == null ? $$0.b(eej.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alf<eem>, eem> a(Map<alf<eem>, eem> $$0, jf<eel> $$1, ecm $$2) {
      Builder<alf<eem>, eem> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(eem.b, new eem($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public ecm a() {
      eem $$0 = this.b.get(eem.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<eem> a(alf<eem> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alf<djh>> b() {
      return this.d().keySet().stream().map(mh::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof ege;
   }

   private static ezg.a b(js<eem> $$0) {
      return $$0.f(eem.b).map($$0x -> {
         ecm $$1 = $$0x.b();
         if ($$1 instanceof ege) {
            return ezg.a.c;
         } else {
            return $$1 instanceof egi ? ezg.a.b : ezg.a.a;
         }
      }).orElse(ezg.a.a);
   }

   static Lifecycle a(alf<eem> $$0, eem $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alf<eem> $$0, eem $$1) {
      if ($$0 == eem.b) {
         return a($$1);
      } else if ($$0 == eem.c) {
         return b($$1);
      } else {
         return $$0 == eem.d ? c($$1) : false;
      }
   }

   private static boolean a(eem $$0) {
      jf<eel> $$1 = $$0.a();
      if (!$$1.a(eej.a) && !$$1.a(eej.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dkx $$2 && !$$2.a(dkz.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(eem $$0) {
      return $$0.a().a(eej.b) && $$0.b() instanceof egq $$1 && $$1.a(egs.f) && $$1.d() instanceof dkx $$2 && $$2.a(dkz.a);
   }

   private static boolean c(eem $$0) {
      return $$0.a().a(eej.c) && $$0.b() instanceof egq $$1 && $$1.a(egs.g) && $$1.d() instanceof dlb;
   }

   public ehi.b a(js<eem> $$0) {
      Stream<alf<eem>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alf<eem> a, eem b) {

         jr c() {
            return new jr(Optional.empty(), ehi.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kb<eem> $$4 = new jn<>(mh.bp, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      js<eem> $$5 = $$4.n();
      ezg.a $$6 = b($$5);
      return new ehi.b($$5.n(), $$6);
   }

   public Map<alf<eem>, eem> d() {
      return this.b;
   }

   public static record b(js<eem> a, ezg.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public jt.b b() {
         return new jt.c(List.of(this.a)).e();
      }

      public js<eem> c() {
         return this.a;
      }

      public ezg.a d() {
         return this.b;
      }
   }
}
