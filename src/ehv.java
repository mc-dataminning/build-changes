import java.util.Map;
import java.util.Optional;

public class ehv {
   public static final ala<ehu> a = a("normal");
   public static final ala<ehu> b = a("flat");
   public static final ala<ehu> c = a("large_biomes");
   public static final ala<ehu> d = a("amplified");
   public static final ala<ehu> e = a("single_biome_surface");
   public static final ala<ehu> f = a("debug_all_block_states");

   public static void a(rc<ehu> $$0) {
      new ehv.a($$0).a();
   }

   private static ala<ehu> a(String $$0) {
      return ala.a(lq.aQ, new alb($$0));
   }

   public static Optional<ala<ehu>> a(dyk $$0) {
      return $$0.a(dvq.b).flatMap($$0x -> {
         dtu $$1 = $$0x.b();
         if ($$1 instanceof dxk) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dxg ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dyk a(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().a();
   }

   public static dvq b(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final rc<ehu> a;
      private final jj<dxu> b;
      private final jj<dcs> c;
      private final jj<ehj> d;
      private final jj<eil> e;
      private final jj<ddg> f;
      private final ji<dvp> g;
      private final dvq h;
      private final dvq i;

      a(rc<ehu> $$0) {
         this.a = $$0;
         jj<dvp> $$1 = $$0.a(lq.aE);
         this.b = $$0.a(lq.aG);
         this.c = $$0.a(lq.az);
         this.d = $$0.a(lq.aI);
         this.e = $$0.a(lq.aL);
         this.f = $$0.a(lq.aR);
         this.g = $$1.b(dvn.a);
         ji<dvp> $$2 = $$1.b(dvn.b);
         ji<dxu> $$3 = this.b.b(dxu.f);
         ji.c<ddg> $$4 = this.f.b(ddh.a);
         this.h = new dvq($$2, new dxs(ddf.a($$4), $$3));
         ji<dvp> $$5 = $$1.b(dvn.c);
         ji<dxu> $$6 = this.b.b(dxu.g);
         this.i = new dvq($$5, new dxs(ddj.a(this.c), $$6));
      }

      private dvq a(dtu $$0) {
         return new dvq(this.g, $$0);
      }

      private dvq a(dcw $$0, ji<dxu> $$1) {
         return this.a(new dxs($$0, $$1));
      }

      private ehu a(dvq $$0) {
         return new ehu(Map.of(dvq.b, $$0, dvq.c, this.h, dvq.d, this.i));
      }

      private void a(ala<ehu> $$0, dvq $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dcw $$0) {
         ji<dxu> $$1 = this.b.b(dxu.c);
         this.a(ehv.a, this.a($$0, $$1));
         ji<dxu> $$2 = this.b.b(dxu.d);
         this.a(ehv.c, this.a($$0, $$2));
         ji<dxu> $$3 = this.b.b(dxu.e);
         this.a(ehv.d, this.a($$0, $$3));
      }

      public void a() {
         ji.c<ddg> $$0 = this.f.b(ddh.b);
         this.a(ddf.a($$0));
         ji<dxu> $$1 = this.b.b(dxu.c);
         ji.c<dcs> $$2 = this.c.b(dcz.b);
         this.a(ehv.e, this.a(new ddd($$2), $$1));
         this.a(ehv.b, this.a(new dxk(egi.a(this.c, this.e, this.d))));
         this.a(ehv.f, this.a(new dxg($$2)));
      }
   }
}
