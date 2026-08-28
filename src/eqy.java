import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eqy {
   public static final alf<eqx> a = a("normal");
   public static final alf<eqx> b = a("flat");
   public static final alf<eqx> c = a("large_biomes");
   public static final alf<eqx> d = a("amplified");
   public static final alf<eqx> e = a("single_biome_surface");
   public static final alf<eqx> f = a("debug_all_block_states");

   public static void a(qh<eqx> $$0) {
      new eqy.a($$0).a();
   }

   private static alf<eqx> a(String $$0) {
      return alf.a(mh.bn, alg.b($$0));
   }

   public static Optional<alf<eqx>> a(ehi $$0) {
      return $$0.a(eem.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         ecm $$1 = (ecm)var10000;

         $$0x.b();
         return switch ($$1) {
            case egi $$3 -> Optional.of(b);
            case ege $$4 -> Optional.of(f);
            case egq $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ehi a(jh.a $$0) {
      return $$0.e(mh.bn).b(a).a().a();
   }

   public static eem b(jh.a $$0) {
      return $$0.e(mh.bn).b(a).a().b().orElseThrow();
   }

   public static ehi c(jh.a $$0) {
      return $$0.e(mh.bn).b(b).a().a();
   }

   static class a {
      private final qh<eqx> a;
      private final jg<egs> b;
      private final jg<dkk> c;
      private final jg<eqm> d;
      private final jg<ero> e;
      private final jg<dky> f;
      private final jf<eel> g;
      private final eem h;
      private final eem i;

      a(qh<eqx> $$0) {
         this.a = $$0;
         jg<eel> $$1 = $$0.a(mh.aP);
         this.b = $$0.a(mh.aX);
         this.c = $$0.a(mh.aG);
         this.d = $$0.a(mh.bb);
         this.e = $$0.a(mh.bd);
         this.f = $$0.a(mh.aW);
         this.g = $$1.b(eej.a);
         jf<eel> $$2 = $$1.b(eej.b);
         jf<egs> $$3 = this.b.b(egs.f);
         jf.c<dky> $$4 = this.f.b(dkz.a);
         this.h = new eem($$2, new egq(dkx.a($$4), $$3));
         jf<eel> $$5 = $$1.b(eej.c);
         jf<egs> $$6 = this.b.b(egs.g);
         this.i = new eem($$5, new egq(dlb.a(this.c), $$6));
      }

      private eem a(ecm $$0) {
         return new eem(this.g, $$0);
      }

      private eem a(dko $$0, jf<egs> $$1) {
         return this.a(new egq($$0, $$1));
      }

      private eqx a(eem $$0) {
         return new eqx(Map.of(eem.b, $$0, eem.c, this.h, eem.d, this.i));
      }

      private void a(alf<eqx> $$0, eem $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dko $$0) {
         jf<egs> $$1 = this.b.b(egs.c);
         this.a(eqy.a, this.a($$0, $$1));
         jf<egs> $$2 = this.b.b(egs.d);
         this.a(eqy.c, this.a($$0, $$2));
         jf<egs> $$3 = this.b.b(egs.e);
         this.a(eqy.d, this.a($$0, $$3));
      }

      public void a() {
         jf.c<dky> $$0 = this.f.b(dkz.b);
         this.a(dkx.a($$0));
         jf<egs> $$1 = this.b.b(egs.c);
         jf.c<dkk> $$2 = this.c.b(dkr.b);
         this.a(eqy.e, this.a(new dkv($$2), $$1));
         this.a(eqy.b, this.a(new egi(epl.a(this.c, this.e, this.d))));
         this.a(eqy.f, this.a(new ege($$2)));
      }
   }
}
