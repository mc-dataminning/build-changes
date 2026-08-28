import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class enc {
   public static final akt<enb> a = a("normal");
   public static final akt<enb> b = a("flat");
   public static final akt<enb> c = a("large_biomes");
   public static final akt<enb> d = a("amplified");
   public static final akt<enb> e = a("single_biome_surface");
   public static final akt<enb> f = a("debug_all_block_states");

   public static void a(qe<enb> $$0) {
      new enc.a($$0).a();
   }

   private static akt<enb> a(String $$0) {
      return akt.a(mc.bb, aku.b($$0));
   }

   public static Optional<akt<enb>> a(edn $$0) {
      return $$0.a(eat.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dyt $$1 = (dyt)var10000;

         $$0x.b();
         return switch ($$1) {
            case ecn $$3 -> Optional.of(b);
            case ecj $$4 -> Optional.of(f);
            case ecv $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static edn a(jt.a $$0) {
      return $$0.d(mc.bb).b(a).a().a();
   }

   public static eat b(jt.a $$0) {
      return $$0.d(mc.bb).b(a).a().b().orElseThrow();
   }

   public static edn c(jt.a $$0) {
      return $$0.d(mc.bb).b(b).a().a();
   }

   static class a {
      private final qe<enb> a;
      private final js<ecx> b;
      private final js<dhk> c;
      private final js<emq> d;
      private final js<ens> e;
      private final js<dhy> f;
      private final jr<eas> g;
      private final eat h;
      private final eat i;

      a(qe<enb> $$0) {
         this.a = $$0;
         js<eas> $$1 = $$0.a(mc.aN);
         this.b = $$0.a(mc.aR);
         this.c = $$0.a(mc.aI);
         this.d = $$0.a(mc.aT);
         this.e = $$0.a(mc.aW);
         this.f = $$0.a(mc.bc);
         this.g = $$1.b(eaq.a);
         jr<eas> $$2 = $$1.b(eaq.b);
         jr<ecx> $$3 = this.b.b(ecx.f);
         jr.c<dhy> $$4 = this.f.b(dhz.a);
         this.h = new eat($$2, new ecv(dhx.a($$4), $$3));
         jr<eas> $$5 = $$1.b(eaq.c);
         jr<ecx> $$6 = this.b.b(ecx.g);
         this.i = new eat($$5, new ecv(dib.a(this.c), $$6));
      }

      private eat a(dyt $$0) {
         return new eat(this.g, $$0);
      }

      private eat a(dho $$0, jr<ecx> $$1) {
         return this.a(new ecv($$0, $$1));
      }

      private enb a(eat $$0) {
         return new enb(Map.of(eat.b, $$0, eat.c, this.h, eat.d, this.i));
      }

      private void a(akt<enb> $$0, eat $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dho $$0) {
         jr<ecx> $$1 = this.b.b(ecx.c);
         this.a(enc.a, this.a($$0, $$1));
         jr<ecx> $$2 = this.b.b(ecx.d);
         this.a(enc.c, this.a($$0, $$2));
         jr<ecx> $$3 = this.b.b(ecx.e);
         this.a(enc.d, this.a($$0, $$3));
      }

      public void a() {
         jr.c<dhy> $$0 = this.f.b(dhz.b);
         this.a(dhx.a($$0));
         jr<ecx> $$1 = this.b.b(ecx.c);
         jr.c<dhk> $$2 = this.c.b(dhr.b);
         this.a(enc.e, this.a(new dhv($$2), $$1));
         this.a(enc.b, this.a(new ecn(elp.a(this.c, this.e, this.d))));
         this.a(enc.f, this.a(new ecj($$2)));
      }
   }
}
