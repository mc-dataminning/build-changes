import java.util.Map;
import java.util.Optional;

public class egf {
   public static final akg<ege> a = a("normal");
   public static final akg<ege> b = a("flat");
   public static final akg<ege> c = a("large_biomes");
   public static final akg<ege> d = a("amplified");
   public static final akg<ege> e = a("single_biome_surface");
   public static final akg<ege> f = a("debug_all_block_states");

   public static void a(ql<ege> $$0) {
      new egf.a($$0).a();
   }

   private static akg<ege> a(String $$0) {
      return akg.a(le.aQ, new akh($$0));
   }

   public static Optional<akg<ege>> a(dwu $$0) {
      return $$0.a(dua.b).flatMap($$0x -> {
         dse $$1 = $$0x.b();
         if ($$1 instanceof dvu) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dvq ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dwu a(jk $$0) {
      return $$0.d(le.aQ).g(a).a().a();
   }

   public static dua b(jk $$0) {
      return $$0.d(le.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final ql<ege> a;
      private final ix<dwe> b;
      private final ix<dbc> c;
      private final ix<eft> d;
      private final ix<egv> e;
      private final ix<dbq> f;
      private final iw<dtz> g;
      private final dua h;
      private final dua i;

      a(ql<ege> $$0) {
         this.a = $$0;
         ix<dtz> $$1 = $$0.a(le.aE);
         this.b = $$0.a(le.aG);
         this.c = $$0.a(le.az);
         this.d = $$0.a(le.aI);
         this.e = $$0.a(le.aL);
         this.f = $$0.a(le.aR);
         this.g = $$1.b(dtx.a);
         iw<dtz> $$2 = $$1.b(dtx.b);
         iw<dwe> $$3 = this.b.b(dwe.f);
         iw.c<dbq> $$4 = this.f.b(dbr.a);
         this.h = new dua($$2, new dwc(dbp.a($$4), $$3));
         iw<dtz> $$5 = $$1.b(dtx.c);
         iw<dwe> $$6 = this.b.b(dwe.g);
         this.i = new dua($$5, new dwc(dbt.a(this.c), $$6));
      }

      private dua a(dse $$0) {
         return new dua(this.g, $$0);
      }

      private dua a(dbg $$0, iw<dwe> $$1) {
         return this.a(new dwc($$0, $$1));
      }

      private ege a(dua $$0) {
         return new ege(Map.of(dua.b, $$0, dua.c, this.h, dua.d, this.i));
      }

      private void a(akg<ege> $$0, dua $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dbg $$0) {
         iw<dwe> $$1 = this.b.b(dwe.c);
         this.a(egf.a, this.a($$0, $$1));
         iw<dwe> $$2 = this.b.b(dwe.d);
         this.a(egf.c, this.a($$0, $$2));
         iw<dwe> $$3 = this.b.b(dwe.e);
         this.a(egf.d, this.a($$0, $$3));
      }

      public void a() {
         iw.c<dbq> $$0 = this.f.b(dbr.b);
         this.a(dbp.a($$0));
         iw<dwe> $$1 = this.b.b(dwe.c);
         iw.c<dbc> $$2 = this.c.b(dbj.b);
         this.a(egf.e, this.a(new dbn($$2), $$1));
         this.a(egf.b, this.a(new dvu(ees.a(this.c, this.e, this.d))));
         this.a(egf.f, this.a(new dvq($$2)));
      }
   }
}
