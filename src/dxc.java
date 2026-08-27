import java.util.Map;
import java.util.Optional;

public class dxc {
   public static final agl<dxb> a = a("normal");
   public static final agl<dxb> b = a("flat");
   public static final agl<dxb> c = a("large_biomes");
   public static final agl<dxb> d = a("amplified");
   public static final agl<dxb> e = a("single_biome_surface");
   public static final agl<dxb> f = a("debug_all_block_states");

   public static void a(oz<dxb> $$0) {
      new dxc.a($$0).a();
   }

   private static agl<dxb> a(String $$0) {
      return agl.a(kd.aH, new agm($$0));
   }

   public static Optional<agl<dxb>> a(is<dkx> $$0) {
      return $$0.d(dkx.b).flatMap($$0x -> {
         djk $$1 = $$0x.b();
         if ($$1 instanceof dmr) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dmn ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dnr a(it $$0) {
      return $$0.d(kd.aH).f(a).a().a();
   }

   public static dkx b(it $$0) {
      return $$0.d(kd.aH).f(a).a().b().orElseThrow();
   }

   static class a {
      private final oz<dxb> a;
      private final ih<dnb> b;
      private final ih<ctd> c;
      private final ih<dwq> d;
      private final ih<dxs> e;
      private final ih<ctr> f;
      private final ig<dkw> g;
      private final dkx h;
      private final dkx i;

      a(oz<dxb> $$0) {
         this.a = $$0;
         ih<dkw> $$1 = $$0.a(kd.aw);
         this.b = $$0.a(kd.ay);
         this.c = $$0.a(kd.ar);
         this.d = $$0.a(kd.aA);
         this.e = $$0.a(kd.aD);
         this.f = $$0.a(kd.aI);
         this.g = $$1.b(dku.a);
         ig<dkw> $$2 = $$1.b(dku.b);
         ig<dnb> $$3 = this.b.b(dnb.f);
         ig.c<ctr> $$4 = this.f.b(cts.a);
         this.h = new dkx($$2, new dmz(ctq.a($$4), $$3));
         ig<dkw> $$5 = $$1.b(dku.c);
         ig<dnb> $$6 = this.b.b(dnb.g);
         this.i = new dkx($$5, new dmz(ctu.a(this.c), $$6));
      }

      private dkx a(djk $$0) {
         return new dkx(this.g, $$0);
      }

      private dkx a(cth $$0, ig<dnb> $$1) {
         return this.a(new dmz($$0, $$1));
      }

      private dxb a(dkx $$0) {
         return new dxb(Map.of(dkx.b, $$0, dkx.c, this.h, dkx.d, this.i));
      }

      private void a(agl<dxb> $$0, dkx $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cth $$0) {
         ig<dnb> $$1 = this.b.b(dnb.c);
         this.a(dxc.a, this.a($$0, $$1));
         ig<dnb> $$2 = this.b.b(dnb.d);
         this.a(dxc.c, this.a($$0, $$2));
         ig<dnb> $$3 = this.b.b(dnb.e);
         this.a(dxc.d, this.a($$0, $$3));
      }

      public void a() {
         ig.c<ctr> $$0 = this.f.b(cts.b);
         this.a(ctq.a($$0));
         ig<dnb> $$1 = this.b.b(dnb.c);
         ig.c<ctd> $$2 = this.c.b(ctk.b);
         this.a(dxc.e, this.a(new cto($$2), $$1));
         this.a(dxc.b, this.a(new dmr(dvp.a(this.c, this.e, this.d))));
         this.a(dxc.f, this.a(new dmn($$2)));
      }
   }
}
