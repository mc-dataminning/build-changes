import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class esd {
   public static final alq<esc> a = a("normal");
   public static final alq<esc> b = a("flat");
   public static final alq<esc> c = a("large_biomes");
   public static final alq<esc> d = a("amplified");
   public static final alq<esc> e = a("single_biome_surface");
   public static final alq<esc> f = a("debug_all_block_states");

   public static void a(qi<esc> $$0) {
      new esd.a($$0).a();
   }

   private static alq<esc> a(String $$0) {
      return alq.a(mi.bo, alr.b($$0));
   }

   public static Optional<alq<esc>> a(eik $$0) {
      return $$0.a(efo.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         edo $$1 = (edo)var10000;

         $$0x.b();
         return switch ($$1) {
            case ehk $$3 -> Optional.of(b);
            case ehg $$4 -> Optional.of(f);
            case ehs $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static eik a(ji.a $$0) {
      return $$0.e(mi.bo).b(a).a().a();
   }

   public static efo b(ji.a $$0) {
      return $$0.e(mi.bo).b(a).a().b().orElseThrow();
   }

   public static eik c(ji.a $$0) {
      return $$0.e(mi.bo).b(b).a().a();
   }

   static class a {
      private final qi<esc> a;
      private final jh<ehu> b;
      private final jh<dlm> c;
      private final jh<err> d;
      private final jh<est> e;
      private final jh<dma> f;
      private final jg<efn> g;
      private final efo h;
      private final efo i;

      a(qi<esc> $$0) {
         this.a = $$0;
         jh<efn> $$1 = $$0.a(mi.aP);
         this.b = $$0.a(mi.aX);
         this.c = $$0.a(mi.aG);
         this.d = $$0.a(mi.bb);
         this.e = $$0.a(mi.bd);
         this.f = $$0.a(mi.aW);
         this.g = $$1.b(efl.a);
         jg<efn> $$2 = $$1.b(efl.b);
         jg<ehu> $$3 = this.b.b(ehu.f);
         jg.c<dma> $$4 = this.f.b(dmb.a);
         this.h = new efo($$2, new ehs(dlz.a($$4), $$3));
         jg<efn> $$5 = $$1.b(efl.c);
         jg<ehu> $$6 = this.b.b(ehu.g);
         this.i = new efo($$5, new ehs(dmd.a(this.c), $$6));
      }

      private efo a(edo $$0) {
         return new efo(this.g, $$0);
      }

      private efo a(dlq $$0, jg<ehu> $$1) {
         return this.a(new ehs($$0, $$1));
      }

      private esc a(efo $$0) {
         return new esc(Map.of(efo.b, $$0, efo.c, this.h, efo.d, this.i));
      }

      private void a(alq<esc> $$0, efo $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dlq $$0) {
         jg<ehu> $$1 = this.b.b(ehu.c);
         this.a(esd.a, this.a($$0, $$1));
         jg<ehu> $$2 = this.b.b(ehu.d);
         this.a(esd.c, this.a($$0, $$2));
         jg<ehu> $$3 = this.b.b(ehu.e);
         this.a(esd.d, this.a($$0, $$3));
      }

      public void a() {
         jg.c<dma> $$0 = this.f.b(dmb.b);
         this.a(dlz.a($$0));
         jg<ehu> $$1 = this.b.b(ehu.c);
         jg.c<dlm> $$2 = this.c.b(dlt.b);
         this.a(esd.e, this.a(new dlx($$2), $$1));
         this.a(esd.b, this.a(new ehk(eqq.a(this.c, this.e, this.d))));
         this.a(esd.f, this.a(new ehg($$2)));
      }
   }
}
