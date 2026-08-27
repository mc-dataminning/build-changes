import java.util.Map;
import java.util.Optional;

public class drq {
   public static final acp<drp> a = a("normal");
   public static final acp<drp> b = a("flat");
   public static final acp<drp> c = a("large_biomes");
   public static final acp<drp> d = a("amplified");
   public static final acp<drp> e = a("single_biome_surface");
   public static final acp<drp> f = a("debug_all_block_states");

   public static void a(nm<drp> $$0) {
      new drq.a($$0).a();
   }

   private static acp<drp> a(String $$0) {
      return acp.a(jc.aF, new acq($$0));
   }

   public static Optional<acp<drp>> a(hr<dfl> $$0) {
      return $$0.d(dfl.b).flatMap($$0x -> {
         ddy $$1 = $$0x.b();
         if ($$1 instanceof dhf) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dhb ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dif a(hs $$0) {
      return $$0.d(jc.aF).f(a).a().a();
   }

   public static dfl b(hs $$0) {
      return $$0.d(jc.aF).f(a).a().b().orElseThrow();
   }

   static class a {
      private final nm<drp> a;
      private final hf<dhp> b;
      private final hf<cnk> c;
      private final hf<dre> d;
      private final hf<dsg> e;
      private final hf<cny> f;
      private final he<dfk> g;
      private final dfl h;
      private final dfl i;

      a(nm<drp> $$0) {
         this.a = $$0;
         hf<dfk> $$1 = $$0.a(jc.au);
         this.b = $$0.a(jc.aw);
         this.c = $$0.a(jc.ap);
         this.d = $$0.a(jc.ay);
         this.e = $$0.a(jc.aB);
         this.f = $$0.a(jc.aG);
         this.g = $$1.b(dfi.a);
         he<dfk> $$2 = $$1.b(dfi.b);
         he<dhp> $$3 = this.b.b(dhp.f);
         he.c<cny> $$4 = this.f.b(cnz.a);
         this.h = new dfl($$2, new dhn(cnx.a($$4), $$3));
         he<dfk> $$5 = $$1.b(dfi.c);
         he<dhp> $$6 = this.b.b(dhp.g);
         this.i = new dfl($$5, new dhn(cob.a(this.c), $$6));
      }

      private dfl a(ddy $$0) {
         return new dfl(this.g, $$0);
      }

      private dfl a(cno $$0, he<dhp> $$1) {
         return this.a(new dhn($$0, $$1));
      }

      private drp a(dfl $$0) {
         return new drp(Map.of(dfl.b, $$0, dfl.c, this.h, dfl.d, this.i));
      }

      private void a(acp<drp> $$0, dfl $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cno $$0) {
         he<dhp> $$1 = this.b.b(dhp.c);
         this.a(drq.a, this.a($$0, $$1));
         he<dhp> $$2 = this.b.b(dhp.d);
         this.a(drq.c, this.a($$0, $$2));
         he<dhp> $$3 = this.b.b(dhp.e);
         this.a(drq.d, this.a($$0, $$3));
      }

      public void a() {
         he.c<cny> $$0 = this.f.b(cnz.b);
         this.a(cnx.a($$0));
         he<dhp> $$1 = this.b.b(dhp.c);
         he.c<cnk> $$2 = this.c.b(cnr.b);
         this.a(drq.e, this.a(new cnv($$2), $$1));
         this.a(drq.b, this.a(new dhf(dqd.a(this.c, this.e, this.d))));
         this.a(drq.f, this.a(new dhb($$2)));
      }
   }
}
