import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class epy {
   public static final ald<epx> a = a("normal");
   public static final ald<epx> b = a("flat");
   public static final ald<epx> c = a("large_biomes");
   public static final ald<epx> d = a("amplified");
   public static final ald<epx> e = a("single_biome_surface");
   public static final ald<epx> f = a("debug_all_block_states");

   public static void a(qh<epx> $$0) {
      new epy.a($$0).a();
   }

   private static ald<epx> a(String $$0) {
      return ald.a(mg.bl, ale.b($$0));
   }

   public static Optional<ald<epx>> a(egi $$0) {
      return $$0.a(edm.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         ebm $$1 = (ebm)var10000;

         $$0x.b();
         return switch ($$1) {
            case efi $$3 -> Optional.of(b);
            case efe $$4 -> Optional.of(f);
            case efq $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static egi a(jg.a $$0) {
      return $$0.e(mg.bl).b(a).a().a();
   }

   public static edm b(jg.a $$0) {
      return $$0.e(mg.bl).b(a).a().b().orElseThrow();
   }

   public static egi c(jg.a $$0) {
      return $$0.e(mg.bl).b(b).a().a();
   }

   static class a {
      private final qh<epx> a;
      private final jf<efs> b;
      private final jf<djs> c;
      private final jf<epm> d;
      private final jf<eqo> e;
      private final jf<dkg> f;
      private final je<edl> g;
      private final edm h;
      private final edm i;

      a(qh<epx> $$0) {
         this.a = $$0;
         jf<edl> $$1 = $$0.a(mg.aN);
         this.b = $$0.a(mg.aV);
         this.c = $$0.a(mg.aG);
         this.d = $$0.a(mg.aZ);
         this.e = $$0.a(mg.bb);
         this.f = $$0.a(mg.aU);
         this.g = $$1.b(edj.a);
         je<edl> $$2 = $$1.b(edj.b);
         je<efs> $$3 = this.b.b(efs.f);
         je.c<dkg> $$4 = this.f.b(dkh.a);
         this.h = new edm($$2, new efq(dkf.a($$4), $$3));
         je<edl> $$5 = $$1.b(edj.c);
         je<efs> $$6 = this.b.b(efs.g);
         this.i = new edm($$5, new efq(dkj.a(this.c), $$6));
      }

      private edm a(ebm $$0) {
         return new edm(this.g, $$0);
      }

      private edm a(djw $$0, je<efs> $$1) {
         return this.a(new efq($$0, $$1));
      }

      private epx a(edm $$0) {
         return new epx(Map.of(edm.b, $$0, edm.c, this.h, edm.d, this.i));
      }

      private void a(ald<epx> $$0, edm $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(djw $$0) {
         je<efs> $$1 = this.b.b(efs.c);
         this.a(epy.a, this.a($$0, $$1));
         je<efs> $$2 = this.b.b(efs.d);
         this.a(epy.c, this.a($$0, $$2));
         je<efs> $$3 = this.b.b(efs.e);
         this.a(epy.d, this.a($$0, $$3));
      }

      public void a() {
         je.c<dkg> $$0 = this.f.b(dkh.b);
         this.a(dkf.a($$0));
         je<efs> $$1 = this.b.b(efs.c);
         je.c<djs> $$2 = this.c.b(djz.b);
         this.a(epy.e, this.a(new dkd($$2), $$1));
         this.a(epy.b, this.a(new efi(eol.a(this.c, this.e, this.d))));
         this.a(epy.f, this.a(new efe($$2)));
      }
   }
}
