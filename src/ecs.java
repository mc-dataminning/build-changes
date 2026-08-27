import java.util.Map;
import java.util.Optional;

public class ecs {
   public static final ajg<ecr> a = a("normal");
   public static final ajg<ecr> b = a("flat");
   public static final ajg<ecr> c = a("large_biomes");
   public static final ajg<ecr> d = a("amplified");
   public static final ajg<ecr> e = a("single_biome_surface");
   public static final ajg<ecr> f = a("debug_all_block_states");

   public static void a(pl<ecr> $$0) {
      new ecs.a($$0).a();
   }

   private static ajg<ecr> a(String $$0) {
      return ajg.a(kj.aL, new ajh($$0));
   }

   public static Optional<ajg<ecr>> a(dth $$0) {
      return $$0.a(dqn.b).flatMap($$0x -> {
         dow $$1 = $$0x.b();
         if ($$1 instanceof dsh) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dsd ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dth a(iz $$0) {
      return $$0.d(kj.aL).g(a).a().a();
   }

   public static dqn b(iz $$0) {
      return $$0.d(kj.aL).g(a).a().b().orElseThrow();
   }

   static class a {
      private final pl<ecr> a;
      private final im<dsr> b;
      private final im<cxy> c;
      private final im<ecg> d;
      private final im<edi> e;
      private final im<cym> f;
      private final il<dqm> g;
      private final dqn h;
      private final dqn i;

      a(pl<ecr> $$0) {
         this.a = $$0;
         im<dqm> $$1 = $$0.a(kj.az);
         this.b = $$0.a(kj.aB);
         this.c = $$0.a(kj.au);
         this.d = $$0.a(kj.aD);
         this.e = $$0.a(kj.aG);
         this.f = $$0.a(kj.aM);
         this.g = $$1.b(dqk.a);
         il<dqm> $$2 = $$1.b(dqk.b);
         il<dsr> $$3 = this.b.b(dsr.f);
         il.c<cym> $$4 = this.f.b(cyn.a);
         this.h = new dqn($$2, new dsp(cyl.a($$4), $$3));
         il<dqm> $$5 = $$1.b(dqk.c);
         il<dsr> $$6 = this.b.b(dsr.g);
         this.i = new dqn($$5, new dsp(cyp.a(this.c), $$6));
      }

      private dqn a(dow $$0) {
         return new dqn(this.g, $$0);
      }

      private dqn a(cyc $$0, il<dsr> $$1) {
         return this.a(new dsp($$0, $$1));
      }

      private ecr a(dqn $$0) {
         return new ecr(Map.of(dqn.b, $$0, dqn.c, this.h, dqn.d, this.i));
      }

      private void a(ajg<ecr> $$0, dqn $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cyc $$0) {
         il<dsr> $$1 = this.b.b(dsr.c);
         this.a(ecs.a, this.a($$0, $$1));
         il<dsr> $$2 = this.b.b(dsr.d);
         this.a(ecs.c, this.a($$0, $$2));
         il<dsr> $$3 = this.b.b(dsr.e);
         this.a(ecs.d, this.a($$0, $$3));
      }

      public void a() {
         il.c<cym> $$0 = this.f.b(cyn.b);
         this.a(cyl.a($$0));
         il<dsr> $$1 = this.b.b(dsr.c);
         il.c<cxy> $$2 = this.c.b(cyf.b);
         this.a(ecs.e, this.a(new cyj($$2), $$1));
         this.a(ecs.b, this.a(new dsh(ebf.a(this.c, this.e, this.d))));
         this.a(ecs.f, this.a(new dsd($$2)));
      }
   }
}
