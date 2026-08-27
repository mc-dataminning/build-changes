import java.util.Map;
import java.util.Optional;

public class dwx {
   public static final agh<dww> a = a("normal");
   public static final agh<dww> b = a("flat");
   public static final agh<dww> c = a("large_biomes");
   public static final agh<dww> d = a("amplified");
   public static final agh<dww> e = a("single_biome_surface");
   public static final agh<dww> f = a("debug_all_block_states");

   public static void a(ov<dww> $$0) {
      new dwx.a($$0).a();
   }

   private static agh<dww> a(String $$0) {
      return agh.a(jz.aH, new agi($$0));
   }

   public static Optional<agh<dww>> a(io<dks> $$0) {
      return $$0.d(dks.b).flatMap($$0x -> {
         djf $$1 = $$0x.b();
         if ($$1 instanceof dmm) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dmi ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dnm a(ip $$0) {
      return $$0.d(jz.aH).f(a).a().a();
   }

   public static dks b(ip $$0) {
      return $$0.d(jz.aH).f(a).a().b().orElseThrow();
   }

   static class a {
      private final ov<dww> a;
      private final ic<dmw> b;
      private final ic<csy> c;
      private final ic<dwl> d;
      private final ic<dxn> e;
      private final ic<ctm> f;
      private final ib<dkr> g;
      private final dks h;
      private final dks i;

      a(ov<dww> $$0) {
         this.a = $$0;
         ic<dkr> $$1 = $$0.a(jz.aw);
         this.b = $$0.a(jz.ay);
         this.c = $$0.a(jz.ar);
         this.d = $$0.a(jz.aA);
         this.e = $$0.a(jz.aD);
         this.f = $$0.a(jz.aI);
         this.g = $$1.b(dkp.a);
         ib<dkr> $$2 = $$1.b(dkp.b);
         ib<dmw> $$3 = this.b.b(dmw.f);
         ib.c<ctm> $$4 = this.f.b(ctn.a);
         this.h = new dks($$2, new dmu(ctl.a($$4), $$3));
         ib<dkr> $$5 = $$1.b(dkp.c);
         ib<dmw> $$6 = this.b.b(dmw.g);
         this.i = new dks($$5, new dmu(ctp.a(this.c), $$6));
      }

      private dks a(djf $$0) {
         return new dks(this.g, $$0);
      }

      private dks a(ctc $$0, ib<dmw> $$1) {
         return this.a(new dmu($$0, $$1));
      }

      private dww a(dks $$0) {
         return new dww(Map.of(dks.b, $$0, dks.c, this.h, dks.d, this.i));
      }

      private void a(agh<dww> $$0, dks $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ctc $$0) {
         ib<dmw> $$1 = this.b.b(dmw.c);
         this.a(dwx.a, this.a($$0, $$1));
         ib<dmw> $$2 = this.b.b(dmw.d);
         this.a(dwx.c, this.a($$0, $$2));
         ib<dmw> $$3 = this.b.b(dmw.e);
         this.a(dwx.d, this.a($$0, $$3));
      }

      public void a() {
         ib.c<ctm> $$0 = this.f.b(ctn.b);
         this.a(ctl.a($$0));
         ib<dmw> $$1 = this.b.b(dmw.c);
         ib.c<csy> $$2 = this.c.b(ctf.b);
         this.a(dwx.e, this.a(new ctj($$2), $$1));
         this.a(dwx.b, this.a(new dmm(dvk.a(this.c, this.e, this.d))));
         this.a(dwx.f, this.a(new dmi($$2)));
      }
   }
}
