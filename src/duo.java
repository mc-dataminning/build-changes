import java.util.Map;
import java.util.Optional;

public class duo {
   public static final aeq<dun> a = a("normal");
   public static final aeq<dun> b = a("flat");
   public static final aeq<dun> c = a("large_biomes");
   public static final aeq<dun> d = a("amplified");
   public static final aeq<dun> e = a("single_biome_surface");
   public static final aeq<dun> f = a("debug_all_block_states");

   public static void a(nm<dun> $$0) {
      new duo.a($$0).a();
   }

   private static aeq<dun> a(String $$0) {
      return aeq.a(jc.aF, new aer($$0));
   }

   public static Optional<aeq<dun>> a(hr<dij> $$0) {
      return $$0.d(dij.b).flatMap($$0x -> {
         dgw $$1 = $$0x.b();
         if ($$1 instanceof dkd) {
            return Optional.of(b);
         } else {
            return $$1 instanceof djz ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dld a(hs $$0) {
      return $$0.d(jc.aF).f(a).a().a();
   }

   public static dij b(hs $$0) {
      return $$0.d(jc.aF).f(a).a().b().orElseThrow();
   }

   static class a {
      private final nm<dun> a;
      private final hf<dkn> b;
      private final hf<cqj> c;
      private final hf<duc> d;
      private final hf<dve> e;
      private final hf<cqx> f;
      private final he<dii> g;
      private final dij h;
      private final dij i;

      a(nm<dun> $$0) {
         this.a = $$0;
         hf<dii> $$1 = $$0.a(jc.au);
         this.b = $$0.a(jc.aw);
         this.c = $$0.a(jc.ap);
         this.d = $$0.a(jc.ay);
         this.e = $$0.a(jc.aB);
         this.f = $$0.a(jc.aG);
         this.g = $$1.b(dig.a);
         he<dii> $$2 = $$1.b(dig.b);
         he<dkn> $$3 = this.b.b(dkn.f);
         he.c<cqx> $$4 = this.f.b(cqy.a);
         this.h = new dij($$2, new dkl(cqw.a($$4), $$3));
         he<dii> $$5 = $$1.b(dig.c);
         he<dkn> $$6 = this.b.b(dkn.g);
         this.i = new dij($$5, new dkl(cra.a(this.c), $$6));
      }

      private dij a(dgw $$0) {
         return new dij(this.g, $$0);
      }

      private dij a(cqn $$0, he<dkn> $$1) {
         return this.a(new dkl($$0, $$1));
      }

      private dun a(dij $$0) {
         return new dun(Map.of(dij.b, $$0, dij.c, this.h, dij.d, this.i));
      }

      private void a(aeq<dun> $$0, dij $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cqn $$0) {
         he<dkn> $$1 = this.b.b(dkn.c);
         this.a(duo.a, this.a($$0, $$1));
         he<dkn> $$2 = this.b.b(dkn.d);
         this.a(duo.c, this.a($$0, $$2));
         he<dkn> $$3 = this.b.b(dkn.e);
         this.a(duo.d, this.a($$0, $$3));
      }

      public void a() {
         he.c<cqx> $$0 = this.f.b(cqy.b);
         this.a(cqw.a($$0));
         he<dkn> $$1 = this.b.b(dkn.c);
         he.c<cqj> $$2 = this.c.b(cqq.b);
         this.a(duo.e, this.a(new cqu($$2), $$1));
         this.a(duo.b, this.a(new dkd(dtb.a(this.c, this.e, this.d))));
         this.a(duo.f, this.a(new djz($$2)));
      }
   }
}
