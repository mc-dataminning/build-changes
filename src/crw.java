import javax.annotation.Nullable;

public class crw extends cvn {
   public static final dgd a = cwo.aC;
   private static final eig b = csv.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eig c = csv.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eig d = csv.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eig e = csv.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eig f = csv.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eig g = csv.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eig h = csv.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eig i = eid.a(b, c, d, e);
   private static final eig j = eid.a(b, f, g, h);
   private static final tl k = tl.c("container.repair");
   private static final float l = 2.0F;
   private static final int m = 40;

   public crw(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.g().h());
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apn.aC);
         return bgy.b;
      }
   }

   @Nullable
   @Override
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      return new bhg(($$2x, $$3, $$4) -> new cen($$2x, $$3, cew.a($$1, $$2)), k);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      ha $$4 = $$0.c(a);
      return $$4.o() == ha.a.a ? i : j;
   }

   @Override
   protected void a(bym $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, dfj $$3, bym $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, bym $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bho a(biq $$0) {
      return $$0.dM().b($$0);
   }

   @Nullable
   public static dfj e(dfj $$0) {
      if ($$0.a(csw.gS)) {
         return csw.gT.n().a(a, $$0.c(a));
      } else {
         return $$0.a(csw.gT) ? csw.gU.n().a(a, $$0.c(a)) : null;
      }
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   @Override
   public int d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
