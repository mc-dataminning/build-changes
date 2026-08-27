import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class des extends crz {
   public static final dfu a = deu.a;
   public static final dfy<dgc> b = deu.b;

   public des(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, dgc.a));
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return null;
   }

   public static dcm a(gu $$0, dfa $$1, dfa $$2, ha $$3, boolean $$4, boolean $$5) {
      return new dew($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$2, dco.k, dew::a);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof dew) {
            ((dew)$$5).j();
         }
      }
   }

   @Override
   public void a(cpn $$0, gu $$1, dfa $$2) {
      gu $$3 = $$1.a($$2.c(a).g());
      dfa $$4 = $$0.a_($$3);
      if ($$4.b() instanceof det && $$4.c(det.b)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bgq.b;
      } else {
         return bgq.d;
      }
   }

   @Override
   public List<ciy> a(dfa $$0, ecn.a $$1) {
      dew $$2 = this.a($$1.a(), gu.a($$1.a(ees.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ehu.a();
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      dew $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ehu.a();
   }

   @Nullable
   private dew a(cos $$0, gu $$1) {
      dcm $$2 = $$0.c_($$1);
      return $$2 instanceof dew ? (dew)$$2 : null;
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return ciy.b;
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
      $$0.a(a, b);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
