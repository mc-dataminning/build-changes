import java.util.Map;
import java.util.Optional;

public class dyv {
   public static final ahf<dyu> a = a("normal");
   public static final ahf<dyu> b = a("flat");
   public static final ahf<dyu> c = a("large_biomes");
   public static final ahf<dyu> d = a("amplified");
   public static final ahf<dyu> e = a("single_biome_surface");
   public static final ahf<dyu> f = a("debug_all_block_states");

   public static void a(pe<dyu> $$0) {
      new dyv.a($$0).a();
   }

   private static ahf<dyu> a(String $$0) {
      return ahf.a(ke.aK, new ahg($$0));
   }

   public static Optional<ahf<dyu>> a(it<dmq> $$0) {
      return $$0.d(dmq.b).flatMap($$0x -> {
         dld $$1 = $$0x.b();
         if ($$1 instanceof dok) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dog ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dpk a(iu $$0) {
      return $$0.d(ke.aK).f(a).a().a();
   }

   public static dmq b(iu $$0) {
      return $$0.d(ke.aK).f(a).a().b().orElseThrow();
   }

   static class a {
      private final pe<dyu> a;
      private final ii<dou> b;
      private final ii<cun> c;
      private final ii<dyj> d;
      private final ii<dzl> e;
      private final ii<cvb> f;
      private final ih<dmp> g;
      private final dmq h;
      private final dmq i;

      a(pe<dyu> $$0) {
         this.a = $$0;
         ii<dmp> $$1 = $$0.a(ke.ay);
         this.b = $$0.a(ke.aA);
         this.c = $$0.a(ke.at);
         this.d = $$0.a(ke.aC);
         this.e = $$0.a(ke.aF);
         this.f = $$0.a(ke.aL);
         this.g = $$1.b(dmn.a);
         ih<dmp> $$2 = $$1.b(dmn.b);
         ih<dou> $$3 = this.b.b(dou.f);
         ih.c<cvb> $$4 = this.f.b(cvc.a);
         this.h = new dmq($$2, new dos(cva.a($$4), $$3));
         ih<dmp> $$5 = $$1.b(dmn.c);
         ih<dou> $$6 = this.b.b(dou.g);
         this.i = new dmq($$5, new dos(cve.a(this.c), $$6));
      }

      private dmq a(dld $$0) {
         return new dmq(this.g, $$0);
      }

      private dmq a(cur $$0, ih<dou> $$1) {
         return this.a(new dos($$0, $$1));
      }

      private dyu a(dmq $$0) {
         return new dyu(Map.of(dmq.b, $$0, dmq.c, this.h, dmq.d, this.i));
      }

      private void a(ahf<dyu> $$0, dmq $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cur $$0) {
         ih<dou> $$1 = this.b.b(dou.c);
         this.a(dyv.a, this.a($$0, $$1));
         ih<dou> $$2 = this.b.b(dou.d);
         this.a(dyv.c, this.a($$0, $$2));
         ih<dou> $$3 = this.b.b(dou.e);
         this.a(dyv.d, this.a($$0, $$3));
      }

      public void a() {
         ih.c<cvb> $$0 = this.f.b(cvc.b);
         this.a(cva.a($$0));
         ih<dou> $$1 = this.b.b(dou.c);
         ih.c<cun> $$2 = this.c.b(cuu.b);
         this.a(dyv.e, this.a(new cuy($$2), $$1));
         this.a(dyv.b, this.a(new dok(dxi.a(this.c, this.e, this.d))));
         this.a(dyv.f, this.a(new dog($$2)));
      }
   }
}
