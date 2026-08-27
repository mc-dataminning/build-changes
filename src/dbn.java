import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbn extends czq {
   public static final dfy a = cwj.aC;
   public static final eib b = csq.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eib c = csq.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eib d = ehy.a(b, csq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eib h = ehy.a(c, csq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<hc, eib> i = Maps.newEnumMap(ImmutableMap.of(hc.c, d, hc.d, d, hc.f, h, hc.e, h));

   public dbn(dfd.d $$0, dgr $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, hc.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.c_($$2) instanceof ddy $$6) {
         cja $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bgt.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dfe $$0, cbp $$1, ehe $$2, ddy $$3, cja $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cim && !this.a($$2, $$0);
   }

   private boolean a(ehe $$0, dfe $$1) {
      return $$0.b().o() == $$1.c(a).o();
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return i.get($$0.c(a));
   }

   @Override
   public eib b_(dfe $$0, cow $$1, gw $$2) {
      return this.a($$0, $$1, $$2, ehn.a());
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      switch ((hc)$$0.c(a)) {
         case f:
         case e:
            return c;
         default:
            return b;
      }
   }

   public boolean b(dfe $$0, cpt $$1, gw $$2) {
      hc $$3 = $$0.c(a).h();
      hc $$4 = $$0.c(a).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cpt $$0, dfe $$1, gw $$2, hc $$3) {
      dfe $$4 = $$0.a_($$2);
      return $$4.a(apo.ay) ? $$4.c(a).o().a($$1.c(a)) : $$4.a($$0, $$2, $$3, das.a);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = this.n();
      eah $$2 = $$0.q().b_($$0.a());
      cpt $$3 = $$0.q();
      gw $$4 = $$0.a();

      for (hc $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            hc $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == eai.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1.o() == $$0.c(a).h().o() && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfe $$0) {
      return $$0.c(a).p();
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, e);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddm($$0, $$1);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.i, ddy::a);
   }
}
