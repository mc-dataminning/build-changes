import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eoa {
   public static final aly<enz> a = a("normal");
   public static final aly<enz> b = a("flat");
   public static final aly<enz> c = a("large_biomes");
   public static final aly<enz> d = a("amplified");
   public static final aly<enz> e = a("single_biome_surface");
   public static final aly<enz> f = a("debug_all_block_states");

   public static void a(rk<enz> $$0) {
      new eoa.a($$0).a();
   }

   private static aly<enz> a(String $$0) {
      return aly.a(mb.bb, alz.b($$0));
   }

   public static Optional<aly<enz>> a(eel $$0) {
      return $$0.a(ebr.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dzr $$1 = (dzr)var10000;

         $$0x.b();
         return switch ($$1) {
            case edl $$3 -> Optional.of(b);
            case edh $$4 -> Optional.of(f);
            case edt $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static eel a(js.a $$0) {
      return $$0.d(mb.bb).b(a).a().a();
   }

   public static ebr b(js.a $$0) {
      return $$0.d(mb.bb).b(a).a().b().orElseThrow();
   }

   public static eel c(js.a $$0) {
      return $$0.d(mb.bb).b(b).a().a();
   }

   static class a {
      private final rk<enz> a;
      private final jr<edv> b;
      private final jr<dik> c;
      private final jr<eno> d;
      private final jr<eoq> e;
      private final jr<diy> f;
      private final jq<ebq> g;
      private final ebr h;
      private final ebr i;

      a(rk<enz> $$0) {
         this.a = $$0;
         jr<ebq> $$1 = $$0.a(mb.aN);
         this.b = $$0.a(mb.aR);
         this.c = $$0.a(mb.aI);
         this.d = $$0.a(mb.aT);
         this.e = $$0.a(mb.aW);
         this.f = $$0.a(mb.bc);
         this.g = $$1.b(ebo.a);
         jq<ebq> $$2 = $$1.b(ebo.b);
         jq<edv> $$3 = this.b.b(edv.f);
         jq.c<diy> $$4 = this.f.b(diz.a);
         this.h = new ebr($$2, new edt(dix.a($$4), $$3));
         jq<ebq> $$5 = $$1.b(ebo.c);
         jq<edv> $$6 = this.b.b(edv.g);
         this.i = new ebr($$5, new edt(djb.a(this.c), $$6));
      }

      private ebr a(dzr $$0) {
         return new ebr(this.g, $$0);
      }

      private ebr a(dio $$0, jq<edv> $$1) {
         return this.a(new edt($$0, $$1));
      }

      private enz a(ebr $$0) {
         return new enz(Map.of(ebr.b, $$0, ebr.c, this.h, ebr.d, this.i));
      }

      private void a(aly<enz> $$0, ebr $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dio $$0) {
         jq<edv> $$1 = this.b.b(edv.c);
         this.a(eoa.a, this.a($$0, $$1));
         jq<edv> $$2 = this.b.b(edv.d);
         this.a(eoa.c, this.a($$0, $$2));
         jq<edv> $$3 = this.b.b(edv.e);
         this.a(eoa.d, this.a($$0, $$3));
      }

      public void a() {
         jq.c<diy> $$0 = this.f.b(diz.b);
         this.a(dix.a($$0));
         jq<edv> $$1 = this.b.b(edv.c);
         jq.c<dik> $$2 = this.c.b(dir.b);
         this.a(eoa.e, this.a(new div($$2), $$1));
         this.a(eoa.b, this.a(new edl(emn.a(this.c, this.e, this.d))));
         this.a(eoa.f, this.a(new edh($$2)));
      }
   }
}
