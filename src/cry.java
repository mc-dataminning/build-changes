import javax.annotation.Nullable;

public class cry extends cvp {
   public static final dgf a = cwq.aC;
   private static final eii b = csx.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eii c = csx.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eii d = csx.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eii e = csx.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eii f = csx.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eii g = csx.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eii h = csx.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eii i = eif.a(b, c, d, e);
   private static final eii j = eif.a(b, f, g, h);
   private static final tn k = tn.c("container.repair");
   private static final float l = 2.0F;
   private static final int m = 40;

   public cry(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.g().h());
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(app.aC);
         return bha.b;
      }
   }

   @Nullable
   @Override
   public bhd b(dfl $$0, cpx $$1, gw $$2) {
      return new bhi(($$2x, $$3, $$4) -> new cep($$2x, $$3, cey.a($$1, $$2)), k);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      hc $$4 = $$0.c(a);
      return $$4.o() == hc.a.a ? i : j;
   }

   @Override
   protected void a(byo $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, dfl $$3, byo $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, byo $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bhq a(bis $$0) {
      return $$0.dM().b($$0);
   }

   @Nullable
   public static dfl e(dfl $$0) {
      if ($$0.a(csy.gS)) {
         return csy.gT.n().a(a, $$0.c(a));
      } else {
         return $$0.a(csy.gT) ? csy.gU.n().a(a, $$0.c(a)) : null;
      }
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   @Override
   public int d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
