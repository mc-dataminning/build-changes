import java.util.Map;
import java.util.Optional;

public class dun {
   public static final aeo<dum> a = a("normal");
   public static final aeo<dum> b = a("flat");
   public static final aeo<dum> c = a("large_biomes");
   public static final aeo<dum> d = a("amplified");
   public static final aeo<dum> e = a("single_biome_surface");
   public static final aeo<dum> f = a("debug_all_block_states");

   public static void a(nn<dum> $$0) {
      new dun.a($$0).a();
   }

   private static aeo<dum> a(String $$0) {
      return aeo.a(jd.aF, new aep($$0));
   }

   public static Optional<aeo<dum>> a(hs<dii> $$0) {
      return $$0.d(dii.b).flatMap($$0x -> {
         dgv $$1 = $$0x.b();
         if ($$1 instanceof dkc) {
            return Optional.of(b);
         } else {
            return $$1 instanceof djy ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dlc a(ht $$0) {
      return $$0.d(jd.aF).f(a).a().a();
   }

   public static dii b(ht $$0) {
      return $$0.d(jd.aF).f(a).a().b().orElseThrow();
   }

   static class a {
      private final nn<dum> a;
      private final hg<dkm> b;
      private final hg<cqi> c;
      private final hg<dub> d;
      private final hg<dvd> e;
      private final hg<cqw> f;
      private final hf<dih> g;
      private final dii h;
      private final dii i;

      a(nn<dum> $$0) {
         this.a = $$0;
         hg<dih> $$1 = $$0.a(jd.au);
         this.b = $$0.a(jd.aw);
         this.c = $$0.a(jd.ap);
         this.d = $$0.a(jd.ay);
         this.e = $$0.a(jd.aB);
         this.f = $$0.a(jd.aG);
         this.g = $$1.b(dif.a);
         hf<dih> $$2 = $$1.b(dif.b);
         hf<dkm> $$3 = this.b.b(dkm.f);
         hf.c<cqw> $$4 = this.f.b(cqx.a);
         this.h = new dii($$2, new dkk(cqv.a($$4), $$3));
         hf<dih> $$5 = $$1.b(dif.c);
         hf<dkm> $$6 = this.b.b(dkm.g);
         this.i = new dii($$5, new dkk(cqz.a(this.c), $$6));
      }

      private dii a(dgv $$0) {
         return new dii(this.g, $$0);
      }

      private dii a(cqm $$0, hf<dkm> $$1) {
         return this.a(new dkk($$0, $$1));
      }

      private dum a(dii $$0) {
         return new dum(Map.of(dii.b, $$0, dii.c, this.h, dii.d, this.i));
      }

      private void a(aeo<dum> $$0, dii $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cqm $$0) {
         hf<dkm> $$1 = this.b.b(dkm.c);
         this.a(dun.a, this.a($$0, $$1));
         hf<dkm> $$2 = this.b.b(dkm.d);
         this.a(dun.c, this.a($$0, $$2));
         hf<dkm> $$3 = this.b.b(dkm.e);
         this.a(dun.d, this.a($$0, $$3));
      }

      public void a() {
         hf.c<cqw> $$0 = this.f.b(cqx.b);
         this.a(cqv.a($$0));
         hf<dkm> $$1 = this.b.b(dkm.c);
         hf.c<cqi> $$2 = this.c.b(cqp.b);
         this.a(dun.e, this.a(new cqt($$2), $$1));
         this.a(dun.b, this.a(new dkc(dta.a(this.c, this.e, this.d))));
         this.a(dun.f, this.a(new djy($$2)));
      }
   }
}
