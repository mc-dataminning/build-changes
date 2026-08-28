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

public record eed(Map<aly<ebj>, ebj> b) {
   public static final MapCodec<eed> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(aly.a(mb.be), ebj.a).fieldOf("dimensions").forGetter(eed::d)).apply($$0, $$0.stable(eed::new))
   );
   private static final Set<aly<ebj>> c = ImmutableSet.of(ebj.b, ebj.c, ebj.d);
   private static final int d = c.size();

   public eed(Map<aly<ebj>, ebj> b) {
      ebj $$1 = b.get(ebj.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public eed(kd<ebj> $$0) {
      this($$0.c().collect(Collectors.toMap(jq.c::h, jq.c::a)));
   }

   public static Stream<aly<ebj>> a(Stream<aly<ebj>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public eed a(js.a $$0, dzj $$1) {
      js<ebi> $$2 = $$0.d(mb.aM);
      Map<aly<ebj>, ebj> $$3 = a($$2, this.b, $$1);
      return new eed($$3);
   }

   public static Map<aly<ebj>, ebj> a(js<ebi> $$0, Map<aly<ebj>, ebj> $$1, dzj $$2) {
      ebj $$3 = $$1.get(ebj.b);
      jq<ebi> $$4 = (jq<ebi>)($$3 == null ? $$0.b(ebg.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<aly<ebj>, ebj> a(Map<aly<ebj>, ebj> $$0, jq<ebi> $$1, dzj $$2) {
      Builder<aly<ebj>, ebj> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(ebj.b, new ebj($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dzj a() {
      ebj $$0 = this.b.get(ebj.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<ebj> a(aly<ebj> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<aly<dha>> b() {
      return this.d().keySet().stream().map(mb::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof ecz;
   }

   private static evz.a b(kd<ebj> $$0) {
      return $$0.f(ebj.b).map($$0x -> {
         dzj $$1 = $$0x.b();
         if ($$1 instanceof ecz) {
            return evz.a.c;
         } else {
            return $$1 instanceof edd ? evz.a.b : evz.a.a;
         }
      }).orElse(evz.a.a);
   }

   static Lifecycle a(aly<ebj> $$0, ebj $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aly<ebj> $$0, ebj $$1) {
      if ($$0 == ebj.b) {
         return a($$1);
      } else if ($$0 == ebj.c) {
         return b($$1);
      } else {
         return $$0 == ebj.d ? c($$1) : false;
      }
   }

   private static boolean a(ebj $$0) {
      jq<ebi> $$1 = $$0.a();
      if (!$$1.a(ebg.a) && !$$1.a(ebg.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dip $$2 && !$$2.a(dir.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(ebj $$0) {
      return $$0.a().a(ebg.b) && $$0.b() instanceof edl $$1 && $$1.a(edn.f) && $$1.d() instanceof dip $$2 && $$2.a(dir.a);
   }

   private static boolean c(ebj $$0) {
      return $$0.a().a(ebg.c) && $$0.b() instanceof edl $$1 && $$1.a(edn.g) && $$1.d() instanceof dit;
   }

   public eed.b a(kd<ebj> $$0) {
      Stream<aly<ebj>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(aly<ebj> a, ebj b) {

         kc c() {
            return new kc(Optional.empty(), eed.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      km<ebj> $$4 = new jy<>(mb.be, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kd<ebj> $$5 = $$4.n();
      evz.a $$6 = b($$5);
      return new eed.b($$5.n(), $$6);
   }

   public Map<aly<ebj>, ebj> d() {
      return this.b;
   }

   public static record b(kd<ebj> a, evz.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ke.b b() {
         return new ke.c(List.of(this.a)).e();
      }

      public kd<ebj> c() {
         return this.a;
      }

      public evz.a d() {
         return this.b;
      }
   }
}
