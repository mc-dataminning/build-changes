import java.util.Map;
import java.util.Optional;

public class ehz {
   public static final ald<ehy> a = a("normal");
   public static final ald<ehy> b = a("flat");
   public static final ald<ehy> c = a("large_biomes");
   public static final ald<ehy> d = a("amplified");
   public static final ald<ehy> e = a("single_biome_surface");
   public static final ald<ehy> f = a("debug_all_block_states");

   public static void a(rc<ehy> $$0) {
      new ehz.a($$0).a();
   }

   private static ald<ehy> a(String $$0) {
      return ald.a(lq.aQ, new ale($$0));
   }

   public static Optional<ald<ehy>> a(dyo $$0) {
      return $$0.a(dvu.b).flatMap($$0x -> {
         dty $$1 = $$0x.b();
         if ($$1 instanceof dxo) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dxk ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dyo a(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().a();
   }

   public static dvu b(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final rc<ehy> a;
      private final jj<dxy> b;
      private final jj<dcw> c;
      private final jj<ehn> d;
      private final jj<eip> e;
      private final jj<ddk> f;
      private final ji<dvt> g;
      private final dvu h;
      private final dvu i;

      a(rc<ehy> $$0) {
         this.a = $$0;
         jj<dvt> $$1 = $$0.a(lq.aE);
         this.b = $$0.a(lq.aG);
         this.c = $$0.a(lq.az);
         this.d = $$0.a(lq.aI);
         this.e = $$0.a(lq.aL);
         this.f = $$0.a(lq.aR);
         this.g = $$1.b(dvr.a);
         ji<dvt> $$2 = $$1.b(dvr.b);
         ji<dxy> $$3 = this.b.b(dxy.f);
         ji.c<ddk> $$4 = this.f.b(ddl.a);
         this.h = new dvu($$2, new dxw(ddj.a($$4), $$3));
         ji<dvt> $$5 = $$1.b(dvr.c);
         ji<dxy> $$6 = this.b.b(dxy.g);
         this.i = new dvu($$5, new dxw(ddn.a(this.c), $$6));
      }

      private dvu a(dty $$0) {
         return new dvu(this.g, $$0);
      }

      private dvu a(dda $$0, ji<dxy> $$1) {
         return this.a(new dxw($$0, $$1));
      }

      private ehy a(dvu $$0) {
         return new ehy(Map.of(dvu.b, $$0, dvu.c, this.h, dvu.d, this.i));
      }

      private void a(ald<ehy> $$0, dvu $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dda $$0) {
         ji<dxy> $$1 = this.b.b(dxy.c);
         this.a(ehz.a, this.a($$0, $$1));
         ji<dxy> $$2 = this.b.b(dxy.d);
         this.a(ehz.c, this.a($$0, $$2));
         ji<dxy> $$3 = this.b.b(dxy.e);
         this.a(ehz.d, this.a($$0, $$3));
      }

      public void a() {
         ji.c<ddk> $$0 = this.f.b(ddl.b);
         this.a(ddj.a($$0));
         ji<dxy> $$1 = this.b.b(dxy.c);
         ji.c<dcw> $$2 = this.c.b(ddd.b);
         this.a(ehz.e, this.a(new ddh($$2), $$1));
         this.a(ehz.b, this.a(new dxo(egm.a(this.c, this.e, this.d))));
         this.a(ehz.f, this.a(new dxk($$2)));
      }
   }
}
