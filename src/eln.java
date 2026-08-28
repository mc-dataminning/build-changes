import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eln {
   public static final alh<elm> a = a("normal");
   public static final alh<elm> b = a("flat");
   public static final alh<elm> c = a("large_biomes");
   public static final alh<elm> d = a("amplified");
   public static final alh<elm> e = a("single_biome_surface");
   public static final alh<elm> f = a("debug_all_block_states");

   public static void a(qy<elm> $$0) {
      new eln.a($$0).a();
   }

   private static alh<elm> a(String $$0) {
      return alh.a(lz.aZ, ali.b($$0));
   }

   public static Optional<alh<elm>> a(eca $$0) {
      return $$0.a(dzg.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dxg $$1 = (dxg)var10000;

         $$0x.b();
         return switch ($$1) {
            case eba $$3 -> Optional.of(b);
            case eaw $$4 -> Optional.of(f);
            case ebi $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static eca a(js.a $$0) {
      return $$0.d(lz.aZ).b(a).a().a();
   }

   public static dzg b(js.a $$0) {
      return $$0.d(lz.aZ).b(a).a().b().orElseThrow();
   }

   public static eca c(js.a $$0) {
      return $$0.d(lz.aZ).b(b).a().a();
   }

   static class a {
      private final qy<elm> a;
      private final jr<ebk> b;
      private final jr<dgc> c;
      private final jr<elb> d;
      private final jr<emd> e;
      private final jr<dgq> f;
      private final jq<dzf> g;
      private final dzg h;
      private final dzg i;

      a(qy<elm> $$0) {
         this.a = $$0;
         jr<dzf> $$1 = $$0.a(lz.aL);
         this.b = $$0.a(lz.aP);
         this.c = $$0.a(lz.aG);
         this.d = $$0.a(lz.aR);
         this.e = $$0.a(lz.aU);
         this.f = $$0.a(lz.ba);
         this.g = $$1.b(dzd.a);
         jq<dzf> $$2 = $$1.b(dzd.b);
         jq<ebk> $$3 = this.b.b(ebk.f);
         jq.c<dgq> $$4 = this.f.b(dgr.a);
         this.h = new dzg($$2, new ebi(dgp.a($$4), $$3));
         jq<dzf> $$5 = $$1.b(dzd.c);
         jq<ebk> $$6 = this.b.b(ebk.g);
         this.i = new dzg($$5, new ebi(dgt.a(this.c), $$6));
      }

      private dzg a(dxg $$0) {
         return new dzg(this.g, $$0);
      }

      private dzg a(dgg $$0, jq<ebk> $$1) {
         return this.a(new ebi($$0, $$1));
      }

      private elm a(dzg $$0) {
         return new elm(Map.of(dzg.b, $$0, dzg.c, this.h, dzg.d, this.i));
      }

      private void a(alh<elm> $$0, dzg $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dgg $$0) {
         jq<ebk> $$1 = this.b.b(ebk.c);
         this.a(eln.a, this.a($$0, $$1));
         jq<ebk> $$2 = this.b.b(ebk.d);
         this.a(eln.c, this.a($$0, $$2));
         jq<ebk> $$3 = this.b.b(ebk.e);
         this.a(eln.d, this.a($$0, $$3));
      }

      public void a() {
         jq.c<dgq> $$0 = this.f.b(dgr.b);
         this.a(dgp.a($$0));
         jq<ebk> $$1 = this.b.b(ebk.c);
         jq.c<dgc> $$2 = this.c.b(dgj.b);
         this.a(eln.e, this.a(new dgn($$2), $$1));
         this.a(eln.b, this.a(new eba(eka.a(this.c, this.e, this.d))));
         this.a(eln.f, this.a(new eaw($$2)));
      }
   }
}
