import java.util.Map;
import java.util.Optional;

public class eex {
   public static final ajs<eew> a = a("normal");
   public static final ajs<eew> b = a("flat");
   public static final ajs<eew> c = a("large_biomes");
   public static final ajs<eew> d = a("amplified");
   public static final ajs<eew> e = a("single_biome_surface");
   public static final ajs<eew> f = a("debug_all_block_states");

   public static void a(px<eew> $$0) {
      new eex.a($$0).a();
   }

   private static ajs<eew> a(String $$0) {
      return ajs.a(ks.aM, new ajt($$0));
   }

   public static Optional<ajs<eew>> a(dvm $$0) {
      return $$0.a(dss.b).flatMap($$0x -> {
         dqw $$1 = $$0x.b();
         if ($$1 instanceof dum) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dui ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dvm a(iz $$0) {
      return $$0.d(ks.aM).g(a).a().a();
   }

   public static dss b(iz $$0) {
      return $$0.d(ks.aM).g(a).a().b().orElseThrow();
   }

   static class a {
      private final px<eew> a;
      private final im<duw> b;
      private final im<czw> c;
      private final im<eel> d;
      private final im<efn> e;
      private final im<dak> f;
      private final il<dsr> g;
      private final dss h;
      private final dss i;

      a(px<eew> $$0) {
         this.a = $$0;
         im<dsr> $$1 = $$0.a(ks.aA);
         this.b = $$0.a(ks.aC);
         this.c = $$0.a(ks.av);
         this.d = $$0.a(ks.aE);
         this.e = $$0.a(ks.aH);
         this.f = $$0.a(ks.aN);
         this.g = $$1.b(dsp.a);
         il<dsr> $$2 = $$1.b(dsp.b);
         il<duw> $$3 = this.b.b(duw.f);
         il.c<dak> $$4 = this.f.b(dal.a);
         this.h = new dss($$2, new duu(daj.a($$4), $$3));
         il<dsr> $$5 = $$1.b(dsp.c);
         il<duw> $$6 = this.b.b(duw.g);
         this.i = new dss($$5, new duu(dan.a(this.c), $$6));
      }

      private dss a(dqw $$0) {
         return new dss(this.g, $$0);
      }

      private dss a(daa $$0, il<duw> $$1) {
         return this.a(new duu($$0, $$1));
      }

      private eew a(dss $$0) {
         return new eew(Map.of(dss.b, $$0, dss.c, this.h, dss.d, this.i));
      }

      private void a(ajs<eew> $$0, dss $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(daa $$0) {
         il<duw> $$1 = this.b.b(duw.c);
         this.a(eex.a, this.a($$0, $$1));
         il<duw> $$2 = this.b.b(duw.d);
         this.a(eex.c, this.a($$0, $$2));
         il<duw> $$3 = this.b.b(duw.e);
         this.a(eex.d, this.a($$0, $$3));
      }

      public void a() {
         il.c<dak> $$0 = this.f.b(dal.b);
         this.a(daj.a($$0));
         il<duw> $$1 = this.b.b(duw.c);
         il.c<czw> $$2 = this.c.b(dad.b);
         this.a(eex.e, this.a(new dah($$2), $$1));
         this.a(eex.b, this.a(new dum(edk.a(this.c, this.e, this.d))));
         this.a(eex.f, this.a(new dui($$2)));
      }
   }
}
