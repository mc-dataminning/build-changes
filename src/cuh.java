import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cuh extends cry implements czm {
   public static final aer a = new aer("sherds");
   private static final ehw b = csl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dft c = dfp.R;
   private static final dfq d = dfp.bw;
   private static final dfq e = dfp.C;

   protected cuh(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, ha.c).a(e, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g()).a(e, Boolean.valueOf($$1.a() == ead.c)).a(d, Boolean.valueOf(false));
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, @Nullable biy $$3, cix $$4) {
      if ($$0.B) {
         $$0.a($$1, dcn.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dda($$0, $$1);
   }

   @Override
   public List<cix> a(dez $$0, ecm.a $$1) {
      dcl $$2 = $$1.b(eer.h);
      if ($$2 instanceof dda $$3) {
         $$1.a(a, $$1x -> $$3.f().a().map(cis::ad_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      cix $$4 = $$3.eR();
      dez $$5 = $$2;
      if ($$4.a(apt.aT) && !cng.f($$4)) {
         $$5 = $$2.a(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(e) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public czy m(dez $$0) {
      return $$0.c(d) ? czy.aY : czy.aX;
   }

   @Override
   public void a(cix $$0, @Nullable cor $$1, List<tf> $$2, cko $$3) {
      super.a($$0, $$1, $$2, $$3);
      dda.a $$4 = dda.a.b(cgq.a($$0));
      if (!$$4.equals(dda.a.a)) {
         $$2.add(te.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cix($$1x, 1).y().d().a(n.h)));
      }
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return $$0.c_($$1) instanceof dda $$3 ? $$3.g() : super.a($$0, $$1, $$2);
   }
}
