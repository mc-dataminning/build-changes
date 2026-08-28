import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ena {
   public static final akt<emz> a = a("normal");
   public static final akt<emz> b = a("flat");
   public static final akt<emz> c = a("large_biomes");
   public static final akt<emz> d = a("amplified");
   public static final akt<emz> e = a("single_biome_surface");
   public static final akt<emz> f = a("debug_all_block_states");

   public static void a(qe<emz> $$0) {
      new ena.a($$0).a();
   }

   private static akt<emz> a(String $$0) {
      return akt.a(mc.bb, aku.b($$0));
   }

   public static Optional<akt<emz>> a(edl $$0) {
      return $$0.a(ear.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dyr $$1 = (dyr)var10000;

         $$0x.b();
         return switch ($$1) {
            case ecl $$3 -> Optional.of(b);
            case ech $$4 -> Optional.of(f);
            case ect $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static edl a(jt.a $$0) {
      return $$0.d(mc.bb).b(a).a().a();
   }

   public static ear b(jt.a $$0) {
      return $$0.d(mc.bb).b(a).a().b().orElseThrow();
   }

   public static edl c(jt.a $$0) {
      return $$0.d(mc.bb).b(b).a().a();
   }

   static class a {
      private final qe<emz> a;
      private final js<ecv> b;
      private final js<dhi> c;
      private final js<emo> d;
      private final js<enq> e;
      private final js<dhw> f;
      private final jr<eaq> g;
      private final ear h;
      private final ear i;

      a(qe<emz> $$0) {
         this.a = $$0;
         js<eaq> $$1 = $$0.a(mc.aN);
         this.b = $$0.a(mc.aR);
         this.c = $$0.a(mc.aI);
         this.d = $$0.a(mc.aT);
         this.e = $$0.a(mc.aW);
         this.f = $$0.a(mc.bc);
         this.g = $$1.b(eao.a);
         jr<eaq> $$2 = $$1.b(eao.b);
         jr<ecv> $$3 = this.b.b(ecv.f);
         jr.c<dhw> $$4 = this.f.b(dhx.a);
         this.h = new ear($$2, new ect(dhv.a($$4), $$3));
         jr<eaq> $$5 = $$1.b(eao.c);
         jr<ecv> $$6 = this.b.b(ecv.g);
         this.i = new ear($$5, new ect(dhz.a(this.c), $$6));
      }

      private ear a(dyr $$0) {
         return new ear(this.g, $$0);
      }

      private ear a(dhm $$0, jr<ecv> $$1) {
         return this.a(new ect($$0, $$1));
      }

      private emz a(ear $$0) {
         return new emz(Map.of(ear.b, $$0, ear.c, this.h, ear.d, this.i));
      }

      private void a(akt<emz> $$0, ear $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dhm $$0) {
         jr<ecv> $$1 = this.b.b(ecv.c);
         this.a(ena.a, this.a($$0, $$1));
         jr<ecv> $$2 = this.b.b(ecv.d);
         this.a(ena.c, this.a($$0, $$2));
         jr<ecv> $$3 = this.b.b(ecv.e);
         this.a(ena.d, this.a($$0, $$3));
      }

      public void a() {
         jr.c<dhw> $$0 = this.f.b(dhx.b);
         this.a(dhv.a($$0));
         jr<ecv> $$1 = this.b.b(ecv.c);
         jr.c<dhi> $$2 = this.c.b(dhp.b);
         this.a(ena.e, this.a(new dht($$2), $$1));
         this.a(ena.b, this.a(new ecl(eln.a(this.c, this.e, this.d))));
         this.a(ena.f, this.a(new ech($$2)));
      }
   }
}
