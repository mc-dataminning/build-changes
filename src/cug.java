import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cug extends crx implements czl {
   public static final aep a = new aep("sherds");
   private static final ehy b = csk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dfs c = dfo.R;
   private static final dfp d = dfo.bw;
   private static final dfp e = dfo.C;

   protected cug(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, hb.c).a(e, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g()).a(e, Boolean.valueOf($$1.a() == eac.c)).a(d, Boolean.valueOf(false));
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      if ($$0.B) {
         $$0.a($$1, dcm.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcz($$0, $$1);
   }

   @Override
   public List<ciw> a(dey $$0, ecn.a $$1) {
      dck $$2 = $$1.b(eet.h);
      if ($$2 instanceof dcz $$3) {
         $$1.a(a, $$1x -> $$3.f().a().map(cir::ae_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      ciw $$4 = $$3.eR();
      dey $$5 = $$2;
      if ($$4.a(apr.aT) && !cnf.f($$4)) {
         $$5 = $$2.a(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(e) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public czx m(dey $$0) {
      return $$0.c(d) ? czx.aY : czx.aX;
   }

   @Override
   public void a(ciw $$0, @Nullable coq $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcz.a $$4 = dcz.a.b(cgp.a($$0));
      if (!$$4.equals(dcz.a.a)) {
         $$2.add(td.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new ciw($$1x, 1).y().d().a(n.h)));
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return $$0.c_($$1) instanceof dcz $$3 ? $$3.g() : super.a($$0, $$1, $$2);
   }
}
