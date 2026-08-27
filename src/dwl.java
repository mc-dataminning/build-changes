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

public record dwl(Map<ake<dtr>, dtr> b) {
   public static final MapCodec<dwl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ake.a(ld.aS), dtr.a).fieldOf("dimensions").forGetter(dwl::d)).apply($$0, $$0.stable(dwl::new))
   );
   private static final Set<ake<dtr>> c = ImmutableSet.of(dtr.b, dtr.c, dtr.d);
   private static final int d = c.size();

   public dwl(Map<ake<dtr>, dtr> b) {
      dtr $$1 = b.get(dtr.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dwl(ji<dtr> $$0) {
      this($$0.h().collect(Collectors.toMap(iv.c::h, iv.c::a)));
   }

   public static Stream<ake<dtr>> a(Stream<ake<dtr>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dwl a(jj $$0, drv $$1) {
      ji<dtq> $$2 = $$0.d(ld.aD);
      Map<ake<dtr>, dtr> $$3 = a($$2, this.b, $$1);
      return new dwl($$3);
   }

   public static Map<ake<dtr>, dtr> a(ji<dtq> $$0, Map<ake<dtr>, dtr> $$1, drv $$2) {
      dtr $$3 = $$1.get(dtr.b);
      iv<dtq> $$4 = (iv<dtq>)($$3 == null ? $$0.g(dto.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ake<dtr>, dtr> a(Map<ake<dtr>, dtr> $$0, iv<dtq> $$1, drv $$2) {
      Builder<ake<dtr>, dtr> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dtr.b, new dtr($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public drv a() {
      dtr $$0 = this.b.get(dtr.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dtr> a(ake<dtr> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ake<czu>> b() {
      return this.d().keySet().stream().map(ld::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dvh;
   }

   private static enu.a b(ji<dtr> $$0) {
      return $$0.e(dtr.b).map($$0x -> {
         drv $$1 = $$0x.b();
         if ($$1 instanceof dvh) {
            return enu.a.c;
         } else {
            return $$1 instanceof dvl ? enu.a.b : enu.a.a;
         }
      }).orElse(enu.a.a);
   }

   static Lifecycle a(ake<dtr> $$0, dtr $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ake<dtr> $$0, dtr $$1) {
      if ($$0 == dtr.b) {
         return a($$1);
      } else if ($$0 == dtr.c) {
         return b($$1);
      } else {
         return $$0 == dtr.d ? c($$1) : false;
      }
   }

   private static boolean a(dtr $$0) {
      iv<dtq> $$1 = $$0.a();
      if (!$$1.a(dto.a) && !$$1.a(dto.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof dbg $$2 && !$$2.a(dbi.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dtr $$0) {
      return $$0.a().a(dto.b) && $$0.b() instanceof dvt $$1 && $$1.a(dvv.f) && $$1.c() instanceof dbg $$2 && $$2.a(dbi.a);
   }

   private static boolean c(dtr $$0) {
      return $$0.a().a(dto.c) && $$0.b() instanceof dvt $$1 && $$1.a(dvv.g) && $$1.c() instanceof dbk;
   }

   public dwl.b a(ji<dtr> $$0) {
      Stream<ake<dtr>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ake<dtr> a, dtr b) {

         jh c() {
            return new jh(Optional.empty(), dwl.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jr<dtr> $$4 = new jd<>(ld.aS, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ji<dtr> $$5 = $$4.l();
      enu.a $$6 = b($$5);
      return new dwl.b($$5.l(), $$6);
   }

   public Map<ake<dtr>, dtr> d() {
      return this.b;
   }

   public static record b(ji<dtr> a, enu.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jj.b b() {
         return new jj.c(List.of(this.a)).d();
      }

      public ji<dtr> c() {
         return this.a;
      }

      public enu.a d() {
         return this.b;
      }
   }
}
