import javax.annotation.Nullable;

public class czr extends cuq implements cso, czn {
   private static final dfr e = dfq.C;
   public static final dfu b = dfq.R;
   protected static final float c = 6.0F;
   protected static final ehx d = csm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public czr(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dfw.b).a(e, Boolean.valueOf(false)).a(b, ha.c));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return d;
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.a(apl.bw) || $$1.b_($$2.c()).a(eae.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.a(b, $$0.g().g())) : null;
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if (!$$0.r_()) {
         gu $$5 = $$1.c();
         dfa $$6 = cuq.b($$0, $$5, this.n().a(a, dfw.a).a(b, $$2.c(b)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(e) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      if ($$0.c(a) == dfw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         gu $$3 = $$2.d();
         dfa $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, e, b);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return true;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      if ($$3.c(cuq.a) == dfw.b) {
         gu $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         csj.a($$0, $$1, $$2, $$3.c(b));
      } else {
         gu $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public float an_() {
      return 0.1F;
   }
}
