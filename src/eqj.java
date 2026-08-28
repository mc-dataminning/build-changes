import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eqj {
   public static final alf<eqi> a = a("normal");
   public static final alf<eqi> b = a("flat");
   public static final alf<eqi> c = a("large_biomes");
   public static final alf<eqi> d = a("amplified");
   public static final alf<eqi> e = a("single_biome_surface");
   public static final alf<eqi> f = a("debug_all_block_states");

   public static void a(qh<eqi> $$0) {
      new eqj.a($$0).a();
   }

   private static alf<eqi> a(String $$0) {
      return alf.a(mg.bm, alg.b($$0));
   }

   public static Optional<alf<eqi>> a(egt $$0) {
      return $$0.a(edx.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         ebx $$1 = (ebx)var10000;

         $$0x.b();
         return switch ($$1) {
            case eft $$3 -> Optional.of(b);
            case efp $$4 -> Optional.of(f);
            case egb $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static egt a(jg.a $$0) {
      return $$0.e(mg.bm).b(a).a().a();
   }

   public static edx b(jg.a $$0) {
      return $$0.e(mg.bm).b(a).a().b().orElseThrow();
   }

   public static egt c(jg.a $$0) {
      return $$0.e(mg.bm).b(b).a().a();
   }

   static class a {
      private final qh<eqi> a;
      private final jf<egd> b;
      private final jf<djy> c;
      private final jf<epx> d;
      private final jf<eqz> e;
      private final jf<dkm> f;
      private final je<edw> g;
      private final edx h;
      private final edx i;

      a(qh<eqi> $$0) {
         this.a = $$0;
         jf<edw> $$1 = $$0.a(mg.aO);
         this.b = $$0.a(mg.aW);
         this.c = $$0.a(mg.aG);
         this.d = $$0.a(mg.ba);
         this.e = $$0.a(mg.bc);
         this.f = $$0.a(mg.aV);
         this.g = $$1.b(edu.a);
         je<edw> $$2 = $$1.b(edu.b);
         je<egd> $$3 = this.b.b(egd.f);
         je.c<dkm> $$4 = this.f.b(dkn.a);
         this.h = new edx($$2, new egb(dkl.a($$4), $$3));
         je<edw> $$5 = $$1.b(edu.c);
         je<egd> $$6 = this.b.b(egd.g);
         this.i = new edx($$5, new egb(dkp.a(this.c), $$6));
      }

      private edx a(ebx $$0) {
         return new edx(this.g, $$0);
      }

      private edx a(dkc $$0, je<egd> $$1) {
         return this.a(new egb($$0, $$1));
      }

      private eqi a(edx $$0) {
         return new eqi(Map.of(edx.b, $$0, edx.c, this.h, edx.d, this.i));
      }

      private void a(alf<eqi> $$0, edx $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dkc $$0) {
         je<egd> $$1 = this.b.b(egd.c);
         this.a(eqj.a, this.a($$0, $$1));
         je<egd> $$2 = this.b.b(egd.d);
         this.a(eqj.c, this.a($$0, $$2));
         je<egd> $$3 = this.b.b(egd.e);
         this.a(eqj.d, this.a($$0, $$3));
      }

      public void a() {
         je.c<dkm> $$0 = this.f.b(dkn.b);
         this.a(dkl.a($$0));
         je<egd> $$1 = this.b.b(egd.c);
         je.c<djy> $$2 = this.c.b(dkf.b);
         this.a(eqj.e, this.a(new dkj($$2), $$1));
         this.a(eqj.b, this.a(new eft(eow.a(this.c, this.e, this.d))));
         this.a(eqj.f, this.a(new efp($$2)));
      }
   }
}
