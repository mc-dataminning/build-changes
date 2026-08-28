import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ejf {
   public static final akq<eje> a = a("normal");
   public static final akq<eje> b = a("flat");
   public static final akq<eje> c = a("large_biomes");
   public static final akq<eje> d = a("amplified");
   public static final akq<eje> e = a("single_biome_surface");
   public static final akq<eje> f = a("debug_all_block_states");

   public static void a(qq<eje> $$0) {
      new ejf.a($$0).a();
   }

   private static akq<eje> a(String $$0) {
      return akq.a(lu.aY, akr.b($$0));
   }

   public static Optional<akq<eje>> a(dzt $$0) {
      return $$0.a(dwz.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         duz $$1 = (duz)var10000;

         $$0x.b();
         return switch ($$1) {
            case dyt $$3 -> Optional.of(b);
            case dyp $$4 -> Optional.of(f);
            case dzb $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static dzt a(ka $$0) {
      return $$0.d(lu.aY).g(a).a().a();
   }

   public static dwz b(ka $$0) {
      return $$0.d(lu.aY).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qq<eje> a;
      private final jn<dzd> b;
      private final jn<ddw> c;
      private final jn<eit> d;
      private final jn<ejv> e;
      private final jn<dek> f;
      private final jm<dwy> g;
      private final dwz h;
      private final dwz i;

      a(qq<eje> $$0) {
         this.a = $$0;
         jn<dwy> $$1 = $$0.a(lu.aK);
         this.b = $$0.a(lu.aO);
         this.c = $$0.a(lu.aF);
         this.d = $$0.a(lu.aQ);
         this.e = $$0.a(lu.aT);
         this.f = $$0.a(lu.aZ);
         this.g = $$1.b(dww.a);
         jm<dwy> $$2 = $$1.b(dww.b);
         jm<dzd> $$3 = this.b.b(dzd.f);
         jm.c<dek> $$4 = this.f.b(del.a);
         this.h = new dwz($$2, new dzb(dej.a($$4), $$3));
         jm<dwy> $$5 = $$1.b(dww.c);
         jm<dzd> $$6 = this.b.b(dzd.g);
         this.i = new dwz($$5, new dzb(den.a(this.c), $$6));
      }

      private dwz a(duz $$0) {
         return new dwz(this.g, $$0);
      }

      private dwz a(dea $$0, jm<dzd> $$1) {
         return this.a(new dzb($$0, $$1));
      }

      private eje a(dwz $$0) {
         return new eje(Map.of(dwz.b, $$0, dwz.c, this.h, dwz.d, this.i));
      }

      private void a(akq<eje> $$0, dwz $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dea $$0) {
         jm<dzd> $$1 = this.b.b(dzd.c);
         this.a(ejf.a, this.a($$0, $$1));
         jm<dzd> $$2 = this.b.b(dzd.d);
         this.a(ejf.c, this.a($$0, $$2));
         jm<dzd> $$3 = this.b.b(dzd.e);
         this.a(ejf.d, this.a($$0, $$3));
      }

      public void a() {
         jm.c<dek> $$0 = this.f.b(del.b);
         this.a(dej.a($$0));
         jm<dzd> $$1 = this.b.b(dzd.c);
         jm.c<ddw> $$2 = this.c.b(ded.b);
         this.a(ejf.e, this.a(new deh($$2), $$1));
         this.a(ejf.b, this.a(new dyt(ehs.a(this.c, this.e, this.d))));
         this.a(ejf.f, this.a(new dyp($$2)));
      }
   }
}
