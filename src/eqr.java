import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eqr {
   public static final alf<eqq> a = a("normal");
   public static final alf<eqq> b = a("flat");
   public static final alf<eqq> c = a("large_biomes");
   public static final alf<eqq> d = a("amplified");
   public static final alf<eqq> e = a("single_biome_surface");
   public static final alf<eqq> f = a("debug_all_block_states");

   public static void a(qh<eqq> $$0) {
      new eqr.a($$0).a();
   }

   private static alf<eqq> a(String $$0) {
      return alf.a(mg.bn, alg.b($$0));
   }

   public static Optional<alf<eqq>> a(ehb $$0) {
      return $$0.a(eef.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         ecf $$1 = (ecf)var10000;

         $$0x.b();
         return switch ($$1) {
            case egb $$3 -> Optional.of(b);
            case efx $$4 -> Optional.of(f);
            case egj $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ehb a(jg.a $$0) {
      return $$0.e(mg.bn).b(a).a().a();
   }

   public static eef b(jg.a $$0) {
      return $$0.e(mg.bn).b(a).a().b().orElseThrow();
   }

   public static ehb c(jg.a $$0) {
      return $$0.e(mg.bn).b(b).a().a();
   }

   static class a {
      private final qh<eqq> a;
      private final jf<egl> b;
      private final jf<dkd> c;
      private final jf<eqf> d;
      private final jf<erh> e;
      private final jf<dkr> f;
      private final je<eee> g;
      private final eef h;
      private final eef i;

      a(qh<eqq> $$0) {
         this.a = $$0;
         jf<eee> $$1 = $$0.a(mg.aP);
         this.b = $$0.a(mg.aX);
         this.c = $$0.a(mg.aG);
         this.d = $$0.a(mg.bb);
         this.e = $$0.a(mg.bd);
         this.f = $$0.a(mg.aW);
         this.g = $$1.b(eec.a);
         je<eee> $$2 = $$1.b(eec.b);
         je<egl> $$3 = this.b.b(egl.f);
         je.c<dkr> $$4 = this.f.b(dks.a);
         this.h = new eef($$2, new egj(dkq.a($$4), $$3));
         je<eee> $$5 = $$1.b(eec.c);
         je<egl> $$6 = this.b.b(egl.g);
         this.i = new eef($$5, new egj(dku.a(this.c), $$6));
      }

      private eef a(ecf $$0) {
         return new eef(this.g, $$0);
      }

      private eef a(dkh $$0, je<egl> $$1) {
         return this.a(new egj($$0, $$1));
      }

      private eqq a(eef $$0) {
         return new eqq(Map.of(eef.b, $$0, eef.c, this.h, eef.d, this.i));
      }

      private void a(alf<eqq> $$0, eef $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dkh $$0) {
         je<egl> $$1 = this.b.b(egl.c);
         this.a(eqr.a, this.a($$0, $$1));
         je<egl> $$2 = this.b.b(egl.d);
         this.a(eqr.c, this.a($$0, $$2));
         je<egl> $$3 = this.b.b(egl.e);
         this.a(eqr.d, this.a($$0, $$3));
      }

      public void a() {
         je.c<dkr> $$0 = this.f.b(dks.b);
         this.a(dkq.a($$0));
         je<egl> $$1 = this.b.b(egl.c);
         je.c<dkd> $$2 = this.c.b(dkk.b);
         this.a(eqr.e, this.a(new dko($$2), $$1));
         this.a(eqr.b, this.a(new egb(epe.a(this.c, this.e, this.d))));
         this.a(eqr.f, this.a(new efx($$2)));
      }
   }
}
