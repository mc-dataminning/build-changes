import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ekw {
   public static final ald<ekv> a = a("normal");
   public static final ald<ekv> b = a("flat");
   public static final ald<ekv> c = a("large_biomes");
   public static final ald<ekv> d = a("amplified");
   public static final ald<ekv> e = a("single_biome_surface");
   public static final ald<ekv> f = a("debug_all_block_states");

   public static void a(qu<ekv> $$0) {
      new ekw.a($$0).a();
   }

   private static ald<ekv> a(String $$0) {
      return ald.a(lw.ba, ale.b($$0));
   }

   public static Optional<ald<ekv>> a(ebj $$0) {
      return $$0.a(dyp.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dwp $$1 = (dwp)var10000;

         $$0x.b();
         return switch ($$1) {
            case eaj $$3 -> Optional.of(b);
            case eaf $$4 -> Optional.of(f);
            case ear $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ebj a(jq.a $$0) {
      return $$0.d(lw.ba).b(a).a().a();
   }

   public static dyp b(jq.a $$0) {
      return $$0.d(lw.ba).b(a).a().b().orElseThrow();
   }

   static class a {
      private final qu<ekv> a;
      private final jp<eat> b;
      private final jp<dfk> c;
      private final jp<ekk> d;
      private final jp<elm> e;
      private final jp<dfy> f;
      private final jo<dyo> g;
      private final dyp h;
      private final dyp i;

      a(qu<ekv> $$0) {
         this.a = $$0;
         jp<dyo> $$1 = $$0.a(lw.aM);
         this.b = $$0.a(lw.aQ);
         this.c = $$0.a(lw.aH);
         this.d = $$0.a(lw.aS);
         this.e = $$0.a(lw.aV);
         this.f = $$0.a(lw.bb);
         this.g = $$1.b(dym.a);
         jo<dyo> $$2 = $$1.b(dym.b);
         jo<eat> $$3 = this.b.b(eat.f);
         jo.c<dfy> $$4 = this.f.b(dfz.a);
         this.h = new dyp($$2, new ear(dfx.a($$4), $$3));
         jo<dyo> $$5 = $$1.b(dym.c);
         jo<eat> $$6 = this.b.b(eat.g);
         this.i = new dyp($$5, new ear(dgb.a(this.c), $$6));
      }

      private dyp a(dwp $$0) {
         return new dyp(this.g, $$0);
      }

      private dyp a(dfo $$0, jo<eat> $$1) {
         return this.a(new ear($$0, $$1));
      }

      private ekv a(dyp $$0) {
         return new ekv(Map.of(dyp.b, $$0, dyp.c, this.h, dyp.d, this.i));
      }

      private void a(ald<ekv> $$0, dyp $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dfo $$0) {
         jo<eat> $$1 = this.b.b(eat.c);
         this.a(ekw.a, this.a($$0, $$1));
         jo<eat> $$2 = this.b.b(eat.d);
         this.a(ekw.c, this.a($$0, $$2));
         jo<eat> $$3 = this.b.b(eat.e);
         this.a(ekw.d, this.a($$0, $$3));
      }

      public void a() {
         jo.c<dfy> $$0 = this.f.b(dfz.b);
         this.a(dfx.a($$0));
         jo<eat> $$1 = this.b.b(eat.c);
         jo.c<dfk> $$2 = this.c.b(dfr.b);
         this.a(ekw.e, this.a(new dfv($$2), $$1));
         this.a(ekw.b, this.a(new eaj(ejj.a(this.c, this.e, this.d))));
         this.a(ekw.f, this.a(new eaf($$2)));
      }
   }
}
