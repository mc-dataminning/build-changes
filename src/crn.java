import javax.annotation.Nullable;

public class crn extends cve {
   public static final dfu a = cwf.aC;
   private static final ehx b = csm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ehx c = csm.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ehx d = csm.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ehx e = csm.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ehx f = csm.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ehx g = csm.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ehx h = csm.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ehx i = ehu.a(b, c, d, e);
   private static final ehx j = ehu.a(b, f, g, h);
   private static final tf k = tf.c("container.repair");
   private static final float l = 2.0F;
   private static final int m = 40;

   public crn(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.g().h());
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apg.aC);
         return bgq.b;
      }
   }

   @Nullable
   @Override
   public bgt b(dfa $$0, cpm $$1, gu $$2) {
      return new bgy(($$2x, $$3, $$4) -> new ceg($$2x, $$3, cep.a($$1, $$2)), k);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ha $$4 = $$0.c(a);
      return $$4.o() == ha.a.a ? i : j;
   }

   @Override
   protected void a(byf $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, dfa $$3, byf $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, byf $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bhg a(bii $$0) {
      return $$0.dL().b($$0);
   }

   @Nullable
   public static dfa e(dfa $$0) {
      if ($$0.a(csn.gS)) {
         return csn.gT.n().a(a, $$0.c(a));
      } else {
         return $$0.a(csn.gT) ? csn.gU.n().a(a, $$0.c(a)) : null;
      }
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public int d(dfa $$0, cos $$1, gu $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
