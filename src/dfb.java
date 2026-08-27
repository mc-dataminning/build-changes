import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dfb extends csi {
   public static final dgd a = dfd.a;
   public static final dgh<dgl> b = dfd.b;

   public dfb(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dgl.a));
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return null;
   }

   public static dcv a(gw $$0, dfj $$1, dfj $$2, hc $$3, boolean $$4, boolean $$5) {
      return new dff($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.k, dff::a);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof dff) {
            ((dff)$$5).j();
         }
      }
   }

   @Override
   public void a(cpw $$0, gw $$1, dfj $$2) {
      gw $$3 = $$1.a($$2.c(a).g());
      dfj $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dfc && $$4.c(dfc.b)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bgy.b;
      } else {
         return bgy.d;
      }
   }

   @Override
   public List<cjf> a(dfj $$0, ecw.a $$1) {
      dff $$2 = this.a($$1.a(), gw.a($$1.a(efb.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return eid.a();
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      dff $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eid.a();
   }

   @Nullable
   private dff a(cpb $$0, gw $$1) {
      dcv $$2 = $$0.c_($$1);
      return $$2 instanceof dff ? (dff)$$2 : null;
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return cjf.b;
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
      $$0.a(a, b);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
