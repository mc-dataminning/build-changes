import java.util.Map;
import java.util.Optional;

public class efg {
   public static final aju<eff> a = a("normal");
   public static final aju<eff> b = a("flat");
   public static final aju<eff> c = a("large_biomes");
   public static final aju<eff> d = a("amplified");
   public static final aju<eff> e = a("single_biome_surface");
   public static final aju<eff> f = a("debug_all_block_states");

   public static void a(pz<eff> $$0) {
      new efg.a($$0).a();
   }

   private static aju<eff> a(String $$0) {
      return aju.a(ku.aN, new ajv($$0));
   }

   public static Optional<aju<eff>> a(dvv $$0) {
      return $$0.a(dtb.b).flatMap($$0x -> {
         drf $$1 = $$0x.b();
         if ($$1 instanceof duv) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dur ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dvv a(jb $$0) {
      return $$0.d(ku.aN).g(a).a().a();
   }

   public static dtb b(jb $$0) {
      return $$0.d(ku.aN).g(a).a().b().orElseThrow();
   }

   static class a {
      private final pz<eff> a;
      private final io<dvf> b;
      private final io<daf> c;
      private final io<eeu> d;
      private final io<efw> e;
      private final io<dat> f;
      private final in<dta> g;
      private final dtb h;
      private final dtb i;

      a(pz<eff> $$0) {
         this.a = $$0;
         io<dta> $$1 = $$0.a(ku.aB);
         this.b = $$0.a(ku.aD);
         this.c = $$0.a(ku.aw);
         this.d = $$0.a(ku.aF);
         this.e = $$0.a(ku.aI);
         this.f = $$0.a(ku.aO);
         this.g = $$1.b(dsy.a);
         in<dta> $$2 = $$1.b(dsy.b);
         in<dvf> $$3 = this.b.b(dvf.f);
         in.c<dat> $$4 = this.f.b(dau.a);
         this.h = new dtb($$2, new dvd(das.a($$4), $$3));
         in<dta> $$5 = $$1.b(dsy.c);
         in<dvf> $$6 = this.b.b(dvf.g);
         this.i = new dtb($$5, new dvd(daw.a(this.c), $$6));
      }

      private dtb a(drf $$0) {
         return new dtb(this.g, $$0);
      }

      private dtb a(daj $$0, in<dvf> $$1) {
         return this.a(new dvd($$0, $$1));
      }

      private eff a(dtb $$0) {
         return new eff(Map.of(dtb.b, $$0, dtb.c, this.h, dtb.d, this.i));
      }

      private void a(aju<eff> $$0, dtb $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(daj $$0) {
         in<dvf> $$1 = this.b.b(dvf.c);
         this.a(efg.a, this.a($$0, $$1));
         in<dvf> $$2 = this.b.b(dvf.d);
         this.a(efg.c, this.a($$0, $$2));
         in<dvf> $$3 = this.b.b(dvf.e);
         this.a(efg.d, this.a($$0, $$3));
      }

      public void a() {
         in.c<dat> $$0 = this.f.b(dau.b);
         this.a(das.a($$0));
         in<dvf> $$1 = this.b.b(dvf.c);
         in.c<daf> $$2 = this.c.b(dam.b);
         this.a(efg.e, this.a(new daq($$2), $$1));
         this.a(efg.b, this.a(new duv(edt.a(this.c, this.e, this.d))));
         this.a(efg.f, this.a(new dur($$2)));
      }
   }
}
