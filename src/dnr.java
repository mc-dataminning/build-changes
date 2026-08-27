import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record dnr(is<dkx> b) {
   public static final MapCodec<dnr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iu.b(kd.aK, Lifecycle.stable(), dkx.a).fieldOf("dimensions").forGetter(dnr::d)).apply($$0, $$0.stable(dnr::new))
   );
   private static final Set<agl<dkx>> c = ImmutableSet.of(dkx.b, dkx.c, dkx.d);
   private static final int d = c.size();

   public dnr(is<dkx> b) {
      dkx $$1 = b.a(dkx.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<agl<dkx>> a(Stream<agl<dkx>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dnr a(it $$0, djk $$1) {
      is<dkw> $$2 = $$0.d(kd.aw);
      is<dkx> $$3 = a($$2, this.b, $$1);
      return new dnr($$3);
   }

   public static is<dkx> a(is<dkw> $$0, is<dkx> $$1, djk $$2) {
      dkx $$3 = $$1.a(dkx.b);
      ig<dkw> $$4 = (ig<dkw>)($$3 == null ? $$0.f(dku.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static is<dkx> a(is<dkx> $$0, ig<dkw> $$1, djk $$2) {
      jb<dkx> $$3 = new io<>(kd.aK, Lifecycle.experimental());
      $$3.a(dkx.b, new dkx($$1, $$2), Lifecycle.stable());

      for (Entry<agl<dkx>, dkx> $$4 : $$0.g()) {
         agl<dkx> $$5 = $$4.getKey();
         if ($$5 != dkx.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public djk a() {
      dkx $$0 = this.b.a(dkx.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dkx> a(agl<dkx> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<agl<csf>> b() {
      return this.d().g().stream().map(Entry::getKey).map(kd::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dmn;
   }

   private static eew.a b(is<dkx> $$0) {
      return $$0.d(dkx.b).map($$0x -> {
         djk $$1 = $$0x.b();
         if ($$1 instanceof dmn) {
            return eew.a.c;
         } else {
            return $$1 instanceof dmr ? eew.a.b : eew.a.a;
         }
      }).orElse(eew.a.a);
   }

   static Lifecycle a(agl<dkx> $$0, dkx $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(agl<dkx> $$0, dkx $$1) {
      if ($$0 == dkx.b) {
         return a($$1);
      } else if ($$0 == dkx.c) {
         return b($$1);
      } else {
         return $$0 == dkx.d ? c($$1) : false;
      }
   }

   private static boolean a(dkx $$0) {
      ig<dkw> $$1 = $$0.a();
      if (!$$1.a(dku.a) && !$$1.a(dku.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof ctq $$2 && !$$2.a(cts.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dkx $$0) {
      return $$0.a().a(dku.b) && $$0.b() instanceof dmz $$1 && $$1.a(dnb.f) && $$1.c() instanceof ctq $$2 && $$2.a(cts.a);
   }

   private static boolean c(dkx $$0) {
      return $$0.a().a(dku.c) && $$0.b() instanceof dmz $$1 && $$1.a(dnb.g) && $$1.c() instanceof ctu;
   }

   public dnr.b a(is<dkx> $$0) {
      Stream<agl<dkx>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(agl<dkx> a, dkx b) {

         Lifecycle c() {
            return dnr.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jb<dkx> $$4 = new io<>(kd.aK, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      is<dkx> $$5 = $$4.l();
      eew.a $$6 = b($$5);
      return new dnr.b($$5.l(), $$6);
   }

   public is<dkx> d() {
      return this.b;
   }

   public static record b(is<dkx> a, eew.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public it.b b() {
         return new it.c(List.of(this.a)).c();
      }

      public is<dkx> c() {
         return this.a;
      }

      public eew.a d() {
         return this.b;
      }
   }
}
