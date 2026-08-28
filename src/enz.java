import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class enz {
   public static final aly<eny> a = a("normal");
   public static final aly<eny> b = a("flat");
   public static final aly<eny> c = a("large_biomes");
   public static final aly<eny> d = a("amplified");
   public static final aly<eny> e = a("single_biome_surface");
   public static final aly<eny> f = a("debug_all_block_states");

   public static void a(rk<eny> $$0) {
      new enz.a($$0).a();
   }

   private static aly<eny> a(String $$0) {
      return aly.a(mb.bb, alz.b($$0));
   }

   public static Optional<aly<eny>> a(eek $$0) {
      return $$0.a(ebq.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dzq $$1 = (dzq)var10000;

         $$0x.b();
         return switch ($$1) {
            case edk $$3 -> Optional.of(b);
            case edg $$4 -> Optional.of(f);
            case eds $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static eek a(js.a $$0) {
      return $$0.d(mb.bb).b(a).a().a();
   }

   public static ebq b(js.a $$0) {
      return $$0.d(mb.bb).b(a).a().b().orElseThrow();
   }

   public static eek c(js.a $$0) {
      return $$0.d(mb.bb).b(b).a().a();
   }

   static class a {
      private final rk<eny> a;
      private final jr<edu> b;
      private final jr<dij> c;
      private final jr<enn> d;
      private final jr<eop> e;
      private final jr<dix> f;
      private final jq<ebp> g;
      private final ebq h;
      private final ebq i;

      a(rk<eny> $$0) {
         this.a = $$0;
         jr<ebp> $$1 = $$0.a(mb.aN);
         this.b = $$0.a(mb.aR);
         this.c = $$0.a(mb.aI);
         this.d = $$0.a(mb.aT);
         this.e = $$0.a(mb.aW);
         this.f = $$0.a(mb.bc);
         this.g = $$1.b(ebn.a);
         jq<ebp> $$2 = $$1.b(ebn.b);
         jq<edu> $$3 = this.b.b(edu.f);
         jq.c<dix> $$4 = this.f.b(diy.a);
         this.h = new ebq($$2, new eds(diw.a($$4), $$3));
         jq<ebp> $$5 = $$1.b(ebn.c);
         jq<edu> $$6 = this.b.b(edu.g);
         this.i = new ebq($$5, new eds(dja.a(this.c), $$6));
      }

      private ebq a(dzq $$0) {
         return new ebq(this.g, $$0);
      }

      private ebq a(din $$0, jq<edu> $$1) {
         return this.a(new eds($$0, $$1));
      }

      private eny a(ebq $$0) {
         return new eny(Map.of(ebq.b, $$0, ebq.c, this.h, ebq.d, this.i));
      }

      private void a(aly<eny> $$0, ebq $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(din $$0) {
         jq<edu> $$1 = this.b.b(edu.c);
         this.a(enz.a, this.a($$0, $$1));
         jq<edu> $$2 = this.b.b(edu.d);
         this.a(enz.c, this.a($$0, $$2));
         jq<edu> $$3 = this.b.b(edu.e);
         this.a(enz.d, this.a($$0, $$3));
      }

      public void a() {
         jq.c<dix> $$0 = this.f.b(diy.b);
         this.a(diw.a($$0));
         jq<edu> $$1 = this.b.b(edu.c);
         jq.c<dij> $$2 = this.c.b(diq.b);
         this.a(enz.e, this.a(new diu($$2), $$1));
         this.a(enz.b, this.a(new edk(emm.a(this.c, this.e, this.d))));
         this.a(enz.f, this.a(new edg($$2)));
      }
   }
}
