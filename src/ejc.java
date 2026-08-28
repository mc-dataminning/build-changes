import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ejc {
   public static final akp<ejb> a = a("normal");
   public static final akp<ejb> b = a("flat");
   public static final akp<ejb> c = a("large_biomes");
   public static final akp<ejb> d = a("amplified");
   public static final akp<ejb> e = a("single_biome_surface");
   public static final akp<ejb> f = a("debug_all_block_states");

   public static void a(qp<ejb> $$0) {
      new ejc.a($$0).a();
   }

   private static akp<ejb> a(String $$0) {
      return akp.a(lu.aY, akq.b($$0));
   }

   public static Optional<akp<ejb>> a(dzq $$0) {
      return $$0.a(dww.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dux $$1 = (dux)var10000;

         $$0x.b();
         return switch ($$1) {
            case dyq $$3 -> Optional.of(b);
            case dym $$4 -> Optional.of(f);
            case dyy $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static dzq a(ka $$0) {
      return $$0.d(lu.aY).g(a).a().a();
   }

   public static dww b(ka $$0) {
      return $$0.d(lu.aY).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qp<ejb> a;
      private final jn<dza> b;
      private final jn<ddu> c;
      private final jn<eiq> d;
      private final jn<ejs> e;
      private final jn<dei> f;
      private final jm<dwv> g;
      private final dww h;
      private final dww i;

      a(qp<ejb> $$0) {
         this.a = $$0;
         jn<dwv> $$1 = $$0.a(lu.aK);
         this.b = $$0.a(lu.aO);
         this.c = $$0.a(lu.aF);
         this.d = $$0.a(lu.aQ);
         this.e = $$0.a(lu.aT);
         this.f = $$0.a(lu.aZ);
         this.g = $$1.b(dwt.a);
         jm<dwv> $$2 = $$1.b(dwt.b);
         jm<dza> $$3 = this.b.b(dza.f);
         jm.c<dei> $$4 = this.f.b(dej.a);
         this.h = new dww($$2, new dyy(deh.a($$4), $$3));
         jm<dwv> $$5 = $$1.b(dwt.c);
         jm<dza> $$6 = this.b.b(dza.g);
         this.i = new dww($$5, new dyy(del.a(this.c), $$6));
      }

      private dww a(dux $$0) {
         return new dww(this.g, $$0);
      }

      private dww a(ddy $$0, jm<dza> $$1) {
         return this.a(new dyy($$0, $$1));
      }

      private ejb a(dww $$0) {
         return new ejb(Map.of(dww.b, $$0, dww.c, this.h, dww.d, this.i));
      }

      private void a(akp<ejb> $$0, dww $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ddy $$0) {
         jm<dza> $$1 = this.b.b(dza.c);
         this.a(ejc.a, this.a($$0, $$1));
         jm<dza> $$2 = this.b.b(dza.d);
         this.a(ejc.c, this.a($$0, $$2));
         jm<dza> $$3 = this.b.b(dza.e);
         this.a(ejc.d, this.a($$0, $$3));
      }

      public void a() {
         jm.c<dei> $$0 = this.f.b(dej.b);
         this.a(deh.a($$0));
         jm<dza> $$1 = this.b.b(dza.c);
         jm.c<ddu> $$2 = this.c.b(deb.b);
         this.a(ejc.e, this.a(new def($$2), $$1));
         this.a(ejc.b, this.a(new dyq(ehp.a(this.c, this.e, this.d))));
         this.a(ejc.f, this.a(new dym($$2)));
      }
   }
}
