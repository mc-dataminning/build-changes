import java.util.Map;
import java.util.Optional;

public class dvq {
   public static final afv<dvp> a = a("normal");
   public static final afv<dvp> b = a("flat");
   public static final afv<dvp> c = a("large_biomes");
   public static final afv<dvp> d = a("amplified");
   public static final afv<dvp> e = a("single_biome_surface");
   public static final afv<dvp> f = a("debug_all_block_states");

   public static void a(oo<dvp> $$0) {
      new dvq.a($$0).a();
   }

   private static afv<dvp> a(String $$0) {
      return afv.a(jz.aG, new afw($$0));
   }

   public static Optional<afv<dvp>> a(io<djl> $$0) {
      return $$0.d(djl.b).flatMap($$0x -> {
         dhy $$1 = $$0x.b();
         if ($$1 instanceof dlf) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dlb ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dmf a(ip $$0) {
      return $$0.d(jz.aG).f(a).a().a();
   }

   public static djl b(ip $$0) {
      return $$0.d(jz.aG).f(a).a().b().orElseThrow();
   }

   static class a {
      private final oo<dvp> a;
      private final ic<dlp> b;
      private final ic<crx> c;
      private final ic<dve> d;
      private final ic<dwg> e;
      private final ic<csl> f;
      private final ib<djk> g;
      private final djl h;
      private final djl i;

      a(oo<dvp> $$0) {
         this.a = $$0;
         ic<djk> $$1 = $$0.a(jz.av);
         this.b = $$0.a(jz.ax);
         this.c = $$0.a(jz.aq);
         this.d = $$0.a(jz.az);
         this.e = $$0.a(jz.aC);
         this.f = $$0.a(jz.aH);
         this.g = $$1.b(dji.a);
         ib<djk> $$2 = $$1.b(dji.b);
         ib<dlp> $$3 = this.b.b(dlp.f);
         ib.c<csl> $$4 = this.f.b(csm.a);
         this.h = new djl($$2, new dln(csk.a($$4), $$3));
         ib<djk> $$5 = $$1.b(dji.c);
         ib<dlp> $$6 = this.b.b(dlp.g);
         this.i = new djl($$5, new dln(cso.a(this.c), $$6));
      }

      private djl a(dhy $$0) {
         return new djl(this.g, $$0);
      }

      private djl a(csb $$0, ib<dlp> $$1) {
         return this.a(new dln($$0, $$1));
      }

      private dvp a(djl $$0) {
         return new dvp(Map.of(djl.b, $$0, djl.c, this.h, djl.d, this.i));
      }

      private void a(afv<dvp> $$0, djl $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(csb $$0) {
         ib<dlp> $$1 = this.b.b(dlp.c);
         this.a(dvq.a, this.a($$0, $$1));
         ib<dlp> $$2 = this.b.b(dlp.d);
         this.a(dvq.c, this.a($$0, $$2));
         ib<dlp> $$3 = this.b.b(dlp.e);
         this.a(dvq.d, this.a($$0, $$3));
      }

      public void a() {
         ib.c<csl> $$0 = this.f.b(csm.b);
         this.a(csk.a($$0));
         ib<dlp> $$1 = this.b.b(dlp.c);
         ib.c<crx> $$2 = this.c.b(cse.b);
         this.a(dvq.e, this.a(new csi($$2), $$1));
         this.a(dvq.b, this.a(new dlf(dud.a(this.c, this.e, this.d))));
         this.a(dvq.f, this.a(new dlb($$2)));
      }
   }
}
