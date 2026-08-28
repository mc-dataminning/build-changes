import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class elh {
   public static final alg<elg> a = a("normal");
   public static final alg<elg> b = a("flat");
   public static final alg<elg> c = a("large_biomes");
   public static final alg<elg> d = a("amplified");
   public static final alg<elg> e = a("single_biome_surface");
   public static final alg<elg> f = a("debug_all_block_states");

   public static void a(qx<elg> $$0) {
      new elh.a($$0).a();
   }

   private static alg<elg> a(String $$0) {
      return alg.a(ly.aZ, alh.b($$0));
   }

   public static Optional<alg<elg>> a(ebu $$0) {
      return $$0.a(dza.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dxa $$1 = (dxa)var10000;

         $$0x.b();
         return switch ($$1) {
            case eau $$3 -> Optional.of(b);
            case eaq $$4 -> Optional.of(f);
            case ebc $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ebu a(jr.a $$0) {
      return $$0.d(ly.aZ).b(a).a().a();
   }

   public static dza b(jr.a $$0) {
      return $$0.d(ly.aZ).b(a).a().b().orElseThrow();
   }

   static class a {
      private final qx<elg> a;
      private final jq<ebe> b;
      private final jq<dfw> c;
      private final jq<ekv> d;
      private final jq<elx> e;
      private final jq<dgk> f;
      private final jp<dyz> g;
      private final dza h;
      private final dza i;

      a(qx<elg> $$0) {
         this.a = $$0;
         jq<dyz> $$1 = $$0.a(ly.aL);
         this.b = $$0.a(ly.aP);
         this.c = $$0.a(ly.aG);
         this.d = $$0.a(ly.aR);
         this.e = $$0.a(ly.aU);
         this.f = $$0.a(ly.ba);
         this.g = $$1.b(dyx.a);
         jp<dyz> $$2 = $$1.b(dyx.b);
         jp<ebe> $$3 = this.b.b(ebe.f);
         jp.c<dgk> $$4 = this.f.b(dgl.a);
         this.h = new dza($$2, new ebc(dgj.a($$4), $$3));
         jp<dyz> $$5 = $$1.b(dyx.c);
         jp<ebe> $$6 = this.b.b(ebe.g);
         this.i = new dza($$5, new ebc(dgn.a(this.c), $$6));
      }

      private dza a(dxa $$0) {
         return new dza(this.g, $$0);
      }

      private dza a(dga $$0, jp<ebe> $$1) {
         return this.a(new ebc($$0, $$1));
      }

      private elg a(dza $$0) {
         return new elg(Map.of(dza.b, $$0, dza.c, this.h, dza.d, this.i));
      }

      private void a(alg<elg> $$0, dza $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dga $$0) {
         jp<ebe> $$1 = this.b.b(ebe.c);
         this.a(elh.a, this.a($$0, $$1));
         jp<ebe> $$2 = this.b.b(ebe.d);
         this.a(elh.c, this.a($$0, $$2));
         jp<ebe> $$3 = this.b.b(ebe.e);
         this.a(elh.d, this.a($$0, $$3));
      }

      public void a() {
         jp.c<dgk> $$0 = this.f.b(dgl.b);
         this.a(dgj.a($$0));
         jp<ebe> $$1 = this.b.b(ebe.c);
         jp.c<dfw> $$2 = this.c.b(dgd.b);
         this.a(elh.e, this.a(new dgh($$2), $$1));
         this.a(elh.b, this.a(new eau(eju.a(this.c, this.e, this.d))));
         this.a(elh.f, this.a(new eaq($$2)));
      }
   }
}
