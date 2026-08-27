import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cum extends csd implements czr {
   public static final aeu a = new aeu("sherds");
   private static final eib b = csq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dfy c = dfu.R;
   private static final dfv d = dfu.bw;
   private static final dfv e = dfu.C;

   protected cum(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, hc.c).a(e, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g()).a(e, Boolean.valueOf($$1.a() == eai.c)).a(d, Boolean.valueOf(false));
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      if ($$0.B) {
         $$0.a($$1, dcs.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddf($$0, $$1);
   }

   @Override
   public List<cja> a(dfe $$0, ecr.a $$1) {
      dcq $$2 = $$1.b(eew.h);
      if ($$2 instanceof ddf $$3) {
         $$1.a(a, $$1x -> $$3.f().a().map(civ::ad_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      cja $$4 = $$3.eR();
      dfe $$5 = $$2;
      if ($$4.a(apw.aT) && !cnl.f($$4)) {
         $$5 = $$2.a(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(e) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public dad m(dfe $$0) {
      return $$0.c(d) ? dad.aY : dad.aX;
   }

   @Override
   public void a(cja $$0, @Nullable cow $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddf.a $$4 = ddf.a.b(cgt.a($$0));
      if (!$$4.equals(ddf.a.a)) {
         $$2.add(th.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cja($$1x, 1).y().d().a(n.h)));
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return $$0.c_($$1) instanceof ddf $$3 ? $$3.g() : super.a($$0, $$1, $$2);
   }
}
