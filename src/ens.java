import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ens {
   public static final aly<enr> a = a("normal");
   public static final aly<enr> b = a("flat");
   public static final aly<enr> c = a("large_biomes");
   public static final aly<enr> d = a("amplified");
   public static final aly<enr> e = a("single_biome_surface");
   public static final aly<enr> f = a("debug_all_block_states");

   public static void a(rk<enr> $$0) {
      new ens.a($$0).a();
   }

   private static aly<enr> a(String $$0) {
      return aly.a(mb.ba, alz.b($$0));
   }

   public static Optional<aly<enr>> a(eed $$0) {
      return $$0.a(ebj.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dzj $$1 = (dzj)var10000;

         $$0x.b();
         return switch ($$1) {
            case edd $$3 -> Optional.of(b);
            case ecz $$4 -> Optional.of(f);
            case edl $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static eed a(js.a $$0) {
      return $$0.d(mb.ba).b(a).a().a();
   }

   public static ebj b(js.a $$0) {
      return $$0.d(mb.ba).b(a).a().b().orElseThrow();
   }

   public static eed c(js.a $$0) {
      return $$0.d(mb.ba).b(b).a().a();
   }

   static class a {
      private final rk<enr> a;
      private final jr<edn> b;
      private final jr<dic> c;
      private final jr<eng> d;
      private final jr<eoi> e;
      private final jr<diq> f;
      private final jq<ebi> g;
      private final ebj h;
      private final ebj i;

      a(rk<enr> $$0) {
         this.a = $$0;
         jr<ebi> $$1 = $$0.a(mb.aM);
         this.b = $$0.a(mb.aQ);
         this.c = $$0.a(mb.aH);
         this.d = $$0.a(mb.aS);
         this.e = $$0.a(mb.aV);
         this.f = $$0.a(mb.bb);
         this.g = $$1.b(ebg.a);
         jq<ebi> $$2 = $$1.b(ebg.b);
         jq<edn> $$3 = this.b.b(edn.f);
         jq.c<diq> $$4 = this.f.b(dir.a);
         this.h = new ebj($$2, new edl(dip.a($$4), $$3));
         jq<ebi> $$5 = $$1.b(ebg.c);
         jq<edn> $$6 = this.b.b(edn.g);
         this.i = new ebj($$5, new edl(dit.a(this.c), $$6));
      }

      private ebj a(dzj $$0) {
         return new ebj(this.g, $$0);
      }

      private ebj a(dig $$0, jq<edn> $$1) {
         return this.a(new edl($$0, $$1));
      }

      private enr a(ebj $$0) {
         return new enr(Map.of(ebj.b, $$0, ebj.c, this.h, ebj.d, this.i));
      }

      private void a(aly<enr> $$0, ebj $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dig $$0) {
         jq<edn> $$1 = this.b.b(edn.c);
         this.a(ens.a, this.a($$0, $$1));
         jq<edn> $$2 = this.b.b(edn.d);
         this.a(ens.c, this.a($$0, $$2));
         jq<edn> $$3 = this.b.b(edn.e);
         this.a(ens.d, this.a($$0, $$3));
      }

      public void a() {
         jq.c<diq> $$0 = this.f.b(dir.b);
         this.a(dip.a($$0));
         jq<edn> $$1 = this.b.b(edn.c);
         jq.c<dic> $$2 = this.c.b(dij.b);
         this.a(ens.e, this.a(new din($$2), $$1));
         this.a(ens.b, this.a(new edd(emf.a(this.c, this.e, this.d))));
         this.a(ens.f, this.a(new ecz($$2)));
      }
   }
}
