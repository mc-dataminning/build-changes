import java.util.Map;
import java.util.Optional;

public class dva {
   public static final aex<duz> a = a("normal");
   public static final aex<duz> b = a("flat");
   public static final aex<duz> c = a("large_biomes");
   public static final aex<duz> d = a("amplified");
   public static final aex<duz> e = a("single_biome_surface");
   public static final aex<duz> f = a("debug_all_block_states");

   public static void a(nt<duz> $$0) {
      new dva.a($$0).a();
   }

   private static aex<duz> a(String $$0) {
      return aex.a(je.aF, new aey($$0));
   }

   public static Optional<aex<duz>> a(ht<div> $$0) {
      return $$0.d(div.b).flatMap($$0x -> {
         dhi $$1 = $$0x.b();
         if ($$1 instanceof dkp) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dkl ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dlp a(hu $$0) {
      return $$0.d(je.aF).f(a).a().a();
   }

   public static div b(hu $$0) {
      return $$0.d(je.aF).f(a).a().b().orElseThrow();
   }

   static class a {
      private final nt<duz> a;
      private final hh<dkz> b;
      private final hh<cqv> c;
      private final hh<duo> d;
      private final hh<dvq> e;
      private final hh<crj> f;
      private final hg<diu> g;
      private final div h;
      private final div i;

      a(nt<duz> $$0) {
         this.a = $$0;
         hh<diu> $$1 = $$0.a(je.au);
         this.b = $$0.a(je.aw);
         this.c = $$0.a(je.ap);
         this.d = $$0.a(je.ay);
         this.e = $$0.a(je.aB);
         this.f = $$0.a(je.aG);
         this.g = $$1.b(dis.a);
         hg<diu> $$2 = $$1.b(dis.b);
         hg<dkz> $$3 = this.b.b(dkz.f);
         hg.c<crj> $$4 = this.f.b(crk.a);
         this.h = new div($$2, new dkx(cri.a($$4), $$3));
         hg<diu> $$5 = $$1.b(dis.c);
         hg<dkz> $$6 = this.b.b(dkz.g);
         this.i = new div($$5, new dkx(crm.a(this.c), $$6));
      }

      private div a(dhi $$0) {
         return new div(this.g, $$0);
      }

      private div a(cqz $$0, hg<dkz> $$1) {
         return this.a(new dkx($$0, $$1));
      }

      private duz a(div $$0) {
         return new duz(Map.of(div.b, $$0, div.c, this.h, div.d, this.i));
      }

      private void a(aex<duz> $$0, div $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cqz $$0) {
         hg<dkz> $$1 = this.b.b(dkz.c);
         this.a(dva.a, this.a($$0, $$1));
         hg<dkz> $$2 = this.b.b(dkz.d);
         this.a(dva.c, this.a($$0, $$2));
         hg<dkz> $$3 = this.b.b(dkz.e);
         this.a(dva.d, this.a($$0, $$3));
      }

      public void a() {
         hg.c<crj> $$0 = this.f.b(crk.b);
         this.a(cri.a($$0));
         hg<dkz> $$1 = this.b.b(dkz.c);
         hg.c<cqv> $$2 = this.c.b(crc.b);
         this.a(dva.e, this.a(new crg($$2), $$1));
         this.a(dva.b, this.a(new dkp(dtn.a(this.c, this.e, this.d))));
         this.a(dva.f, this.a(new dkl($$2)));
      }
   }
}
