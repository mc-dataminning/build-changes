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

public record dmf(io<djl> b) {
   public static final MapCodec<dmf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iq.b(jz.aJ, Lifecycle.stable(), djl.a).fieldOf("dimensions").forGetter(dmf::d)).apply($$0, $$0.stable(dmf::new))
   );
   private static final Set<afv<djl>> c = ImmutableSet.of(djl.b, djl.c, djl.d);
   private static final int d = c.size();

   public dmf(io<djl> b) {
      djl $$1 = b.a(djl.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<afv<djl>> a(Stream<afv<djl>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dmf a(ip $$0, dhy $$1) {
      io<djk> $$2 = $$0.d(jz.av);
      io<djl> $$3 = a($$2, this.b, $$1);
      return new dmf($$3);
   }

   public static io<djl> a(io<djk> $$0, io<djl> $$1, dhy $$2) {
      djl $$3 = $$1.a(djl.b);
      ib<djk> $$4 = (ib<djk>)($$3 == null ? $$0.f(dji.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static io<djl> a(io<djl> $$0, ib<djk> $$1, dhy $$2) {
      ix<djl> $$3 = new ik<>(jz.aJ, Lifecycle.experimental());
      $$3.a(djl.b, new djl($$1, $$2), Lifecycle.stable());

      for (Entry<afv<djl>, djl> $$4 : $$0.g()) {
         afv<djl> $$5 = $$4.getKey();
         if ($$5 != djl.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dhy a() {
      djl $$0 = this.b.a(djl.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<djl> a(afv<djl> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<afv<cqz>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jz::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dlb;
   }

   private static edc.a b(io<djl> $$0) {
      return $$0.d(djl.b).map($$0x -> {
         dhy $$1 = $$0x.b();
         if ($$1 instanceof dlb) {
            return edc.a.c;
         } else {
            return $$1 instanceof dlf ? edc.a.b : edc.a.a;
         }
      }).orElse(edc.a.a);
   }

   static Lifecycle a(afv<djl> $$0, djl $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(afv<djl> $$0, djl $$1) {
      if ($$0 == djl.b) {
         return a($$1);
      } else if ($$0 == djl.c) {
         return b($$1);
      } else {
         return $$0 == djl.d ? c($$1) : false;
      }
   }

   private static boolean a(djl $$0) {
      ib<djk> $$1 = $$0.a();
      if (!$$1.a(dji.a) && !$$1.a(dji.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof csk $$2 && !$$2.a(csm.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(djl $$0) {
      return $$0.a().a(dji.b) && $$0.b() instanceof dln $$1 && $$1.a(dlp.f) && $$1.c() instanceof csk $$2 && $$2.a(csm.a);
   }

   private static boolean c(djl $$0) {
      return $$0.a().a(dji.c) && $$0.b() instanceof dln $$1 && $$1.a(dlp.g) && $$1.c() instanceof cso;
   }

   public dmf.b a(io<djl> $$0) {
      Stream<afv<djl>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(afv<djl> a, djl b) {

         Lifecycle c() {
            return dmf.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ix<djl> $$4 = new ik<>(jz.aJ, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      io<djl> $$5 = $$4.l();
      edc.a $$6 = b($$5);
      return new dmf.b($$5.l(), $$6);
   }

   public io<djl> d() {
      return this.b;
   }

   public static record b(io<djl> a, edc.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public ip.b b() {
         return new ip.c(List.of(this.a)).c();
      }

      public io<djl> c() {
         return this.a;
      }

      public edc.a d() {
         return this.b;
      }
   }
}
