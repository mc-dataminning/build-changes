import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cut extends csk implements czy {
   public static final aey a = new aey("sherds");
   private static final eii b = csx.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dgf c = dgb.R;
   private static final dgc d = dgb.bw;
   private static final dgc e = dgb.C;

   protected cut(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, hc.c).a(e, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g()).a(e, Boolean.valueOf($$1.a() == eap.c)).a(d, Boolean.valueOf(false));
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
      if ($$0.B) {
         $$0.a($$1, dcz.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddm($$0, $$1);
   }

   @Override
   public List<cjh> a(dfl $$0, ecy.a $$1) {
      dcx $$2 = $$1.b(efd.h);
      if ($$2 instanceof ddm $$3) {
         $$1.a(a, $$1x -> $$3.f().a().map(cjc::ai_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      cjh $$4 = $$3.eS();
      dfl $$5 = $$2;
      if ($$4.a(aqc.aT) && !cns.f($$4)) {
         $$5 = $$2.a(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(e) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public dak m(dfl $$0) {
      return $$0.c(d) ? dak.aY : dak.aX;
   }

   @Override
   public void a(cjh $$0, @Nullable cpd $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddm.a $$4 = ddm.a.b(cha.a($$0));
      if (!$$4.equals(ddm.a.a)) {
         $$2.add(tm.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cjh($$1x, 1).y().d().a(n.h)));
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return $$0.c_($$1) instanceof ddm $$3 ? $$3.g() : super.a($$0, $$1, $$2);
   }
}
