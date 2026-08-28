import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ent {
   public static final alo<ens> a = a("normal");
   public static final alo<ens> b = a("flat");
   public static final alo<ens> c = a("large_biomes");
   public static final alo<ens> d = a("amplified");
   public static final alo<ens> e = a("single_biome_surface");
   public static final alo<ens> f = a("debug_all_block_states");

   public static void a(ra<ens> $$0) {
      new ent.a($$0).a();
   }

   private static alo<ens> a(String $$0) {
      return alo.a(mb.bb, alp.b($$0));
   }

   public static Optional<alo<ens>> a(eee $$0) {
      return $$0.a(ebk.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dzk $$1 = (dzk)var10000;

         $$0x.b();
         return switch ($$1) {
            case ede $$3 -> Optional.of(b);
            case eda $$4 -> Optional.of(f);
            case edm $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static eee a(js.a $$0) {
      return $$0.d(mb.bb).b(a).a().a();
   }

   public static ebk b(js.a $$0) {
      return $$0.d(mb.bb).b(a).a().b().orElseThrow();
   }

   public static eee c(js.a $$0) {
      return $$0.d(mb.bb).b(b).a().a();
   }

   static class a {
      private final ra<ens> a;
      private final jr<edo> b;
      private final jr<dib> c;
      private final jr<enh> d;
      private final jr<eoj> e;
      private final jr<dip> f;
      private final jq<ebj> g;
      private final ebk h;
      private final ebk i;

      a(ra<ens> $$0) {
         this.a = $$0;
         jr<ebj> $$1 = $$0.a(mb.aN);
         this.b = $$0.a(mb.aR);
         this.c = $$0.a(mb.aI);
         this.d = $$0.a(mb.aT);
         this.e = $$0.a(mb.aW);
         this.f = $$0.a(mb.bc);
         this.g = $$1.b(ebh.a);
         jq<ebj> $$2 = $$1.b(ebh.b);
         jq<edo> $$3 = this.b.b(edo.f);
         jq.c<dip> $$4 = this.f.b(diq.a);
         this.h = new ebk($$2, new edm(dio.a($$4), $$3));
         jq<ebj> $$5 = $$1.b(ebh.c);
         jq<edo> $$6 = this.b.b(edo.g);
         this.i = new ebk($$5, new edm(dis.a(this.c), $$6));
      }

      private ebk a(dzk $$0) {
         return new ebk(this.g, $$0);
      }

      private ebk a(dif $$0, jq<edo> $$1) {
         return this.a(new edm($$0, $$1));
      }

      private ens a(ebk $$0) {
         return new ens(Map.of(ebk.b, $$0, ebk.c, this.h, ebk.d, this.i));
      }

      private void a(alo<ens> $$0, ebk $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dif $$0) {
         jq<edo> $$1 = this.b.b(edo.c);
         this.a(ent.a, this.a($$0, $$1));
         jq<edo> $$2 = this.b.b(edo.d);
         this.a(ent.c, this.a($$0, $$2));
         jq<edo> $$3 = this.b.b(edo.e);
         this.a(ent.d, this.a($$0, $$3));
      }

      public void a() {
         jq.c<dip> $$0 = this.f.b(diq.b);
         this.a(dio.a($$0));
         jq<edo> $$1 = this.b.b(edo.c);
         jq.c<dib> $$2 = this.c.b(dii.b);
         this.a(ent.e, this.a(new dim($$2), $$1));
         this.a(ent.b, this.a(new ede(emg.a(this.c, this.e, this.d))));
         this.a(ent.f, this.a(new eda($$2)));
      }
   }
}
