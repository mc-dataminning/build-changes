import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eig {
   public static final akj<eif> a = a("normal");
   public static final akj<eif> b = a("flat");
   public static final akj<eif> c = a("large_biomes");
   public static final akj<eif> d = a("amplified");
   public static final akj<eif> e = a("single_biome_surface");
   public static final akj<eif> f = a("debug_all_block_states");

   public static void a(qm<eif> $$0) {
      new eig.a($$0).a();
   }

   private static akj<eif> a(String $$0) {
      return akj.a(lr.aX, new akk($$0));
   }

   public static Optional<akj<eif>> a(dyu $$0) {
      return $$0.a(dwa.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         due $$1 = (due)var10000;

         $$0x.b();
         return switch ($$1) {
            case dxu $$3 -> Optional.of(b);
            case dxq $$4 -> Optional.of(f);
            case dyc $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static dyu a(jx $$0) {
      return $$0.d(lr.aX).g(a).a().a();
   }

   public static dwa b(jx $$0) {
      return $$0.d(lr.aX).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qm<eif> a;
      private final jk<dye> b;
      private final jk<ddd> c;
      private final jk<ehu> d;
      private final jk<eiw> e;
      private final jk<ddr> f;
      private final jj<dvz> g;
      private final dwa h;
      private final dwa i;

      a(qm<eif> $$0) {
         this.a = $$0;
         jk<dvz> $$1 = $$0.a(lr.aJ);
         this.b = $$0.a(lr.aN);
         this.c = $$0.a(lr.aE);
         this.d = $$0.a(lr.aP);
         this.e = $$0.a(lr.aS);
         this.f = $$0.a(lr.aY);
         this.g = $$1.b(dvx.a);
         jj<dvz> $$2 = $$1.b(dvx.b);
         jj<dye> $$3 = this.b.b(dye.f);
         jj.c<ddr> $$4 = this.f.b(dds.a);
         this.h = new dwa($$2, new dyc(ddq.a($$4), $$3));
         jj<dvz> $$5 = $$1.b(dvx.c);
         jj<dye> $$6 = this.b.b(dye.g);
         this.i = new dwa($$5, new dyc(ddu.a(this.c), $$6));
      }

      private dwa a(due $$0) {
         return new dwa(this.g, $$0);
      }

      private dwa a(ddh $$0, jj<dye> $$1) {
         return this.a(new dyc($$0, $$1));
      }

      private eif a(dwa $$0) {
         return new eif(Map.of(dwa.b, $$0, dwa.c, this.h, dwa.d, this.i));
      }

      private void a(akj<eif> $$0, dwa $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ddh $$0) {
         jj<dye> $$1 = this.b.b(dye.c);
         this.a(eig.a, this.a($$0, $$1));
         jj<dye> $$2 = this.b.b(dye.d);
         this.a(eig.c, this.a($$0, $$2));
         jj<dye> $$3 = this.b.b(dye.e);
         this.a(eig.d, this.a($$0, $$3));
      }

      public void a() {
         jj.c<ddr> $$0 = this.f.b(dds.b);
         this.a(ddq.a($$0));
         jj<dye> $$1 = this.b.b(dye.c);
         jj.c<ddd> $$2 = this.c.b(ddk.b);
         this.a(eig.e, this.a(new ddo($$2), $$1));
         this.a(eig.b, this.a(new dxu(egt.a(this.c, this.e, this.d))));
         this.a(eig.f, this.a(new dxq($$2)));
      }
   }
}
