import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbs extends czv {
   public static final dgd a = cwo.aC;
   public static final eig b = csv.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eig c = csv.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eig d = eid.a(b, csv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eig h = eid.a(c, csv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ha, eig> i = Maps.newEnumMap(ImmutableMap.of(ha.c, d, ha.d, d, ha.f, h, ha.e, h));

   public dbs(dfi.d $$0, dgw $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, ha.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.c_($$2) instanceof ded $$6) {
         cjf $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bgy.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dfj $$0, cbu $$1, ehj $$2, ded $$3, cjf $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cir && !this.a($$2, $$0);
   }

   private boolean a(ehj $$0, dfj $$1) {
      return $$0.b().o() == $$1.c(a).o();
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return i.get($$0.c(a));
   }

   @Override
   public eig b_(dfj $$0, cpb $$1, gw $$2) {
      return this.a($$0, $$1, $$2, ehs.a());
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      switch ((ha)$$0.c(a)) {
         case f:
         case e:
            return c;
         default:
            return b;
      }
   }

   public boolean b(dfj $$0, cpy $$1, gw $$2) {
      ha $$3 = $$0.c(a).h();
      ha $$4 = $$0.c(a).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cpy $$0, dfj $$1, gw $$2, ha $$3) {
      dfj $$4 = $$0.a_($$2);
      return $$4.a(aps.ay) ? $$4.c(a).o().a($$1.c(a)) : $$4.a($$0, $$2, $$3, dax.a);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = this.n();
      eam $$2 = $$0.q().b_($$0.a());
      cpy $$3 = $$0.q();
      gw $$4 = $$0.a();

      for (ha $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == ean.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1.o() == $$0.c(a).h().o() && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfj $$0) {
      return $$0.c(a).p();
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, e);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddr($$0, $$1);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.i, ded::a);
   }
}
