import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class erd {
   public static final alf<erc> a = a("normal");
   public static final alf<erc> b = a("flat");
   public static final alf<erc> c = a("large_biomes");
   public static final alf<erc> d = a("amplified");
   public static final alf<erc> e = a("single_biome_surface");
   public static final alf<erc> f = a("debug_all_block_states");

   public static void a(qh<erc> $$0) {
      new erd.a($$0).a();
   }

   private static alf<erc> a(String $$0) {
      return alf.a(mh.bo, alg.b($$0));
   }

   public static Optional<alf<erc>> a(ehn $$0) {
      return $$0.a(eer.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         ecr $$1 = (ecr)var10000;

         $$0x.b();
         return switch ($$1) {
            case egn $$3 -> Optional.of(b);
            case egj $$4 -> Optional.of(f);
            case egv $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ehn a(jh.a $$0) {
      return $$0.e(mh.bo).b(a).a().a();
   }

   public static eer b(jh.a $$0) {
      return $$0.e(mh.bo).b(a).a().b().orElseThrow();
   }

   public static ehn c(jh.a $$0) {
      return $$0.e(mh.bo).b(b).a().a();
   }

   static class a {
      private final qh<erc> a;
      private final jg<egx> b;
      private final jg<dkp> c;
      private final jg<eqr> d;
      private final jg<ert> e;
      private final jg<dld> f;
      private final jf<eeq> g;
      private final eer h;
      private final eer i;

      a(qh<erc> $$0) {
         this.a = $$0;
         jg<eeq> $$1 = $$0.a(mh.aP);
         this.b = $$0.a(mh.aX);
         this.c = $$0.a(mh.aG);
         this.d = $$0.a(mh.bb);
         this.e = $$0.a(mh.bd);
         this.f = $$0.a(mh.aW);
         this.g = $$1.b(eeo.a);
         jf<eeq> $$2 = $$1.b(eeo.b);
         jf<egx> $$3 = this.b.b(egx.f);
         jf.c<dld> $$4 = this.f.b(dle.a);
         this.h = new eer($$2, new egv(dlc.a($$4), $$3));
         jf<eeq> $$5 = $$1.b(eeo.c);
         jf<egx> $$6 = this.b.b(egx.g);
         this.i = new eer($$5, new egv(dlg.a(this.c), $$6));
      }

      private eer a(ecr $$0) {
         return new eer(this.g, $$0);
      }

      private eer a(dkt $$0, jf<egx> $$1) {
         return this.a(new egv($$0, $$1));
      }

      private erc a(eer $$0) {
         return new erc(Map.of(eer.b, $$0, eer.c, this.h, eer.d, this.i));
      }

      private void a(alf<erc> $$0, eer $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dkt $$0) {
         jf<egx> $$1 = this.b.b(egx.c);
         this.a(erd.a, this.a($$0, $$1));
         jf<egx> $$2 = this.b.b(egx.d);
         this.a(erd.c, this.a($$0, $$2));
         jf<egx> $$3 = this.b.b(egx.e);
         this.a(erd.d, this.a($$0, $$3));
      }

      public void a() {
         jf.c<dld> $$0 = this.f.b(dle.b);
         this.a(dlc.a($$0));
         jf<egx> $$1 = this.b.b(egx.c);
         jf.c<dkp> $$2 = this.c.b(dkw.b);
         this.a(erd.e, this.a(new dla($$2), $$1));
         this.a(erd.b, this.a(new egn(epq.a(this.c, this.e, this.d))));
         this.a(erd.f, this.a(new egj($$2)));
      }
   }
}
