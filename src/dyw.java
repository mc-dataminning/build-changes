import java.util.Map;
import java.util.Optional;

public class dyw {
   public static final ahf<dyv> a = a("normal");
   public static final ahf<dyv> b = a("flat");
   public static final ahf<dyv> c = a("large_biomes");
   public static final ahf<dyv> d = a("amplified");
   public static final ahf<dyv> e = a("single_biome_surface");
   public static final ahf<dyv> f = a("debug_all_block_states");

   public static void a(pe<dyv> $$0) {
      new dyw.a($$0).a();
   }

   private static ahf<dyv> a(String $$0) {
      return ahf.a(ke.aK, new ahg($$0));
   }

   public static Optional<ahf<dyv>> a(it<dmr> $$0) {
      return $$0.d(dmr.b).flatMap($$0x -> {
         dle $$1 = $$0x.b();
         if ($$1 instanceof dol) {
            return Optional.of(b);
         } else {
            return $$1 instanceof doh ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dpl a(iu $$0) {
      return $$0.d(ke.aK).f(a).a().a();
   }

   public static dmr b(iu $$0) {
      return $$0.d(ke.aK).f(a).a().b().orElseThrow();
   }

   static class a {
      private final pe<dyv> a;
      private final ii<dov> b;
      private final ii<cuo> c;
      private final ii<dyk> d;
      private final ii<dzm> e;
      private final ii<cvc> f;
      private final ih<dmq> g;
      private final dmr h;
      private final dmr i;

      a(pe<dyv> $$0) {
         this.a = $$0;
         ii<dmq> $$1 = $$0.a(ke.ay);
         this.b = $$0.a(ke.aA);
         this.c = $$0.a(ke.at);
         this.d = $$0.a(ke.aC);
         this.e = $$0.a(ke.aF);
         this.f = $$0.a(ke.aL);
         this.g = $$1.b(dmo.a);
         ih<dmq> $$2 = $$1.b(dmo.b);
         ih<dov> $$3 = this.b.b(dov.f);
         ih.c<cvc> $$4 = this.f.b(cvd.a);
         this.h = new dmr($$2, new dot(cvb.a($$4), $$3));
         ih<dmq> $$5 = $$1.b(dmo.c);
         ih<dov> $$6 = this.b.b(dov.g);
         this.i = new dmr($$5, new dot(cvf.a(this.c), $$6));
      }

      private dmr a(dle $$0) {
         return new dmr(this.g, $$0);
      }

      private dmr a(cus $$0, ih<dov> $$1) {
         return this.a(new dot($$0, $$1));
      }

      private dyv a(dmr $$0) {
         return new dyv(Map.of(dmr.b, $$0, dmr.c, this.h, dmr.d, this.i));
      }

      private void a(ahf<dyv> $$0, dmr $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cus $$0) {
         ih<dov> $$1 = this.b.b(dov.c);
         this.a(dyw.a, this.a($$0, $$1));
         ih<dov> $$2 = this.b.b(dov.d);
         this.a(dyw.c, this.a($$0, $$2));
         ih<dov> $$3 = this.b.b(dov.e);
         this.a(dyw.d, this.a($$0, $$3));
      }

      public void a() {
         ih.c<cvc> $$0 = this.f.b(cvd.b);
         this.a(cvb.a($$0));
         ih<dov> $$1 = this.b.b(dov.c);
         ih.c<cuo> $$2 = this.c.b(cuv.b);
         this.a(dyw.e, this.a(new cuz($$2), $$1));
         this.a(dyw.b, this.a(new dol(dxj.a(this.c, this.e, this.d))));
         this.a(dyw.f, this.a(new doh($$2)));
      }
   }
}
