import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbu extends czx {
   public static final dgf a = cwq.aC;
   public static final eii b = csx.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eii c = csx.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eii d = eif.a(b, csx.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eii h = eif.a(c, csx.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<hc, eii> i = Maps.newEnumMap(ImmutableMap.of(hc.c, d, hc.d, d, hc.f, h, hc.e, h));

   public dbu(dfk.d $$0, dgy $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, hc.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.c_($$2) instanceof def $$6) {
         cjh $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bha.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dfl $$0, cbw $$1, ehl $$2, def $$3, cjh $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cit && !this.a($$2, $$0);
   }

   private boolean a(ehl $$0, dfl $$1) {
      return $$0.b().o() == $$1.c(a).o();
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return i.get($$0.c(a));
   }

   @Override
   public eii b_(dfl $$0, cpd $$1, gw $$2) {
      return this.a($$0, $$1, $$2, ehu.a());
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ((hc)$$0.c(a)) {
         case f:
         case e:
            return c;
         default:
            return b;
      }
   }

   public boolean b(dfl $$0, cqa $$1, gw $$2) {
      hc $$3 = $$0.c(a).h();
      hc $$4 = $$0.c(a).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cqa $$0, dfl $$1, gw $$2, hc $$3) {
      dfl $$4 = $$0.a_($$2);
      return $$4.a(apu.ay) ? $$4.c(a).o().a($$1.c(a)) : $$4.a($$0, $$2, $$3, daz.a);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = this.n();
      eao $$2 = $$0.q().b_($$0.a());
      cqa $$3 = $$0.q();
      gw $$4 = $$0.a();

      for (hc $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            hc $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == eap.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1.o() == $$0.c(a).h().o() && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfl $$0) {
      return $$0.c(a).p();
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, e);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddt($$0, $$1);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$2, dcz.i, def::a);
   }
}
