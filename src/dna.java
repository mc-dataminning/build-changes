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

public record dna(io<dkg> b) {
   public static final MapCodec<dna> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iq.b(jz.aK, Lifecycle.stable(), dkg.a).fieldOf("dimensions").forGetter(dna::d)).apply($$0, $$0.stable(dna::new))
   );
   private static final Set<agf<dkg>> c = ImmutableSet.of(dkg.b, dkg.c, dkg.d);
   private static final int d = c.size();

   public dna(io<dkg> b) {
      dkg $$1 = b.a(dkg.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<agf<dkg>> a(Stream<agf<dkg>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dna a(ip $$0, dit $$1) {
      io<dkf> $$2 = $$0.d(jz.aw);
      io<dkg> $$3 = a($$2, this.b, $$1);
      return new dna($$3);
   }

   public static io<dkg> a(io<dkf> $$0, io<dkg> $$1, dit $$2) {
      dkg $$3 = $$1.a(dkg.b);
      ib<dkf> $$4 = (ib<dkf>)($$3 == null ? $$0.f(dkd.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static io<dkg> a(io<dkg> $$0, ib<dkf> $$1, dit $$2) {
      ix<dkg> $$3 = new ik<>(jz.aK, Lifecycle.experimental());
      $$3.a(dkg.b, new dkg($$1, $$2), Lifecycle.stable());

      for (Entry<agf<dkg>, dkg> $$4 : $$0.g()) {
         agf<dkg> $$5 = $$4.getKey();
         if ($$5 != dkg.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dit a() {
      dkg $$0 = this.b.a(dkg.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dkg> a(agf<dkg> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<agf<crs>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jz::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dlw;
   }

   private static eef.a b(io<dkg> $$0) {
      return $$0.d(dkg.b).map($$0x -> {
         dit $$1 = $$0x.b();
         if ($$1 instanceof dlw) {
            return eef.a.c;
         } else {
            return $$1 instanceof dma ? eef.a.b : eef.a.a;
         }
      }).orElse(eef.a.a);
   }

   static Lifecycle a(agf<dkg> $$0, dkg $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(agf<dkg> $$0, dkg $$1) {
      if ($$0 == dkg.b) {
         return a($$1);
      } else if ($$0 == dkg.c) {
         return b($$1);
      } else {
         return $$0 == dkg.d ? c($$1) : false;
      }
   }

   private static boolean a(dkg $$0) {
      ib<dkf> $$1 = $$0.a();
      if (!$$1.a(dkd.a) && !$$1.a(dkd.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof ctd $$2 && !$$2.a(ctf.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dkg $$0) {
      return $$0.a().a(dkd.b) && $$0.b() instanceof dmi $$1 && $$1.a(dmk.f) && $$1.c() instanceof ctd $$2 && $$2.a(ctf.a);
   }

   private static boolean c(dkg $$0) {
      return $$0.a().a(dkd.c) && $$0.b() instanceof dmi $$1 && $$1.a(dmk.g) && $$1.c() instanceof cth;
   }

   public dna.b a(io<dkg> $$0) {
      Stream<agf<dkg>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(agf<dkg> a, dkg b) {

         Lifecycle c() {
            return dna.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ix<dkg> $$4 = new ik<>(jz.aK, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      io<dkg> $$5 = $$4.l();
      eef.a $$6 = b($$5);
      return new dna.b($$5.l(), $$6);
   }

   public io<dkg> d() {
      return this.b;
   }

   public static record b(io<dkg> a, eef.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public ip.b b() {
         return new ip.c(List.of(this.a)).c();
      }

      public io<dkg> c() {
         return this.a;
      }

      public eef.a d() {
         return this.b;
      }
   }
}
