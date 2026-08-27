import java.util.Map;
import java.util.Optional;

public class dwl {
   public static final agf<dwk> a = a("normal");
   public static final agf<dwk> b = a("flat");
   public static final agf<dwk> c = a("large_biomes");
   public static final agf<dwk> d = a("amplified");
   public static final agf<dwk> e = a("single_biome_surface");
   public static final agf<dwk> f = a("debug_all_block_states");

   public static void a(ou<dwk> $$0) {
      new dwl.a($$0).a();
   }

   private static agf<dwk> a(String $$0) {
      return agf.a(jz.aH, new agg($$0));
   }

   public static Optional<agf<dwk>> a(io<dkg> $$0) {
      return $$0.d(dkg.b).flatMap($$0x -> {
         dit $$1 = $$0x.b();
         if ($$1 instanceof dma) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dlw ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dna a(ip $$0) {
      return $$0.d(jz.aH).f(a).a().a();
   }

   public static dkg b(ip $$0) {
      return $$0.d(jz.aH).f(a).a().b().orElseThrow();
   }

   static class a {
      private final ou<dwk> a;
      private final ic<dmk> b;
      private final ic<csq> c;
      private final ic<dvz> d;
      private final ic<dxb> e;
      private final ic<cte> f;
      private final ib<dkf> g;
      private final dkg h;
      private final dkg i;

      a(ou<dwk> $$0) {
         this.a = $$0;
         ic<dkf> $$1 = $$0.a(jz.aw);
         this.b = $$0.a(jz.ay);
         this.c = $$0.a(jz.ar);
         this.d = $$0.a(jz.aA);
         this.e = $$0.a(jz.aD);
         this.f = $$0.a(jz.aI);
         this.g = $$1.b(dkd.a);
         ib<dkf> $$2 = $$1.b(dkd.b);
         ib<dmk> $$3 = this.b.b(dmk.f);
         ib.c<cte> $$4 = this.f.b(ctf.a);
         this.h = new dkg($$2, new dmi(ctd.a($$4), $$3));
         ib<dkf> $$5 = $$1.b(dkd.c);
         ib<dmk> $$6 = this.b.b(dmk.g);
         this.i = new dkg($$5, new dmi(cth.a(this.c), $$6));
      }

      private dkg a(dit $$0) {
         return new dkg(this.g, $$0);
      }

      private dkg a(csu $$0, ib<dmk> $$1) {
         return this.a(new dmi($$0, $$1));
      }

      private dwk a(dkg $$0) {
         return new dwk(Map.of(dkg.b, $$0, dkg.c, this.h, dkg.d, this.i));
      }

      private void a(agf<dwk> $$0, dkg $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(csu $$0) {
         ib<dmk> $$1 = this.b.b(dmk.c);
         this.a(dwl.a, this.a($$0, $$1));
         ib<dmk> $$2 = this.b.b(dmk.d);
         this.a(dwl.c, this.a($$0, $$2));
         ib<dmk> $$3 = this.b.b(dmk.e);
         this.a(dwl.d, this.a($$0, $$3));
      }

      public void a() {
         ib.c<cte> $$0 = this.f.b(ctf.b);
         this.a(ctd.a($$0));
         ib<dmk> $$1 = this.b.b(dmk.c);
         ib.c<csq> $$2 = this.c.b(csx.b);
         this.a(dwl.e, this.a(new ctb($$2), $$1));
         this.a(dwl.b, this.a(new dma(duy.a(this.c, this.e, this.d))));
         this.a(dwl.f, this.a(new dlw($$2)));
      }
   }
}
