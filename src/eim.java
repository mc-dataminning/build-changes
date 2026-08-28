import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eim {
   public static final akj<eil> a = a("normal");
   public static final akj<eil> b = a("flat");
   public static final akj<eil> c = a("large_biomes");
   public static final akj<eil> d = a("amplified");
   public static final akj<eil> e = a("single_biome_surface");
   public static final akj<eil> f = a("debug_all_block_states");

   public static void a(qm<eil> $$0) {
      new eim.a($$0).a();
   }

   private static akj<eil> a(String $$0) {
      return akj.a(lr.aX, new akk($$0));
   }

   public static Optional<akj<eil>> a(dza $$0) {
      return $$0.a(dwg.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         duh $$1 = (duh)var10000;

         $$0x.b();
         return switch ($$1) {
            case dya $$3 -> Optional.of(b);
            case dxw $$4 -> Optional.of(f);
            case dyi $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static dza a(jx $$0) {
      return $$0.d(lr.aX).g(a).a().a();
   }

   public static dwg b(jx $$0) {
      return $$0.d(lr.aX).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qm<eil> a;
      private final jk<dyk> b;
      private final jk<ddf> c;
      private final jk<eia> d;
      private final jk<ejc> e;
      private final jk<ddt> f;
      private final jj<dwf> g;
      private final dwg h;
      private final dwg i;

      a(qm<eil> $$0) {
         this.a = $$0;
         jk<dwf> $$1 = $$0.a(lr.aJ);
         this.b = $$0.a(lr.aN);
         this.c = $$0.a(lr.aE);
         this.d = $$0.a(lr.aP);
         this.e = $$0.a(lr.aS);
         this.f = $$0.a(lr.aY);
         this.g = $$1.b(dwd.a);
         jj<dwf> $$2 = $$1.b(dwd.b);
         jj<dyk> $$3 = this.b.b(dyk.f);
         jj.c<ddt> $$4 = this.f.b(ddu.a);
         this.h = new dwg($$2, new dyi(dds.a($$4), $$3));
         jj<dwf> $$5 = $$1.b(dwd.c);
         jj<dyk> $$6 = this.b.b(dyk.g);
         this.i = new dwg($$5, new dyi(ddw.a(this.c), $$6));
      }

      private dwg a(duh $$0) {
         return new dwg(this.g, $$0);
      }

      private dwg a(ddj $$0, jj<dyk> $$1) {
         return this.a(new dyi($$0, $$1));
      }

      private eil a(dwg $$0) {
         return new eil(Map.of(dwg.b, $$0, dwg.c, this.h, dwg.d, this.i));
      }

      private void a(akj<eil> $$0, dwg $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ddj $$0) {
         jj<dyk> $$1 = this.b.b(dyk.c);
         this.a(eim.a, this.a($$0, $$1));
         jj<dyk> $$2 = this.b.b(dyk.d);
         this.a(eim.c, this.a($$0, $$2));
         jj<dyk> $$3 = this.b.b(dyk.e);
         this.a(eim.d, this.a($$0, $$3));
      }

      public void a() {
         jj.c<ddt> $$0 = this.f.b(ddu.b);
         this.a(dds.a($$0));
         jj<dyk> $$1 = this.b.b(dyk.c);
         jj.c<ddf> $$2 = this.c.b(ddm.b);
         this.a(eim.e, this.a(new ddq($$2), $$1));
         this.a(eim.b, this.a(new dya(egz.a(this.c, this.e, this.d))));
         this.a(eim.f, this.a(new dxw($$2)));
      }
   }
}
