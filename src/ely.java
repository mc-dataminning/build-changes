import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ely {
   public static final ali<elx> a = a("normal");
   public static final ali<elx> b = a("flat");
   public static final ali<elx> c = a("large_biomes");
   public static final ali<elx> d = a("amplified");
   public static final ali<elx> e = a("single_biome_surface");
   public static final ali<elx> f = a("debug_all_block_states");

   public static void a(qz<elx> $$0) {
      new ely.a($$0).a();
   }

   private static ali<elx> a(String $$0) {
      return ali.a(ma.aZ, alj.b($$0));
   }

   public static Optional<ali<elx>> a(ecl $$0) {
      return $$0.a(dzr.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dxr $$1 = (dxr)var10000;

         $$0x.b();
         return switch ($$1) {
            case ebl $$3 -> Optional.of(b);
            case ebh $$4 -> Optional.of(f);
            case ebt $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ecl a(js.a $$0) {
      return $$0.d(ma.aZ).b(a).a().a();
   }

   public static dzr b(js.a $$0) {
      return $$0.d(ma.aZ).b(a).a().b().orElseThrow();
   }

   public static ecl c(js.a $$0) {
      return $$0.d(ma.aZ).b(b).a().a();
   }

   static class a {
      private final qz<elx> a;
      private final jr<ebv> b;
      private final jr<dgo> c;
      private final jr<elm> d;
      private final jr<emo> e;
      private final jr<dhc> f;
      private final jq<dzq> g;
      private final dzr h;
      private final dzr i;

      a(qz<elx> $$0) {
         this.a = $$0;
         jr<dzq> $$1 = $$0.a(ma.aL);
         this.b = $$0.a(ma.aP);
         this.c = $$0.a(ma.aG);
         this.d = $$0.a(ma.aR);
         this.e = $$0.a(ma.aU);
         this.f = $$0.a(ma.ba);
         this.g = $$1.b(dzo.a);
         jq<dzq> $$2 = $$1.b(dzo.b);
         jq<ebv> $$3 = this.b.b(ebv.f);
         jq.c<dhc> $$4 = this.f.b(dhd.a);
         this.h = new dzr($$2, new ebt(dhb.a($$4), $$3));
         jq<dzq> $$5 = $$1.b(dzo.c);
         jq<ebv> $$6 = this.b.b(ebv.g);
         this.i = new dzr($$5, new ebt(dhf.a(this.c), $$6));
      }

      private dzr a(dxr $$0) {
         return new dzr(this.g, $$0);
      }

      private dzr a(dgs $$0, jq<ebv> $$1) {
         return this.a(new ebt($$0, $$1));
      }

      private elx a(dzr $$0) {
         return new elx(Map.of(dzr.b, $$0, dzr.c, this.h, dzr.d, this.i));
      }

      private void a(ali<elx> $$0, dzr $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dgs $$0) {
         jq<ebv> $$1 = this.b.b(ebv.c);
         this.a(ely.a, this.a($$0, $$1));
         jq<ebv> $$2 = this.b.b(ebv.d);
         this.a(ely.c, this.a($$0, $$2));
         jq<ebv> $$3 = this.b.b(ebv.e);
         this.a(ely.d, this.a($$0, $$3));
      }

      public void a() {
         jq.c<dhc> $$0 = this.f.b(dhd.b);
         this.a(dhb.a($$0));
         jq<ebv> $$1 = this.b.b(ebv.c);
         jq.c<dgo> $$2 = this.c.b(dgv.b);
         this.a(ely.e, this.a(new dgz($$2), $$1));
         this.a(ely.b, this.a(new ebl(ekl.a(this.c, this.e, this.d))));
         this.a(ely.f, this.a(new ebh($$2)));
      }
   }
}
