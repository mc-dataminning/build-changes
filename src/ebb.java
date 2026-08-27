import java.util.Map;
import java.util.Optional;

public class ebb {
   public static final aix<eba> a = a("normal");
   public static final aix<eba> b = a("flat");
   public static final aix<eba> c = a("large_biomes");
   public static final aix<eba> d = a("amplified");
   public static final aix<eba> e = a("single_biome_surface");
   public static final aix<eba> f = a("debug_all_block_states");

   public static void a(ph<eba> $$0) {
      new ebb.a($$0).a();
   }

   private static aix<eba> a(String $$0) {
      return aix.a(kg.aK, new aiy($$0));
   }

   public static Optional<aix<eba>> a(iv<dow> $$0) {
      return $$0.d(dow.b).flatMap($$0x -> {
         dng $$1 = $$0x.b();
         if ($$1 instanceof dqq) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dqm ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static drq a(iw $$0) {
      return $$0.d(kg.aK).f(a).a().a();
   }

   public static dow b(iw $$0) {
      return $$0.d(kg.aK).f(a).a().b().orElseThrow();
   }

   static class a {
      private final ph<eba> a;
      private final ik<dra> b;
      private final ik<cwq> c;
      private final ik<eap> d;
      private final ik<ebr> e;
      private final ik<cxe> f;
      private final ij<dov> g;
      private final dow h;
      private final dow i;

      a(ph<eba> $$0) {
         this.a = $$0;
         ik<dov> $$1 = $$0.a(kg.ay);
         this.b = $$0.a(kg.aA);
         this.c = $$0.a(kg.at);
         this.d = $$0.a(kg.aC);
         this.e = $$0.a(kg.aF);
         this.f = $$0.a(kg.aL);
         this.g = $$1.b(dot.a);
         ij<dov> $$2 = $$1.b(dot.b);
         ij<dra> $$3 = this.b.b(dra.f);
         ij.c<cxe> $$4 = this.f.b(cxf.a);
         this.h = new dow($$2, new dqy(cxd.a($$4), $$3));
         ij<dov> $$5 = $$1.b(dot.c);
         ij<dra> $$6 = this.b.b(dra.g);
         this.i = new dow($$5, new dqy(cxh.a(this.c), $$6));
      }

      private dow a(dng $$0) {
         return new dow(this.g, $$0);
      }

      private dow a(cwu $$0, ij<dra> $$1) {
         return this.a(new dqy($$0, $$1));
      }

      private eba a(dow $$0) {
         return new eba(Map.of(dow.b, $$0, dow.c, this.h, dow.d, this.i));
      }

      private void a(aix<eba> $$0, dow $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cwu $$0) {
         ij<dra> $$1 = this.b.b(dra.c);
         this.a(ebb.a, this.a($$0, $$1));
         ij<dra> $$2 = this.b.b(dra.d);
         this.a(ebb.c, this.a($$0, $$2));
         ij<dra> $$3 = this.b.b(dra.e);
         this.a(ebb.d, this.a($$0, $$3));
      }

      public void a() {
         ij.c<cxe> $$0 = this.f.b(cxf.b);
         this.a(cxd.a($$0));
         ij<dra> $$1 = this.b.b(dra.c);
         ij.c<cwq> $$2 = this.c.b(cwx.b);
         this.a(ebb.e, this.a(new cxb($$2), $$1));
         this.a(ebb.b, this.a(new dqq(dzo.a(this.c, this.e, this.d))));
         this.a(ebb.f, this.a(new dqm($$2)));
      }
   }
}
