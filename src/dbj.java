import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbj extends czm {
   public static final dfu a = cwf.aC;
   public static final ehx b = csm.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ehx c = csm.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ehx d = ehu.a(b, csm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ehx h = ehu.a(c, csm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ha, ehx> i = Maps.newEnumMap(ImmutableMap.of(ha.c, d, ha.d, d, ha.f, h, ha.e, h));

   public dbj(dez.d $$0, dgn $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, ha.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.c_($$2) instanceof ddu $$6) {
         ciy $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bgq.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dfa $$0, cbn $$1, eha $$2, ddu $$3, ciy $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cik && !this.a($$2, $$0);
   }

   private boolean a(eha $$0, dfa $$1) {
      return $$0.b().o() == $$1.c(a).o();
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return i.get($$0.c(a));
   }

   @Override
   public ehx b_(dfa $$0, cos $$1, gu $$2) {
      return this.a($$0, $$1, $$2, ehj.a());
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      switch ((ha)$$0.c(a)) {
         case f:
         case e:
            return c;
         default:
            return b;
      }
   }

   public boolean b(dfa $$0, cpp $$1, gu $$2) {
      ha $$3 = $$0.c(a).h();
      ha $$4 = $$0.c(a).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cpp $$0, dfa $$1, gu $$2, ha $$3) {
      dfa $$4 = $$0.a_($$2);
      return $$4.a(apl.ay) ? $$4.c(a).o().a($$1.c(a)) : $$4.a($$0, $$2, $$3, dao.a);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = this.n();
      ead $$2 = $$0.q().b_($$0.a());
      cpp $$3 = $$0.q();
      gu $$4 = $$0.a();

      for (ha $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == eae.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1.o() == $$0.c(a).h().o() && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfa $$0) {
      return $$0.c(a).p();
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, e);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddi($$0, $$1);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$2, dco.i, ddu::a);
   }
}
