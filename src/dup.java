import java.util.Map;
import java.util.Optional;

public class dup {
   public static final aeq<duo> a = a("normal");
   public static final aeq<duo> b = a("flat");
   public static final aeq<duo> c = a("large_biomes");
   public static final aeq<duo> d = a("amplified");
   public static final aeq<duo> e = a("single_biome_surface");
   public static final aeq<duo> f = a("debug_all_block_states");

   public static void a(nm<duo> $$0) {
      new dup.a($$0).a();
   }

   private static aeq<duo> a(String $$0) {
      return aeq.a(jc.aF, new aer($$0));
   }

   public static Optional<aeq<duo>> a(hr<dik> $$0) {
      return $$0.d(dik.b).flatMap($$0x -> {
         dgx $$1 = $$0x.b();
         if ($$1 instanceof dke) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dka ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dle a(hs $$0) {
      return $$0.d(jc.aF).f(a).a().a();
   }

   public static dik b(hs $$0) {
      return $$0.d(jc.aF).f(a).a().b().orElseThrow();
   }

   static class a {
      private final nm<duo> a;
      private final hf<dko> b;
      private final hf<cqk> c;
      private final hf<dud> d;
      private final hf<dvf> e;
      private final hf<cqy> f;
      private final he<dij> g;
      private final dik h;
      private final dik i;

      a(nm<duo> $$0) {
         this.a = $$0;
         hf<dij> $$1 = $$0.a(jc.au);
         this.b = $$0.a(jc.aw);
         this.c = $$0.a(jc.ap);
         this.d = $$0.a(jc.ay);
         this.e = $$0.a(jc.aB);
         this.f = $$0.a(jc.aG);
         this.g = $$1.b(dih.a);
         he<dij> $$2 = $$1.b(dih.b);
         he<dko> $$3 = this.b.b(dko.f);
         he.c<cqy> $$4 = this.f.b(cqz.a);
         this.h = new dik($$2, new dkm(cqx.a($$4), $$3));
         he<dij> $$5 = $$1.b(dih.c);
         he<dko> $$6 = this.b.b(dko.g);
         this.i = new dik($$5, new dkm(crb.a(this.c), $$6));
      }

      private dik a(dgx $$0) {
         return new dik(this.g, $$0);
      }

      private dik a(cqo $$0, he<dko> $$1) {
         return this.a(new dkm($$0, $$1));
      }

      private duo a(dik $$0) {
         return new duo(Map.of(dik.b, $$0, dik.c, this.h, dik.d, this.i));
      }

      private void a(aeq<duo> $$0, dik $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cqo $$0) {
         he<dko> $$1 = this.b.b(dko.c);
         this.a(dup.a, this.a($$0, $$1));
         he<dko> $$2 = this.b.b(dko.d);
         this.a(dup.c, this.a($$0, $$2));
         he<dko> $$3 = this.b.b(dko.e);
         this.a(dup.d, this.a($$0, $$3));
      }

      public void a() {
         he.c<cqy> $$0 = this.f.b(cqz.b);
         this.a(cqx.a($$0));
         he<dko> $$1 = this.b.b(dko.c);
         he.c<cqk> $$2 = this.c.b(cqr.b);
         this.a(dup.e, this.a(new cqv($$2), $$1));
         this.a(dup.b, this.a(new dke(dtc.a(this.c, this.e, this.d))));
         this.a(dup.f, this.a(new dka($$2)));
      }
   }
}
