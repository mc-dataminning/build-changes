import java.util.Map;
import java.util.Optional;

public class eau {
   public static final aix<eat> a = a("normal");
   public static final aix<eat> b = a("flat");
   public static final aix<eat> c = a("large_biomes");
   public static final aix<eat> d = a("amplified");
   public static final aix<eat> e = a("single_biome_surface");
   public static final aix<eat> f = a("debug_all_block_states");

   public static void a(ph<eat> $$0) {
      new eau.a($$0).a();
   }

   private static aix<eat> a(String $$0) {
      return aix.a(kg.aK, new aiy($$0));
   }

   public static Optional<aix<eat>> a(iv<dop> $$0) {
      return $$0.d(dop.b).flatMap($$0x -> {
         dnc $$1 = $$0x.b();
         if ($$1 instanceof dqj) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dqf ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static drj a(iw $$0) {
      return $$0.d(kg.aK).f(a).a().a();
   }

   public static dop b(iw $$0) {
      return $$0.d(kg.aK).f(a).a().b().orElseThrow();
   }

   static class a {
      private final ph<eat> a;
      private final ik<dqt> b;
      private final ik<cwm> c;
      private final ik<eai> d;
      private final ik<ebk> e;
      private final ik<cxa> f;
      private final ij<doo> g;
      private final dop h;
      private final dop i;

      a(ph<eat> $$0) {
         this.a = $$0;
         ik<doo> $$1 = $$0.a(kg.ay);
         this.b = $$0.a(kg.aA);
         this.c = $$0.a(kg.at);
         this.d = $$0.a(kg.aC);
         this.e = $$0.a(kg.aF);
         this.f = $$0.a(kg.aL);
         this.g = $$1.b(dom.a);
         ij<doo> $$2 = $$1.b(dom.b);
         ij<dqt> $$3 = this.b.b(dqt.f);
         ij.c<cxa> $$4 = this.f.b(cxb.a);
         this.h = new dop($$2, new dqr(cwz.a($$4), $$3));
         ij<doo> $$5 = $$1.b(dom.c);
         ij<dqt> $$6 = this.b.b(dqt.g);
         this.i = new dop($$5, new dqr(cxd.a(this.c), $$6));
      }

      private dop a(dnc $$0) {
         return new dop(this.g, $$0);
      }

      private dop a(cwq $$0, ij<dqt> $$1) {
         return this.a(new dqr($$0, $$1));
      }

      private eat a(dop $$0) {
         return new eat(Map.of(dop.b, $$0, dop.c, this.h, dop.d, this.i));
      }

      private void a(aix<eat> $$0, dop $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cwq $$0) {
         ij<dqt> $$1 = this.b.b(dqt.c);
         this.a(eau.a, this.a($$0, $$1));
         ij<dqt> $$2 = this.b.b(dqt.d);
         this.a(eau.c, this.a($$0, $$2));
         ij<dqt> $$3 = this.b.b(dqt.e);
         this.a(eau.d, this.a($$0, $$3));
      }

      public void a() {
         ij.c<cxa> $$0 = this.f.b(cxb.b);
         this.a(cwz.a($$0));
         ij<dqt> $$1 = this.b.b(dqt.c);
         ij.c<cwm> $$2 = this.c.b(cwt.b);
         this.a(eau.e, this.a(new cwx($$2), $$1));
         this.a(eau.b, this.a(new dqj(dzh.a(this.c, this.e, this.d))));
         this.a(eau.f, this.a(new dqf($$2)));
      }
   }
}
