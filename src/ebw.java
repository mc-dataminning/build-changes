import java.util.Map;
import java.util.Optional;

public class ebw {
   public static final ajb<ebv> a = a("normal");
   public static final ajb<ebv> b = a("flat");
   public static final ajb<ebv> c = a("large_biomes");
   public static final ajb<ebv> d = a("amplified");
   public static final ajb<ebv> e = a("single_biome_surface");
   public static final ajb<ebv> f = a("debug_all_block_states");

   public static void a(pj<ebv> $$0) {
      new ebw.a($$0).a();
   }

   private static ajb<ebv> a(String $$0) {
      return ajb.a(ki.aL, new ajc($$0));
   }

   public static Optional<ajb<ebv>> a(ix<dpr> $$0) {
      return $$0.d(dpr.b).flatMap($$0x -> {
         dob $$1 = $$0x.b();
         if ($$1 instanceof drl) {
            return Optional.of(b);
         } else {
            return $$1 instanceof drh ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dsl a(iy $$0) {
      return $$0.d(ki.aL).f(a).a().a();
   }

   public static dpr b(iy $$0) {
      return $$0.d(ki.aL).f(a).a().b().orElseThrow();
   }

   static class a {
      private final pj<ebv> a;
      private final im<drv> b;
      private final im<cxd> c;
      private final im<ebk> d;
      private final im<ecm> e;
      private final im<cxr> f;
      private final il<dpq> g;
      private final dpr h;
      private final dpr i;

      a(pj<ebv> $$0) {
         this.a = $$0;
         im<dpq> $$1 = $$0.a(ki.az);
         this.b = $$0.a(ki.aB);
         this.c = $$0.a(ki.au);
         this.d = $$0.a(ki.aD);
         this.e = $$0.a(ki.aG);
         this.f = $$0.a(ki.aM);
         this.g = $$1.b(dpo.a);
         il<dpq> $$2 = $$1.b(dpo.b);
         il<drv> $$3 = this.b.b(drv.f);
         il.c<cxr> $$4 = this.f.b(cxs.a);
         this.h = new dpr($$2, new drt(cxq.a($$4), $$3));
         il<dpq> $$5 = $$1.b(dpo.c);
         il<drv> $$6 = this.b.b(drv.g);
         this.i = new dpr($$5, new drt(cxu.a(this.c), $$6));
      }

      private dpr a(dob $$0) {
         return new dpr(this.g, $$0);
      }

      private dpr a(cxh $$0, il<drv> $$1) {
         return this.a(new drt($$0, $$1));
      }

      private ebv a(dpr $$0) {
         return new ebv(Map.of(dpr.b, $$0, dpr.c, this.h, dpr.d, this.i));
      }

      private void a(ajb<ebv> $$0, dpr $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cxh $$0) {
         il<drv> $$1 = this.b.b(drv.c);
         this.a(ebw.a, this.a($$0, $$1));
         il<drv> $$2 = this.b.b(drv.d);
         this.a(ebw.c, this.a($$0, $$2));
         il<drv> $$3 = this.b.b(drv.e);
         this.a(ebw.d, this.a($$0, $$3));
      }

      public void a() {
         il.c<cxr> $$0 = this.f.b(cxs.b);
         this.a(cxq.a($$0));
         il<drv> $$1 = this.b.b(drv.c);
         il.c<cxd> $$2 = this.c.b(cxk.b);
         this.a(ebw.e, this.a(new cxo($$2), $$1));
         this.a(ebw.b, this.a(new drl(eaj.a(this.c, this.e, this.d))));
         this.a(ebw.f, this.a(new drh($$2)));
      }
   }
}
