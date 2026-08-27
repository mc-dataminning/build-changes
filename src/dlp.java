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

public record dlp(ht<div> b) {
   public static final MapCodec<dlp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hv.b(je.aI, Lifecycle.stable(), div.a).fieldOf("dimensions").forGetter(dlp::d)).apply($$0, $$0.stable(dlp::new))
   );
   private static final Set<aex<div>> c = ImmutableSet.of(div.b, div.c, div.d);
   private static final int d = c.size();

   public dlp(ht<div> b) {
      div $$1 = b.a(div.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aex<div>> a(Stream<aex<div>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dlp a(hu $$0, dhi $$1) {
      ht<diu> $$2 = $$0.d(je.au);
      ht<div> $$3 = a($$2, this.b, $$1);
      return new dlp($$3);
   }

   public static ht<div> a(ht<diu> $$0, ht<div> $$1, dhi $$2) {
      div $$3 = $$1.a(div.b);
      hg<diu> $$4 = (hg<diu>)($$3 == null ? $$0.f(dis.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static ht<div> a(ht<div> $$0, hg<diu> $$1, dhi $$2) {
      ic<div> $$3 = new ho<>(je.aI, Lifecycle.experimental());
      $$3.a(div.b, new div($$1, $$2), Lifecycle.stable());

      for (Entry<aex<div>, div> $$4 : $$0.g()) {
         aex<div> $$5 = $$4.getKey();
         if ($$5 != div.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dhi a() {
      div $$0 = this.b.a(div.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<div> a(aex<div> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aex<cpx>> b() {
      return this.d().g().stream().map(Entry::getKey).map(je::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dkl;
   }

   private static ecm.a b(ht<div> $$0) {
      return $$0.d(div.b).map($$0x -> {
         dhi $$1 = $$0x.b();
         if ($$1 instanceof dkl) {
            return ecm.a.c;
         } else {
            return $$1 instanceof dkp ? ecm.a.b : ecm.a.a;
         }
      }).orElse(ecm.a.a);
   }

   static Lifecycle a(aex<div> $$0, div $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aex<div> $$0, div $$1) {
      if ($$0 == div.b) {
         return a($$1);
      } else if ($$0 == div.c) {
         return b($$1);
      } else {
         return $$0 == div.d ? c($$1) : false;
      }
   }

   private static boolean a(div $$0) {
      hg<diu> $$1 = $$0.a();
      if (!$$1.a(dis.a) && !$$1.a(dis.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cri $$2 && !$$2.a(crk.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(div $$0) {
      return $$0.a().a(dis.b) && $$0.b() instanceof dkx $$1 && $$1.a(dkz.f) && $$1.c() instanceof cri $$2 && $$2.a(crk.a);
   }

   private static boolean c(div $$0) {
      return $$0.a().a(dis.c) && $$0.b() instanceof dkx $$1 && $$1.a(dkz.g) && $$1.c() instanceof crm;
   }

   public dlp.b a(ht<div> $$0) {
      Stream<aex<div>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aex<div> a, div b) {

         Lifecycle c() {
            return dlp.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ic<div> $$4 = new ho<>(je.aI, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ht<div> $$5 = $$4.l();
      ecm.a $$6 = b($$5);
      return new dlp.b($$5.l(), $$6);
   }

   public ht<div> d() {
      return this.b;
   }

   public static record b(ht<div> a, ecm.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public hu.b b() {
         return new hu.c(List.of(this.a)).c();
      }

      public ht<div> c() {
         return this.a;
      }

      public ecm.a d() {
         return this.b;
      }
   }
}
