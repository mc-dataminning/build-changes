import javax.annotation.Nullable;

public class cws extends crr implements cpp, cwo {
   private static final dcs e = dcr.C;
   public static final dcv b = dcr.R;
   protected static final float c = 6.0F;
   protected static final efb d = cpn.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public cws(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dcx.b).a(e, Boolean.valueOf(false)).a(b, ha.c));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return d;
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.a(amw.bu) || $$1.b_($$2.c()).a(dxf.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = super.a($$0);
      return $$1 != null ? a($$0.q(), $$0.a(), $$1.a(b, $$0.g().g())) : null;
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if (!$$0.r_()) {
         gu $$5 = $$1.c();
         dcb $$6 = crr.a($$0, $$5, this.n().a(a, dcx.a).a(b, $$2.c(b)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(e) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      if ($$0.c(a) == dcx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         gu $$3 = $$2.d();
         dcb $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, e, b);
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      if ($$3.c(crr.a) == dcx.b) {
         gu $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cpk.a($$0, $$1, $$2, $$3.c(b));
      } else {
         gu $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
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
   public float an_() {
      return 0.1F;
   }
}
