import java.util.Map;
import java.util.Optional;

public class ejj {
   public static final aks<eji> a = a("normal");
   public static final aks<eji> b = a("flat");
   public static final aks<eji> c = a("large_biomes");
   public static final aks<eji> d = a("amplified");
   public static final aks<eji> e = a("single_biome_surface");
   public static final aks<eji> f = a("debug_all_block_states");

   public static void a(qq<eji> $$0) {
      new ejj.a($$0).a();
   }

   private static aks<eji> a(String $$0) {
      return aks.a(li.aQ, new akt($$0));
   }

   public static Optional<aks<eji>> a(dzp $$0) {
      return $$0.a(dwv.b).flatMap($$0x -> {
         duz $$1 = $$0x.b();
         if ($$1 instanceof dyp) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dyl ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dzp a(jo $$0) {
      return $$0.d(li.aQ).g(a).a().a();
   }

   public static dwv b(jo $$0) {
      return $$0.d(li.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final qq<eji> a;
      private final jb<dyz> b;
      private final jb<dcz> c;
      private final jb<eix> d;
      private final jb<ejz> e;
      private final jb<ddn> f;
      private final ja<dwu> g;
      private final dwv h;
      private final dwv i;
      private final dwv j;

      a(qq<eji> $$0) {
         this.a = $$0;
         jb<dwu> $$1 = $$0.a(li.aE);
         this.b = $$0.a(li.aG);
         this.c = $$0.a(li.az);
         this.d = $$0.a(li.aI);
         this.e = $$0.a(li.aL);
         this.f = $$0.a(li.aR);
         this.g = $$1.b(dws.a);
         ja<dwu> $$2 = $$1.b(dws.b);
         ja<dyz> $$3 = this.b.b(dyz.f);
         ja.c<ddn> $$4 = this.f.b(ddo.a);
         this.h = new dwv($$2, new dyx(ddm.a($$4), $$3));
         ja<dwu> $$5 = $$1.b(dws.c);
         ja<dyz> $$6 = this.b.b(dyz.g);
         this.i = new dwv($$5, new dyx(ddq.a(this.c), $$6));
         ja<dwu> $$7 = $$1.b(dws.d);
         ja<dyz> $$8 = this.b.b(dyz.j);
         ja.c<ddn> $$9 = this.f.b(ddo.c);
         this.j = new dwv($$7, new dyx(ddm.a($$9), $$8));
      }

      private dwv a(duz $$0) {
         return new dwv(this.g, $$0);
      }

      private dwv a(ddd $$0, ja<dyz> $$1) {
         return this.a(new dyx($$0, $$1));
      }

      private eji a(dwv $$0) {
         return new eji(Map.of(dwv.b, $$0, dwv.c, this.h, dwv.d, this.i, dwv.e, this.j));
      }

      private void a(aks<eji> $$0, dwv $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ddd $$0) {
         ja<dyz> $$1 = this.b.b(dyz.c);
         this.a(ejj.a, this.a($$0, $$1));
         ja<dyz> $$2 = this.b.b(dyz.d);
         this.a(ejj.c, this.a($$0, $$2));
         ja<dyz> $$3 = this.b.b(dyz.e);
         this.a(ejj.d, this.a($$0, $$3));
      }

      public void a() {
         ja.c<ddn> $$0 = this.f.b(ddo.b);
         this.a(ddm.a($$0));
         ja<dyz> $$1 = this.b.b(dyz.c);
         ja.c<dcz> $$2 = this.c.b(ddg.b);
         this.a(ejj.e, this.a(new ddk($$2), $$1));
         this.a(ejj.b, this.a(new dyp(ehv.a(this.c, this.e, this.d))));
         this.a(ejj.f, this.a(new dyl($$2)));
      }
   }
}
