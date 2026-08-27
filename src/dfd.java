import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dfd extends csk {
   public static final dgf a = dff.a;
   public static final dgj<dgn> b = dff.b;

   public dfd(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dgn.a));
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return null;
   }

   public static dcx a(gw $$0, dfl $$1, dfl $$2, hc $$3, boolean $$4, boolean $$5) {
      return new dfh($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$2, dcz.k, dfh::a);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof dfh) {
            ((dfh)$$5).j();
         }
      }
   }

   @Override
   public void a(cpy $$0, gw $$1, dfl $$2) {
      gw $$3 = $$1.a($$2.c(a).g());
      dfl $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dfe && $$4.c(dfe.b)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bha.b;
      } else {
         return bha.d;
      }
   }

   @Override
   public List<cjh> a(dfl $$0, ecy.a $$1) {
      dfh $$2 = this.a($$1.a(), gw.a($$1.a(efd.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return eif.a();
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      dfh $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eif.a();
   }

   @Nullable
   private dfh a(cpd $$0, gw $$1) {
      dcx $$2 = $$0.c_($$1);
      return $$2 instanceof dfh ? (dfh)$$2 : null;
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return cjh.b;
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
      $$0.a(a, b);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
