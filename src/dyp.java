import java.util.Map;
import java.util.Optional;

public class dyp {
   public static final ahc<dyo> a = a("normal");
   public static final ahc<dyo> b = a("flat");
   public static final ahc<dyo> c = a("large_biomes");
   public static final ahc<dyo> d = a("amplified");
   public static final ahc<dyo> e = a("single_biome_surface");
   public static final ahc<dyo> f = a("debug_all_block_states");

   public static void a(pc<dyo> $$0) {
      new dyp.a($$0).a();
   }

   private static ahc<dyo> a(String $$0) {
      return ahc.a(ke.aK, new ahd($$0));
   }

   public static Optional<ahc<dyo>> a(it<dmk> $$0) {
      return $$0.d(dmk.b).flatMap($$0x -> {
         dkx $$1 = $$0x.b();
         if ($$1 instanceof doe) {
            return Optional.of(b);
         } else {
            return $$1 instanceof doa ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dpe a(iu $$0) {
      return $$0.d(ke.aK).f(a).a().a();
   }

   public static dmk b(iu $$0) {
      return $$0.d(ke.aK).f(a).a().b().orElseThrow();
   }

   static class a {
      private final pc<dyo> a;
      private final ii<doo> b;
      private final ii<cuh> c;
      private final ii<dyd> d;
      private final ii<dzf> e;
      private final ii<cuv> f;
      private final ih<dmj> g;
      private final dmk h;
      private final dmk i;

      a(pc<dyo> $$0) {
         this.a = $$0;
         ii<dmj> $$1 = $$0.a(ke.ay);
         this.b = $$0.a(ke.aA);
         this.c = $$0.a(ke.at);
         this.d = $$0.a(ke.aC);
         this.e = $$0.a(ke.aF);
         this.f = $$0.a(ke.aL);
         this.g = $$1.b(dmh.a);
         ih<dmj> $$2 = $$1.b(dmh.b);
         ih<doo> $$3 = this.b.b(doo.f);
         ih.c<cuv> $$4 = this.f.b(cuw.a);
         this.h = new dmk($$2, new dom(cuu.a($$4), $$3));
         ih<dmj> $$5 = $$1.b(dmh.c);
         ih<doo> $$6 = this.b.b(doo.g);
         this.i = new dmk($$5, new dom(cuy.a(this.c), $$6));
      }

      private dmk a(dkx $$0) {
         return new dmk(this.g, $$0);
      }

      private dmk a(cul $$0, ih<doo> $$1) {
         return this.a(new dom($$0, $$1));
      }

      private dyo a(dmk $$0) {
         return new dyo(Map.of(dmk.b, $$0, dmk.c, this.h, dmk.d, this.i));
      }

      private void a(ahc<dyo> $$0, dmk $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cul $$0) {
         ih<doo> $$1 = this.b.b(doo.c);
         this.a(dyp.a, this.a($$0, $$1));
         ih<doo> $$2 = this.b.b(doo.d);
         this.a(dyp.c, this.a($$0, $$2));
         ih<doo> $$3 = this.b.b(doo.e);
         this.a(dyp.d, this.a($$0, $$3));
      }

      public void a() {
         ih.c<cuv> $$0 = this.f.b(cuw.b);
         this.a(cuu.a($$0));
         ih<doo> $$1 = this.b.b(doo.c);
         ih.c<cuh> $$2 = this.c.b(cuo.b);
         this.a(dyp.e, this.a(new cus($$2), $$1));
         this.a(dyp.b, this.a(new doe(dxc.a(this.c, this.e, this.d))));
         this.a(dyp.f, this.a(new doa($$2)));
      }
   }
}
