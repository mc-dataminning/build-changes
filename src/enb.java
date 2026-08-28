import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class enb {
   public static final aku<ena> a = a("normal");
   public static final aku<ena> b = a("flat");
   public static final aku<ena> c = a("large_biomes");
   public static final aku<ena> d = a("amplified");
   public static final aku<ena> e = a("single_biome_surface");
   public static final aku<ena> f = a("debug_all_block_states");

   public static void a(qe<ena> $$0) {
      new enb.a($$0).a();
   }

   private static aku<ena> a(String $$0) {
      return aku.a(mc.bb, akv.b($$0));
   }

   public static Optional<aku<ena>> a(edm $$0) {
      return $$0.a(eas.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dys $$1 = (dys)var10000;

         $$0x.b();
         return switch ($$1) {
            case ecm $$3 -> Optional.of(b);
            case eci $$4 -> Optional.of(f);
            case ecu $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static edm a(jt.a $$0) {
      return $$0.d(mc.bb).b(a).a().a();
   }

   public static eas b(jt.a $$0) {
      return $$0.d(mc.bb).b(a).a().b().orElseThrow();
   }

   public static edm c(jt.a $$0) {
      return $$0.d(mc.bb).b(b).a().a();
   }

   static class a {
      private final qe<ena> a;
      private final js<ecw> b;
      private final js<dhj> c;
      private final js<emp> d;
      private final js<enr> e;
      private final js<dhx> f;
      private final jr<ear> g;
      private final eas h;
      private final eas i;

      a(qe<ena> $$0) {
         this.a = $$0;
         js<ear> $$1 = $$0.a(mc.aN);
         this.b = $$0.a(mc.aR);
         this.c = $$0.a(mc.aI);
         this.d = $$0.a(mc.aT);
         this.e = $$0.a(mc.aW);
         this.f = $$0.a(mc.bc);
         this.g = $$1.b(eap.a);
         jr<ear> $$2 = $$1.b(eap.b);
         jr<ecw> $$3 = this.b.b(ecw.f);
         jr.c<dhx> $$4 = this.f.b(dhy.a);
         this.h = new eas($$2, new ecu(dhw.a($$4), $$3));
         jr<ear> $$5 = $$1.b(eap.c);
         jr<ecw> $$6 = this.b.b(ecw.g);
         this.i = new eas($$5, new ecu(dia.a(this.c), $$6));
      }

      private eas a(dys $$0) {
         return new eas(this.g, $$0);
      }

      private eas a(dhn $$0, jr<ecw> $$1) {
         return this.a(new ecu($$0, $$1));
      }

      private ena a(eas $$0) {
         return new ena(Map.of(eas.b, $$0, eas.c, this.h, eas.d, this.i));
      }

      private void a(aku<ena> $$0, eas $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dhn $$0) {
         jr<ecw> $$1 = this.b.b(ecw.c);
         this.a(enb.a, this.a($$0, $$1));
         jr<ecw> $$2 = this.b.b(ecw.d);
         this.a(enb.c, this.a($$0, $$2));
         jr<ecw> $$3 = this.b.b(ecw.e);
         this.a(enb.d, this.a($$0, $$3));
      }

      public void a() {
         jr.c<dhx> $$0 = this.f.b(dhy.b);
         this.a(dhw.a($$0));
         jr<ecw> $$1 = this.b.b(ecw.c);
         jr.c<dhj> $$2 = this.c.b(dhq.b);
         this.a(enb.e, this.a(new dhu($$2), $$1));
         this.a(enb.b, this.a(new ecm(elo.a(this.c, this.e, this.d))));
         this.a(enb.f, this.a(new eci($$2)));
      }
   }
}
