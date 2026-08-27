import javax.annotation.Nullable;

public class dav extends csx {
   private static final tn c = tn.c("container.stonecutter");
   public static final dgf a = cwq.aC;
   protected static final eii b = csx.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public dav(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(app.ay);
         return bha.b;
      }
   }

   @Nullable
   @Override
   public bhd b(dfl $$0, cpx $$1, gw $$2) {
      return new bhi(($$2x, $$3, $$4) -> new cgj($$2x, $$3, cey.a($$1, $$2)), c);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
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
      $$0.a(a);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
