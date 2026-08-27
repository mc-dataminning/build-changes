import java.util.Map;
import java.util.Optional;

public class ehb {
   public static final akm<eha> a = a("normal");
   public static final akm<eha> b = a("flat");
   public static final akm<eha> c = a("large_biomes");
   public static final akm<eha> d = a("amplified");
   public static final akm<eha> e = a("single_biome_surface");
   public static final akm<eha> f = a("debug_all_block_states");

   public static void a(qo<eha> $$0) {
      new ehb.a($$0).a();
   }

   private static akm<eha> a(String $$0) {
      return akm.a(lf.aQ, new akn($$0));
   }

   public static Optional<akm<eha>> a(dxq $$0) {
      return $$0.a(duw.b).flatMap($$0x -> {
         dta $$1 = $$0x.b();
         if ($$1 instanceof dwq) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dwm ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dxq a(jl $$0) {
      return $$0.d(lf.aQ).g(a).a().a();
   }

   public static duw b(jl $$0) {
      return $$0.d(lf.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qo<eha> a;
      private final iy<dxa> b;
      private final iy<dby> c;
      private final iy<egp> d;
      private final iy<ehr> e;
      private final iy<dcm> f;
      private final ix<duv> g;
      private final duw h;
      private final duw i;

      a(qo<eha> $$0) {
         this.a = $$0;
         iy<duv> $$1 = $$0.a(lf.aE);
         this.b = $$0.a(lf.aG);
         this.c = $$0.a(lf.az);
         this.d = $$0.a(lf.aI);
         this.e = $$0.a(lf.aL);
         this.f = $$0.a(lf.aR);
         this.g = $$1.b(dut.a);
         ix<duv> $$2 = $$1.b(dut.b);
         ix<dxa> $$3 = this.b.b(dxa.f);
         ix.c<dcm> $$4 = this.f.b(dcn.a);
         this.h = new duw($$2, new dwy(dcl.a($$4), $$3));
         ix<duv> $$5 = $$1.b(dut.c);
         ix<dxa> $$6 = this.b.b(dxa.g);
         this.i = new duw($$5, new dwy(dcp.a(this.c), $$6));
      }

      private duw a(dta $$0) {
         return new duw(this.g, $$0);
      }

      private duw a(dcc $$0, ix<dxa> $$1) {
         return this.a(new dwy($$0, $$1));
      }

      private eha a(duw $$0) {
         return new eha(Map.of(duw.b, $$0, duw.c, this.h, duw.d, this.i));
      }

      private void a(akm<eha> $$0, duw $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dcc $$0) {
         ix<dxa> $$1 = this.b.b(dxa.c);
         this.a(ehb.a, this.a($$0, $$1));
         ix<dxa> $$2 = this.b.b(dxa.d);
         this.a(ehb.c, this.a($$0, $$2));
         ix<dxa> $$3 = this.b.b(dxa.e);
         this.a(ehb.d, this.a($$0, $$3));
      }

      public void a() {
         ix.c<dcm> $$0 = this.f.b(dcn.b);
         this.a(dcl.a($$0));
         ix<dxa> $$1 = this.b.b(dxa.c);
         ix.c<dby> $$2 = this.c.b(dcf.b);
         this.a(ehb.e, this.a(new dcj($$2), $$1));
         this.a(ehb.b, this.a(new dwq(efo.a(this.c, this.e, this.d))));
         this.a(ehb.f, this.a(new dwm($$2)));
      }
   }
}
