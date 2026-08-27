import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbi extends czl {
   public static final dft a = cwe.aC;
   public static final ehw b = csl.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ehw c = csl.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ehw d = eht.a(b, csl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ehw h = eht.a(c, csl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ha, ehw> i = Maps.newEnumMap(ImmutableMap.of(ha.c, d, ha.d, d, ha.f, h, ha.e, h));

   public dbi(dey.d $$0, dgm $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, ha.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.c_($$2) instanceof ddt $$6) {
         cix $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bgq.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dez $$0, cbm $$1, egz $$2, ddt $$3, cix $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cij && !this.a($$2, $$0);
   }

   private boolean a(egz $$0, dez $$1) {
      return $$0.b().o() == $$1.c(a).o();
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return i.get($$0.c(a));
   }

   @Override
   public ehw b_(dez $$0, cor $$1, gu $$2) {
      return this.a($$0, $$1, $$2, ehi.a());
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      switch ((ha)$$0.c(a)) {
         case f:
         case e:
            return c;
         default:
            return b;
      }
   }

   public boolean b(dez $$0, cpo $$1, gu $$2) {
      ha $$3 = $$0.c(a).h();
      ha $$4 = $$0.c(a).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cpo $$0, dez $$1, gu $$2, ha $$3) {
      dez $$4 = $$0.a_($$2);
      return $$4.a(apl.ay) ? $$4.c(a).o().a($$1.c(a)) : $$4.a($$0, $$2, $$3, dan.a);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = this.n();
      eac $$2 = $$0.q().b_($$0.a());
      cpo $$3 = $$0.q();
      gu $$4 = $$0.a();

      for (ha $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == ead.c));
            }
         }
      }

      return null;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1.o() == $$0.c(a).h().o() && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dez $$0) {
      return $$0.c(a).p();
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, e);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddh($$0, $$1);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.i, ddt::a);
   }
}
