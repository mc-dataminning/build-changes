import java.util.Map;
import java.util.Optional;

public class ecu {
   public static final ajg<ect> a = a("normal");
   public static final ajg<ect> b = a("flat");
   public static final ajg<ect> c = a("large_biomes");
   public static final ajg<ect> d = a("amplified");
   public static final ajg<ect> e = a("single_biome_surface");
   public static final ajg<ect> f = a("debug_all_block_states");

   public static void a(pl<ect> $$0) {
      new ecu.a($$0).a();
   }

   private static ajg<ect> a(String $$0) {
      return ajg.a(kj.aL, new ajh($$0));
   }

   public static Optional<ajg<ect>> a(dtj $$0) {
      return $$0.a(dqp.b).flatMap($$0x -> {
         doy $$1 = $$0x.b();
         if ($$1 instanceof dsj) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dsf ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dtj a(iz $$0) {
      return $$0.d(kj.aL).g(a).a().a();
   }

   public static dqp b(iz $$0) {
      return $$0.d(kj.aL).g(a).a().b().orElseThrow();
   }

   static class a {
      private final pl<ect> a;
      private final im<dst> b;
      private final im<cya> c;
      private final im<eci> d;
      private final im<edk> e;
      private final im<cyo> f;
      private final il<dqo> g;
      private final dqp h;
      private final dqp i;

      a(pl<ect> $$0) {
         this.a = $$0;
         im<dqo> $$1 = $$0.a(kj.az);
         this.b = $$0.a(kj.aB);
         this.c = $$0.a(kj.au);
         this.d = $$0.a(kj.aD);
         this.e = $$0.a(kj.aG);
         this.f = $$0.a(kj.aM);
         this.g = $$1.b(dqm.a);
         il<dqo> $$2 = $$1.b(dqm.b);
         il<dst> $$3 = this.b.b(dst.f);
         il.c<cyo> $$4 = this.f.b(cyp.a);
         this.h = new dqp($$2, new dsr(cyn.a($$4), $$3));
         il<dqo> $$5 = $$1.b(dqm.c);
         il<dst> $$6 = this.b.b(dst.g);
         this.i = new dqp($$5, new dsr(cyr.a(this.c), $$6));
      }

      private dqp a(doy $$0) {
         return new dqp(this.g, $$0);
      }

      private dqp a(cye $$0, il<dst> $$1) {
         return this.a(new dsr($$0, $$1));
      }

      private ect a(dqp $$0) {
         return new ect(Map.of(dqp.b, $$0, dqp.c, this.h, dqp.d, this.i));
      }

      private void a(ajg<ect> $$0, dqp $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cye $$0) {
         il<dst> $$1 = this.b.b(dst.c);
         this.a(ecu.a, this.a($$0, $$1));
         il<dst> $$2 = this.b.b(dst.d);
         this.a(ecu.c, this.a($$0, $$2));
         il<dst> $$3 = this.b.b(dst.e);
         this.a(ecu.d, this.a($$0, $$3));
      }

      public void a() {
         il.c<cyo> $$0 = this.f.b(cyp.b);
         this.a(cyn.a($$0));
         il<dst> $$1 = this.b.b(dst.c);
         il.c<cya> $$2 = this.c.b(cyh.b);
         this.a(ecu.e, this.a(new cyl($$2), $$1));
         this.a(ecu.b, this.a(new dsj(ebh.a(this.c, this.e, this.d))));
         this.a(ecu.f, this.a(new dsf($$2)));
      }
   }
}
