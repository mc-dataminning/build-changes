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

public record dnm(io<dks> b) {
   public static final MapCodec<dnm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iq.b(jz.aK, Lifecycle.stable(), dks.a).fieldOf("dimensions").forGetter(dnm::d)).apply($$0, $$0.stable(dnm::new))
   );
   private static final Set<agh<dks>> c = ImmutableSet.of(dks.b, dks.c, dks.d);
   private static final int d = c.size();

   public dnm(io<dks> b) {
      dks $$1 = b.a(dks.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<agh<dks>> a(Stream<agh<dks>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dnm a(ip $$0, djf $$1) {
      io<dkr> $$2 = $$0.d(jz.aw);
      io<dks> $$3 = a($$2, this.b, $$1);
      return new dnm($$3);
   }

   public static io<dks> a(io<dkr> $$0, io<dks> $$1, djf $$2) {
      dks $$3 = $$1.a(dks.b);
      ib<dkr> $$4 = (ib<dkr>)($$3 == null ? $$0.f(dkp.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static io<dks> a(io<dks> $$0, ib<dkr> $$1, djf $$2) {
      ix<dks> $$3 = new ik<>(jz.aK, Lifecycle.experimental());
      $$3.a(dks.b, new dks($$1, $$2), Lifecycle.stable());

      for (Entry<agh<dks>, dks> $$4 : $$0.g()) {
         agh<dks> $$5 = $$4.getKey();
         if ($$5 != dks.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public djf a() {
      dks $$0 = this.b.a(dks.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dks> a(agh<dks> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<agh<csa>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jz::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dmi;
   }

   private static eer.a b(io<dks> $$0) {
      return $$0.d(dks.b).map($$0x -> {
         djf $$1 = $$0x.b();
         if ($$1 instanceof dmi) {
            return eer.a.c;
         } else {
            return $$1 instanceof dmm ? eer.a.b : eer.a.a;
         }
      }).orElse(eer.a.a);
   }

   static Lifecycle a(agh<dks> $$0, dks $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(agh<dks> $$0, dks $$1) {
      if ($$0 == dks.b) {
         return a($$1);
      } else if ($$0 == dks.c) {
         return b($$1);
      } else {
         return $$0 == dks.d ? c($$1) : false;
      }
   }

   private static boolean a(dks $$0) {
      ib<dkr> $$1 = $$0.a();
      if (!$$1.a(dkp.a) && !$$1.a(dkp.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof ctl $$2 && !$$2.a(ctn.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dks $$0) {
      return $$0.a().a(dkp.b) && $$0.b() instanceof dmu $$1 && $$1.a(dmw.f) && $$1.c() instanceof ctl $$2 && $$2.a(ctn.a);
   }

   private static boolean c(dks $$0) {
      return $$0.a().a(dkp.c) && $$0.b() instanceof dmu $$1 && $$1.a(dmw.g) && $$1.c() instanceof ctp;
   }

   public dnm.b a(io<dks> $$0) {
      Stream<agh<dks>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(agh<dks> a, dks b) {

         Lifecycle c() {
            return dnm.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ix<dks> $$4 = new ik<>(jz.aK, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      io<dks> $$5 = $$4.l();
      eer.a $$6 = b($$5);
      return new dnm.b($$5.l(), $$6);
   }

   public io<dks> d() {
      return this.b;
   }

   public static record b(io<dks> a, eer.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public ip.b b() {
         return new ip.c(List.of(this.a)).c();
      }

      public io<dks> c() {
         return this.a;
      }

      public eer.a d() {
         return this.b;
      }
   }
}
