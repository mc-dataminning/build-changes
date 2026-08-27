import java.util.Map;
import java.util.Optional;

public class efw {
   public static final ake<efv> a = a("normal");
   public static final ake<efv> b = a("flat");
   public static final ake<efv> c = a("large_biomes");
   public static final ake<efv> d = a("amplified");
   public static final ake<efv> e = a("single_biome_surface");
   public static final ake<efv> f = a("debug_all_block_states");

   public static void a(qj<efv> $$0) {
      new efw.a($$0).a();
   }

   private static ake<efv> a(String $$0) {
      return ake.a(ld.aP, new akf($$0));
   }

   public static Optional<ake<efv>> a(dwl $$0) {
      return $$0.a(dtr.b).flatMap($$0x -> {
         drv $$1 = $$0x.b();
         if ($$1 instanceof dvl) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dvh ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dwl a(jj $$0) {
      return $$0.d(ld.aP).g(a).a().a();
   }

   public static dtr b(jj $$0) {
      return $$0.d(ld.aP).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qj<efv> a;
      private final iw<dvv> b;
      private final iw<dat> c;
      private final iw<efk> d;
      private final iw<egm> e;
      private final iw<dbh> f;
      private final iv<dtq> g;
      private final dtr h;
      private final dtr i;

      a(qj<efv> $$0) {
         this.a = $$0;
         iw<dtq> $$1 = $$0.a(ld.aD);
         this.b = $$0.a(ld.aF);
         this.c = $$0.a(ld.ay);
         this.d = $$0.a(ld.aH);
         this.e = $$0.a(ld.aK);
         this.f = $$0.a(ld.aQ);
         this.g = $$1.b(dto.a);
         iv<dtq> $$2 = $$1.b(dto.b);
         iv<dvv> $$3 = this.b.b(dvv.f);
         iv.c<dbh> $$4 = this.f.b(dbi.a);
         this.h = new dtr($$2, new dvt(dbg.a($$4), $$3));
         iv<dtq> $$5 = $$1.b(dto.c);
         iv<dvv> $$6 = this.b.b(dvv.g);
         this.i = new dtr($$5, new dvt(dbk.a(this.c), $$6));
      }

      private dtr a(drv $$0) {
         return new dtr(this.g, $$0);
      }

      private dtr a(dax $$0, iv<dvv> $$1) {
         return this.a(new dvt($$0, $$1));
      }

      private efv a(dtr $$0) {
         return new efv(Map.of(dtr.b, $$0, dtr.c, this.h, dtr.d, this.i));
      }

      private void a(ake<efv> $$0, dtr $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dax $$0) {
         iv<dvv> $$1 = this.b.b(dvv.c);
         this.a(efw.a, this.a($$0, $$1));
         iv<dvv> $$2 = this.b.b(dvv.d);
         this.a(efw.c, this.a($$0, $$2));
         iv<dvv> $$3 = this.b.b(dvv.e);
         this.a(efw.d, this.a($$0, $$3));
      }

      public void a() {
         iv.c<dbh> $$0 = this.f.b(dbi.b);
         this.a(dbg.a($$0));
         iv<dvv> $$1 = this.b.b(dvv.c);
         iv.c<dat> $$2 = this.c.b(dba.b);
         this.a(efw.e, this.a(new dbe($$2), $$1));
         this.a(efw.b, this.a(new dvl(eej.a(this.c, this.e, this.d))));
         this.a(efw.f, this.a(new dvh($$2)));
      }
   }
}
