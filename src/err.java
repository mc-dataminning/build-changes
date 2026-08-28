import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class err {
   public static final alh<erq> a = a("normal");
   public static final alh<erq> b = a("flat");
   public static final alh<erq> c = a("large_biomes");
   public static final alh<erq> d = a("amplified");
   public static final alh<erq> e = a("single_biome_surface");
   public static final alh<erq> f = a("debug_all_block_states");

   public static void a(qh<erq> $$0) {
      new err.a($$0).a();
   }

   private static alh<erq> a(String $$0) {
      return alh.a(mh.bo, ali.b($$0));
   }

   public static Optional<alh<erq>> a(ehy $$0) {
      return $$0.a(efc.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         edc $$1 = (edc)var10000;

         $$0x.b();
         return switch ($$1) {
            case egy $$3 -> Optional.of(b);
            case egu $$4 -> Optional.of(f);
            case ehg $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ehy a(jh.a $$0) {
      return $$0.e(mh.bo).b(a).a().a();
   }

   public static efc b(jh.a $$0) {
      return $$0.e(mh.bo).b(a).a().b().orElseThrow();
   }

   public static ehy c(jh.a $$0) {
      return $$0.e(mh.bo).b(b).a().a();
   }

   static class a {
      private final qh<erq> a;
      private final jg<ehi> b;
      private final jg<dla> c;
      private final jg<erf> d;
      private final jg<esh> e;
      private final jg<dlo> f;
      private final jf<efb> g;
      private final efc h;
      private final efc i;

      a(qh<erq> $$0) {
         this.a = $$0;
         jg<efb> $$1 = $$0.a(mh.aP);
         this.b = $$0.a(mh.aX);
         this.c = $$0.a(mh.aG);
         this.d = $$0.a(mh.bb);
         this.e = $$0.a(mh.bd);
         this.f = $$0.a(mh.aW);
         this.g = $$1.b(eez.a);
         jf<efb> $$2 = $$1.b(eez.b);
         jf<ehi> $$3 = this.b.b(ehi.f);
         jf.c<dlo> $$4 = this.f.b(dlp.a);
         this.h = new efc($$2, new ehg(dln.a($$4), $$3));
         jf<efb> $$5 = $$1.b(eez.c);
         jf<ehi> $$6 = this.b.b(ehi.g);
         this.i = new efc($$5, new ehg(dlr.a(this.c), $$6));
      }

      private efc a(edc $$0) {
         return new efc(this.g, $$0);
      }

      private efc a(dle $$0, jf<ehi> $$1) {
         return this.a(new ehg($$0, $$1));
      }

      private erq a(efc $$0) {
         return new erq(Map.of(efc.b, $$0, efc.c, this.h, efc.d, this.i));
      }

      private void a(alh<erq> $$0, efc $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dle $$0) {
         jf<ehi> $$1 = this.b.b(ehi.c);
         this.a(err.a, this.a($$0, $$1));
         jf<ehi> $$2 = this.b.b(ehi.d);
         this.a(err.c, this.a($$0, $$2));
         jf<ehi> $$3 = this.b.b(ehi.e);
         this.a(err.d, this.a($$0, $$3));
      }

      public void a() {
         jf.c<dlo> $$0 = this.f.b(dlp.b);
         this.a(dln.a($$0));
         jf<ehi> $$1 = this.b.b(ehi.c);
         jf.c<dla> $$2 = this.c.b(dlh.b);
         this.a(err.e, this.a(new dll($$2), $$1));
         this.a(err.b, this.a(new egy(eqe.a(this.c, this.e, this.d))));
         this.a(err.f, this.a(new egu($$2)));
      }
   }
}
