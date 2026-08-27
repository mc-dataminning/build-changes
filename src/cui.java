import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cui extends crz implements czn {
   public static final aer a = new aer("sherds");
   private static final ehx b = csm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dfu c = dfq.R;
   private static final dfr d = dfq.bw;
   private static final dfr e = dfq.C;

   protected cui(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, ha.c).a(e, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g()).a(e, Boolean.valueOf($$1.a() == eae.c)).a(d, Boolean.valueOf(false));
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
      if ($$0.B) {
         $$0.a($$1, dco.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddb($$0, $$1);
   }

   @Override
   public List<ciy> a(dfa $$0, ecn.a $$1) {
      dcm $$2 = $$1.b(ees.h);
      if ($$2 instanceof ddb $$3) {
         $$1.a(a, $$1x -> $$3.f().a().map(cit::ae_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      ciy $$4 = $$3.eR();
      dfa $$5 = $$2;
      if ($$4.a(apt.aT) && !cnh.f($$4)) {
         $$5 = $$2.a(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(e) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public czz m(dfa $$0) {
      return $$0.c(d) ? czz.aY : czz.aX;
   }

   @Override
   public void a(ciy $$0, @Nullable cos $$1, List<tf> $$2, ckp $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddb.a $$4 = ddb.a.b(cgr.a($$0));
      if (!$$4.equals(ddb.a.a)) {
         $$2.add(te.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new ciy($$1x, 1).y().d().a(n.h)));
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return $$0.c_($$1) instanceof ddb $$3 ? $$3.g() : super.a($$0, $$1, $$2);
   }
}
