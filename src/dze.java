import java.util.Map;
import java.util.Optional;

public class dze {
   public static final ahg<dzd> a = a("normal");
   public static final ahg<dzd> b = a("flat");
   public static final ahg<dzd> c = a("large_biomes");
   public static final ahg<dzd> d = a("amplified");
   public static final ahg<dzd> e = a("single_biome_surface");
   public static final ahg<dzd> f = a("debug_all_block_states");

   public static void a(pf<dzd> $$0) {
      new dze.a($$0).a();
   }

   private static ahg<dzd> a(String $$0) {
      return ahg.a(ke.aK, new ahh($$0));
   }

   public static Optional<ahg<dzd>> a(it<dmz> $$0) {
      return $$0.d(dmz.b).flatMap($$0x -> {
         dlm $$1 = $$0x.b();
         if ($$1 instanceof dot) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dop ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dpt a(iu $$0) {
      return $$0.d(ke.aK).f(a).a().a();
   }

   public static dmz b(iu $$0) {
      return $$0.d(ke.aK).f(a).a().b().orElseThrow();
   }

   static class a {
      private final pf<dzd> a;
      private final ii<dpd> b;
      private final ii<cuw> c;
      private final ii<dys> d;
      private final ii<dzu> e;
      private final ii<cvk> f;
      private final ih<dmy> g;
      private final dmz h;
      private final dmz i;

      a(pf<dzd> $$0) {
         this.a = $$0;
         ii<dmy> $$1 = $$0.a(ke.ay);
         this.b = $$0.a(ke.aA);
         this.c = $$0.a(ke.at);
         this.d = $$0.a(ke.aC);
         this.e = $$0.a(ke.aF);
         this.f = $$0.a(ke.aL);
         this.g = $$1.b(dmw.a);
         ih<dmy> $$2 = $$1.b(dmw.b);
         ih<dpd> $$3 = this.b.b(dpd.f);
         ih.c<cvk> $$4 = this.f.b(cvl.a);
         this.h = new dmz($$2, new dpb(cvj.a($$4), $$3));
         ih<dmy> $$5 = $$1.b(dmw.c);
         ih<dpd> $$6 = this.b.b(dpd.g);
         this.i = new dmz($$5, new dpb(cvn.a(this.c), $$6));
      }

      private dmz a(dlm $$0) {
         return new dmz(this.g, $$0);
      }

      private dmz a(cva $$0, ih<dpd> $$1) {
         return this.a(new dpb($$0, $$1));
      }

      private dzd a(dmz $$0) {
         return new dzd(Map.of(dmz.b, $$0, dmz.c, this.h, dmz.d, this.i));
      }

      private void a(ahg<dzd> $$0, dmz $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cva $$0) {
         ih<dpd> $$1 = this.b.b(dpd.c);
         this.a(dze.a, this.a($$0, $$1));
         ih<dpd> $$2 = this.b.b(dpd.d);
         this.a(dze.c, this.a($$0, $$2));
         ih<dpd> $$3 = this.b.b(dpd.e);
         this.a(dze.d, this.a($$0, $$3));
      }

      public void a() {
         ih.c<cvk> $$0 = this.f.b(cvl.b);
         this.a(cvj.a($$0));
         ih<dpd> $$1 = this.b.b(dpd.c);
         ih.c<cuw> $$2 = this.c.b(cvd.b);
         this.a(dze.e, this.a(new cvh($$2), $$1));
         this.a(dze.b, this.a(new dot(dxr.a(this.c, this.e, this.d))));
         this.a(dze.f, this.a(new dop($$2)));
      }
   }
}
