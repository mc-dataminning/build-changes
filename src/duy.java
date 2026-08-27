import java.util.Map;
import java.util.Optional;

public class duy {
   public static final aew<dux> a = a("normal");
   public static final aew<dux> b = a("flat");
   public static final aew<dux> c = a("large_biomes");
   public static final aew<dux> d = a("amplified");
   public static final aew<dux> e = a("single_biome_surface");
   public static final aew<dux> f = a("debug_all_block_states");

   public static void a(nt<dux> $$0) {
      new duy.a($$0).a();
   }

   private static aew<dux> a(String $$0) {
      return aew.a(je.aF, new aex($$0));
   }

   public static Optional<aew<dux>> a(ht<dit> $$0) {
      return $$0.d(dit.b).flatMap($$0x -> {
         dhg $$1 = $$0x.b();
         if ($$1 instanceof dkn) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dkj ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dln a(hu $$0) {
      return $$0.d(je.aF).f(a).a().a();
   }

   public static dit b(hu $$0) {
      return $$0.d(je.aF).f(a).a().b().orElseThrow();
   }

   static class a {
      private final nt<dux> a;
      private final hh<dkx> b;
      private final hh<cqt> c;
      private final hh<dum> d;
      private final hh<dvo> e;
      private final hh<crh> f;
      private final hg<dis> g;
      private final dit h;
      private final dit i;

      a(nt<dux> $$0) {
         this.a = $$0;
         hh<dis> $$1 = $$0.a(je.au);
         this.b = $$0.a(je.aw);
         this.c = $$0.a(je.ap);
         this.d = $$0.a(je.ay);
         this.e = $$0.a(je.aB);
         this.f = $$0.a(je.aG);
         this.g = $$1.b(diq.a);
         hg<dis> $$2 = $$1.b(diq.b);
         hg<dkx> $$3 = this.b.b(dkx.f);
         hg.c<crh> $$4 = this.f.b(cri.a);
         this.h = new dit($$2, new dkv(crg.a($$4), $$3));
         hg<dis> $$5 = $$1.b(diq.c);
         hg<dkx> $$6 = this.b.b(dkx.g);
         this.i = new dit($$5, new dkv(crk.a(this.c), $$6));
      }

      private dit a(dhg $$0) {
         return new dit(this.g, $$0);
      }

      private dit a(cqx $$0, hg<dkx> $$1) {
         return this.a(new dkv($$0, $$1));
      }

      private dux a(dit $$0) {
         return new dux(Map.of(dit.b, $$0, dit.c, this.h, dit.d, this.i));
      }

      private void a(aew<dux> $$0, dit $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cqx $$0) {
         hg<dkx> $$1 = this.b.b(dkx.c);
         this.a(duy.a, this.a($$0, $$1));
         hg<dkx> $$2 = this.b.b(dkx.d);
         this.a(duy.c, this.a($$0, $$2));
         hg<dkx> $$3 = this.b.b(dkx.e);
         this.a(duy.d, this.a($$0, $$3));
      }

      public void a() {
         hg.c<crh> $$0 = this.f.b(cri.b);
         this.a(crg.a($$0));
         hg<dkx> $$1 = this.b.b(dkx.c);
         hg.c<cqt> $$2 = this.c.b(cra.b);
         this.a(duy.e, this.a(new cre($$2), $$1));
         this.a(duy.b, this.a(new dkn(dtl.a(this.c, this.e, this.d))));
         this.a(duy.f, this.a(new dkj($$2)));
      }
   }
}
