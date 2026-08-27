import java.util.Map;
import java.util.Optional;

public class dus {
   public static final aey<dur> a = a("normal");
   public static final aey<dur> b = a("flat");
   public static final aey<dur> c = a("large_biomes");
   public static final aey<dur> d = a("amplified");
   public static final aey<dur> e = a("single_biome_surface");
   public static final aey<dur> f = a("debug_all_block_states");

   public static void a(nr<dur> $$0) {
      new dus.a($$0).a();
   }

   private static aey<dur> a(String $$0) {
      return aey.a(jc.aG, new aez($$0));
   }

   public static Optional<aey<dur>> a(hq<din> $$0) {
      return $$0.d(din.b).flatMap($$0x -> {
         dha $$1 = $$0x.b();
         if ($$1 instanceof dkh) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dkd ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dlh a(hr $$0) {
      return $$0.d(jc.aG).f(a).a().a();
   }

   public static din b(hr $$0) {
      return $$0.d(jc.aG).f(a).a().b().orElseThrow();
   }

   static class a {
      private final nr<dur> a;
      private final hf<dkr> b;
      private final hf<cqz> c;
      private final hf<dug> d;
      private final hf<dvi> e;
      private final hf<crn> f;
      private final he<dim> g;
      private final din h;
      private final din i;

      a(nr<dur> $$0) {
         this.a = $$0;
         hf<dim> $$1 = $$0.a(jc.av);
         this.b = $$0.a(jc.ax);
         this.c = $$0.a(jc.aq);
         this.d = $$0.a(jc.az);
         this.e = $$0.a(jc.aC);
         this.f = $$0.a(jc.aH);
         this.g = $$1.b(dik.a);
         he<dim> $$2 = $$1.b(dik.b);
         he<dkr> $$3 = this.b.b(dkr.f);
         he.c<crn> $$4 = this.f.b(cro.a);
         this.h = new din($$2, new dkp(crm.a($$4), $$3));
         he<dim> $$5 = $$1.b(dik.c);
         he<dkr> $$6 = this.b.b(dkr.g);
         this.i = new din($$5, new dkp(crq.a(this.c), $$6));
      }

      private din a(dha $$0) {
         return new din(this.g, $$0);
      }

      private din a(crd $$0, he<dkr> $$1) {
         return this.a(new dkp($$0, $$1));
      }

      private dur a(din $$0) {
         return new dur(Map.of(din.b, $$0, din.c, this.h, din.d, this.i));
      }

      private void a(aey<dur> $$0, din $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(crd $$0) {
         he<dkr> $$1 = this.b.b(dkr.c);
         this.a(dus.a, this.a($$0, $$1));
         he<dkr> $$2 = this.b.b(dkr.d);
         this.a(dus.c, this.a($$0, $$2));
         he<dkr> $$3 = this.b.b(dkr.e);
         this.a(dus.d, this.a($$0, $$3));
      }

      public void a() {
         he.c<crn> $$0 = this.f.b(cro.b);
         this.a(crm.a($$0));
         he<dkr> $$1 = this.b.b(dkr.c);
         he.c<cqz> $$2 = this.c.b(crg.b);
         this.a(dus.e, this.a(new crk($$2), $$1));
         this.a(dus.b, this.a(new dkh(dtf.a(this.c, this.e, this.d))));
         this.a(dus.f, this.a(new dkd($$2)));
      }
   }
}
