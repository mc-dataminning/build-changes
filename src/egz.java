import java.util.Map;
import java.util.Optional;

public class egz {
   public static final akl<egy> a = a("normal");
   public static final akl<egy> b = a("flat");
   public static final akl<egy> c = a("large_biomes");
   public static final akl<egy> d = a("amplified");
   public static final akl<egy> e = a("single_biome_surface");
   public static final akl<egy> f = a("debug_all_block_states");

   public static void a(qo<egy> $$0) {
      new egz.a($$0).a();
   }

   private static akl<egy> a(String $$0) {
      return akl.a(lf.aQ, new akm($$0));
   }

   public static Optional<akl<egy>> a(dxo $$0) {
      return $$0.a(duu.b).flatMap($$0x -> {
         dsy $$1 = $$0x.b();
         if ($$1 instanceof dwo) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dwk ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dxo a(jl $$0) {
      return $$0.d(lf.aQ).g(a).a().a();
   }

   public static duu b(jl $$0) {
      return $$0.d(lf.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qo<egy> a;
      private final iy<dwy> b;
      private final iy<dbw> c;
      private final iy<egn> d;
      private final iy<ehp> e;
      private final iy<dck> f;
      private final ix<dut> g;
      private final duu h;
      private final duu i;

      a(qo<egy> $$0) {
         this.a = $$0;
         iy<dut> $$1 = $$0.a(lf.aE);
         this.b = $$0.a(lf.aG);
         this.c = $$0.a(lf.az);
         this.d = $$0.a(lf.aI);
         this.e = $$0.a(lf.aL);
         this.f = $$0.a(lf.aR);
         this.g = $$1.b(dur.a);
         ix<dut> $$2 = $$1.b(dur.b);
         ix<dwy> $$3 = this.b.b(dwy.f);
         ix.c<dck> $$4 = this.f.b(dcl.a);
         this.h = new duu($$2, new dww(dcj.a($$4), $$3));
         ix<dut> $$5 = $$1.b(dur.c);
         ix<dwy> $$6 = this.b.b(dwy.g);
         this.i = new duu($$5, new dww(dcn.a(this.c), $$6));
      }

      private duu a(dsy $$0) {
         return new duu(this.g, $$0);
      }

      private duu a(dca $$0, ix<dwy> $$1) {
         return this.a(new dww($$0, $$1));
      }

      private egy a(duu $$0) {
         return new egy(Map.of(duu.b, $$0, duu.c, this.h, duu.d, this.i));
      }

      private void a(akl<egy> $$0, duu $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dca $$0) {
         ix<dwy> $$1 = this.b.b(dwy.c);
         this.a(egz.a, this.a($$0, $$1));
         ix<dwy> $$2 = this.b.b(dwy.d);
         this.a(egz.c, this.a($$0, $$2));
         ix<dwy> $$3 = this.b.b(dwy.e);
         this.a(egz.d, this.a($$0, $$3));
      }

      public void a() {
         ix.c<dck> $$0 = this.f.b(dcl.b);
         this.a(dcj.a($$0));
         ix<dwy> $$1 = this.b.b(dwy.c);
         ix.c<dbw> $$2 = this.c.b(dcd.b);
         this.a(egz.e, this.a(new dch($$2), $$1));
         this.a(egz.b, this.a(new dwo(efm.a(this.c, this.e, this.d))));
         this.a(egz.f, this.a(new dwk($$2)));
      }
   }
}
