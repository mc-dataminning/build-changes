import javax.annotation.Nullable;

public class czp extends cuo implements csm, czl {
   private static final dfp e = dfo.C;
   public static final dfs b = dfo.R;
   protected static final float c = 6.0F;
   protected static final ehy d = csk.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public czp(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dfu.b).a(e, Boolean.valueOf(false)).a(b, hb.c));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return d;
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.a(apj.bw) || $$1.b_($$2.c()).a(eac.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.a(b, $$0.g().g())) : null;
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if (!$$0.r_()) {
         gv $$5 = $$1.c();
         dey $$6 = cuo.b($$0, $$5, this.n().a(a, dfu.a).a(b, $$2.c(b)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(e) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      if ($$0.c(a) == dfu.a) {
         return super.a($$0, $$1, $$2);
      } else {
         gv $$3 = $$2.d();
         dey $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, e, b);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return true;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      if ($$3.c(cuo.a) == dfu.b) {
         gv $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         csh.a($$0, $$1, $$2, $$3.c(b));
      } else {
         gv $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public float an_() {
      return 0.1F;
   }
}
