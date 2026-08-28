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

public record ehn(Map<alf<eer>, eer> b) {
   public static final MapCodec<ehn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alf.a(mh.bq), eer.a).fieldOf("dimensions").forGetter(ehn::d)).apply($$0, $$0.stable(ehn::new))
   );
   private static final Set<alf<eer>> c = ImmutableSet.of(eer.b, eer.c, eer.d);
   private static final int d = c.size();

   public ehn(Map<alf<eer>, eer> b) {
      eer $$1 = b.get(eer.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ehn(js<eer> $$0) {
      this($$0.c().collect(Collectors.toMap(jf.c::h, jf.c::a)));
   }

   public static Stream<alf<eer>> a(Stream<alf<eer>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ehn a(jh.a $$0, ecr $$1) {
      jh<eeq> $$2 = $$0.e(mh.aP);
      Map<alf<eer>, eer> $$3 = a($$2, this.b, $$1);
      return new ehn($$3);
   }

   public static Map<alf<eer>, eer> a(jh<eeq> $$0, Map<alf<eer>, eer> $$1, ecr $$2) {
      eer $$3 = $$1.get(eer.b);
      jf<eeq> $$4 = (jf<eeq>)($$3 == null ? $$0.b(eeo.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alf<eer>, eer> a(Map<alf<eer>, eer> $$0, jf<eeq> $$1, ecr $$2) {
      Builder<alf<eer>, eer> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(eer.b, new eer($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public ecr a() {
      eer $$0 = this.b.get(eer.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<eer> a(alf<eer> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alf<djm>> b() {
      return this.d().keySet().stream().map(mh::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof egj;
   }

   private static ezl.a b(js<eer> $$0) {
      return $$0.f(eer.b).map($$0x -> {
         ecr $$1 = $$0x.b();
         if ($$1 instanceof egj) {
            return ezl.a.c;
         } else {
            return $$1 instanceof egn ? ezl.a.b : ezl.a.a;
         }
      }).orElse(ezl.a.a);
   }

   static Lifecycle a(alf<eer> $$0, eer $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alf<eer> $$0, eer $$1) {
      if ($$0 == eer.b) {
         return a($$1);
      } else if ($$0 == eer.c) {
         return b($$1);
      } else {
         return $$0 == eer.d ? c($$1) : false;
      }
   }

   private static boolean a(eer $$0) {
      jf<eeq> $$1 = $$0.a();
      if (!$$1.a(eeo.a) && !$$1.a(eeo.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dlc $$2 && !$$2.a(dle.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(eer $$0) {
      return $$0.a().a(eeo.b) && $$0.b() instanceof egv $$1 && $$1.a(egx.f) && $$1.d() instanceof dlc $$2 && $$2.a(dle.a);
   }

   private static boolean c(eer $$0) {
      return $$0.a().a(eeo.c) && $$0.b() instanceof egv $$1 && $$1.a(egx.g) && $$1.d() instanceof dlg;
   }

   public ehn.b a(js<eer> $$0) {
      Stream<alf<eer>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alf<eer> a, eer b) {

         jr c() {
            return new jr(Optional.empty(), ehn.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kb<eer> $$4 = new jn<>(mh.bq, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      js<eer> $$5 = $$4.n();
      ezl.a $$6 = b($$5);
      return new ehn.b($$5.n(), $$6);
   }

   public Map<alf<eer>, eer> d() {
      return this.b;
   }

   public static record b(js<eer> a, ezl.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public jt.b b() {
         return new jt.c(List.of(this.a)).e();
      }

      public js<eer> c() {
         return this.a;
      }

      public ezl.a d() {
         return this.b;
      }
   }
}
