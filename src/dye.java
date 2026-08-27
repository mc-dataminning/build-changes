import java.util.Map;
import java.util.Optional;

public class dye {
   public static final ags<dyd> a = a("normal");
   public static final ags<dyd> b = a("flat");
   public static final ags<dyd> c = a("large_biomes");
   public static final ags<dyd> d = a("amplified");
   public static final ags<dyd> e = a("single_biome_surface");
   public static final ags<dyd> f = a("debug_all_block_states");

   public static void a(pa<dyd> $$0) {
      new dye.a($$0).a();
   }

   private static ags<dyd> a(String $$0) {
      return ags.a(kc.aJ, new agt($$0));
   }

   public static Optional<ags<dyd>> a(ir<dlz> $$0) {
      return $$0.d(dlz.b).flatMap($$0x -> {
         dkm $$1 = $$0x.b();
         if ($$1 instanceof dnt) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dnp ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dot a(is $$0) {
      return $$0.d(kc.aJ).f(a).a().a();
   }

   public static dlz b(is $$0) {
      return $$0.d(kc.aJ).f(a).a().b().orElseThrow();
   }

   static class a {
      private final pa<dyd> a;
      private final ig<dod> b;
      private final ig<ctx> c;
      private final ig<dxs> d;
      private final ig<dyu> e;
      private final ig<cul> f;
      private final ie<dly> g;
      private final dlz h;
      private final dlz i;

      a(pa<dyd> $$0) {
         this.a = $$0;
         ig<dly> $$1 = $$0.a(kc.ax);
         this.b = $$0.a(kc.az);
         this.c = $$0.a(kc.as);
         this.d = $$0.a(kc.aB);
         this.e = $$0.a(kc.aE);
         this.f = $$0.a(kc.aK);
         this.g = $$1.b(dlw.a);
         ie<dly> $$2 = $$1.b(dlw.b);
         ie<dod> $$3 = this.b.b(dod.f);
         ie.c<cul> $$4 = this.f.b(cum.a);
         this.h = new dlz($$2, new dob(cuk.a($$4), $$3));
         ie<dly> $$5 = $$1.b(dlw.c);
         ie<dod> $$6 = this.b.b(dod.g);
         this.i = new dlz($$5, new dob(cuo.a(this.c), $$6));
      }

      private dlz a(dkm $$0) {
         return new dlz(this.g, $$0);
      }

      private dlz a(cub $$0, ie<dod> $$1) {
         return this.a(new dob($$0, $$1));
      }

      private dyd a(dlz $$0) {
         return new dyd(Map.of(dlz.b, $$0, dlz.c, this.h, dlz.d, this.i));
      }

      private void a(ags<dyd> $$0, dlz $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cub $$0) {
         ie<dod> $$1 = this.b.b(dod.c);
         this.a(dye.a, this.a($$0, $$1));
         ie<dod> $$2 = this.b.b(dod.d);
         this.a(dye.c, this.a($$0, $$2));
         ie<dod> $$3 = this.b.b(dod.e);
         this.a(dye.d, this.a($$0, $$3));
      }

      public void a() {
         ie.c<cul> $$0 = this.f.b(cum.b);
         this.a(cuk.a($$0));
         ie<dod> $$1 = this.b.b(dod.c);
         ie.c<ctx> $$2 = this.c.b(cue.b);
         this.a(dye.e, this.a(new cui($$2), $$1));
         this.a(dye.b, this.a(new dnt(dwr.a(this.c, this.e, this.d))));
         this.a(dye.f, this.a(new dnp($$2)));
      }
   }
}
