import java.util.Map;
import java.util.Optional;

public class duy {
   public static final aev<dux> a = a("normal");
   public static final aev<dux> b = a("flat");
   public static final aev<dux> c = a("large_biomes");
   public static final aev<dux> d = a("amplified");
   public static final aev<dux> e = a("single_biome_surface");
   public static final aev<dux> f = a("debug_all_block_states");

   public static void a(nr<dux> $$0) {
      new duy.a($$0).a();
   }

   private static aev<dux> a(String $$0) {
      return aev.a(jc.aF, new aew($$0));
   }

   public static Optional<aev<dux>> a(hq<dit> $$0) {
      return $$0.d(dit.b).flatMap($$0x -> {
         dhg $$1 = $$0x.b();
         if ($$1 instanceof dkn) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dkj ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dln a(hr $$0) {
      return $$0.d(jc.aF).f(a).a().a();
   }

   public static dit b(hr $$0) {
      return $$0.d(jc.aF).f(a).a().b().orElseThrow();
   }

   static class a {
      private final nr<dux> a;
      private final hf<dkx> b;
      private final hf<cqt> c;
      private final hf<dum> d;
      private final hf<dvo> e;
      private final hf<crh> f;
      private final he<dis> g;
      private final dit h;
      private final dit i;

      a(nr<dux> $$0) {
         this.a = $$0;
         hf<dis> $$1 = $$0.a(jc.au);
         this.b = $$0.a(jc.aw);
         this.c = $$0.a(jc.ap);
         this.d = $$0.a(jc.ay);
         this.e = $$0.a(jc.aB);
         this.f = $$0.a(jc.aG);
         this.g = $$1.b(diq.a);
         he<dis> $$2 = $$1.b(diq.b);
         he<dkx> $$3 = this.b.b(dkx.f);
         he.c<crh> $$4 = this.f.b(cri.a);
         this.h = new dit($$2, new dkv(crg.a($$4), $$3));
         he<dis> $$5 = $$1.b(diq.c);
         he<dkx> $$6 = this.b.b(dkx.g);
         this.i = new dit($$5, new dkv(crk.a(this.c), $$6));
      }

      private dit a(dhg $$0) {
         return new dit(this.g, $$0);
      }

      private dit a(cqx $$0, he<dkx> $$1) {
         return this.a(new dkv($$0, $$1));
      }

      private dux a(dit $$0) {
         return new dux(Map.of(dit.b, $$0, dit.c, this.h, dit.d, this.i));
      }

      private void a(aev<dux> $$0, dit $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cqx $$0) {
         he<dkx> $$1 = this.b.b(dkx.c);
         this.a(duy.a, this.a($$0, $$1));
         he<dkx> $$2 = this.b.b(dkx.d);
         this.a(duy.c, this.a($$0, $$2));
         he<dkx> $$3 = this.b.b(dkx.e);
         this.a(duy.d, this.a($$0, $$3));
      }

      public void a() {
         he.c<crh> $$0 = this.f.b(cri.b);
         this.a(crg.a($$0));
         he<dkx> $$1 = this.b.b(dkx.c);
         he.c<cqt> $$2 = this.c.b(cra.b);
         this.a(duy.e, this.a(new cre($$2), $$1));
         this.a(duy.b, this.a(new dkn(dtl.a(this.c, this.e, this.d))));
         this.a(duy.f, this.a(new dkj($$2)));
      }
   }
}
