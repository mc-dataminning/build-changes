import javax.annotation.Nullable;

public class com extends col implements cwo {
   public static final dcs a = dcr.C;
   public static final dcv b = dcr.P;
   protected final efb c;
   protected final efb d;
   protected final efb e;
   protected final efb f;
   protected final efb g;
   protected final efb h;

   public com(int $$0, int $$1, dca.d $$2) {
      super($$2);
      this.k(this.n().a(a, Boolean.valueOf(false)).a(b, ha.b));
      this.g = cpn.a((double)$$1, 0.0, (double)$$1, (double)(16 - $$1), (double)$$0, (double)(16 - $$1));
      this.h = cpn.a((double)$$1, (double)(16 - $$0), (double)$$1, (double)(16 - $$1), 16.0, (double)(16 - $$1));
      this.c = cpn.a((double)$$1, (double)$$1, (double)(16 - $$0), (double)(16 - $$1), (double)(16 - $$1), 16.0);
      this.d = cpn.a((double)$$1, (double)$$1, 0.0, (double)(16 - $$1), (double)(16 - $$1), (double)$$0);
      this.e = cpn.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16 - $$1), (double)(16 - $$1));
      this.f = cpn.a((double)(16 - $$0), (double)$$1, (double)$$1, 16.0, (double)(16 - $$1), (double)(16 - $$1));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      ha $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return this.c;
         case d:
            return this.d;
         case f:
            return this.e;
         case e:
            return this.f;
         case a:
            return this.h;
         case b:
         default:
            return this.g;
      }
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      ha $$3 = $$0.c(b);
      gu $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      cmn $$1 = $$0.q();
      gu $$2 = $$0.a();
      return this.n().a(a, Boolean.valueOf($$1.b_($$2).a() == dxf.c)).a(b, $$0.k());
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(a) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }
}
