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

public record ehy(Map<alh<efc>, efc> b) {
   public static final MapCodec<ehy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alh.a(mh.bq), efc.a).fieldOf("dimensions").forGetter(ehy::d)).apply($$0, $$0.stable(ehy::new))
   );
   private static final Set<alh<efc>> c = ImmutableSet.of(efc.b, efc.c, efc.d);
   private static final int d = c.size();

   public ehy(Map<alh<efc>, efc> b) {
      efc $$1 = b.get(efc.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ehy(js<efc> $$0) {
      this($$0.c().collect(Collectors.toMap(jf.c::h, jf.c::a)));
   }

   public static Stream<alh<efc>> a(Stream<alh<efc>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ehy a(jh.a $$0, edc $$1) {
      jh<efb> $$2 = $$0.e(mh.aP);
      Map<alh<efc>, efc> $$3 = a($$2, this.b, $$1);
      return new ehy($$3);
   }

   public static Map<alh<efc>, efc> a(jh<efb> $$0, Map<alh<efc>, efc> $$1, edc $$2) {
      efc $$3 = $$1.get(efc.b);
      jf<efb> $$4 = (jf<efb>)($$3 == null ? $$0.b(eez.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alh<efc>, efc> a(Map<alh<efc>, efc> $$0, jf<efb> $$1, edc $$2) {
      Builder<alh<efc>, efc> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(efc.b, new efc($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public edc a() {
      efc $$0 = this.b.get(efc.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<efc> a(alh<efc> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alh<djx>> b() {
      return this.d().keySet().stream().map(mh::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof egu;
   }

   private static ezz.a b(js<efc> $$0) {
      return $$0.f(efc.b).map($$0x -> {
         edc $$1 = $$0x.b();
         if ($$1 instanceof egu) {
            return ezz.a.c;
         } else {
            return $$1 instanceof egy ? ezz.a.b : ezz.a.a;
         }
      }).orElse(ezz.a.a);
   }

   static Lifecycle a(alh<efc> $$0, efc $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alh<efc> $$0, efc $$1) {
      if ($$0 == efc.b) {
         return a($$1);
      } else if ($$0 == efc.c) {
         return b($$1);
      } else {
         return $$0 == efc.d ? c($$1) : false;
      }
   }

   private static boolean a(efc $$0) {
      jf<efb> $$1 = $$0.a();
      if (!$$1.a(eez.a) && !$$1.a(eez.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dln $$2 && !$$2.a(dlp.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(efc $$0) {
      return $$0.a().a(eez.b) && $$0.b() instanceof ehg $$1 && $$1.a(ehi.f) && $$1.d() instanceof dln $$2 && $$2.a(dlp.a);
   }

   private static boolean c(efc $$0) {
      return $$0.a().a(eez.c) && $$0.b() instanceof ehg $$1 && $$1.a(ehi.g) && $$1.d() instanceof dlr;
   }

   public ehy.b a(js<efc> $$0) {
      Stream<alh<efc>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alh<efc> a, efc b) {

         jr c() {
            return new jr(Optional.empty(), ehy.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kb<efc> $$4 = new jn<>(mh.bq, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      js<efc> $$5 = $$4.n();
      ezz.a $$6 = b($$5);
      return new ehy.b($$5.n(), $$6);
   }

   public Map<alh<efc>, efc> d() {
      return this.b;
   }

   public static record b(js<efc> a, ezz.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public jt.b b() {
         return new jt.c(List.of(this.a)).e();
      }

      public js<efc> c() {
         return this.a;
      }

      public ezz.a d() {
         return this.b;
      }
   }
}
