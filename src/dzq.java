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

public record dzq(Map<akp<dww>, dww> b) {
   public static final MapCodec<dzq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akp.a(lu.bb), dww.a).fieldOf("dimensions").forGetter(dzq::d)).apply($$0, $$0.stable(dzq::new))
   );
   private static final Set<akp<dww>> c = ImmutableSet.of(dww.b, dww.c, dww.d);
   private static final int d = c.size();

   public dzq(Map<akp<dww>, dww> b) {
      dww $$1 = b.get(dww.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dzq(jz<dww> $$0) {
      this($$0.i().collect(Collectors.toMap(jm.c::h, jm.c::a)));
   }

   public static Stream<akp<dww>> a(Stream<akp<dww>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dzq a(ka $$0, dux $$1) {
      jz<dwv> $$2 = $$0.d(lu.aK);
      Map<akp<dww>, dww> $$3 = a($$2, this.b, $$1);
      return new dzq($$3);
   }

   public static Map<akp<dww>, dww> a(jz<dwv> $$0, Map<akp<dww>, dww> $$1, dux $$2) {
      dww $$3 = $$1.get(dww.b);
      jm<dwv> $$4 = (jm<dwv>)($$3 == null ? $$0.g(dwt.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akp<dww>, dww> a(Map<akp<dww>, dww> $$0, jm<dwv> $$1, dux $$2) {
      Builder<akp<dww>, dww> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dww.b, new dww($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dux a() {
      dww $$0 = this.b.get(dww.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dww> a(akp<dww> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akp<dcu>> b() {
      return this.d().keySet().stream().map(lu::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dym;
   }

   private static erd.a b(jz<dww> $$0) {
      return $$0.e(dww.b).map($$0x -> {
         dux $$1 = $$0x.b();
         if ($$1 instanceof dym) {
            return erd.a.c;
         } else {
            return $$1 instanceof dyq ? erd.a.b : erd.a.a;
         }
      }).orElse(erd.a.a);
   }

   static Lifecycle a(akp<dww> $$0, dww $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akp<dww> $$0, dww $$1) {
      if ($$0 == dww.b) {
         return a($$1);
      } else if ($$0 == dww.c) {
         return b($$1);
      } else {
         return $$0 == dww.d ? c($$1) : false;
      }
   }

   private static boolean a(dww $$0) {
      jm<dwv> $$1 = $$0.a();
      if (!$$1.a(dwt.a) && !$$1.a(dwt.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof deh $$2 && !$$2.a(dej.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dww $$0) {
      return $$0.a().a(dwt.b) && $$0.b() instanceof dyy $$1 && $$1.a(dza.f) && $$1.d() instanceof deh $$2 && $$2.a(dej.a);
   }

   private static boolean c(dww $$0) {
      return $$0.a().a(dwt.c) && $$0.b() instanceof dyy $$1 && $$1.a(dza.g) && $$1.d() instanceof del;
   }

   public dzq.b a(jz<dww> $$0) {
      Stream<akp<dww>> $$1 = Stream.concat($$0.g().stream(), this.b.keySet().stream()).distinct();

      record a(akp<dww> a, dww b) {

         jy c() {
            return new jy(Optional.empty(), dzq.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ki<dww> $$4 = new ju<>(lu.bb, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jz<dww> $$5 = $$4.m();
      erd.a $$6 = b($$5);
      return new dzq.b($$5.m(), $$6);
   }

   public Map<akp<dww>, dww> d() {
      return this.b;
   }

   public static record b(jz<dww> a, erd.a b) {
      public Lifecycle a() {
         return this.a.e();
      }

      public ka.b b() {
         return new ka.c(List.of(this.a)).d();
      }

      public jz<dww> c() {
         return this.a;
      }

      public erd.a d() {
         return this.b;
      }
   }
}
