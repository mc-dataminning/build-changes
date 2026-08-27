import javax.annotation.Nullable;

public class dat extends csv {
   private static final tm c = tm.c("container.stonecutter");
   public static final dgd a = cwo.aC;
   protected static final eig b = csv.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public dat(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apo.ay);
         return bgy.b;
      }
   }

   @Nullable
   @Override
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      return new bhg(($$2x, $$3, $$4) -> new cgh($$2x, $$3, cew.a($$1, $$2)), c);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
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
      $$0.a(a);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
