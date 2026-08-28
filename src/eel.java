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

public record eel(Map<aly<ebr>, ebr> b) {
   public static final MapCodec<eel> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(aly.a(mb.bf), ebr.a).fieldOf("dimensions").forGetter(eel::d)).apply($$0, $$0.stable(eel::new))
   );
   private static final Set<aly<ebr>> c = ImmutableSet.of(ebr.b, ebr.c, ebr.d);
   private static final int d = c.size();

   public eel(Map<aly<ebr>, ebr> b) {
      ebr $$1 = b.get(ebr.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public eel(kd<ebr> $$0) {
      this($$0.c().collect(Collectors.toMap(jq.c::h, jq.c::a)));
   }

   public static Stream<aly<ebr>> a(Stream<aly<ebr>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public eel a(js.a $$0, dzr $$1) {
      js<ebq> $$2 = $$0.d(mb.aN);
      Map<aly<ebr>, ebr> $$3 = a($$2, this.b, $$1);
      return new eel($$3);
   }

   public static Map<aly<ebr>, ebr> a(js<ebq> $$0, Map<aly<ebr>, ebr> $$1, dzr $$2) {
      ebr $$3 = $$1.get(ebr.b);
      jq<ebq> $$4 = (jq<ebq>)($$3 == null ? $$0.b(ebo.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<aly<ebr>, ebr> a(Map<aly<ebr>, ebr> $$0, jq<ebq> $$1, dzr $$2) {
      Builder<aly<ebr>, ebr> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(ebr.b, new ebr($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dzr a() {
      ebr $$0 = this.b.get(ebr.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<ebr> a(aly<ebr> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<aly<dhi>> b() {
      return this.d().keySet().stream().map(mb::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof edh;
   }

   private static ewh.a b(kd<ebr> $$0) {
      return $$0.f(ebr.b).map($$0x -> {
         dzr $$1 = $$0x.b();
         if ($$1 instanceof edh) {
            return ewh.a.c;
         } else {
            return $$1 instanceof edl ? ewh.a.b : ewh.a.a;
         }
      }).orElse(ewh.a.a);
   }

   static Lifecycle a(aly<ebr> $$0, ebr $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aly<ebr> $$0, ebr $$1) {
      if ($$0 == ebr.b) {
         return a($$1);
      } else if ($$0 == ebr.c) {
         return b($$1);
      } else {
         return $$0 == ebr.d ? c($$1) : false;
      }
   }

   private static boolean a(ebr $$0) {
      jq<ebq> $$1 = $$0.a();
      if (!$$1.a(ebo.a) && !$$1.a(ebo.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dix $$2 && !$$2.a(diz.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(ebr $$0) {
      return $$0.a().a(ebo.b) && $$0.b() instanceof edt $$1 && $$1.a(edv.f) && $$1.d() instanceof dix $$2 && $$2.a(diz.a);
   }

   private static boolean c(ebr $$0) {
      return $$0.a().a(ebo.c) && $$0.b() instanceof edt $$1 && $$1.a(edv.g) && $$1.d() instanceof djb;
   }

   public eel.b a(kd<ebr> $$0) {
      Stream<aly<ebr>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(aly<ebr> a, ebr b) {

         kc c() {
            return new kc(Optional.empty(), eel.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      km<ebr> $$4 = new jy<>(mb.bf, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kd<ebr> $$5 = $$4.n();
      ewh.a $$6 = b($$5);
      return new eel.b($$5.n(), $$6);
   }

   public Map<aly<ebr>, ebr> d() {
      return this.b;
   }

   public static record b(kd<ebr> a, ewh.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ke.b b() {
         return new ke.c(List.of(this.a)).e();
      }

      public kd<ebr> c() {
         return this.a;
      }

      public ewh.a d() {
         return this.b;
      }
   }
}
