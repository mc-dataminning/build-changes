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

public record egi(Map<ald<edm>, edm> b) {
   public static final MapCodec<egi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ald.a(mg.bn), edm.a).fieldOf("dimensions").forGetter(egi::d)).apply($$0, $$0.stable(egi::new))
   );
   private static final Set<ald<edm>> c = ImmutableSet.of(edm.b, edm.c, edm.d);
   private static final int d = c.size();

   public egi(Map<ald<edm>, edm> b) {
      edm $$1 = b.get(edm.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public egi(jr<edm> $$0) {
      this($$0.c().collect(Collectors.toMap(je.c::h, je.c::a)));
   }

   public static Stream<ald<edm>> a(Stream<ald<edm>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public egi a(jg.a $$0, ebm $$1) {
      jg<edl> $$2 = $$0.e(mg.aN);
      Map<ald<edm>, edm> $$3 = a($$2, this.b, $$1);
      return new egi($$3);
   }

   public static Map<ald<edm>, edm> a(jg<edl> $$0, Map<ald<edm>, edm> $$1, ebm $$2) {
      edm $$3 = $$1.get(edm.b);
      je<edl> $$4 = (je<edl>)($$3 == null ? $$0.b(edj.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ald<edm>, edm> a(Map<ald<edm>, edm> $$0, je<edl> $$1, ebm $$2) {
      Builder<ald<edm>, edm> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(edm.b, new edm($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public ebm a() {
      edm $$0 = this.b.get(edm.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<edm> a(ald<edm> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ald<dip>> b() {
      return this.d().keySet().stream().map(mg::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof efe;
   }

   private static eyf.a b(jr<edm> $$0) {
      return $$0.f(edm.b).map($$0x -> {
         ebm $$1 = $$0x.b();
         if ($$1 instanceof efe) {
            return eyf.a.c;
         } else {
            return $$1 instanceof efi ? eyf.a.b : eyf.a.a;
         }
      }).orElse(eyf.a.a);
   }

   static Lifecycle a(ald<edm> $$0, edm $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ald<edm> $$0, edm $$1) {
      if ($$0 == edm.b) {
         return a($$1);
      } else if ($$0 == edm.c) {
         return b($$1);
      } else {
         return $$0 == edm.d ? c($$1) : false;
      }
   }

   private static boolean a(edm $$0) {
      je<edl> $$1 = $$0.a();
      if (!$$1.a(edj.a) && !$$1.a(edj.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dkf $$2 && !$$2.a(dkh.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(edm $$0) {
      return $$0.a().a(edj.b) && $$0.b() instanceof efq $$1 && $$1.a(efs.f) && $$1.d() instanceof dkf $$2 && $$2.a(dkh.a);
   }

   private static boolean c(edm $$0) {
      return $$0.a().a(edj.c) && $$0.b() instanceof efq $$1 && $$1.a(efs.g) && $$1.d() instanceof dkj;
   }

   public egi.b a(jr<edm> $$0) {
      Stream<ald<edm>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(ald<edm> a, edm b) {

         jq c() {
            return new jq(Optional.empty(), egi.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ka<edm> $$4 = new jm<>(mg.bn, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jr<edm> $$5 = $$4.n();
      eyf.a $$6 = b($$5);
      return new egi.b($$5.n(), $$6);
   }

   public Map<ald<edm>, edm> d() {
      return this.b;
   }

   public static record b(jr<edm> a, eyf.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public js.b b() {
         return new js.c(List.of(this.a)).e();
      }

      public jr<edm> c() {
         return this.a;
      }

      public eyf.a d() {
         return this.b;
      }
   }
}
