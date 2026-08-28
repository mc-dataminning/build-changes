import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class enz {
   public static final akt<eny> a = a("normal");
   public static final akt<eny> b = a("flat");
   public static final akt<eny> c = a("large_biomes");
   public static final akt<eny> d = a("amplified");
   public static final akt<eny> e = a("single_biome_surface");
   public static final akt<eny> f = a("debug_all_block_states");

   public static void a(qe<eny> $$0) {
      new enz.a($$0).a();
   }

   private static akt<eny> a(String $$0) {
      return akt.a(mc.bd, aku.b($$0));
   }

   public static Optional<akt<eny>> a(eej $$0) {
      return $$0.a(ebn.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dzn $$1 = (dzn)var10000;

         $$0x.b();
         return switch ($$1) {
            case edj $$3 -> Optional.of(b);
            case edf $$4 -> Optional.of(f);
            case edr $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static eej a(jt.a $$0) {
      return $$0.d(mc.bd).b(a).a().a();
   }

   public static ebn b(jt.a $$0) {
      return $$0.d(mc.bd).b(a).a().b().orElseThrow();
   }

   public static eej c(jt.a $$0) {
      return $$0.d(mc.bd).b(b).a().a();
   }

   static class a {
      private final qe<eny> a;
      private final js<edt> b;
      private final js<dic> c;
      private final js<enn> d;
      private final js<eop> e;
      private final js<diq> f;
      private final jr<ebm> g;
      private final ebn h;
      private final ebn i;

      a(qe<eny> $$0) {
         this.a = $$0;
         js<ebm> $$1 = $$0.a(mc.aO);
         this.b = $$0.a(mc.aS);
         this.c = $$0.a(mc.aJ);
         this.d = $$0.a(mc.aV);
         this.e = $$0.a(mc.aY);
         this.f = $$0.a(mc.be);
         this.g = $$1.b(ebk.a);
         jr<ebm> $$2 = $$1.b(ebk.b);
         jr<edt> $$3 = this.b.b(edt.f);
         jr.c<diq> $$4 = this.f.b(dir.a);
         this.h = new ebn($$2, new edr(dip.a($$4), $$3));
         jr<ebm> $$5 = $$1.b(ebk.c);
         jr<edt> $$6 = this.b.b(edt.g);
         this.i = new ebn($$5, new edr(dit.a(this.c), $$6));
      }

      private ebn a(dzn $$0) {
         return new ebn(this.g, $$0);
      }

      private ebn a(dig $$0, jr<edt> $$1) {
         return this.a(new edr($$0, $$1));
      }

      private eny a(ebn $$0) {
         return new eny(Map.of(ebn.b, $$0, ebn.c, this.h, ebn.d, this.i));
      }

      private void a(akt<eny> $$0, ebn $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dig $$0) {
         jr<edt> $$1 = this.b.b(edt.c);
         this.a(enz.a, this.a($$0, $$1));
         jr<edt> $$2 = this.b.b(edt.d);
         this.a(enz.c, this.a($$0, $$2));
         jr<edt> $$3 = this.b.b(edt.e);
         this.a(enz.d, this.a($$0, $$3));
      }

      public void a() {
         jr.c<diq> $$0 = this.f.b(dir.b);
         this.a(dip.a($$0));
         jr<edt> $$1 = this.b.b(edt.c);
         jr.c<dic> $$2 = this.c.b(dij.b);
         this.a(enz.e, this.a(new din($$2), $$1));
         this.a(enz.b, this.a(new edj(emm.a(this.c, this.e, this.d))));
         this.a(enz.f, this.a(new edf($$2)));
      }
   }
}
