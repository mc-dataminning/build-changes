import java.util.Map;
import java.util.Optional;

public class eic {
   public static final ale<eib> a = a("normal");
   public static final ale<eib> b = a("flat");
   public static final ale<eib> c = a("large_biomes");
   public static final ale<eib> d = a("amplified");
   public static final ale<eib> e = a("single_biome_surface");
   public static final ale<eib> f = a("debug_all_block_states");

   public static void a(rc<eib> $$0) {
      new eic.a($$0).a();
   }

   private static ale<eib> a(String $$0) {
      return ale.a(lq.aQ, new alf($$0));
   }

   public static Optional<ale<eib>> a(dyr $$0) {
      return $$0.a(dvx.b).flatMap($$0x -> {
         dub $$1 = $$0x.b();
         if ($$1 instanceof dxr) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dxn ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dyr a(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().a();
   }

   public static dvx b(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final rc<eib> a;
      private final jj<dyb> b;
      private final jj<dcz> c;
      private final jj<ehq> d;
      private final jj<eis> e;
      private final jj<ddn> f;
      private final ji<dvw> g;
      private final dvx h;
      private final dvx i;

      a(rc<eib> $$0) {
         this.a = $$0;
         jj<dvw> $$1 = $$0.a(lq.aE);
         this.b = $$0.a(lq.aG);
         this.c = $$0.a(lq.az);
         this.d = $$0.a(lq.aI);
         this.e = $$0.a(lq.aL);
         this.f = $$0.a(lq.aR);
         this.g = $$1.b(dvu.a);
         ji<dvw> $$2 = $$1.b(dvu.b);
         ji<dyb> $$3 = this.b.b(dyb.f);
         ji.c<ddn> $$4 = this.f.b(ddo.a);
         this.h = new dvx($$2, new dxz(ddm.a($$4), $$3));
         ji<dvw> $$5 = $$1.b(dvu.c);
         ji<dyb> $$6 = this.b.b(dyb.g);
         this.i = new dvx($$5, new dxz(ddq.a(this.c), $$6));
      }

      private dvx a(dub $$0) {
         return new dvx(this.g, $$0);
      }

      private dvx a(ddd $$0, ji<dyb> $$1) {
         return this.a(new dxz($$0, $$1));
      }

      private eib a(dvx $$0) {
         return new eib(Map.of(dvx.b, $$0, dvx.c, this.h, dvx.d, this.i));
      }

      private void a(ale<eib> $$0, dvx $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ddd $$0) {
         ji<dyb> $$1 = this.b.b(dyb.c);
         this.a(eic.a, this.a($$0, $$1));
         ji<dyb> $$2 = this.b.b(dyb.d);
         this.a(eic.c, this.a($$0, $$2));
         ji<dyb> $$3 = this.b.b(dyb.e);
         this.a(eic.d, this.a($$0, $$3));
      }

      public void a() {
         ji.c<ddn> $$0 = this.f.b(ddo.b);
         this.a(ddm.a($$0));
         ji<dyb> $$1 = this.b.b(dyb.c);
         ji.c<dcz> $$2 = this.c.b(ddg.b);
         this.a(eic.e, this.a(new ddk($$2), $$1));
         this.a(eic.b, this.a(new dxr(egp.a(this.c, this.e, this.d))));
         this.a(eic.f, this.a(new dxn($$2)));
      }
   }
}
