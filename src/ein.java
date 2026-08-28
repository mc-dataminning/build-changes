import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ein {
   public static final akj<eim> a = a("normal");
   public static final akj<eim> b = a("flat");
   public static final akj<eim> c = a("large_biomes");
   public static final akj<eim> d = a("amplified");
   public static final akj<eim> e = a("single_biome_surface");
   public static final akj<eim> f = a("debug_all_block_states");

   public static void a(qm<eim> $$0) {
      new ein.a($$0).a();
   }

   private static akj<eim> a(String $$0) {
      return akj.a(lr.aX, new akk($$0));
   }

   public static Optional<akj<eim>> a(dzb $$0) {
      return $$0.a(dwh.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dui $$1 = (dui)var10000;

         $$0x.b();
         return switch ($$1) {
            case dyb $$3 -> Optional.of(b);
            case dxx $$4 -> Optional.of(f);
            case dyj $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static dzb a(jx $$0) {
      return $$0.d(lr.aX).g(a).a().a();
   }

   public static dwh b(jx $$0) {
      return $$0.d(lr.aX).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qm<eim> a;
      private final jk<dyl> b;
      private final jk<ddg> c;
      private final jk<eib> d;
      private final jk<ejd> e;
      private final jk<ddu> f;
      private final jj<dwg> g;
      private final dwh h;
      private final dwh i;

      a(qm<eim> $$0) {
         this.a = $$0;
         jk<dwg> $$1 = $$0.a(lr.aJ);
         this.b = $$0.a(lr.aN);
         this.c = $$0.a(lr.aE);
         this.d = $$0.a(lr.aP);
         this.e = $$0.a(lr.aS);
         this.f = $$0.a(lr.aY);
         this.g = $$1.b(dwe.a);
         jj<dwg> $$2 = $$1.b(dwe.b);
         jj<dyl> $$3 = this.b.b(dyl.f);
         jj.c<ddu> $$4 = this.f.b(ddv.a);
         this.h = new dwh($$2, new dyj(ddt.a($$4), $$3));
         jj<dwg> $$5 = $$1.b(dwe.c);
         jj<dyl> $$6 = this.b.b(dyl.g);
         this.i = new dwh($$5, new dyj(ddx.a(this.c), $$6));
      }

      private dwh a(dui $$0) {
         return new dwh(this.g, $$0);
      }

      private dwh a(ddk $$0, jj<dyl> $$1) {
         return this.a(new dyj($$0, $$1));
      }

      private eim a(dwh $$0) {
         return new eim(Map.of(dwh.b, $$0, dwh.c, this.h, dwh.d, this.i));
      }

      private void a(akj<eim> $$0, dwh $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ddk $$0) {
         jj<dyl> $$1 = this.b.b(dyl.c);
         this.a(ein.a, this.a($$0, $$1));
         jj<dyl> $$2 = this.b.b(dyl.d);
         this.a(ein.c, this.a($$0, $$2));
         jj<dyl> $$3 = this.b.b(dyl.e);
         this.a(ein.d, this.a($$0, $$3));
      }

      public void a() {
         jj.c<ddu> $$0 = this.f.b(ddv.b);
         this.a(ddt.a($$0));
         jj<dyl> $$1 = this.b.b(dyl.c);
         jj.c<ddg> $$2 = this.c.b(ddn.b);
         this.a(ein.e, this.a(new ddr($$2), $$1));
         this.a(ein.b, this.a(new dyb(eha.a(this.c, this.e, this.d))));
         this.a(ein.f, this.a(new dxx($$2)));
      }
   }
}
