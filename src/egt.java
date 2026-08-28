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

public record egt(Map<alf<edx>, edx> b) {
   public static final MapCodec<egt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alf.a(mg.bo), edx.a).fieldOf("dimensions").forGetter(egt::d)).apply($$0, $$0.stable(egt::new))
   );
   private static final Set<alf<edx>> c = ImmutableSet.of(edx.b, edx.c, edx.d);
   private static final int d = c.size();

   public egt(Map<alf<edx>, edx> b) {
      edx $$1 = b.get(edx.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public egt(jr<edx> $$0) {
      this($$0.c().collect(Collectors.toMap(je.c::h, je.c::a)));
   }

   public static Stream<alf<edx>> a(Stream<alf<edx>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public egt a(jg.a $$0, ebx $$1) {
      jg<edw> $$2 = $$0.e(mg.aO);
      Map<alf<edx>, edx> $$3 = a($$2, this.b, $$1);
      return new egt($$3);
   }

   public static Map<alf<edx>, edx> a(jg<edw> $$0, Map<alf<edx>, edx> $$1, ebx $$2) {
      edx $$3 = $$1.get(edx.b);
      je<edw> $$4 = (je<edw>)($$3 == null ? $$0.b(edu.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alf<edx>, edx> a(Map<alf<edx>, edx> $$0, je<edw> $$1, ebx $$2) {
      Builder<alf<edx>, edx> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(edx.b, new edx($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public ebx a() {
      edx $$0 = this.b.get(edx.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<edx> a(alf<edx> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alf<div>> b() {
      return this.d().keySet().stream().map(mg::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof efp;
   }

   private static eyr.a b(jr<edx> $$0) {
      return $$0.f(edx.b).map($$0x -> {
         ebx $$1 = $$0x.b();
         if ($$1 instanceof efp) {
            return eyr.a.c;
         } else {
            return $$1 instanceof eft ? eyr.a.b : eyr.a.a;
         }
      }).orElse(eyr.a.a);
   }

   static Lifecycle a(alf<edx> $$0, edx $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alf<edx> $$0, edx $$1) {
      if ($$0 == edx.b) {
         return a($$1);
      } else if ($$0 == edx.c) {
         return b($$1);
      } else {
         return $$0 == edx.d ? c($$1) : false;
      }
   }

   private static boolean a(edx $$0) {
      je<edw> $$1 = $$0.a();
      if (!$$1.a(edu.a) && !$$1.a(edu.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dkl $$2 && !$$2.a(dkn.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(edx $$0) {
      return $$0.a().a(edu.b) && $$0.b() instanceof egb $$1 && $$1.a(egd.f) && $$1.d() instanceof dkl $$2 && $$2.a(dkn.a);
   }

   private static boolean c(edx $$0) {
      return $$0.a().a(edu.c) && $$0.b() instanceof egb $$1 && $$1.a(egd.g) && $$1.d() instanceof dkp;
   }

   public egt.b a(jr<edx> $$0) {
      Stream<alf<edx>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alf<edx> a, edx b) {

         jq c() {
            return new jq(Optional.empty(), egt.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ka<edx> $$4 = new jm<>(mg.bo, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jr<edx> $$5 = $$4.n();
      eyr.a $$6 = b($$5);
      return new egt.b($$5.n(), $$6);
   }

   public Map<alf<edx>, edx> d() {
      return this.b;
   }

   public static record b(jr<edx> a, eyr.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public js.b b() {
         return new js.c(List.of(this.a)).e();
      }

      public jr<edx> c() {
         return this.a;
      }

      public eyr.a d() {
         return this.b;
      }
   }
}
